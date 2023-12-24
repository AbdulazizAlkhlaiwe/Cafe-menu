public class Cafe {
	private double coffeePrice, teaPrice, donutPrice, discount, subtotal, discountedPrice, total;
	private int coffeTotQty, teaTotQty, donutTotQty;
	
	public Cafe() {
		
	}
	
	
	
	public Cafe(double coffeePrice, double teaPrice, double donutPrice, int coffeeTotQty, int teaTotQty, int donutTotQty, double discount) {
		setCoffeePrice(coffeePrice);
		setTeaPrice(teaPrice);
		setDonutPrice(donutPrice);
		setCoffeTotQty(coffeeTotQty);
		setTeaTotQty(teaTotQty);
		setDonutTotQty(donutTotQty);
		setDiscount(discount);
		
		
	}
	
	
	public double getCoffeePrice() {
		return coffeePrice;
	}
	public void setCoffeePrice(double coffeePrice) {
		if(coffeePrice<0)
			coffeePrice*=-1;
		this.coffeePrice = coffeePrice;
	}
	public double getTeaPrice() {
		return teaPrice;
	}
	public void setTeaPrice(double teaPrice) {
		if(teaPrice<0)
			teaPrice*=-1;
		this.teaPrice = teaPrice;
	}
	public double getDonutPrice() {
		return donutPrice;
	}
	public void setDonutPrice(double donutPrice) {
		if(donutPrice<0)
			donutPrice*=-1;
		this.donutPrice = donutPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount/100;
	}
	public int getCoffeTotQty() {
		return coffeTotQty;
	}
	public void setCoffeTotQty(int coffeeTotQty) {
		if(coffeeTotQty<0)
			coffeeTotQty*=-1;
		this.coffeTotQty = coffeeTotQty;
	}
	public int getTeaTotQty() {
		return teaTotQty;
	}
	public void setTeaTotQty(int teaTotQty) {
		if(teaTotQty<0)
			teaTotQty*=-1;
		this.teaTotQty = teaTotQty;
	}
	public int getDonutTotQty() {
		return donutTotQty;
	}
	public void setDonutTotQty(int donutTotQty) {
		if(donutTotQty<0)
			donutTotQty*=-1;
		this.donutTotQty = donutTotQty;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	public double getTotal() {
		return total;
	}

	
	
	private void calculateSubTotal(int coffeeQty, int teaQty, int donutQty) {
		subtotal = (getCoffeePrice()*coffeeQty)+(getTeaPrice()*teaQty)+(getDonutPrice()*donutQty);
		
	} 
	
	private void calculateTotal(int coffeeQty, int teaQty, int donutQty) {
		calculateSubTotal(coffeeQty, teaQty, donutQty);
		total=subtotal-(subtotal*discount);
		discountedPrice=subtotal-total;
		
	}
	
	public double order(int coffeeQty, int teaQty, int donutQty) {
		if ((getCoffeTotQty()<coffeeQty)||(getTeaTotQty()<teaQty)||(getDonutTotQty()<donutQty)) {
			System.out.print("Error: no enough cups and/or donuts”");
		return 0;
		}else {
			calculateTotal( coffeeQty, teaQty, donutQty);
			display( coffeeQty, teaQty, donutQty);
			return total;
		}
		
	}
	private void display(int coffeeQty, int teaQty, int donutQty) {
		System.out.println("-------------------------------------------");
		System.out.println("Item         Quantity            Price     ");
		System.out.println("-------------------------------------------");
		System.out.println("Coffee       "+coffeeQty+"                   "+(coffeeQty*getCoffeePrice()));
		System.out.println("Tea          "+teaQty+"                   "+(teaQty*getTeaPrice()));
		System.out.println("Donuts       "+donutQty+"                   "+(donutQty*getDonutPrice()));
		System.out.println("-------------------------------------------");
		System.out.println("Subtotal                         "+getSubtotal());
		System.out.println("discount     (%"+getDiscount()*100+")             "+getDiscountedPrice());
		System.out.println("-------------------------------------------");
		System.out.println("total                            "+getTotal());
		System.out.println("-------------------------------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
}
