
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char  a1='A';
		char a2=65;
		char i1=5;
		char i2=10;
		
		boolean res1=(i1==i2)&&(a1==a2);
		System.out.println(res1);
		boolean res2=(i1==i2)&(a1==a2);
		System.out.println(res2);
		
		boolean res3=(a1==a2)||(i1==i2);
		System.out.println(res3);
		
		boolean res4=(a1==a2)|(i1==i2);
		System.out.println(res4);
		
		boolean res5=(a1==a2)^(i1==i2);
				System.out.println(res5);
				
		boolean res6=(a1==a2)^(i1!=i2);
		System.out.println(res6);	
	}

}
