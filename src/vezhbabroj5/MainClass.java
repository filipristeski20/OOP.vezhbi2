package vezhbabroj5;

public class MainClass {
	public static void main(String[] args) {
		Predmet object1 = new Predmet();
		object1.ime = "Objektno orientirano programiranje";
		object1.profesor = "Ilija Jolevski";
		object1.krediti = 6;
		object1.semestar = 3;
		System.out.println("Ova e " + object1.ime + " go predava profesorot " + object1.profesor+ " predmetot nosi " + object1.krediti + " krediti i e od " + object1.semestar + " semestar");
		
		Predmet object2 = new Predmet("Strukturno programiranje");
		System.out.println("Imeto na drugiot predmet e " + object2.ime);
		
		Predmet object3 = new Predmet("Matematika", "Sonja Mancevska", 6 );
		System.out.println("Imeto na tretiot predmetot e " + object3.ime + " nosi " + object3.krediti + " krediti i go predava profesorkata " + object3.profesor);
		
	}
}
