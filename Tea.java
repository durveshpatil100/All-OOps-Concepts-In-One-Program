public class Tea extends Beverages implements Clean{
    @Override
    public void getBeverage() {
        cleanPot();
        getMixture();
        addIngredients();
        System.out.println("Tea is ready");
    }

    @Override
    public void addIngredients() {
        System.out.println("Tea bag Added");
    }

    @Override
    public void cleanPot() {
        System.out.println("Cleaning the pot");
    }
}
