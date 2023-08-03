/*import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MassegeComponent extends JFrame {
    private JLabel

    private JButton setButton;
    private DefaultListModel<MassegeModel> model;
    private JList<MassegeModel> list;
    Observable observable;

    MassegeComponent(String name, Observable observable) {
        this.observable = observable;

        setTitle(name);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 450);
        setLocation(80, 50);
        setLayout(null);



        JButton setButton = new JButton("");
        setButton.setFont(new Font("", 1, 14));
        setButton.setBounds(650, 370, 100, 40);

        add(

        add(setButton);

        model = new DefaultListModel();
        model.addElement(new MassegeModel("10", "20", "12", "40"));

        setButton.addActionListener(evt -> {
            setButton.setText("Set");
            String startHour = "" + StartHourSpinner.getValue();
            String startMinute = "" + StartMinuteSpinner.getValue();
            String endHour = "" + EndHourSpinner.getValue();
            String endMinute = "" + EndMinuteSpinner.getValue();

            System.out.println(startHour+" "+startMinute+" "+endHour+" "+endMinute);

            model.addElement(new MassegeModel(startHour, startMinute, endHour, endMinute));
            observable.MassegeModel(startHour, startMinute, endHour, endMinute);

        });
        list = new JList(model);

        list.setFont(new Font("", 1, 20));
        list.setForeground(Color.RED);
        list.setBounds(50, 40, 500, 300);

        add(list);
        setVisible(true);


    }


}*/
