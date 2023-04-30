package day14BasciA;

public class StackMainClass {

	public static void main(String[] args) {
		MyStack stack1 = new MyStack();

		stack1.push(70);
		stack1.push(30);
		stack1.push(56);

		stack1.printStack();

		stack1.peak();
		stack1.pop();
		stack1.printStack();

		stack1.peak();
		stack1.pop();
		stack1.printStack();

		stack1.peak();
		stack1.pop();

		stack1.peak();
		stack1.pop();
	}

}
