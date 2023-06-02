package utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerCSV {
	public static String usuario = "";
	public static String clave = "";
    public static void usuario() {
    	String archivoCSV = "src/test/resources/archivos/usuarios.csv";
        String separador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            boolean primeraLinea = true;
            int columnaUsuario = -1;
            int columnaClave = -1;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(separador);

                if (primeraLinea) {
                   
                    for (int i = 0; i < datos.length; i++) {
                        if (datos[i].equalsIgnoreCase("usuario")) {
                            columnaUsuario = i;
                        } else if (datos[i].equalsIgnoreCase("clave")) {
                            columnaClave = i;
                        }
                    }

                    primeraLinea = false;
                } else {
                    if (columnaUsuario != -1 && columnaClave != -1) {
                        usuario = datos[columnaUsuario];
                        clave = datos[columnaClave];
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
