package retostarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("temperatura.mostrar")
public class TemperaturaProperties {
	
	private float temperatura = 20.0f;

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
