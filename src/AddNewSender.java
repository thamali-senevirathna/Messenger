import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class AddNewSender extends JFrame {
  private   JLabel addNewSenderLbl;
  private   JLabel newSenderNameLbl;
  private JTextField newSenderTxt;

     AddNewSender() {
        Observable newSenderObservable = Observable.gettInstance();
        setTitle("ADD NEW SENDER");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 250);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);


        JLabel addNewSenderLbl = new JLabel("Add Sender");
        addNewSenderLbl.setFont(new Font("", Font.BOLD, 20));
        addNewSenderLbl.setVerticalAlignment(JLabel.CENTER);
        addNewSenderLbl.setHorizontalAlignment(JLabel.CENTER);
        addNewSenderLbl.setBounds(0, 0, 450, 40);
        addNewSenderLbl.setBackground(new Color(186, 85, 211));
        addNewSenderLbl.setForeground(Color.black);
        addNewSenderLbl.setOpaque(true);

        JLabel newSenderNameLbl = new JLabel("Sender Name:");
        newSenderNameLbl.setBounds(30, 90, 150, 50);
        newSenderNameLbl.setFont(new Font("",1,20));

        JTextField newSenderTxt = new JTextField();
        newSenderTxt.setBounds(170, 93, 200, 40);
        newSenderTxt.setFont(new Font("",1,20));
        newSenderTxt.setBorder(new LineBorder(Color.BLACK, 3));
        newSenderTxt.addActionListener(e->{
            newSenderObservable.addSender(new Sender(newSenderTxt.getText()));
        });
        add(addNewSenderLbl);
        add(newSenderNameLbl);
        add(newSenderTxt);
        setVisible(true);
    }




}
