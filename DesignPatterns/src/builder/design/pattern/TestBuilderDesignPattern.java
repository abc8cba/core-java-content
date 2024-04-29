package builder.design.pattern;

class Product{
	private int productId;
	private String productName;
	private double productCost;
	private String productColor;
	
	private Product(ProductBuilder builder){
		this.productId = builder.productId;
		this.productName = builder.productName;
		this.productColor = builder.productColor;
		this.productCost = builder.productCost;
	}
	
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductCost() {
		return productCost;
	}
	public String getProductColor() {
		return productColor;
	}
	
	static class ProductBuilder {
		
		private int productId;
		private String productName;
		private double productCost;
		private String productColor;
		
		public ProductBuilder() {
			
		}

		public ProductBuilder(int id,String name){
			productId = id;
			productName = name;
		}
		
		public ProductBuilder setProductId(int id){
			productId = id;
			return this;
		}
		
		public ProductBuilder setProductName(String name){
			productName = name;
			return this;
		}
		
		public ProductBuilder setProductCost(double cost){
			this.productCost = cost;
			return this;
		}
		
		public ProductBuilder setProductColor(String color){
			productColor = color;
			return this;
		}
		
		public Product build(){
			return new Product(this);
		}
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + 
				productName + ", productCost=" + productCost
				+ ", productColor=" + productColor + "]";
	}
	
}

public class TestBuilderDesignPattern {

	public static void main(String[] args) {
		
		Product product = new Product.ProductBuilder()
				.setProductId(101)
				.setProductCost(3000.0)
				.setProductName("LED")
				.setProductColor("RED")
				.build();
		
		System.out.println(product);
	}

}
