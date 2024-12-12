import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class BMI_Calculator extends JFrame{
    private JPanel BMI_Converter;
    private JFormattedTextField Height;
    private JFormattedTextField Weight;
    private JButton Calculate;

    public BMI_Calculator(){
       setTitle("BMI Calculator");
       setVisible(true);
       setSize(250,200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setContentPane(BMI_Converter);

        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float height = (float) ((Double.parseDouble(Height.getText()))*0.01);
                float weight =(float) Double.parseDouble(Weight.getText());
                if(height<=0||weight<=0){
                    JOptionPane.showMessageDialog(BMI_Calculator.this,"Invalid Input");
                }
                float BMI= (weight/(height*height));
                String status=null;
                if(BMI<18.5)status="Underweight";
                else if(BMI>=18.5&&BMI<25)status="Healthy Weight";
                else if(BMI>=25&&BMI<30)status="Overweight";
                else if(BMI>=30)status="Obesity";
                JOptionPane.showMessageDialog(BMI_Calculator.this,"Your Bmi ="+BMI+'\n'+"Your status is "+status);


            }
        });

    }

    public static void main(String[] args) {
        new BMI_Calculator();

    }

}

