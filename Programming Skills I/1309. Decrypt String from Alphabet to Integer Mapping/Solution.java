class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()){
            if (i + 2 < s.length() && s.charAt(i + 2) == '#'){
                String s1 = String.format("%c%c", s.charAt(i), s.charAt(i + 1));
                sb.append( (char) (96 + Integer.parseInt(s1)));
                i += 3;
            }
            else {
                String s2 = String.format("%c", s.charAt(i));
                sb.append( (char) (96 + Integer.parseInt(s2)));
                i++;
            }
        }
        return sb.toString();
    }
}