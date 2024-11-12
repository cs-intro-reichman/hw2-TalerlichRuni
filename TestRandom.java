public class TestRandom {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        int i = 0; 
        int little = 0;
        int big = 0;
        while (i < n) 
		{
            double result = Math.random();
            if (result <= 0.5)
			 {
                little++;
            } 
			else
			 {
                big++;
            }
            i++;
        }

        double ratio; 
        if (little != 0 && big != 0) {
            ratio = (double) Math.min(little, big) / Math.max(little, big);  
            System.out.println("> 0.5: " + big + " times");
            System.out.println("<= 0.5: " + little + " times");
            System.out.println("Ratio: " + ratio);
        }
		 else 
		 {
            System.out.println("> 0.5: " + big + " times");
            System.out.println("<= 0.5: " + little + " times");
        }
    }
}
