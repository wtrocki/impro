function [ ] = Classification(fileName, features, originalImage, segImage)
% Klasyfikacja na podstawie czterech ró¿nych klasyfikatorów
% Przypisanie do danej klasy wystêpuje w momencie przewagi jednego


results = zeros(1,4);

recognizerResult = recognizer(originalImage);
results(recognizerResult) = results(recognizerResult) + 1;

whiteBlackCriteriaResult = whiteBlackCriteria(segImage);
results(whiteBlackCriteriaResult) = results(whiteBlackCriteriaResult) + 1;

checkFeaturesResult = checkFeatures(features);
results(checkFeaturesResult) = results(checkFeaturesResult) + 1;

HSVRecognizerResult = HSVRecognizer(originalImage);
results(HSVRecognizerResult) = results(HSVRecognizerResult) + 1;

[~,winner] = max(results);
fprintf('================================================\n');
fprintf('Nazwa pliku: %s\nRozpoznanie: %s\n', fileName, GroupConventer.getGroupName(winner));
fprintf('================================================\n');
end
