package rozdzial02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrzykładObserwatoraSwing {
    JFrame frame;

    public static void main(String[] args) {
        PrzykładObserwatoraSwing przykład = new PrzykładObserwatoraSwing();
        przykład.uruchom();
    }

    public void uruchom() {
        frame = new JFrame();
        JButton button = new JButton("Czy powiniennem to zrobić?");
        button.addActionListener(new AniołSłuchach());
        button.addActionListener(new DiabełSłuchacz());

        // Parametry okienka
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class AniołSłuchach implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Nie rób tego! Możesz później żałować!");
        }
    }

    class DiabełSłuchacz implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Tak! Zrób to!");
        }
    }

}
