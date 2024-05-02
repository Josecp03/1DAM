package Poo;

public class Dado {
	
	//Atributos
	private int nCara;
	
	//Constructor por defecto
	public Dado() {
		this.nCara=0;
	}

	//Getters y Setters
	public int getNcara() {
		return nCara;
	}

	public void setNcara(int ncara) {
		this.nCara = ncara;
	}

	//toString
	@Override
	public String toString() {
		return "|"+nCara+"|";
	}
	
	//LanzarDado
	public void lanzarDado() {
		this.nCara=(int)(1+Math.random()*6);
	}
	
	//dosIguales
	public boolean dosIguales(int[] lanzamientos) {
		for(int i=0;i<lanzamientos.length;i++) {
			for(int j=i+1;j<lanzamientos.length;j++) {
				if (lanzamientos[i]==lanzamientos[j])
					return true;
			}
		}
		return false;
	} 
	
	//Metodo para contar numero de seises
	public int cuenta6() {
		int contador=0;
		for(int i=0;i<8;i++) {
			this.lanzarDado();
			System.out.println(this);
			if(this.getNcara()==6)
				contador++;
		}
		return contador;
	}
	
	//Metodo para sumar 4 primeros lanzamientos
	public int sumaCuatroLanzamientos() {
		int suma=0;
		for(int i=0;i<4;i++) {
			this.lanzarDado();
			suma+=this.getNcara();
		}
		return suma;
	}
	
	//Método para sumar los pesos correspondientes del juego
	public int sumaPeso() {
		int suma=0;
		int[]peso={6,1,2,3,4,5};
		for(int i=0;i<5;i++) {
			this.lanzarDado();
			System.out.println(this);
			suma+=peso[this.getNcara()-1];
		}
		return suma;
	}
	
}
