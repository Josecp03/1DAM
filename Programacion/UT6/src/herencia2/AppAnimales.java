package herencia2;

public class AppAnimales {

	public static void main(String[] args) {
		Animal misAnimales[]=new Animal[4];
		
		misAnimales[0]=new Perro("Lori", "324324", "Border Collie", 4, "Gris", "Ladrido", true);
		misAnimales[1]=new Perro("Cooper","3434324","Border Collie", 4, "Blanco y negro","Ladrido", true);
		misAnimales[2]=new Gato("Tina", "54545", "Rag Doll", 4, "Tricolor", "Maullido");
		misAnimales[3]=new Perro("Berta", "343434", "Pastor Alemán", 4, "Marrón", "Ladrido", true);
		
		for(int i=0;i<misAnimales.length;i++) {
			System.out.println(misAnimales[i].emitirSonido());
		}
	}

}
