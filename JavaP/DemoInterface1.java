class A
{
	int i=2;
	void disp()
	{
		System.out.println("In disp:");
	}	
}
interface B
{
	static final double pi=3.14;
	public void disp1();
}
class DemoInterface1 extends A implements B

{
	public void disp1()
	{
		System.out.println("In disp1:");
		
	}	
		public static void main (String args[])
		{
			DemoInterface1 d1=new DemoInterface1();
			d1.disp1();
			d1.disp();
				
		}	
}