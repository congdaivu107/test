package thucpham;

import java.util.ArrayList;


public class DanhSachHangHoa {
	private ArrayList<HangHoa> list = new ArrayList<>();
	
	void them(HangHoa x)
	{
		
		for (HangHoa x1 : list) {
			if (x.getMa().equals(x1.getMa())) {
				System.out.println("Trung ma hang hoa khong them duoc");
				return;
			}
		}
			
				list.add(x);
			
			
		
		}
	
	
	
	
	void them1(HangHoa x)
	{
		list.add(x);
	}
	
	
	void showAll()
	{
		System.out.println("Ma\tTen\t\t\tSo Luong Ton \tDon Gia\t\tNgay san xuat\tNgay het han\tNha san xuat\t\tBao Hanh\t\tCong Suat \t\tNha san xuat\t\t Ngay Nhap kho");
		System.out.println("=============================================================================================================================================");
		for(HangHoa x : list)
		{
			System.out.println(x.toString());
		}
	}
	String tinhtrang(String x)
	{
		for (HangHoa t : list)
		{
			if (t.getMa().equals(x))
			{
				String a="Ma\tTen\t\t\tSo Luong Ton \t Tinh trang\n";
				String b = t.getMa()+"\t"+t.getTen()+"\t\t\t"+t.getSlton()+"\t\t  "+t.danhgia();
				return a+b;
				
			}
			
		}
		return "khong ton tai san pham";
		
	}
	void Vat(String id)
	{
		for (HangHoa t:list)
		{
			if (t.getMa().equals(id))
			{
				System.out.println	("Ma\tTen\t\t\tSo Luong Ton \tVat\n");
				System.out.println(t.ma+"\t"+t.getTen()+"\t\t\t"+t.getSlton()+"\t"+t.VAT());
				
			}
		}
	}
	

}