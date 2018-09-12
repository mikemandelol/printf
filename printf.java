import cs1.Keyboard;
import java.util.Scanner;

public class printf
{
	public static void main(String[] args)
	{
		double total;
		double point;
		total = (142.18 + 5.66);
		point = (15*6.6666666667);
		System.out.printf("Numer of Items purchased:%12d \n",15);
		System.out.printf("Subtotal:  %30.2f \n",142.18);
		System.out.printf("Tax: 	 %30.2f \n",5.66);
		System.out.printf("	                           ----- \n");
		System.out.printf("Total:     %30.2f \n",+total);
		System.out.printf("				\n");
		System.out.printf("Gas points earned:%20d \n",+(int)(point));
	}
}
