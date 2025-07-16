class Swiggy1Runner {
    public static void main(String[] args) {
        String foodName = "Masala Dosa";
        int price = Swiggy1.getFoodPrice(foodName);
		System.out.println("The price of " +foodName+ " is " + price);
		int quantity = 2;
        int priceWithQuantity = Swiggy1.getFoodPrice(foodName, quantity);
        System.out.println("The price  for " + foodName + " with quantity "+quantity+" is: " + priceWithQuantity);
    }
}