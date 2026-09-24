public class Multadd{

	public static double multadd(double a, double b, double c){
		return a*b+c;
	}

	public static double expSum(double x){
		return multadd(1, multadd(x, Math.exp(-x), 0), Math.sqrt(multadd(1, 1, -Math.exp(-x))));
	}

	public static void main(String[] args){
		System.out.println(multadd(1.0, 2.0, 3.0));
		System.out.println(multadd(Math.sin(Math.PI/4), 1,(Math.cos(Math.PI/4))/2));
		System.out.println(multadd(Math.log(10.0), 1, Math.log(20.0)));
	}
	
}
