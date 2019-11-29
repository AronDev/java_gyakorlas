package Gyakorlas1_2019_11_28;

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
                Datastores.sportagLista.add(new Sportag(elements[0]));
                for(int i = 1; i <= 16; i++) {
                    Datastores.sportagLista.get(Datastores.sportagLista.size() - 1).donto[i-1] = Integer.parseInt(elements[i]);
                }
            }
            System.out.println(String.format("Fájl beolvasva! (%s)", fileName));
        } catch(FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        }
    }
}

