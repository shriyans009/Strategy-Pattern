public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehaviour = new MuteQuack();
        swimBehaviour = new Drown();
    }

    @Override
    void display() {
        System.out.println("I am a Decoy Duck...");
    }
}
