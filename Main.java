public class Main {
    public static void main(String[] args) {

        RubberDuck rb  = new RubberDuck();
        System.out.println("---------------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        System.out.println("---------------");

        MallardDuck md = new MallardDuck();
        System.out.println("---------------");
        md.display();
        md.performQuack();
        md.performSwim();
        System.out.println("---------------");

        RedHeadDuck rhd  = new RedHeadDuck();
        System.out.println("---------------");
        rhd.display();
        rhd.performQuack();
        rhd.performSwim();
        System.out.println("---------------");

    }
}
