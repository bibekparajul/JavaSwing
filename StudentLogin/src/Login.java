
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {       //interface implement garxi override garnu parxa
    JLabel lbluser, lblpass;
    JTextField txtuser;
    JPasswordField txtpass;
    JButton btnLogin;
    JButton btnReset;

    public Login(){
//        Font font = new Font("times new roman", Font.BOLD,16);

        lbluser = new JLabel("Username");

        lblpass = new JLabel("Password");

        txtuser = new JTextField(20);
        txtpass = new JPasswordField(20);

        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");

//        setLayout(new FlowLayout());
        setLayout(null);
        add(lbluser);
        lbluser.setBounds(20,20,70,25);


        add(txtuser);
        txtuser.setBounds(110,20,250,25);


        add(lblpass);
        lblpass.setBounds(20,60,70,25);


        add(txtpass);
        txtpass.setBounds(110,60,250,25);


        add(btnLogin);
        btnLogin.setBounds(110,100,70,25);
        btnLogin.addActionListener(this);

        add(btnReset);
        btnReset.setBounds(200,100,70,25);
        btnReset.addActionListener(this);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //close garxa x garda
        setTitle("Student Login");
        setSize(400,250);
        setResizable(false);      //maximize garna namilney
        setLocationRelativeTo(null);      //frame kata launey vanera set garxa




    }
    public static void main(String args[])throws Exception{
        //look and field vaneko main method vitra garney
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//        setDefaultLookAndFeelDecorated(true);
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = "abc";
        String pwd = "abc";

        String uname = txtuser.getText();
        String pwds = String.valueOf(txtpass.getPassword());

        if(username.equals(uname) && pwd.equals(pwds)){

            JOptionPane.showMessageDialog(null,"Want to move to next page???");
            MainFrame mainFrame=new MainFrame();


        }
        else{
            JOptionPane.showMessageDialog(null,"Login Failed");

        }

//        if(e.getSource() == btnLogin){
//            JOptionPane.showMessageDialog(null,"Login Checked");
//        }
//        if(e.getSource() == btnReset){
//            JOptionPane.showMessageDialog(null,"Reset Checked");
//        }
//    JOptionPane.showMessageDialog(null, "you cliced on login");
    }
}
