package thucpham;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
public class Test{

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd,MM,yyyy");
		DanhSachHangHoa ld = new DanhSachHangHoa();
		Scanner sc = new Scanner(System.in);
		int chon;
		do {
		System.out.println("1.Nhap");
		System.out.println("2.Xuat toan bo danh sach");
		System.out.println("3.Xem danh gia");
		
	
		 chon = sc.nextInt();
		switch(chon)
		{
		case 1:
		
			int nhap ;
			do {
			System.out.println("1.Nhap Hang Dien May");
			System.out.println("2.Nhap hang Sanh Su");
			System.out.println("3.Nhap hang thuc pham");
			System.out.println("4.thoat");
			 nhap = sc.nextInt();
			switch(nhap)
			{
				case 1:
				
					System.out.println("=============Nhap Hang Dien May=========:\n");
					System.out.println("Nhap ma hang:");
					sc.nextLine();
					String ma = sc.nextLine();
					
					System.out.println("Nhap ten hang:");
					String ten = sc.nextLine();
					System.out.println("Nhap so luong ton: ");
					int sl = sc.nextInt();
					System.out.println("Nhap don gia: ");
					double dongia = sc.nextDouble();
					System.out.println("Nhap thang bao hiem: ");
					int bh = sc.nextInt();
					System.out.println("Nhap cong suat: ");
					int congsuat = sc.nextInt();
					HangHoa x = new HangDienMay(ma,ten,sl,dongia,bh,congsuat);
					ld.them(x);
					break;
					
					//public HangDienMay(String ma, String ten, int slton, double dongia,int bh,int congsuat) {
					
				
				
				case 2:
				
					System.out.println("=============Nhap Hang Sanh Su=========:\n");
					sc.nextLine();
					System.out.println("Nhap ma hang:");
					String ma2 = sc.nextLine();
					System.out.println("Nhap ten hang:");
					String ten2 = sc.nextLine();
					System.out.println("Nhap so luong ton: ");
					int sl2 = sc.nextInt();
					System.out.println("Nhap don gia: ");
					double dongia2 = sc.nextDouble();
					System.out.println("Nhap ten nha san xuat: ");
					String nhasx = sc.nextLine();
					Date ngaynk;
					try {
						sc.nextLine();
						System.out.println("Ngay nhap kho");
						ngaynk = df.parse(sc.nextLine());
						HangHoa x2 = new HangSanhSu (ma2,ten2,sl2,dongia2,nhasx,ngaynk);
						ld.them(x2);
						break;

					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				//	public HangSanhSu(String ma, String ten, int slton, double dongia,String nhasx,Date ngaynk) {
					
				
				case 3 : System.out.println("=============Nhap Hang Thuc Pham =========:\n");
				sc.nextLine();
				System.out.println("Nhap ma hang:");
				String ma3 = sc.nextLine();
				System.out.println("Nhap ten hang:");
				String ten3 = sc.nextLine();
				System.out.println("Nhap so luong ton: ");
int sl3 = sc.nextInt();
				System.out.println("Nhap don gia: ");
				double dongia3 = sc.nextDouble();
				System.out.println("Nhap ngay san xuat: ");
				Date ngaysx,ngayhh;
				try {
					sc.nextLine();
					ngaysx = df.parse(sc.nextLine());
					System.out.println("Nhap ngay het han");
					ngayhh = df.parse(sc.nextLine());
					System.out.println("Nhap nha san xuat");
					String nhasx3 = sc.nextLine();
					HangHoa x3 = new HangThucPham(ma3,ten3,sl3,dongia3,ngaysx,ngayhh,nhasx3);
					ld.them(x3);
					break;

					} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					}
												
						
				case 4: 
					break;
				
				} // case 1 nho
			} while (nhap >=1 && nhap<=3);
			
		
			
			case 2: // mở case 2 lớn 
			
				ld.showAll(); break;
			
			case 3: 
			
				sc.nextLine();
				System.out.println("Nhap ma hang hoa muon xem tinh trang: ");
				String ma = sc.nextLine();
				System.out.println(ld.tinhtrang(ma));
				break;
			
				
			
		
					
		}	
		} while (chon >= 1 && chon <= 3);
		// switch lớn
		
		
	} 
}