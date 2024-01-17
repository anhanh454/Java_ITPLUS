package CLL;

public class Cau3 {
	public static void main(String[] args)
	{
		// In ra màn hình 20 số đầu tiên của dãy số fibonacci
		int st1 = 0, st2 = 1;
		System.out.println(" 20 số đầu tiên của dãy Fibonacci: ");
		
		for (int i =0; i < 20; i++)
		{
			System.out.println(st1 + "");
			int s = st1 + st2;
			st1 = st2;
			st2 = s;
		}
	}
}
