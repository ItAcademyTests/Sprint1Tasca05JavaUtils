package n1Exercici1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class LlistarContingut {

    public static void llistaAlfabeticament(String nomDirectori) {

        var fitxers = new ArrayList<String>();

        try {
            DirectoryStream<Path> ds = Files.newDirectoryStream(Paths.get(nomDirectori));
            for (Path ruta : ds) {
                fitxers.add(ruta.getFileName().toString());
            }

            Arrays.sort(new ArrayList[]{fitxers});

            for (String nomFitxer : fitxers) {
                System.out.println(nomFitxer);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
