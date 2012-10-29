package pak;

public class C {
	private int myInt;
	private B b;
	private String SomethingNew;

	public C(int myInt, B b)
	{
		super();
		this.myInt = myInt;
		this.b = b;
	}

	public int getMyInt()
	{
		return myInt;
	}

	public void setMyInt(int myInt)
	{
		this.myInt = myInt;
	}

	public B getB()
	{
		return b;
	}

	public void setB(B b)
	{
		this.b = b;
	}

	public String getSomethingNew() 
	{
		return SomethingNew;
	}
}
