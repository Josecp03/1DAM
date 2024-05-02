
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("numeros.txt");
		Scanner entrada=new Scanner(f);
		int suma=0;
		String num="";

		while(entrada.hasNext()) {
			num=entrada.next();
			System.out.println(num);
			suma+=Integer.parseInt(num);
		}
		
		System.out.println("Suma = "+suma);
		
		//Cerrar Scanner
		entrada.close();
	}