package thucpham;



public class HangDienMay extends HangHoa{

	private int bh;
	private int congsuat;
	public HangDienMay(String ma, String ten, int slton, double dongia,int bh,int congsuat) {
		super(ma, ten, slton, dongia);
		// TODO Auto-generated constructor stub
		this.setBh(bh);
		this.setCongsuat(congsuat);
		
	}
	@Override
	public double VAT() {
		return (this.getDongia()/100)*10;
		
	}
	public int getBh() {
		return bh;
	}
	public void setBh(int bh) {
		
			if (bh >= 0) 
				this.bh = bh;
			else System.out.println("Bao hanh phai >=0");
		
	}
	public int getCongsuat() {
		return congsuat;
	}
	public void setCongsuat(int congsuat) {
		
			if (congsuat>0)
		this.congsuat = congsuat;
			else System.out.println("cong suat phai > 0 ");
		
	}
	@Override
	public String danhgia() {
		if (slton < 3)
		{
			return "ban duoc";
		}
		else return "kho ban";
	}
	@Override
	public String toString() {
		return super.toString()+"\t\t\t\t\t\t\t\t\t "+bh + "\t\t\t " + congsuat ;
	}
	
	

}