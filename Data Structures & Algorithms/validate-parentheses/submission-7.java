class Solution {
    public boolean isValid(String s) {  
        Stack stack = new Stack();
        java.util.Map<Character, Character> map = new java.util.HashMap<>();


    map.put(')', '(');
    map.put(']', '[');
    map.put('}', '{');

    for (Character c: s.toCharArray()) {
        if (map.containsKey(c)) {
            if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                stack.pop();
            } else {
                return false;
            }
        } else {
            stack.push(c);
        }
        
    }
return stack.isEmpty();
}
}
