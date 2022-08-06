package DemoVariables;

public class VariablesOperators {
//	Variables
	int a=25;           //instance veriable
	static float b=13.25f;    //static veriable
	void veriable() {
		int a=45,b=41;     //local veriable
		System.out.println(a+b);	
	}
//  Operators
	void Arithmatic() {
		int a=15,b=95;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	static void Relational() {
		int a=25,b=60;
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesOperators n=new VariablesOperators ();
		n.veriable();
		System.out.println(n.a);
		System.out.println(b);
		n.Arithmatic();
		Relational();
	}

}
