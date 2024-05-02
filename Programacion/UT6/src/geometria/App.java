package geometria;

public class App {

	public static void main(String[] args) {
		Figura f[]=new Figura[5]; 
		f[0]=new Cuadrado("verde",2);
		f[1]=new Circulo("Verde",2);
		f[2]=new TrianguloEquilatero("Azul",5);
		f[3]=new TrianguloIsosceles("Amarillo",3,2);
		f[4]=new TrianguloEscaleno("Naranja",3,7,1);
		
		System.out.println("*********************************************  EQUALS  *********************************************");
		for(int i=0;i<f.length-1;i++) {
			if(f[i].equals(f[i+1]))
				System.out.println(f[i]+" = "+f[i+1]);
			else
				System.out.println(f[i]+" != "+f[i+1]);
		}
		
		System.out.println();
		System.out.println("****************************************  ÁREAS Y PERÍMETROS  ***************************************");
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]+" -->  Área= "+f[i].area()+" Perímetro= "+f[i].perimetro());
		}
		
		
		
	}

}
