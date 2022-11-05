package vezhbabroj7;
import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			String a,b,c;
			Scanner scanner= new Scanner(System.in);
			System.out.println("Vnesi strani za presmetka");
			a = scanner.nextLine();
			b = scanner.nextLine();
			c = scanner.nextLine();
			
			Triagolnik t = new Triagolnik(a,b,c);
			System.out.println("Perimetarot na triagolnik e: " + t.perimetarnaTriagolnik());
			System.out.println("Plostina na triagolnik e: " + t.plostinanaTriagolnik());
			

		}

	}

