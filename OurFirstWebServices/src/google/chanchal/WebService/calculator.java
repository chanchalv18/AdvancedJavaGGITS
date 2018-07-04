package google.chanchal.WebService;

public class calculator {
             
	public String hello(String name){
		String result="";
		
		
		result="Hello"+name;
		
		return result;
		
	}
	public int add(int A, int B){
		
		int sum = A+B;
		
		return sum;
		
		
	}
	public int sub(int A, int B){
		int diff = A-B;
		
		return diff;
		
		
	}
	
	
	public int mul(int A, int B){
		int mul = A*B;
		
		return mul;
		
		
	}
	
	public int div(int A, int B){
		int div = A/B;
		
		return div;
		
		
	}
	
	
}
