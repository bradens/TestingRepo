package pak;

public class B
{
	private A a;
	private int myInt;
	
	public B(A a, int myInt)
	{
		super();
		this.a = a;
		this.myInt = myInt;
	}
	
	public String getMyAString() {
		return a.getMyString();
	}

	public A getA()
	{
		return a;
	}

	public void setA(A a)
	{
		this.a = a;
	}

	public int getMyInt()
	{
		return myInt;
	}

	public void setMyInt(int myInt)
	{
		this.myInt = myInt;
	}

	public void adrianMethod() {
		int x = 0;
		x = x+x;
	}
}
