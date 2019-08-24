import java.util.*;
public class Practice01MathIterative implements Practice01Math{

	
	public Practice01MathIterative () {
		return;
	}

	public int fib(int n)throws Exception{
		if(n<0){
			throw new IllegalArgumentException("Error no negative numbers"); 
		}
		else if(n<=1){
			return n; 
		}
		int f = 1; 
		int f2 = 1; 
		for(int i =2; i<n; i++){
			int temp = f; 
			f += f2; 
			f2 = temp; 
		}
		return f; 
	} 
	public int fact(int n)throws Exception{
		if(n<0){
			throw new IllegalArgumentException("Error no negative numbers"); 
		}
		int total = 1; 
		for(int i = 1; i <=n; i++){
			total *=i; 
		}
		return total; 
	}
}