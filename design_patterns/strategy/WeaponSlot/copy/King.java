package WeaponSlot.copy;

public class King extends Character {

    public King() {
        
        this.equipedWeapon = new BareHandsBehavior(); 
    }
    
    
    public void fight() {
        
        this.equipedWeapon.useWeapon();
    }
}
