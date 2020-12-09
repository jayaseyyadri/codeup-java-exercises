public class DishTest {
    public static void main(String[] args) {
//        instantiate a new dish
        Dish dish1 =new Dish();

//      setting name, cost & recommendation
        dish1.setNameOfDish("French Fries");
        dish1.setCostInCents(50);
        dish1.setWouldRecommend(true);
        dish1.printSummary();

DishTools.shoutDishName(dish1);
DishTools.analyzeDishCost(dish1);
DishTools.flipRecommendation(dish1);


    }
}
