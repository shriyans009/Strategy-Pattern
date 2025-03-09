public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehaviour = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I am Rubber Duck");
    }
}
