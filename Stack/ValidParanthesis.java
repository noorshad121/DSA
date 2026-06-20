import java.util.Stack;

public class ValidParanthesis {

    public static boolean getValidParanthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            // opening braces
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            } else{
                if(s.isEmpty()){
                    return false;
                }
            }
            // closing braces 
            char top = s.peek();
             if((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')){
                s.pop();
            }
        }

        if(s.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = ")";
        System.out.println(getValidParanthesis(str));
    }
}
