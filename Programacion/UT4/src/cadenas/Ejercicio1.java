package cadenas;

public class Ejercicio1 {
	
    public static void main(String[] args) {
        String cadena = "eJEMPLO de CadEnA";
        String cadenaFormateada = formatearCadena(cadena);
        System.out.println(cadenaFormateada);
    }

    public static String formatearCadena(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return cadena; // Si la cadena es nula o vacía, no hacemos ningún cambio.
        }

        // Convierte la primera letra a mayúscula y las demás a minúsculas
        String primeraLetraMayuscula = cadena.substring(0, 1).toUpperCase();
        String restoCadenaMinusculas = cadena.substring(1).toLowerCase();

        return primeraLetraMayuscula + restoCadenaMinusculas;
    }
    
}

