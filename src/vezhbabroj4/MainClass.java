package vezhbabroj4;

public class MainClass {
	public static void main(String[] args) {
		
		Avtomobil kola = new Avtomobil ();
		kola.marka = "Mercedes";
		kola.model = "S-Class";
		kola.kilometri = "100K";
		System.out.println("Ova e " + kola.marka + " " + kola.model + " " + "so pominati " +kola.kilometri + " kilometri");
		
		Avtomobil kola2 = new Avtomobil("Volkswagen", "Arteon", "200K");
		System.out.println("Ova e " + kola2.marka + " " + kola2.model + " " + "so pominati " +kola2.kilometri + " kilometri");
	}
	
	   
	   
	   
	

}
