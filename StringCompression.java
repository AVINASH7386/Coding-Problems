public class StringCompression {
    public int compress(char[] chars) {
        // checking if length is 1 if its one we can reutrn 1 and no need to modify given array as well
        if (chars.length == 1) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        // a a b b c c c
        // a 2 b 2 c 3
        int i = 0;
        // traversing will end
        while (i < chars.length) {
            int count = 1;
            // checking whether current character is equal to next element or not, if its same going through all similar characters
            // adding the count of it
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            // adding charcter to string builder
            sb.append(chars[i]);
            // if count is greater than 1 then only we need to add the count to array
            if (count > 1) {
                sb.append(count);
            }
            i++;
        }
        // my string builder is having the required format which need to replace with given string
        for (i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        // returning length 0f string builder as we need to return the length of modified array
        return sb.length();
    }
}
