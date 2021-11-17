package thucpham;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
public class HangSanhSu extends HangHoa {
	private String nhasx;
	private Date ngaynk;
	public HangSanhSu(String ma, String ten, int slton, double dongia,String nhasx,Date ngaynk) {
		super(ma, ten, slton, dongia);
		// TODO Auto-generated constructor stub
		this.nhasx = nhasx;
		this.ngaynk = ngaynk;
	}
	
	@Override
	public double VAT() {
		// TODO Auto-generated method stub
		return (this.getDongia()/100)*10;
		
	}
	public String getNhasx() {
		return nhasx;
	}
	public void setNhasx(String nhasx) {
		this.nhasx = nhasx;
	}
	public Date getNgaynk() {
		return ngaynk;
	}
	public void setNgaynk(Date ngaynk) {
		this.ngaynk = ngaynk;
	}

	@Override
	public String danhgia() {
		String c = "Ban duoc";
      //  SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
      
        Calendar t = Calendar.getInstance();
        t.add(Calendar.DAY_OF_YEAR, -10);
        Date tam = t.getTime();

       if (tam.compareTo(ngaynk) > 0)
       {
    	   if (slton >50)
    	   {
    		   c = "Ban cham";
    		  
    	   }
       }  
  
       return c;
       }

	@Override
	public String toString() {
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		return super.toString()+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + nhasx + "\t\t  " + df.format(ngaynk) ;
	}
      
			
	}