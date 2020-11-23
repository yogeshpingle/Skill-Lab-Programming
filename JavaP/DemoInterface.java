
interface Abc
{
	static final double pi=3.14;
	public void disp();
}
class Def
{
	int i=22;
	void disp1()
	{
		System.out.println("In disp1:");
	}
}
class DemoInterface extends Def implements Abc
{
	public void disp()
	{
		System.out.println("In disp:");
	}
	public static void main(String[] args)
	{
		DemoInterface di=new DemoInterface();
		di.disp1();
		di.disp();
	}
    
}