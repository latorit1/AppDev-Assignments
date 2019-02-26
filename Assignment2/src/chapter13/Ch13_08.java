package chapter13;

public class Ch13_08 {

	public static void main(String[] args) throws CloneNotSupportedException {
		MyStack stack1 = new MyStack();

		System.out.println("Pushing the number 4, 5, and 6 to 1st stack");
		stack1.push(new Integer(4));
		stack1.push(new Integer(5));
		stack1.push(new Integer(6));

		MyStack stack2 = (MyStack)stack1.clone();

		stack1.pop();

		System.out.print("1st ");
		System.out.println(stack1);
		System.out.print("2nd ");
		System.out.println(stack2);


	}

}
