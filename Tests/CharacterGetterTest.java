import java.util.HashMap;

public class CharacterGetterTest extends CharacterGetter {

    @org.junit.Test
    public void testUpdateFrequencyWithNoInitialKey() {
        HashMap<String, Integer> letterFrequencyMap = new HashMap<String, Integer>();
        CharacterGetterTest charFrequency = new CharacterGetterTest();

        charFrequency.updateFrequency("o", letterFrequencyMap);

        Integer expectedValue = 1;
        Integer returnValue = letterFrequencyMap.get("o");
        assert(expectedValue == returnValue);
    }

    @org.junit.Test
    public void testUpdateFrequencyWithInitialKey() {
        HashMap<String, Integer> letterFrequencyMap = new HashMap<String, Integer>();
        CharacterGetterTest charFrequency = new CharacterGetterTest();
        letterFrequencyMap.put("o", 1);
        charFrequency.updateFrequency("o", letterFrequencyMap);

        Integer expectedValue = 2;
        Integer returnValue = letterFrequencyMap.get("o");
        assert(expectedValue == returnValue);
    }

    @org.junit.Test
    public void testUpdateLetterFrequencies() {
        HashMap<String, Integer> letterFrequencyMap = new HashMap<String, Integer>();
        CharacterGetterTest charFrequency = new CharacterGetterTest();
        String[] letters = "helloworld".split("");
        charFrequency.updateLetterFrequencies(letters, letterFrequencyMap);

        Integer expectedValue = 3;
        Integer returnValue = letterFrequencyMap.get("l");
        assert(expectedValue == returnValue);
    }
}