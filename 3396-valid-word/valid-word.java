class Solution
{
    public static boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false; // invalid character
            }

            if (isVowel(ch)) {
                hasVowel = true;
            } else if (Character.isLetter(ch)) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
