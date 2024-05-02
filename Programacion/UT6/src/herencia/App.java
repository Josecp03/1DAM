package herencia;

public class App {

	public static void main(String[] args) {
		Trabajador t1=new Trabajador("Luisa","López","324324","dfadf");
		Empleado e=new Empleado("Patricia","Núñez","324324","fads",30000);
		Consultor c=new Consultor("Rodrigo", "Muñoz","fgsfd", "dfad", 10, 14);
		Trabajador t[]=new Trabajador[3];
		t[0]=t1;
		t[1]=e;
		t[2]=c;
		
		for(int i=0;i<t.length;i++) {
			if(t[i] instanceof Trabajador) {
				System.out.print("Trabajador: ");
			}
			if(t[i] instanceof Empleado) {
				System.out.print("Empleado: ");
			}
			if(t[i] instanceof Consultor) {
				System.out.print("Consultor: ");
			}
			System.out.println(t[i].getNombre()+" "+t[i].getApellidos()+" "+t[i].calcularPaga());
		}
		
	}

}
