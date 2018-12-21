import java.util.HashMap;

class CharacterGetter {

    public void updateFrequency(String letter, HashMap<String, Integer> letterFrequencyMap) {
        Integer value = letterFrequencyMap.get(letter);

        if(value != null){
            Integer newFrequency = value + 1;
            letterFrequencyMap.put(letter, newFrequency);
        } else {
            letterFrequencyMap.put(letter, 1);
        }
    }

    public void updateLetterFrequencies(String[] letters, HashMap<String, Integer> letterFrequencyMap) {
        for (String letter : letters) {
            updateFrequency(letter, letterFrequencyMap);
        }
    }
}