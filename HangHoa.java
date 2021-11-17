package thucpham;

public abstract class HangHoa {
	protected String ma ;
	private String ten;
	protected int slton;
	private double dongia;
	
	public abstract double VAT() ;
	public abstract String danhgia();
	
	public String getMa() {
		return ma;
	}
	
	public String getTen() {
		
		return ten;
	}
	public void setTen(String ten) {
		
		if (ten.trim().length()>0)
		this.ten = ten;
		else System.out.println("\nKhong duoc de trong ten");
		
	}
	public int getSlton() {
		return slton;
	}
	public void setSlton(int slton) {
		
		if (slton >= 0 )
		this.slton = slton;
		else System.out.println("so luong ton phai >= 0");
	
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		
			if (dongia > 0)
		this.dongia = dongia;
			else System.out.println("don gia phai > 0");
		
	}


	public HangHoa(String ma, String ten, int slton, double dongia) {
		super();
		
			if (ma.trim().length() != 0)
			{
				this.ma = ma;}
			else { System.out.println("ma khong duoc rong");}
		this.setTen(ten);
		this.setSlton(slton);
		this.setDongia(dongia);
	}
	@Override
	public String toString() {
		return   ma + " \t" + ten + "\t\t\t" + slton + "\t\t" + dongia ;
	}
	
	

}