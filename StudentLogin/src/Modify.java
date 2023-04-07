import javax.swing.*;

public class Modify extends JFrame  {

    JTextField txtField;
    JMenuBar modifyMenu = new JMenuBar();
    public Modify(){


        this.setTitle("Modify Menu");
        this.setJMenuBar(modifyMenu);

        txtField = new JTextField("This is a modify Section");

        add(txtField);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Modify();
    }

}
