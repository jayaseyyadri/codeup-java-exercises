public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_Cents = 1300;

    public static int getAVERAGE_COST_OF_DISH_IN_Cents() {
        return AVERAGE_COST_OF_DISH_IN_Cents;
    }


    public static void shoutDishName(Dish dishName){
        System.out.println(dishName.nameOfDish.toUpperCase());

    }

    public static void analyzeDishCost(Dish dishCost){
        if(dishCost.costInCents > getAVERAGE_COST_OF_DISH_IN_Cents())
        {
            System.out.println("More expensive than average");
        }
       else
        {
            System.out.println("Less expensive than average");
        }

    }
    public static void flipRecommendation (Dish recommendation){
        System.out.println(!recommendation.wouldRecommend);
    }

}


