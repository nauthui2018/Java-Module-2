import java.util.Arrays;
import java.util.Stack;

public class reverseArrayByStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Stack<String> myStack1 = new Stack<>();
        int[] myArray = new int[5];
        String[] str = {
                "getting", "good", "at", "coding",
                "needs", "a", "lot", "of", "practice"};
        int length = myArray.length;
        int length1 = str.length;
        for (int i = 0; i < length; i++) {
            myArray[i] = (int) (Math.random() * 20);
            myStack.push(myArray[i]);
        }
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < length; i++) {
            myArray[i] = myStack.pop();
        }
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < length1; i++) {
            myStack1.push(str[i]);
            System.out.print(str[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < length1; i++) {
            str[i] = myStack1.pop();
            System.out.print(str[i] + " ");
        }
    }
}
