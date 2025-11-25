package data;
import model.CentroCultivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
* Acá, se manejan los datos del archivo de texto.
* Separa cada línea y las convierte en objeto.
* Los objetos son añadidos a un ArrayList que se envía a Main.
* */

public class GestorDatos {
    public static ArrayList<CentroCultivo> centerlist() throws FileNotFoundException {
        File file = new File("resources/centros.txt");         //Importa el archivo
        Scanner sc = new Scanner(file);

        ArrayList<CentroCultivo> centros = new ArrayList<>();

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String[] partes = linea.split(";"); //Separa la linea por el caaracter ";"

            CentroCultivo cc = new CentroCultivo(
                    Integer.parseInt(partes[0]),                 //Primera parte: ID
                    partes[1],                                  //Segunda parte: Nombre
                    partes[2],                                  //Tercera parte: Comuna
                    Integer.parseInt(partes[3])                 //Cuarta parte: Producción en toneladas
            );
            centros.add(cc);
        }
        return centros;
    }
}
