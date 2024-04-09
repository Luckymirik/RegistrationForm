import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SampleForm sampleForm = new SampleForm();
        sampleForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sampleForm.setLocationByPlatform(true);
        sampleForm.setTitle("Регистрация");
        sampleForm.pack();
        sampleForm.setVisible(true);


    }
}