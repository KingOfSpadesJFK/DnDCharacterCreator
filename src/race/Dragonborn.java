// Kyle Garcia
public class Dragonborn{
      
   String raceName = "Dragonborn";  //Race name
   String charName;                 //Character name
   String className;                //Class type i.e.: Fighter etc. 
   String color; 
   String damageType;    

   class AbilityScoreIncrease {
      public AbilityScoreIncrease(String ability, int scoreIncrease) {
         this.ability = ability;
         this.scoreIncrease = scoreIncrease;
      }
      
      String ability;
      int scoreIncrease;   
   }
   
   AbilityScoreIncrease abilityScoreIncrease;
   String size;
   int speed;
   String[] Language;
   
   
   public String getCharName(){
      return charName;
   }
   public void setCharName(String name){
      this.charName = name;   
   } 
   
   public String getClassName(){
      return className;
   }
   public void setClassName(String name){
      this.className = name;
   }
      
   public static void main(String[] args){
      Dragonborn dragon = new Dragonborn();
      dragon.setClassName("Fighter");
      dragon.setCharName("Dragon Guy");
      System.out.println("Name:" + dragon.getCharName() + ", Class:" + dragon.getClassName());
      
      

      
   }
}