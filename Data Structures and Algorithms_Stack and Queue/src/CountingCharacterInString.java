import java.util.TreeMap;

public class CountingCharacterInString {
    public static void main(String[] args) {
        TreeMap<Character, Integer> characters = new TreeMap<Character, Integer>();
        String str = "Welcome Back Khanh Supper";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            Character x = Character.toUpperCase(str.charAt(i));
            if (x == ' '){
                continue;
            }
            if (characters.containsKey(x)) {
                int repeatTime = characters.get(x) + 1;
                characters.put(x, repeatTime);
            } else {
                characters.put(x, 1);
            }
        }
        System.out.println(characters);
    }
}
