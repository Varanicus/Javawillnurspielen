
public class TestVertex {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(17,4);
		Vertex v2 = new Vertex(42,0);
		Vertex v3 = v1.skalarMult(16);
		Vertex maus = new Vertex(15,22);
		Vertex katze = new Vertex(2,2);
		Vertex hund = katze.add(maus);
		
		
 System.out.println("v1: "+v1);
 System.out.println("v2: "+v2);
 System.out.println("v3: "+v3);
 System.out.println(v1.length());
 System.out.println(katze);
 katze.addMod(maus);
 System.out.println(katze);
 System.out.println(hund);
	}

}
