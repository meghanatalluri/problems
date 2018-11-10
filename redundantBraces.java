public class Solution {
    public int braces(String A) {

        Stack < Character > s = new Stack();

        for (int i = 0; i < A.length(); i++) {
            boolean isRedundant = true;
            char c = A.charAt(i);
            char pop;
            if (c == ')') {
                pop = s.pop();
                while (pop != '(') {
                    if (pop == '+' || pop == '*' || pop == '-' || pop == '/')
                        isRedundant = false;
                    if (!s.isEmpty())
                        pop = s.pop();
                }

                if (isRedundant) {
                    return 1;
                }


            } else {
                s.push(c);

            }
        }
        return 0;
    }
}