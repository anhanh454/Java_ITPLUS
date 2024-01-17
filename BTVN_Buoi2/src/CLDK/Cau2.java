package CLDK;
import java.util.*;

public class Cau2 {
	public static void main(String[] args ) {
		/* Nhập vào điểm của một học viên. Kết quả trả về là
		xếp loại của học viên đó.
		Yêu cầu: - lớn hơn 8đ là giỏi
				 - lớn hơn 6,5đ là khá
				 - lớn hơn 5đ là trung bình
				 - còn lại là yếu*/
		float diem;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập điểm: ");
		diem = scanner.nextFloat();
		
		if( diem > 8)
		{
			System.out.println("Học viên xếp loại giỏi");
		}
		else if ( diem <= 8 && diem > 6.5)
		{
			System.out.println("Học viên xếp loại khá");
		}
		else if (diem <= 6.5 && diem >5)
		{
			System.out.println("Học viên xếp loại trung bình");
		}
		else
			System.out.println("Học viên xếp loại yếu");
		scanner.close();
	}
}
