import java.util.HashMap;

public class LT2325{

    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        char decodedChar = 'a';

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);

            if (ch != ' ' && !map.containsKey(ch)) {
                map.put(ch, decodedChar);
                decodedChar++;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (ch == ' ') {
                result.append(' ');
            } else {
                result.append(map.get(ch));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

        String answer = decodeMessage(key, message);

        System.out.println(answer);
    }
}