public class Coffee extends Beverages implements Clean{
    @Override
    public void getBeverage() {
        cleanPot();
        getMixture();
        addIngredients();
        System.out.println("Your coffee is ready!!");
    }

    @Override
    public void addIngredients() {
        System.out.println("Coffee bag is Added");
    }

    @Override
    public void cleanPot() {
        System.out.println("Cleaning coffee Pot...");
    }
}
