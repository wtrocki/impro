function features2csv(features, fileName, header)
%FEATURES2CSV Exports all features to CSV file.
%   Exports all featuers to CSV file.
%   
%   features - struct with features for all images
%   fileName - file where features will be saved
%   header - if true header with names of columns is included 
%            (default: true)

% if too few arguments
if nargin < 2
    error('Too few arguments: features2csv takes at least 2 arguments.');
end

% set default header
if nargin < 3
    header = true;
end

% set default decimal separator
dsep = '.';

% set default cell separator
csep = ',';

% open file for writing
f = fopen(fileName, 'w');
if f == -1  % if cannot open file
    error('Cannot open file: ' + fileName);
end

% write header
if header
    fprintf(f, ['"Area_mean"' csep...
                '"Area_var"' csep...
                '"Perimeter_mean"' csep...
                '"Perimeter_var"' csep...
                '"Eccentricity_mean"' csep...
                '"Eccentricity_var"' csep...
                '"MajorAxisLength_mean"' csep...
                '"MajorAxisLength_var"' csep...
                '"MinorAxisLength_mean"' csep...
                '"MinorAxisLength_var"' csep...
                '"LuminanceVariance_mean"' csep...
                '"LuminanceVariance_var"' csep...
                '"LuminanceMean_mean"' csep...
                '"LuminanceMean_var"' csep...
                '"DistToCentroid_mean"' csep...
                '"DistToCentroid_var"' csep...
                '"PatientNo"' csep...
                '"ClassificationGroup"' csep...
                '\r\n']);
end

% for all cells (images) write values
n = size(features,1);
for i = 1:n
    fprintf(f, ['%s' csep], strrep(num2str(features(i).Area_mean), '.', dsep));
    fprintf(f, ['%s' csep], strrep(num2str(features(i).Area_var), '.', dsep));
    
    fprintf(f, ['%s' csep], strrep(num2str(features(i).Perimeter_mean), '.', dsep));
    fprintf(f, ['%s' csep], strrep(num2str(features(i).Perimeter_var), '.', dsep));
    
    fprintf(f, ['%s' csep], strrep(num2str(features(i).Eccentricity_mean), '.', dsep));
    fprintf(f, ['%s' csep], strrep(num2str(features(i).Eccentricity_var), '.', dsep));
    
    fprintf(f, ['%s' csep], strrep(num2str(features(i).MajorAxisLength_mean), '.', dsep));
    fprintf(f, ['%s' csep], strrep(num2str(features(i).MajorAxisLength_var), '.', dsep));
    
    fprintf(f, ['%s' csep], strrep(num2str(features(i).MinorAxisLength_mean), '.', dsep));
    fprintf(f, ['%s' csep], strrep(num2str(features(i).MinorAxisLength_var), '.', dsep));
    
    fprintf(f, ['%s' csep], strrep(num2str(features(i).LuminanceVariance_mean), '.', dsep));
    fprintf(f, ['%s' csep], strrep(num2str(features(i).LuminanceVariance_var), '.', dsep));
    
    fprintf(f, ['%s' csep], strrep(num2str(features(i).LuminanceMean_mean), '.', dsep));
    fprintf(f, ['%s' csep], strrep(num2str(features(i).LuminanceMean_var), '.', dsep));
    
    fprintf(f, ['%s' csep], strrep(num2str(features(i).DistToCentroid_mean), '.', dsep));
    fprintf(f, ['%s' csep], strrep(num2str(features(i).DistToCentroid_var), '.', dsep));
    
    fprintf(f, ['%s' csep], num2str(features(i).PatientNo));
    fprintf(f, ['%s' csep], num2str(features(i).ClassificationGroup));
    
    % new line (omit if it's the last line)
    if i ~= n
        fprintf(f, '\r\n');
    end
end

% close file
fclose(f);

end

