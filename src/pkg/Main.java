package pkg;

public class Main {
	
	public static void main(String[] args) {
		Stocks stocks = new Stocks();
				
		stocks.addProduct("たまご", 100, 20);
		
		stocks.displayProducts();
		stocks.deleteProduct(3);
		stocks.displayProducts();
	}

}
