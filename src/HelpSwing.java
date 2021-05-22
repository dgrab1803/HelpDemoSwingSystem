package academy.learnprogramming;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.color.*;
import java.util.concurrent.Flow;
import java.awt.Component.*;

public class HelpSwing implements ListSelectionListener {
    JList<String> jlist;
    JLabel jlab;
    JScrollPane jscrlp;
    JLabel resultLab;

    String[] menu = {"If", "Switch", "For", "While", "Do-while", "Break", "Continue"};


    HelpSwing() {
        JFrame jfrm = new JFrame("Aplikacja wyswietlajaca informacje o skladni instrukcji ");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(560, 250);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        jlist = new JList<>(menu);

        jscrlp = new JScrollPane(jlist);

        jscrlp.setPreferredSize(new Dimension(120, 120));

        jlab = new JLabel("Wybierz składnie ");

        jlist.addListSelectionListener((ListSelectionListener) this);

        resultLab = new JLabel("");

        jfrm.add(jscrlp);
        jfrm.add(jlab);
        jfrm.add(resultLab);
        jfrm.setVisible(true);

    }



    public void valueChanged(ListSelectionEvent le) {

        int idx = jlist.getSelectedIndex();

        switch (idx) {
            case 0 :
                resultLab.setText("<html>Instrukcja warunkowa if<br>if(warunek) instrukcja.<br>else instrukcja.</html>");
                break;
            case 1 :
                resultLab.setText("<html>Instrukcja wyboru switch:<br>switch(wyrazenie){<br>case 'stala' :<br>sekwencja instrukcji<br>break: <br>//... <br> }</html>");
                break;
            case 2 :
                resultLab.setText("<html>Pętla for:<br>for(inicjalizacja; warunek; literacja<br>instrukcja)</html>");
                break;
            case 3 :
                resultLab.setText("<html>Pętla while:<br>while(warunek)<br>instrukcja</html>");
                break;
            case 4 :
                resultLab.setText("<html>Pętla do-while:<br>do{<br>instrukcja<br>while(warunek)</html>");
                break;
            case 5 :
                resultLab.setText("<html>instrukcja break:<br>break; ; lub break etykieta;</html>");
                break;
            case 6 :
                resultLab.setText("<html>instrukcja continue<br>continue; lub continue etykieta;</html");
                break;
        }
    }
}
