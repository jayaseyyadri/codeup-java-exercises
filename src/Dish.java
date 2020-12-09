public class Dish {
//    instance variables
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    //    getters & setters
    public int getCostInCents() {
        return costInCents;
    }
    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }
    public String getNameOfDish() {
        return nameOfDish;
    }
    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }


    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
    public boolean getWouldRecommend() {
        return wouldRecommend;
    }



//instance method
public void printSummary(){
    System.out.printf("Cost:%d \nName:%s\nRecommended:%b\n",costInCents,nameOfDish,wouldRecommend);

}


}
