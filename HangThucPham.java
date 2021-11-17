package thucpham;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class HangThucPham extends HangHoa {

	
		private Date ngaysx;
		private Date ngayhh;
		private String nhasx;
	public HangThucPham(String ma, String ten, int slton, double dongia,Date ngaysx,Date ngayhh,String nhasx ) {
		super(ma, ten, slton, dongia);
		// TODO Auto-generated constructor stub
		this.setNgaysx(ngaysx);
		this.setNgayhh(ngayhh);
		this.nhasx = nhasx;
	}
	@Override
	public double VAT() {
		return (this.getDongia()/100)*5;
		
	}
	public Date getNgaysx() {
		return ngaysx;
	}
	public void setNgaysx(Date ngaysx) {
		this.ngaysx = ngaysx;
	}
	public Date getNgayhh() {
		return ngayhh;
	}
	public void setNgayhh(Date ngayhh) {
		
			if (ngayhh.compareTo(ngaysx) < 0 )
			{
				System.out.println("\nNgay hh phai>= ngay sx");
			}
			this.ngayhh = ngayhh;
		}
		
		
	
	public String getNhasx() {
		return nhasx;
	}
	public void setNhasx(String nhasx) {
		this.nhasx = nhasx;
	}
	@Override
	public String danhgia() {
		java.util.Date date=new java.util.Date();
		if (slton > 0 && ngayhh.compareTo(date) <= 0)
		{
		return "kho ban";
		}
		else return "ban duoc";
	}
	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		return super.toString()+"\t\t " +df.format(ngaysx) +"\t" + df.format(ngayhh) + "\t" + this.nhasx ;
	}
	
	

}