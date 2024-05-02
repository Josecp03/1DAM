
	public void cargaActividades() {
		String cadena;
        String[] linea;
        try {
        	Scanner entrada=new Scanner(new File("reservaPendientes.csv"));
        	entrada.nextLine();
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		if (linea[2].equals(this.getCodigo())) {
        			this.getListaActividades().add(new ActividadReservada(linea[0], Double.parseDouble(linea[1]), linea[2], Integer.parseInt(linea[3]), Integer.parseInt(linea[4])));
        		}
        	}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
	}