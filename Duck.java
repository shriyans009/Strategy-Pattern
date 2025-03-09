abstract public class Duck {
    QuackBehaviour quackBehaviour;

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    abstract void display();

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performSwim(){
        swimBehaviour.swim();
    }
}
