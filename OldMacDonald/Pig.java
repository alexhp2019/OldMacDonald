class Pig implements Animal 
{     
     private String myType;
     private String mySound;
   
     public Pig(String type, String sound)
     {
       myType = "pig";
       mySound = "oink";
     }
     public String getType(){return myType;}
     public String getSound(){ return mySound;}
}
