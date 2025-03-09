public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new Fly();
    }

    @Override
    void display() {
        System.out.println("I am RedHeadDuck");
    }
}
