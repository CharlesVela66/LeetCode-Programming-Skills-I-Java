class Solution {
    public String interpret(String command) {
        String output = "";
        for (int i = 0; i < command.length(); i++){
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                output += "o";
                i++;
            }
            else if (command.charAt(i) == '(' && command.charAt(i + 1) != ')'){
                
            }
            else if (command.charAt(i) == ')' && command.charAt(i - 1) != '('){

            }
            else {
                output += command.charAt(i);
            }
        }
        return output;
    }
}