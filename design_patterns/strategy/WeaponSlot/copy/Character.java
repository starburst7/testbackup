package WeaponSlot.copy;

public abstract class Character {
    
    WeaponBehavior equipedWeapon;
    
    
    public void setWeapon(WeaponBehavior w) {
        
        this.equipedWeapon = w;
    }
    
    
    public abstract void fight();
    
    
    
    
    
}


