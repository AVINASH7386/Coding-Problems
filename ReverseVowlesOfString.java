public class ReverseVowlesOfString {

    public String reverseVowels(String s) {

        int start = 0;
        int end = s.length() - 1;
        // converting string to char array 
        char[] result = s.toCharArray();
    
        while (start < end) {
            // finding first vowel
            while (start < end && !isVowel(result[start])) {
                start++;
            }
            // finding last vowel
            while (start < end && !isVowel(result[end])) {
                end--;
            }
            // swapping them accorgingly
            if (start < end) {
                swap(start, end, result);
                start++;
                end--;
            }
        }
        return new String(result);
    }

    public static void swap(int start, int end, char[] arr) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U';
    }

}
