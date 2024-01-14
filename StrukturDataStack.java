import java.util.Stack;

public class fitra {

    public static void main(String[] args) {
      Stack<Double>ifStack = new Stack<>();
      ifStack.push(2.37);
      System.out.println(" ifaStack");
        
        ifStack.push(2.89);
        ifStack.push(4.56);
        ifStack.push(10.3);
        ifStack.push(235.7);
        System.out.println("ifStack");
        
        double value = ifStack.pop();
        System.out.println("POP:" +value);
        System.out.println("ifStack");
        
        value = ifStack.peek();
        System.out.println("PEEK:" +value);
        System.out.println("ifStack");
        
        ifStack.push(439.6);
        ifStack.push(3.54);
        System.out.println("ifStack");
    }
}


