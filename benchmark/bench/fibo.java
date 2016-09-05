// $Id: fibo.java,v 1.3 2005-04-25 19:01:38 igouy-guest Exp $
// http://www.bagley.org/~doug/shootout/

public class fibo {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        System.out.println(fib(N));
    }

	//implementacion de la serie de fibonacci recursivamente
    public static int fibonacci(int n) {
        if (n < 2) return(1);
        return( fibonacci(n-2) + fibonacci(n-1) ); //Aquiusamos recursion
    }
}
