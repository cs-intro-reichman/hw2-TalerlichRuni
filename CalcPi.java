public class CalcPi {
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);  
        double pi = 1.0;  
        double divisor = 3;
        int i = 2;
        while (i < n+1 )
		 {
            if (i % 2 == 0) 
			{
                pi = pi - (1.0 / divisor);  
            } 
			else 
			{
                pi = pi + (1.0 / divisor);  
            }
            divisor = divisor + 2; 
            i++;
        }
        pi = pi* 4;  
        System.out.println("pi: " + Math.PI);
        System.out.printf("pi, approximated: %.15f\n", pi);
    }
}
