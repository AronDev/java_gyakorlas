package Gyakorlas1_2019_11_29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Functions {
    static void readFile(String fileName) {
        System.out.println(String.format("Fájl beolvasása megkezdve.. (%s)", fileName));
        File f = new File(fileName);
        try(Scanner sc = new Scanner(f)) {
            String line;
            String [] elements;
            while(sc.hasNextLine()) {
                line = sc.nextLine();
                line = line.replaceAll("\\uFEFF", ""); // invisible Unicode character
                elements = line.split(";");
                Datastores.uzemanyagLista.add(new Uzemanyag(elements[0], Integer.parseInt(elements[1]), Integer.parseInt(elements[2])));
            }
            System.out.println(String.format("Fájl beolvasva! (%s)", fileName));
        } catch(FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        }
    }
}
