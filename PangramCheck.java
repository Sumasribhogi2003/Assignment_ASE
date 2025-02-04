public class PangramCheck {
    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        sentence = sentence.toLowerCase();
        int index;
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';  // Convert char to index (0 for 'a', 25 for 'z')
                alphabet[index] = true;
            }
        }
        
        // Check if all letters are present
        for (boolean isPresent : alphabet) {
            if (!isPresent) {
                return false;  // If any letter is missing
            }
        }
        return true;  // All letters are present
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        if (isPangram(sentence)) {
            System.out.println("The sentence is a Pangram.");
        } else {
            System.out.println("The sentence is not a Pangram.");
        }
    }
}
