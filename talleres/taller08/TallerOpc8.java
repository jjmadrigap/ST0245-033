import java.util.Queue;
import java.util.Stack;

public class TallerOpc8 {
    public static Stack<Integer> inversa (Stack<Integer> stack){
        int size = stack.size();
        Stack<Integer> temp = new Stack<Integer>();
        for(int i = 0; i < size; i++)
            temp.push(stack.pop());
        return temp;
    }
    public static void cola(Queue<String> queue){
        while (queue.size()>0)
            System.out.println("Atendiendo a " + queue.poll());
    }
}
