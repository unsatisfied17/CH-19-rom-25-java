class SwiggyRunner {
    public static void main(String[] args) {
        String foodName = "Masala Dosa";
     

        int price = SwiggyMenu.getFoodPrice(foodName);
        System.out.println("The price  for " + foodName + " is: " + price);
    }
}