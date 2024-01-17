package CLL;

import java.util.*;
public class Cau4 {
	public static void main(String[] args)
	{
		//tính lãi kép cho 1 ngân hàng. Đầu vào có số tiền gửi, lãi suất và số tháng gửi
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số tiền gửi vào: ");
		double tiengui = sc.nextDouble();
		System.out.print("Nhập vào lãi suất: ");
		double lai = sc.nextDouble();
		System.out.print("Nhập số tháng gửi: ");
		int thang = sc.nextInt();
		
		double tienlai = tiengui * Math.pow(1+lai / 12,thang);
		System.out.printf("Lãi kép sau %d tháng là: %.2f",thang,tienlai);
		sc.close();
	}
}
