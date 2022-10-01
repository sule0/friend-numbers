
public class Main {

	public static void main(String[] args) {
		//the sum of the divisors of the friend numbers is equal to each other
		
		int num1=17296, num2=18416;
		int total1=0;
		int total2=0;
		
		for (int i=1;i<num1;i++) {
			if(num1%i==0) {
				total1+=i;
				
			}
			if(num2%i==0) {
			    total2+=i;
			    
			}}
		
		if(num1==total2 && num2==total1) {
			System.out.println("These numbers are friends numbers");
			return;
		}else {
			
			System.out.println("These numbers aren't friends numbers");
		}
		

	}

}
