import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame implements ActionListener {
    JButton addRecord, modifyRecord, deleteRecord;
//    JPanel panel;
    //menu from here
    JMenuBar barMenu = new JMenuBar();
    JMenu addFile = new JMenu("Add");
    JMenu modifyFile = new JMenu("Modify");
    JMenu deleteFile = new JMenu("Delete");

    JMenuItem addStudent = new JMenuItem("Add Student");
    JMenuItem addSubject = new JMenuItem("Add Subject");
    JMenuItem modifySubject = new JMenuItem("Add Subject");

    public MainFrame(){
        this.setTitle("MenuBar");
        this.setJMenuBar(barMenu);
        //menu
        barMenu.add(addFile);
        barMenu.add(modifyFile);
        barMenu.add(deleteFile);

        //item menu
        addFile.add(addStudent);
        addFile.add(addSubject);

        modifyFile.add(modifySubject);



        addFile.addActionListener(this);
        modifyFile.addActionListener(this);
        deleteFile.addActionListener(this);

        //menu



        addRecord = new JButton("Add record");
        modifyRecord = new JButton("Add record");
        deleteRecord = new JButton("Add record");


        addRecord.addActionListener(this);
        modifyRecord.addActionListener(this);
        deleteRecord.addActionListener(this);

        addStudent.addActionListener(this);
        addSubject.addActionListener(this);
        modifySubject.addActionListener(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == addStudent){
            Add add = new Add();
        }
        
        if(e.getSource() == modifySubject){
            Modify modify = new Modify();
        }

//    Add add = new Add();

    }

    public static void main(String args[]){
        new MainFrame();
    }
}
