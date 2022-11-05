package vezhbabroj7;

public class Triagolnik {
 	
	public float a;
	public float b;
	public float c;
	
	public Triagolnik(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Triagolnik(String a, String b, String c) {
        this.a = Float.parseFloat(a);
        this.b = Float.parseFloat(b);
        this.c = Float.parseFloat(c);
    }
	
	public float perimetarnaTriagolnik() {
		return a+b+c;
	}
	public float plostinanaTriagolnik() {
		float s = (float) (a + b + c) /2;
		
		return (float) Math.sqrt(s* (s - a) * (s - b) * (s - c));
	}
}