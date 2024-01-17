package CLDK;
import java.util.*;

public class Cau1 {
	public static void main(String[] args) {
		//Cho 3 số nguyên, tìm sln trong 3 số đó
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Nhập số thứ nhất: ");
		int a = scanner.nextInt();
		System.out.println("Nhập số thứ hai: ");
		int b = scanner.nextInt();
		System.out.println("Nhập số thứ ba: ");
		int c = scanner.nextInt();
		
		if(a>=b && a>=c)
			System.out.println(a+ " là số lớn nhất");
		else if (b>=a && b>=c)
			System.out.println(b+ " là số lớn nhất");
		else
			System.out.println(c+ " là số lớn nhất");
		scanner.close();
		
		}
	}
