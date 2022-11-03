package vezhbabroj1;

public class MainClass {
	public static void main(String[] args) {
		Student object1 = new Student (); 
		object1.ime = "Filip"; 
		object1.prezime = "Risteski";
		object1.indeks = 835;
		System.out.println("Податоци за прв објект:");
		System.out.println(object1.ime + " " + object1.prezime + " " + object1.indeks);
		Student object2 = new Student("Ivan","Ivanovski",535);
		System.out.println ("Податоци за втор објект:");
		System.out.println (object2.ime + " " + object2.prezime + " " + object2.indeks);
		}

}
