function [efficiencyImage, efficiencyPatient, imConfMat, pConfMat] = generateResults(class, group, key, schedule, style, classifier)
%GENERATERESULTS calculates results like efficiency and confusion matrices from
%classification results and displays them in given style if needed.
%   class - classification results
%   group - affiliation to classifying group (1 - benign, 2 - malignant, etc...)
%   key      - key and schedule are
%   schedule - used for cross-validation
%   classifier - string with the name of the classifier for displaying purposes
%   style - style of result presentation (basic, standard, extended or full)
%   efficiencyImage - efficiency for single images
%   efficiencyPatient - efficiency for patients
%   imConfMat - confusion matrix for single images
%   pConfMat - confusion matrix for patients

% set number of spaces to print results aligned (only basic and standard styles)
spaces = ' ';
for i=1:20 - size(classifier, 2);
    spaces = [spaces ' '];
end

% image efficiency
g = size(group, 1); % number of images
correctIm = zeros(g, 1);
correctIm(class == group) = 1;
efficiencyImage = 100 * (sum(correctIm) / g);

% patient efficiency
s = size(schedule, 1); % number of patients
gClass = zeros(s, 1); % patient classification needed for calculating confusion matrix
gGroup = zeros(s, 1); % patient group needed for calculating confusion matrix
correct = zeros(s, 1);
for i=1:s
    idx = key == schedule(i);
    [~, ~, F] = mode(class(idx)); % find group with the most votes in classification results
    caseGroup = group(idx);   % determine group
    gGroup(i) = caseGroup(1); % of the patient
    if (size(F{1}, 1) > 1) % if there are more then 2 groups with the same number of votes
        correct(i) = -1;   % set patient as uncertain
        gClass(i) = 0;     % set class as uncertain
    elseif (F{1} == caseGroup(1)) % if classification was correct
        correct(i) = 1;
        gClass(i) = F{1};
    end
end
efficiencyPatient = 100 * (sum(correct(correct == 1)) / s);
uncertain = -100 * (sum(correct(correct == -1))) / s;

% image confusion matrix
imConfMat = confusionmat(group, class);

% patient confusion matrix
pConfMat = confusionmat(gGroup, gClass);

% Display
switch style
    case 'none'
        
    case 'basic'
        disp([spaces classifier ' = ' num2str(efficiencyPatient, '% .2f') '%']);
        
    case 'standard'
        disp([spaces classifier ' = ' num2str(efficiencyPatient, '% .2f') '% corr. (' num2str(efficiencyImage, '% .2f') '% image), '...
              num2str(uncertain, '% .2f') '% uncert., ' num2str(100 - efficiencyPatient - uncertain, '% .2f') '% incorr.']);
          
    case 'extended'
        disp([classifier ':']);
        disp(['   ' num2str(efficiencyPatient, '% .2f') '% correct']);
        disp(['   ' num2str(uncertain, '% .2f') '% uncertain']);
        disp(['   ' num2str(100 - efficiencyPatient - uncertain, '% .2f') '% incorrect']);
        disp(['   ' num2str(efficiencyImage, '% .2f') '% image efficiency']);
        disp(' ');
        disp('   confusion matrix (patient):');
        disp(pConfMat);
        disp('   confusion matrix (image):');
        disp(imConfMat);
    
    case 'full'
        disp([classifier ':']);
        disp(['   ' num2str(efficiencyPatient, '% .2f') '% correct']);
        disp(['   ' num2str(uncertain, '% .2f') '% uncertain']);
        disp(['   ' num2str(100 - efficiencyPatient - uncertain, '% .2f') '% incorrect']);
        disp(['   ' num2str(efficiencyImage, '% .2f') '% image efficiency']);
        disp(' ');
        disp('   confusion matrix (patient):');
        disp(pConfMat);
        disp('   confusion matrix (image):');
        disp(imConfMat);
        disp('         Lp.         key       group       class       corr.');
        tab = [(1:g)' key group class correctIm];
        disp(tab);
        
    otherwise
        error(['Unknow result presentation style: ' style]);
end

end

