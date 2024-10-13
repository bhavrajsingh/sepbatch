package package1;

public class airthmatic1 {
//((((10+2)-2)+2)*2/2)
	public int sum (int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum="+c);
		return c;
	}
	public int sub (int c, int d)
	{
		int e;
		e=c-d;
		System.out.println("sub="+e);
		return e;
	}
	public int mul (int z1, int z2)
	{
		int f;
		f=z1*z2;
		System.out.println("mul="+f);
		return f;
	}
	public void div (int y1, int y2)
	{
		int x;
		x=y1/y2;
		System.out.println("final result div="+x);
	}
	public static void main(String[] args) {
		airthmatic1 ob = new airthmatic1();
		int sumresult=ob.sum(10, 2);
		int subresult=ob.sub(sumresult, 2);
		int sumresult2=ob.sum(subresult, 2);
		int mulresult=ob.mul(sumresult2, 2);
		ob.div(mulresult, 2);
		
		
	}
}
