public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_Cents = 1300;



    public static void shoutDishName(Dish dishName){
        System.out.println(dishName.getNameOfDish().toUpperCase());

    }

    public static void analyzeDishCost(Dish dishCost){
        if(dishCost.getCostInCents() > DishTools.AVERAGE_COST_OF_DISH_IN_Cents)
        {
            System.out.println("More expensive than average");
        }
       else
        {
            System.out.println("Less expensive than average");
        }

    }
    public static void flipRecommendation (Dish recommendation){
        recommendation.setWouldRecommend(!recommendation.getWouldRecommend());
    }

}


