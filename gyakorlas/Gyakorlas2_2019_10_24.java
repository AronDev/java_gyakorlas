import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Gyakorlas2_2019_10_24 {
    /* Globális változók */
    private static Dimension frameSize = new Dimension(800, 600);
    private static final int N = 20;


    public static void main(String[] args) {
        initUI();
    }

    private static void initUI() {
        /* Emberek létrehozása (max 2) */
        Person [] persons = new Person[2];

        persons[0] = new Person();
        persons[0].newPerson("Aladár", "files/aladar.txt");

        persons[1] = new Person();
        persons[1].newPerson("Bendegúz", "files/bendeguz.txt");


        /* Ablak létrehozása */
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame f = new JFrame("Dobókocka versens");
        /*f.setSize(frameSize);
        f.setPreferredSize(frameSize);*/
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Elemek hozzáadása az ablakhoz */
        JPanel p1 = new JPanel();
        /*p1.setSize(frameSize);
        p1.setPreferredSize(frameSize);*/
        BoxLayout boxLayout1 = new BoxLayout(p1, BoxLayout.Y_AXIS);
        p1.setLayout(boxLayout1);

        JLabel l1 = new JLabel("Dobókocka verseny");
        l1.setFont(new Font("Sans Serif", Font.BOLD, 20));
        l1.setHorizontalAlignment(JLabel.LEFT);
        l1.setVerticalAlignment(JLabel.TOP);
        p1.add(l1);

        JPanel p2 = new JPanel();
        p2.setSize(frameSize.width, frameSize.height/2);
        Dimension p2dim = new Dimension(frameSize.width, frameSize.height/2);
        p2.setPreferredSize(p2dim);
        BoxLayout boxLayout2 = new BoxLayout(p2, BoxLayout.Y_AXIS);
        p2.setLayout(boxLayout2);
        p2.setBackground(Color.white);
        p1.add(p2);

        JLabel l2 = new JLabel("<html><br /><b>Személyek:</b><br />");
        l2.setFont(new Font("Sans Serif", Font.PLAIN, 14));
        l2.setHorizontalAlignment(JLabel.LEFT);
        l2.setVerticalAlignment(JLabel.TOP);
        p2.add(l2);
        for(Person p : persons) {
            l2.setText(l2.getText() + String.format("- %s <i>(%s)</i><br />", p.personName, p.filePath));
        }
        l2.setText(l2.getText() + "</html>");

        JLabel l3 = new JLabel();
        l3.setFont(new Font("Sans Serif", Font.PLAIN, 12));
        l3.setHorizontalAlignment(JLabel.LEFT);
        l3.setVerticalAlignment(JLabel.TOP);
        p2.add(l3);

        JButton b1 = new JButton();
        b1.setText("Számítás");
        f.getRootPane().setDefaultButton(b1);
        p1.add(b1);
        b1.addActionListener(actionEvent -> {
            if(actionEvent.getID() == ActionEvent.ACTION_PERFORMED) { // Kattintás
                /* Beolvasás és kiíratás */

                l3.setText("<html><br />");

                // Dobások
                for(Person p : persons) {
                    p.readFile();
                    l3.setText(l3.getText() + String.format("%s dobásai: <b>%s</b><br />", p.personName, p.getData()));
                }
                l3.setText(l3.getText() + "<br />");

                // Győzelmek száma
                for(int i = 0; i < N; i++) {
                    if(persons[0].data.get(i) > persons[1].data.get(i)) {
                        persons[0].matchWins ++;
                    } else persons[1].matchWins ++;
                }

                for(Person p : persons) {
                    l3.setText(l3.getText() + String.format("%s győzelmeinek száma: <b>%d</b><br />", p.personName, p.matchWins));
                }
                l3.setText(l3.getText() + "<br />");

                // 6-os dobások száma
                for(int i = 0; i < N; i++) {
                    if(persons[0].data.get(i) == 6) persons[0].dropNumber6 ++;
                    else if(persons[1].data.get(i) == 6) persons[1].dropNumber6 ++;
                }

                for(Person p : persons) {
                    l3.setText(l3.getText() + String.format("%s 6-os dobásainak száma: <b>%d</b><br />", p.personName, p.dropNumber6));
                }
                l3.setText(l3.getText() + "<br />");

                // Nyerő széria volt-e
                int j = 0;
                if(!(persons[0].data.get(j) > persons[1].data.get(j) && persons[0].data.get(j + 1) > persons[1].data.get(j + 1) && persons[0].data.get(j + 2) > persons[1].data.get(j + 2))) {
                    persons[0].winningSeries = true;
                } else if(!(persons[1].data.get(j) > persons[0].data.get(j) && persons[1].data.get(j + 1) > persons[0].data.get(j + 1) && persons[1].data.get(j + 2) > persons[0].data.get(j + 2))) {
                    persons[1].winningSeries = true;
                }

                for(Person p : persons) {
                    l3.setText(l3.getText() + String.format("%snak %s nyerő szériája<br />", p.personName, p.winningSeries ? "<b>volt</b>" : "<b>nem volt</b>"));
                }

                l3.setText(l3.getText() + "<br /></html>");
            }
        });

        /* Ablak megjelenítése */
        f.getContentPane().add(p1);
        f.pack();
        f.setVisible(true);
    }

    private static class Person {
        String personName = "";
        String filePath = "";
        ArrayList <Integer> data = new ArrayList<>();

        boolean winningSeries = false;
        int matchWins = 0;
        int dropNumber6 = 0;

        void newPerson(String pname, String fpath) {
            this.personName = pname;
            this.filePath = fpath;
        }

        void clearStats() {
            this.winningSeries = false;
            this.matchWins = 0;
            this.dropNumber6 = 0;
            this.data.clear();
        }

        void readFile() {
            clearStats();

            File file = new File(filePath);
            String lineStr = "";
            try(Scanner sc = new Scanner(file)) {
                while (sc.hasNextLine()) {
                    lineStr = sc.nextLine();
                    data.add(Integer.parseInt(lineStr));
                }
                System.out.printf("%s eredmenyei sikeresen beolvasva! (%s)\n", this.personName, this.filePath);
            } catch(FileNotFoundException fnfe) {
                showMsg(JOptionPane.ERROR_MESSAGE, "Nem található fájl!", String.format("%s nevű személyhez tartozó fájl (%s) nem található!\n\nHibaüzenet: %s", this.personName, this.filePath, fnfe));
            }
        }

        private String getData() {
            String returnStr = "";
            int j = 0;
            for(int num : this.data) {
                returnStr += String.valueOf(num);
                if(j + 1 < this.data.size()) returnStr += ", ";
                j ++;
            }
            return returnStr;
        }
    }

    private static void showMsg(int msgType, String msgTitle, String msgText) {
        JOptionPane.showMessageDialog(null, msgText, msgTitle, msgType);
    }
}
