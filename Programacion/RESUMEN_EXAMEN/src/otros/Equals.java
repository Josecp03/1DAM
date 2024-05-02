
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Cuadrado other = (Cuadrado) obj;
		return this.getLado()==other.getLado() && this.getColor().equalsIgnoreCase(other.getColor());
	}