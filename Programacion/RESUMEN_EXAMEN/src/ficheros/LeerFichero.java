	
private void leerConductores() {
		try {
        	String cadena;
            String[] linea;
        	Scanner entrada=new Scanner(new File("conductor.csv"));
        	entrada.nextLine(); // Se salta la primera línea
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		this.getConductores().add(new Conductor(Integer.parseInt(linea[0]),Integer.parseInt(linea[1]),linea[2],linea[3],linea[4],Integer.parseInt(linea[5]),linea[6],linea[7]));
        	}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
	}
