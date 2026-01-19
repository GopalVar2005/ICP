
public class StackUsingArray {
	int[] arr;
	int idx;
	public StackUsingArray()
	{
		arr=new int[10];
		idx=0;
	}
	public StackUsingArray(int n)
	{
		arr=new int[n];
		idx=0;
	}
	public void push(int n)
	{
		int len=arr.length;
		if(idx>=len)
		{
			throw new RuntimeException("Stack Overflow");
		}
		arr[idx]=n;
		idx++;
	}
	public int pop()
	{
		if(idx<=0)
		{
			throw new RuntimeException("Stack Underflow");
		}
		idx--;
		int val=arr[idx];
		return val;
	}
	public int peek()
	{
		if(idx<=0)
		{
			throw new RuntimeException("Stack Underflow");
		}
		int val=arr[idx-1];
		return val;
	}
	public boolean isEmpty()
	{
		return idx==0;
	}
}
