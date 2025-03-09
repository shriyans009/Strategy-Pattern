public class Main {
    public static void main(String[] args) {

        RubberDuck rb  = new RubberDuck();
        System.out.println("---------------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("---------------");

        MallardDuck md = new MallardDuck();
        System.out.println("---------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("---------------");

        RedHeadDuck rhd  = new RedHeadDuck();
        System.out.println("---------------");
        rhd.display();
        rhd.performQuack();
        rhd.performSwim();
        rhd.performFly();
        System.out.println("---------------");

        DecoyDuck dk  = new DecoyDuck();
        System.out.println("---------------");
        dk.display();
        dk.performQuack();
        dk.performSwim();
        dk.performFly();
        System.out.println("---------------");

    }
}
