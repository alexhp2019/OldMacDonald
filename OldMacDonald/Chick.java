class Chick implements Animal 
{     
     private String myType;
     private String mySound;
   
     public Chick(String type, String sound)
     {
       myType = "chick";
       mySound = "peep";
     }
     public String getType(){return myType;}
     public String getSound(){ return mySound;}
}
