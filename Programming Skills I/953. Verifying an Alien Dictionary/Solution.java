class Solution {
    //https://www.youtube.com/watch?v=qSbJZWENtX4&ab_channel=NickWhite
    public Map <Character, Integer> alienDict = new HashMap<>();
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++){
            alienDict.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++){
            if (!compare(words[i], words[i + 1])){
                return false;
            }
        }
        return true;
    }
    public boolean compare(String word1, String word2){
        int i = 0;
        int j = 0;

        int positionAlienDictW1 = -1;
        int positionAlienDictW2 = -1;

        while (i < word1.length() && j < word2.length()){
            positionAlienDictW1 = alienDict.get(word1.charAt(i));
            positionAlienDictW2 = alienDict.get(word2.charAt(j));

            if (positionAlienDictW1 < positionAlienDictW2){
                return true;
            }
            else if (positionAlienDictW1 > positionAlienDictW2){
                return false;
            }

            i++;
            j++;
        }
        if (positionAlienDictW1 == positionAlienDictW2){
             //same words, check => ["hello", "hel"] is false and ["hel", "hello"] is true
            return word1.length() <= word2.length();
        }
        return true;
    }
}