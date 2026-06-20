import java.util.Stack;

public class ReverseStack {

    public static void getReverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        getReverse(s);
        getPushAtButton(s, top);


    }

    public static void getPushAtButton(Stack<Integer> s, int data){
      
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        getPushAtButton(s, data);
        s.push(top);
    }

    public static void print(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        getReverse(s);
         print(s);
    }
}
