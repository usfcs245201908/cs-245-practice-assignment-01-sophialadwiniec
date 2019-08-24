import java.lang.*; 
 
public class Practice01MathRecursive implements Practice01Math{

	
	public Practice01MathRecursive () {
		return;
	}
	
	public int fib (int n)throws Exception{
		if(n<0){
			throw new IllegalArgumentException("Error no negative numbers"); 
		}
		if(n==1 || n==0){
			return n; 
		}
		return fib(n-1)+fib(n-2); 
	}
	public int fact (int n)throws Exception{
		if(n<0){
			throw new IllegalArgumentException("Error no negative numbers"); 
		}
		if(n<=1){
			return 1; 
		}
		return n*fact(n-1);
	}
}