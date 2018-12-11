package WeaponSlot.copy;

public class Knight extends Character{

   public Knight() {
       
       this.equipedWeapon = new BareHandsBehavior(); 
   }
   
   public void fight() {
       
       this.equipedWeapon.useWeapon();
   }
    
}
