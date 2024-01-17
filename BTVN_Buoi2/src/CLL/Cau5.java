package CLL;

public class Cau5 {
	public static void main(String[] args)
	{
		/*in ra các số từ 1 -> 100. Nếu số đó chia hết cho 3 in ra từ "Hello",
		 * chia hết cho 5 in ra từ "World", chia hết cho cả 3 và 5 in ra từ "HelloWorld".
		 * Các số khác in ra số như bình thường
		 */
		for(int i=1;i <= 100; i++)
		{
			if(i%3 == 0 && i%5 == 0)
			{
				System.out.println("HelloWorld");
			}
			else if (i%3 == 0)
			{
				System.out.println("Hello");
			}
			else if (i%5 == 0)
			{
				System.out.println("World");
			}
			else
				System.out.println(i);
		}
	}
}
