
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;


public class Sender extends JFrame implements Observer {
    private JFrame frame1;
    private JLabel sender1Label;

    private JTextField sender1TextField;
    private JButton buttonSend;
    private JTextArea sender1TextArea;
    private JButton btnAddNewSender;

    String title;


    public Sender(String title) {
        this.title = title;
        Observable observable = Observable.gettInstance();
        frame1 = new JFrame(title);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setSize(500, 400);
        frame1.setLocation(50, 50);
        frame1.setLayout(null);

        sender1Label=new JLabel(title);
        sender1Label.setHorizontalAlignment(JLabel.CENTER);
        sender1Label.setFont(new Font("", 1, 35));
        sender1Label.setBounds(70, 50, 600, 200);
        sender1Label.setVerticalAlignment(JLabel.TOP);
        sender1Label.setBounds(0, 0, 500, 50);
        sender1Label.setBackground(new Color(186, 85, 211));
        sender1Label.setForeground(Color.BLACK);
        sender1Label.setOpaque(true);

        sender1Label = new JLabel(title);
        sender1Label.setHorizontalAlignment(JLabel.CENTER);
        sender1Label.setFont(new Font("", 1, 35));
        sender1Label.setBounds(70, 50, 600, 200);
        sender1Label.setVerticalAlignment(JLabel.TOP);
        sender1Label.setBounds(0, 0, 500, 50);
        sender1Label.setBackground(new Color(186, 85, 211));
        sender1Label.setForeground(Color.BLACK);
        sender1Label.setOpaque(true);

        sender1TextField = new JTextField();
        sender1TextField.setFont(new Font("", 1, 20));
        sender1TextField.setHorizontalAlignment(JLabel.CENTER);
        sender1TextField.setBounds(60, 70, 300, 40);
        sender1TextField.setBackground(new Color(255, 250, 250));
        sender1TextField.setForeground(Color.BLACK);
        sender1TextField.setOpaque(true);
        sender1TextField.setBorder(new LineBorder(Color.BLACK, 2));

        JButton buttonSend = new JButton("Send");
        buttonSend.setFont(new Font("", 1, 18));
        buttonSend.setBounds(370, 75, 100, 30);
        buttonSend.setBorder(new LineBorder(Color.BLUE, 2));

        buttonSend.addActionListener(e -> {
            observable.setValue(title, sender1TextField.getText());
            sender1TextField.setText("");

        });

        sender1TextArea = new JTextArea("");
        sender1TextArea.setFont(new Font("", Font.BOLD, 20));
        sender1TextArea.setBounds(60, 150, 300, 200);
        sender1TextArea.setForeground(Color.BLACK);
        sender1TextArea.setOpaque(true);
        sender1TextArea.setBorder(new LineBorder(Color.BLACK, 2));

        btnAddNewSender=new JButton("+");
        btnAddNewSender.setFont(new Font("", 1, 35));
        btnAddNewSender.setBounds(378, 319, 80, 30);
        btnAddNewSender.setForeground(Color.BLACK);
        btnAddNewSender.setOpaque(true);
        btnAddNewSender.setBorder(new LineBorder(Color.BLACK, 2));
        btnAddNewSender.addActionListener(e->{
         new AddNewSender().setVisible(true);
        });

        frame1.add(sender1Label);
        frame1.add(sender1TextField);
        frame1.add(buttonSend);
        frame1.add(sender1TextArea);
        frame1.add(btnAddNewSender);
        frame1.setVisible(true);

    }
    @Override
    public void update(String title, String textMessage) {
        if(this.title==title){
            sender1TextArea.append("Me  : " + textMessage + "\n");

        }else{
            sender1TextArea.append(title+" : " + textMessage + "\n");

        }
    }
}


