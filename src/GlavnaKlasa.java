
public class GlavnaKlasa {

	public static void main(String[] args) {
	        int br1 = 5; // Пример за првиот број
	        int br2 = 10; // Пример за вториот број
	        
	        // Креирање на објект од класата KlasaZbir
	        KlasaZbir zbir = new KlasaZbir(br1, br2);
	        
	        // Повикување на методот за собирање на броеви и прикажување на резултатот
	        int rezultat = zbir.Soberi();
	        System.out.println("Резултатот е: " + rezultat);
	    }
}
