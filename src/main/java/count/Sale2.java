package count;

public class Sale2 
{
	int price,count ;
	String garment; 
	
	public Sale2(String garment, int count,int price ) {
		super();
		this.price = price;
		this.count = count;
		this.garment = garment;
	}
	@Override
	public String toString() {
		return "\n\n price=" + price + "\n count=" + count + "\n garment=" + garment + "\n\n";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getGarment() {
		return garment;
	}
	public void setGarment(String garment) {
		this.garment = garment;
	}
}