class Solution {
    public boolean isValid(String s) {
       
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char bracket = s.charAt(i);

            // if opening bracket than add and continue
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.add(bracket);
                continue;
            }

            // if its not an opening bracket than the stack cannot be empty
            if (stack.isEmpty()) return false;

            char openingBracket = stack.pop();

            if (openingBracket == '(' && bracket != ')') {
                return false;
            }

            if (openingBracket == '{' && bracket != '}') {
                return false;
            }

            if (openingBracket == '[' && bracket != ']') {
                return false;
            }
        }


        return stack.isEmpty();
    }
}
