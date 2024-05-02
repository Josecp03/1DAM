package Poo;

public class JuegoDadoPeso {

	public static void main(String[] args) {
		Dado jugador1=new Dado();
		Dado jugador2=new Dado();
		System.out.println("El jugador 1 ha sumado "+jugador1.sumaPeso());
		System.out.println("El jugador 2 ha sumado "+jugador2.sumaPeso());
		if(jugador1.sumaPeso()>jugador2.sumaPeso())
			System.out.println("El jugador 1 ha ganado");
		else
			System.out.println("El jugador 2 ha gando");
	}

}
