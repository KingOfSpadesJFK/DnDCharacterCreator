/*
* @author Kyle Garcia, Miguel Lima
*/
package race;

import main.GameCharacter.Language;
import main.GameCharacter.Size;

public class Dragonborn extends Race
{
   public enum DragonType
   {
      BLACK,
      BLUE,
      BRASS,
      BRONZE,
      COPPER,
      GOLD,
      GREEN,
      RED,
      SILVER,
      WHITE
   };

   private static final String RACE_NAME = "Dragonborn";  //Race name
   private static final String[] traits = {
     "Draconic Ancestory",
     "Breath Weapon",
     "Damage Resistance"
   };
   private static final Language[] languages = {
       Language.COMMON,
       Language.DRACONIC
   };

   private DragonType dragon;
      
   public Dragonborn(DragonType dragon) {
      super(RACE_NAME, 2, 0, 0, 0, 0, 1);
      this.dragon = dragon;
      setTraits(traits);
      setLanguages(languages);
      setSize(Size.MEDIUM);
      setSpeed(30);
   }

   public DragonType getDragon() {
      return dragon;
   }

   public Object getDamageType() {
      // TODO: Implement damage types
      return null;
   }
}