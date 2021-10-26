
public class Hund {
     String rasse;
     String name;
     int alter;
     double lautstaerkeDB;
	public static void main(String[] args) {
		Hund h1=new Hund("Wauwau", 4, 31.4);
        System.out.println(h1.ausgabe());
        Hund h2=new Schaeferhund("WaWau", 4, 31.4);
        System.out.println(h2.ausgabe());
	}
   public Hund(String name, int alter, double lautstaerkeDB) {
	   this.name = name;
	   this.alter = alter;
	   this.lautstaerkeDB = lautstaerkeDB;
   }
   public Hund(String name) {
	   this(name, 50,50);
	
   }
   public Hund() {
	   this("Adrian");
   }
   public double ausgabe() {
	   return lautstaerkeDB;
	   
   }
   
    
}
