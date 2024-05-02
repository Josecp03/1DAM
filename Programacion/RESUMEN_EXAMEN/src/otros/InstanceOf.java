
	public double calcularPrecioAparcamiento(int dias) {
		if(this instanceof Coche) {
			return 10*dias;
		} 
		else if(this instanceof Moto) {
			return 5*dias;
		}
		else if(this instanceof Furgoneta) {
			return 15*dias;
		}
		else {
			return 0;
		}
	}