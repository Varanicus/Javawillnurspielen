
public class Schaeferhund extends Hund{

	 public Schaeferhund(String name, int alter, double lautstaerkeDB ) {
		super(name, alter, lautstaerkeDB);
		this.rasse="Schaferhund";
	}
   @Override public double ausgabe() {
	   return lautstaerkeDB*1.5;
   }
}
