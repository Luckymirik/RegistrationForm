import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class SampleForm extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JLabel label;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JComboBox comboBox1;
    private JButton button;
    private JSpinner spinner1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JSlider slider1;
    private JList list1;
    private JTextPane textPane1;
    public SampleForm(){
        this.getContentPane().add(panel);
        spinner1.setModel(new SpinnerNumberModel(18,18,100,1));

        Color red = new Color(200,90,90);

        button.addActionListener(e -> {
            boolean error = false;
            if (textField1.getText().length()==0){
                textField1.setBackground(red);
                error=true;
            }else {
                textField1.setBackground(Color.white);
            }
            if (passwordField1.getPassword().length<7||passwordField2.getPassword().length<7||
            !Arrays.equals(passwordField1.getPassword(),passwordField2.getPassword())){
                passwordField1.setBackground(red);
                passwordField2.setBackground(red);
                error=true;
            }else {
                passwordField1.setBackground(Color.white);
                passwordField2.setBackground(Color.white);
            }
            if (!error){
                int[] selectedIndices = list1.getSelectedIndices();
                String list = "";
                for (int i = 0; i < selectedIndices.length; i++) {
                    list+=" " + list1.getModel().getElementAt(selectedIndices[i]);
                }
                new JOptionPane().showMessageDialog(panel,
                        "Фамилия Имя Отчество - " + textField1.getText()+"\n"+
                                "Пароль - " + new String(passwordField1.getPassword())+"\n"+
                                "Пол - " + (radioButton1.isSelected()?"Муж":"Жен") + "\n" +
                                "Возраст - " +   spinner1.getValue() + "\n" +
                                "Образование - " + comboBox1.getSelectedItem() + "\n" +
                                "Сфера интересов - " +  (checkBox1.isSelected()?checkBox1.getText() + " ":"")+
                                  (checkBox2.isSelected()?checkBox2.getText() + " ":"")+
                                  (checkBox3.isSelected()?checkBox3.getText() + " ":"")+
                                  (checkBox4.isSelected()?checkBox4.getText() + " ":"") + "\n" +
                                "Ваш текущий уровень знаний, % - " + slider1.getValue() + "\n" +
                                "Почему вам это интересно?  - " + list + "\n" ,
                        "Ваши данные",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
