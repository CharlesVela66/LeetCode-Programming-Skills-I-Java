class Solution {
    public char findTheDifference(String s, String t) {
        // https://www.youtube.com/watch?v=sRwElQ_TOr8&ab_channel=KnowledgeCenter
        char c = 0;
        for (char cs : s.toCharArray()){
            c ^= cs;
        }
        for (char ct : t.toCharArray()){
            c ^= ct;
        }
        return c;
    }
}