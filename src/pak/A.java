package pak;

public class A
{
	private String myString;
	private int myInt;
	public float myFloat;
	
	public A(String myString, int myInt)
	{
		super();
		this.myString = myString;
		this.myInt = myInt;
	}
	
	public String getMyString()
	{
		// This change is for jordan
		int x = 0;
		return myString;
	}
	
	public void setMyString(String myString)
	{
		this.myString = myString;
	}
	
	public int getMyInt()
	{
		return myInt;
	}
	
	public void setMyInt(int myInt)
	{
		this.myInt = myInt;
	}
}
