//package pkg;
//
//public class Stocks {
//	String[] taste = {"醤油", "塩", "味噌", "豚骨", "魚介系"};
//	String[] density = {"薄め", "ふつう", "濃いめ"};
//	String[] type = {"太麺", "中太麺", "細麺", "ちぢれ麺"};
//	String[] hardness = {"やわらかめ", "ふつう", "かため", "バリカタ", "ハリガネ"};
//	String[] amount = {"少なめ", "ふつう", "大盛"};
//	String[] toppings = {"チャーシュー", "メンマ", "のり", "たまご", "青ネギ", "白ネギ", "ほうれん草", "コーン", "バター", "ニンニク"};
//	
//}

package pkg;
import java.util.ArrayList;
import java.util.List;

public class Stocks {
    private static class Product {
        private String name;
        private int price;
        private int stock;

        public Product(String name, int price, int stock) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public int getStock() {
            return stock;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        //public void decreaseStock() {
            //if (stock <= 0) {
               // System.out.println("エラー: " + name + " の在庫がありません");
            //}
       // }

    }

    private List<Product> products;

    public Stocks() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String name, int price, int stock) {
        Product product = new Product(name, price, stock);
        products.add(product);
    }

    public void editProduct(int productIndex, int newPrice, int newStock) {
        if (productIndex >= 0 && productIndex < products.size()) {
            Product selectedProduct = products.get(productIndex);
            selectedProduct.setPrice(newPrice);
            selectedProduct.setStock(newStock);
            System.out.println("商品情報を編集しました: " + selectedProduct.getName() +
                    " - 価格: " + selectedProduct.getPrice() + " - 在庫: " + selectedProduct.getStock());
        } else {
            System.out.println("エラー: 無効な商品インデックス");
        }
    }

    public void deleteProduct(int productIndex) {
        if (productIndex >= 0 && productIndex < products.size()) {
            Product deletedProduct = products.remove(productIndex);
            System.out.println("商品を削除しました: " + deletedProduct.getName());
        } else {
            System.out.println("エラー: 無効な商品インデックス");
        }
    }

    public void displayProducts() {
        System.out.println("利用可能な商品:");
        for (Product product : products) {
            System.out.println(product.getName() + " - 価格: " + product.getPrice() + " - 在庫: " + product.getStock());
        }
    }

}
