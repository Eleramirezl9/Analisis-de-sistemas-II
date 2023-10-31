
public  abstract class Duck {
    protected iFly flyBehavior;
    protected Isound soundBehavior;

    public Duck() {

    }

    @Override
    public String toString() {
        return "Duck{}";
    }

    public void swim(){
        System.out.println("Estoy nadando, incluso puedo flotar");

    }

    public void performFly(){
        //String str = "estoy volando...";
        //System.out.println(str);
        flyBehavior.fly();
    }
    public abstract void display();

    public void performsound(){

        System.out.println("cuack quack");
    }

}

