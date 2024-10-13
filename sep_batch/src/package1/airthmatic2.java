package package1;

public class airthmatic2 {
public int mul(int a,int b)
{
	int c;
	c=a*b;
	return c;
}
public int sub(int d, int e)
{
	int f;
	f=d-e;
	return f;
}
public int sum(int g,int h)
{
	int i;
	i=g-h;
	return i;
}
public void div(int j,int k)
{
	int l;
	l=j/k;
}
public static void main(String[] args) {
	airthmatic1 ob = new airthmatic1();
	int mulresult=ob.mul(10, 2);
	int subresult=ob.sub(mulresult, 2);
	int subresult2=ob.sub(subresult, 2);
	int sumresult=ob.sum(subresult2, 2);
	ob.div(sumresult, 2);
}
}
