package primeraUnidad;

public class persona {
	private String nombre;
	private byte edad;
	private float estatura;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}
	
	
}
