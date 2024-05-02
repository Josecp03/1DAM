
	@Override
	public boolean valida(String cadena) {
		String nif=cadena.substring(0,8);
		int posicionLetra=Integer.parseInt(nif)%23;
		String[]letras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		String letra=letras[posicionLetra];
		return cadena.matches("[0-9]{8}"+letra);
	}