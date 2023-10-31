public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        soundBehavior = new quack();
    }

    @Override
    public void display() {
        System.out.println("hoña soy un patito");
    }



    @Override
    public String toString() {
        return "RubberDuck{" +
                "soundBehavior=" + soundBehavior +
                '}';
    }
}
