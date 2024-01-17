package CLL;

import java.util.*;
public class Cau1 {
	public static void main (String[] args)
	{
		//tính giai thừa của 1 số
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số: ");
		n = scanner.nextInt();
		
		if(n < 0)
		{
			System.out.println("Không tính được");
		}
		else
		{
			long kq = tinhGiaithua(n);
			System.out.println("Giai thừa của " + n + " là: " + kq);
			scanner.close();
		}
	}
	public static long tinhGiaithua(int a)
	{
		if(a==0 || a ==1)
		{
			return 1;
		}
		long gt = 1;
		for (int i = 2; i<=a; i++)
		{
			gt *= i;
		}
		return gt;
	}
}
