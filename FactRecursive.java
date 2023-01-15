public class FactRecursive{
	public static void main(String[] args){
		System.out.println(fact(5));
	}
	
	public static int fact(int n){
		/* int res = 1;
		for(int i=1;i<=n;i++){
			res = res * i;
		}
		
		return res; */
		if(n==1) return 1;
		return n * fact(n-1);
	}
}