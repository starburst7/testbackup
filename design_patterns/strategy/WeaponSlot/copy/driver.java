package WeaponSlot.copy;

public class driver {

    public static void main(String[] args) {
        
        Character Arthas= new Knight();
        Arthas.fight();
      
        Arthas.setWeapon(new SwordBehavior());
        Arthas.fight();
        
        Arthas.setWeapon(new DaggerBehavior());
        Arthas.fight();
    }
    
}
