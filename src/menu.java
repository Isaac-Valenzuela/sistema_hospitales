import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame{
    private JPanel panel1;
    private JButton IRButton;
    private JButton IRButton1;
    private JButton salirButton;

    public menu(){
        setTitle("Menu");
        setSize(400,400);
        setContentPane(panel1);

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login salir = new login();
                salir.setVisible(true);
                dispose();
            }
        });

        IRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrar salir = new registrar();
                salir.setVisible(true);
                dispose();
            }
        });

        IRButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscar b = new buscar();
                b.setVisible(true);
                dispose();
            }
        });



    }

}
