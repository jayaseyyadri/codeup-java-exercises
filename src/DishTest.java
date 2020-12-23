public class DishTest {
    public static void main(String[] args) {
//        instantiate a new dish
        Dish dish1 =new Dish(20,"Noodles",false);

        Dish dish2=new Dish(50,"FrenchToast",true);

        dish1.printSummary();
//      setting name, cost & recommendation
//        dish1.setNameOfDish("French Fries");
//        dish1.setCostInCents(50);
//        dish1.setWouldRecommend(true);

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);


        dish1.printSummary();
        dish2.printSummary();


    }
}
