package sesion_01_06_2021;

public class Contador {

	int count;

	public Contador() {
		
	}
	
	public Contador(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

	int incrementar() {
		return this.count + 1;
	}


	
}
