public class StringCompression {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        // a a b b c c c
        // a 2 b 2 c 3
        int i = 0;
        while (i < chars.length) {
            int count = 1;
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            sb.append(chars[i]);
            if (count > 1) {
                sb.append(count);
            }
            i++;
        }
        for (i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
