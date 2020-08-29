import java.util.Arrays;
import java.util.Stack;

public class reverseArrayByStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        int[] myArray = new int[5];
        int length = myArray.length;
        for (int i = 0; i < length; i++) {
            myArray[i] = (int) (Math.random() * 20);
            myStack.push(myArray[i]);
        }
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < length; i++) {
            myArray[i] = myStack.pop();
        }
        System.out.println(Arrays.toString(myArray));
    }
}
