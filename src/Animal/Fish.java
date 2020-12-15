package Animal;

public class Fish extends Animal {
    public String swim;

    public Fish(){
        super(0," I live in water");
    }

    public String getCanSwim(){
        return swim;
    }
    public void setCanSwim(String swim){
        this.swim=swim;
    }



    @Override
    public String getAnimalInfo() {
        System.out.println("i can swim");
        return getCanSwim();
    }
}
