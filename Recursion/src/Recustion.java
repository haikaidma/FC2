
public class Recustion {
public static long factorial(int n) {
	if(n==0)
		return 1;
	else return n*factorial(n-1);
}
public static void BS(int n)
{
	if(n<0)
		System.out.println("no");
	else
		if(n==0)
			System.out.println("BS");
		else BS(n-10);
}
public static int UCLN(int a, int b ) {
	if(a==0||b==0)
		return a+b;
	if(a>=b)
		return UCLN(a-b,b);
	else
		return UCLN(a,b-a);
}
public static long mod(int a, int b) {
	if(a==0||b==0)
		return 0;
	if(a>=b)
		return mod(a-b,b);
	else 
		return a;
}
public static long div(int a, int b,int d) {
	int dem=d;
	if(b==0)
		return 0;   
	if(a>=b)
		return div(a-b,b,dem+1);
	else
		return dem;
}
public static long mu(int n) {
	if(n==0)
		return 1;
	if(n>0)
			//return 2*mu(n-1);
				return mu(n-1)+mu(n-1);
	else 
		return -1;
}
public static long mu2n(int n) {
	if(n==0)
		return 2;
	else 
		return mu2n(n-1)*mu2n(n-1);
}
public static long xmuy(int x,int y) {
	if(y==0)
		return 1;
	else
		return x*xmuy(x,y-1);
}

public static void main(String[] args ) {

	Recustion.factorial(5);
	Recustion.BS(50);
	System.out.println(Recustion.UCLN(0, 3));
	System.out.println(Recustion.mod(4, 3));
	System.out.println(Recustion.div(4,2,0));
	System.out.println(Recustion.mu(4));
	System.out.println(Recustion.xmuy(3,3));
	System.out.println(Recustion.mu2n(3));
}
}
