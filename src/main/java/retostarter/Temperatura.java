package retostarter;

public class Temperatura {
	
	private float temperatura;

	public Temperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	public String mostrarTemperatura(float temperatura,String unidad) {
		
		return "La temperatura actual es de: " + temperatura + unidad;
	}
	
	public String convertirCelsiusFaren(float temperatura) {
		
		float temperaturaFaren = (float) (temperatura * 1.8 + 32);
		
		return "La temperatura en fahrenheit es de: " + temperaturaFaren;
	}
}
