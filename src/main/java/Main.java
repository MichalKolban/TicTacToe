import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    int count = 0;


    public Main(){
        setSize(600,600);
        setVisible(true);
        setTitle("Tic Tac Toe");
        setLayout(new GridLayout(3,3));
        for(int i = 0; i<9; i++){
        JButton jButton = new JButton("");
        add(jButton);
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                if(count % 2 == 0){             // program przestawia co kliknięcie albo krzyżyk albo kółko
                    button.setText("X");
                    System.out.println("X");
                }else {
                    button.setText("O");
                    System.out.println("O");
                }
                button.setEnabled(false);   // zapobiega ponownemy kliknięciu w już kliknięty przycisk
                count++;
            }
        });
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
