class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        boolean flag = false;
        ArrayList<String> list = new ArrayList<>();
        if (s1.equals(s2)){
            return true;
        }
        else {
            for (int i = 0; i <s1.length(); i++){
                if (s1.charAt(i) != s2.charAt(i)){
                    count++;
                    list.add(String.valueOf(s1.charAt(i)));
                    list.add(String.valueOf(s2.charAt(i)));
                }
            }
            if (count == 2){
                if (list.get(0).equals(list.get(list.size() - 1))){
                    if (list.get(list.size() - 2).equals(list.get(1))){
                        flag = true;
                    }
                }   
            }
        }
        return flag;
    }
}