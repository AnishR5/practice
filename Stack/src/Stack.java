
public class Stack {
	
	private int[] arr;
	private int top; 
	
	public Stack(int size)
	{
		arr=new int[size];
		top=-1;
	}
	
	public boolean isFull()
	{
		return top==arr.length-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean push(int data)
	{
		if(isFull())
			return false;
		top++;
		arr[top]=data;
		return true;					
	}
	
	public boolean pop()
	{
		if(isEmpty())
			return false;
		top--;
		return true;
	}
	
	public void peek()
	{
		if(isEmpty())
			throw new RuntimeException("stack empty");
		System.out.println(arr[top]);
	}

}
