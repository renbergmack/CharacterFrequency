import java.util.HashMap;

public class CharacterFrequency extends CharacterGetter {

    public static void main(String []args) {
        String input = "Hello World";
        String inputLowerCase = input.toLowerCase();
        String inputRemovedWhitespace = inputLowerCase.replaceAll("\\s", "");
        String[] letterArray = inputRemovedWhitespace.split("");
        HashMap<String, Integer> letterFrequencyMap = new HashMap<String, Integer>();
        CharacterFrequency charFrequency = new CharacterFrequency();

        charFrequency.updateLetterFrequencies(letterArray, letterFrequencyMap);
    }
}
