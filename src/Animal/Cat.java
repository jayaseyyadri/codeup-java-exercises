package Animal;

public class Cat extends Animal{
    public String climbTrees;
    public Cat(){
        super(4,"winter");
    }

    public String isClimbTrees(){
        return "I climb trees";
    }
    public void setClimbTrees(String climbTrees){
        this.climbTrees=climbTrees;
    }

    @Override
    public String getAnimalInfo() {
        return isClimbTrees();
    }
}
