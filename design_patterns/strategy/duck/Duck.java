package duck;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck() {
        
    }
    
    public abstract void display();
    
    
    public void performFly() {
        
    flyBehavior.fly();
    
    }
    
    public void performQuack() {
        
    quackBehavior.quack();   //from quackBehavior instance variable above
    }
    
    public void swim() {
        
    System.out.println("All ducks float, even decoys!");
    }
    
    
    
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
        }
        public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
        }
    
}
