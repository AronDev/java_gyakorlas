package Gyakorlas1_2019_11_28;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Functions {    
    static final int INFO_MSG = 0;
    static final int WARN_MSG = 1;
    static final int ERROR_MSG = 2;
    static final int DEBUG_MSG = 3;
    
    static void showMsg(int msgType, String msgTitle, String msgText) {
        JOptionPane.showMessageDialog(null, msgText, msgTitle, msgType);
    }
    
    static void systemMsg(int msgType, String msgText) {
        if(msgText.trim().length() > 0) {
            switch(msgType) {
                case 0: {
                    System.out.printf("[I] %s\n", msgText);
                    break;
                } case 1: {
                    System.out.printf("[W] %s\n", msgText);
                    break;
                } case 2: {
                    System.out.printf("[E] %s\n", msgText);
                    break;
                } case 3: {
                    if(Main.DEBUG) {
                        System.out.printf("[D] %s\n", msgText);
                    }
                    break;
                } default: {
                    systemMsg(ERROR_MSG, String.format("Hibás msgType érték a systemMsg funkcióban! (msgType = %d)", msgType));
                }
            }
        } else {
            systemMsg(ERROR_MSG, "msgTextnek nincsenk értéke a systemMsg funkcióban!");
        }
    }
    
    static void readFile(String fileName) {
        systemMsg(DEBUG_MSG, String.format("Fájl beolvasása megkezdve.. (%s)", fileName));
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
            systemMsg(DEBUG_MSG, String.format("Fájl beolvasva! (%s)", fileName));
        } catch(FileNotFoundException fnfe) {
            systemMsg(ERROR_MSG, String.format("%s", fnfe.getMessage()));
        }
    }
}

