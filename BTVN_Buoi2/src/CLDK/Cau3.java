package CLDK;
import java.util.*;

public class Cau3 {
	public static void main(String[] args)
	{
		/* nhập vào 1 số. Nếu số đó lớn hơn 0 thì in ra chuỗi "Positive",
		 * nhỏ hơn 0 thì in chuỗi "Negative", bằng 0 thì in ra chính số 0
		 */
		float n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào một số: ");
		
		n = scanner.nextFloat();
		
		if (n > 0)
		{
			System.out.println("Positive");
		}
		else if ( n < 0)
		{
			System.out.println("Negative");
		}
		else
			System.out.println("0");
		scanner.close();
	}
}
