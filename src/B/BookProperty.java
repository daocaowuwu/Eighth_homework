package B;

public class BookProperty {
	private String name; //书名
	private double singleprice;  //单价
	private String publishhouse;  //出版社
	BookProperty(){
		
	}
		
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public double getsingleprice() {
		return singleprice;
	}
	public void setsingleprice(double singleprice) {
		this.singleprice=singleprice;
	}
	
	public String getpublishhouse() {
		return publishhouse;
	}
	public void setpublishhouse(String publishhouse) {
		this.publishhouse=publishhouse;
	}
	
	

}