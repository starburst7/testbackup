package duck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        
        Duck mallardobj = new MallardDuck() ;  //create MallardDuck object and store inside Duck variable.
            
        mallardobj.performQuack();
        mallardobj.performFly();
        
        
        Duck model = new ModelDuck();
        
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
    }
    
}
