package Practice;

 class Villians extends Heroes{

    public String scream;

     public Villians(String name,String sex, String scream, String power) {
         super(name, sex, power);
         this.scream = scream;
     }

     public String present(){
         return ("I am " + name + ", a " + sex + "-" + scream + " with " + power + " power !");
     }

     public String getScream(){
         return scream;
     }

 }
