abstract public class Duck {
    QuackBehaviour quackBehaviour;

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    abstract void display();

    public void performQuack(){
        quackBehaviour.quack();
    }
}
