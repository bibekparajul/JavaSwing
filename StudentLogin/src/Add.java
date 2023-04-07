import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add extends JFrame implements ActionListener {

    JTextField txtField;
    JLabel addme;
    JMenuBar addMenu = new JMenuBar();

    public Add(){
        this.setTitle("Add Menu Bar");
        this.setJMenuBar(addMenu);
        addme = new JLabel("Add Student Here");
        txtField = new JTextField("This is a add Section");

        add(txtField);
        addme.setBounds(20,20,70,25);


        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Add();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
