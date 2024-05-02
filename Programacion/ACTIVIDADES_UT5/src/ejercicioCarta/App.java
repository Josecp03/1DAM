package ejercicioCarta;

public class App {

	public static void main(String[] args) {
		//Creamos dos cartas
		Carta c1 = new Carta();
		Carta c2 = new Carta();
		
		//Creamos dos jugadores
		Jugador j1 = new Jugador("Paco",c1);
		Jugador j2 = new Jugador("Pepe",c2);
		
		//Juego
		//Cuenta primer jugador
		int cont=0;
		int suma1=0;
		do {
			c1.extraerCarta();
			suma1+=c1.getNumero();
			System.out.println(j1.getNombre()+" saca un "+j1.getCarta());
			cont++;
		}while(cont<3);
		System.out.println();
		
		//Cuenta segundo jugador
		cont=0;
		int suma2=0;
		do {
			c2.extraerCarta();
			suma2+=c2.getNumero();
			System.out.println(j2.getNombre()+" saca un "+j2.getCarta());
			cont++;
		}while(cont<3);
		System.out.println();
		
		//Muestro por pantalla los puntos de cada jugador
		System.out.println(j1.getNombre()+" tiene un total de "+suma1+" puntos");
		System.out.println(j2.getNombre()+" tiene un total de "+suma2+" puntos\n");
		
		//Comprobamos quien gana y lo mostramos por pantalla
		if(suma1>suma2) {
			System.out.println(j1.getNombre()+" gana el juego");
		}else if(suma2>suma1) {
			System.out.println(j2.getNombre()+" gana el juego");
		}
		else {
			System.out.println(j1.getNombre()+" y "+j2.getNombre()+" han empatado");
		}
	}

}
