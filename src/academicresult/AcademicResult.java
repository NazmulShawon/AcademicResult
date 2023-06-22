
package academicresult;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class AcademicResult {

   
     public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700, 700);
        frame.setTitle("Academic Result");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        ImageIcon img = new ImageIcon("img/logo2.png");
        JLabel image = new JLabel();
        image.setBounds(150, 20, 400, 119);
        image.setIcon(img);
        frame.add(image);
        
        // student photo
        ImageIcon img2 = new ImageIcon("img/img.png");
        JLabel image2 = new JLabel();
        image2.setBounds(500, 180, 100, 150);
        image2.setIcon(img2);
        frame.add(image2);

        JLabel label1 = new JLabel();
        label1.setBounds(40, 180, 200, 20);
        label1.setText("Student Name : ");
        Font font1 = new Font("ARIAL", Font.BOLD, 18);
        label1.setFont(font1);
        frame.add(label1);

        JTextField text1 = new JTextField();
        text1.setBounds(200, 180, 150, 25);
        frame.add(text1);

        JLabel label2 = new JLabel();
        label2.setBounds(40, 220, 200, 20);
        label2.setText("Batch                : ");
        Font font2 = new Font("ARIAL", Font.BOLD, 18);
        label2.setFont(font2);
        frame.add(label2);

        String[] batch = {"54", "55", "56", "57", "58"};
        JComboBox<String> comboBox = new JComboBox<>(batch);
        comboBox.setBounds(200, 220, 150, 20);
        frame.add(comboBox);

        JLabel label3 = new JLabel();
        label3.setBounds(40, 260, 200, 20);
        label3.setText("ID                       : ");
        Font font3 = new Font("ARIAL", Font.BOLD, 18);
        label3.setFont(font3);
        frame.add(label3);

        JTextField text2 = new JTextField();
        text2.setBounds(200, 260, 150, 25);
        frame.add(text2);

        JLabel label4 = new JLabel();
        label4.setBounds(40, 300, 200, 20);
        label4.setText("Gender             : ");
        Font font4 = new Font("ARIAL", Font.BOLD, 18);
        label4.setFont(font4);
        frame.add(label4);

        JTextField text3 = new JTextField();
        text3.setBounds(200, 300, 150, 25);
        frame.add(text3);

        JRadioButton rb1 = new JRadioButton("Female");
        rb1.setBounds(200, 340, 100, 20);
        frame.add(rb1);

        JRadioButton rb2 = new JRadioButton("Male");
        rb2.setBounds(300, 340, 100, 20);
        frame.add(rb2);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);
        ActionListener radioListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rb1.isSelected()) {
                    text3.setText("Female");
                } else if (rb2.isSelected()) {
                    text3.setText("Male");
                }
            }
        };

        rb1.addActionListener(radioListener);
        rb2.addActionListener(radioListener);

//        course 1 
        JLabel label5 = new JLabel();
        label5.setBounds(40, 400, 200, 20);
        label5.setText("Course Name : ");
        Font font5 = new Font("ARIAL", Font.BOLD, 18);
        label5.setFont(font5);
        frame.add(label5);

        String[] c1 = {"Object Oriented", "Physics", "Data Structure", "Algorithm", "English"};
        JComboBox<String> comboBox2 = new JComboBox<>(c1);
        comboBox2.setBounds(200, 400, 150, 25);
        frame.add(comboBox2);

        JLabel label6 = new JLabel();
        label6.setBounds(370, 400, 100, 20);
        label6.setText("CGPA : ");
        Font font6 = new Font("ARIAL", Font.BOLD, 18);
        label6.setFont(font6);
        frame.add(label6);

        JTextField text4 = new JTextField();
        text4.setBounds(470, 400, 150, 25);
        frame.add(text4);

        //        course 2 
        JLabel label7 = new JLabel();
        label7.setBounds(40, 445, 200, 20);
        label7.setText("Course Name : ");
        Font font7 = new Font("ARIAL", Font.BOLD, 18);
        label7.setFont(font7);
        frame.add(label7);

        String[] c2 = {"Data Structure", "Physics", "English", "Algorithm", "Object Oriented"};
        JComboBox<String> comboBox3 = new JComboBox<>(c2);
        comboBox3.setBounds(200, 445, 150, 25);
        frame.add(comboBox3);

        JLabel label8 = new JLabel();
        label8.setBounds(370, 445, 100, 20);
        label8.setText("CGPA : ");
        Font font8 = new Font("ARIAL", Font.BOLD, 18);
        label8.setFont(font8);
        frame.add(label8);

        JTextField text5 = new JTextField();
        text5.setBounds(470, 445, 150, 25);
        frame.add(text5);

        //        course 3 
        JLabel label9 = new JLabel();
        label9.setBounds(40, 485, 200, 20);
        label9.setText("Course Name : ");
        Font font9 = new Font("ARIAL", Font.BOLD, 18);
        label9.setFont(font9);
        frame.add(label9);

        String[] c3 = {"Algorithm", "Data Structure", "Physics", "English", "Object Oriented"};
        JComboBox<String> comboBox4 = new JComboBox<>(c3);
        comboBox4.setBounds(200, 485, 150, 25);
        frame.add(comboBox4);

        JLabel label10 = new JLabel();
        label10.setBounds(370, 485, 100, 20);
        label10.setText("CGPA : ");
        Font font10 = new Font("ARIAL", Font.BOLD, 18);
        label10.setFont(font10);
        frame.add(label10);

        JTextField text6 = new JTextField();
        text6.setBounds(470, 485, 150, 25);
        frame.add(text6);

        //        course 4
        JLabel label11 = new JLabel();
        label11.setBounds(40, 525, 200, 20);
        label11.setText("Course Name : ");
        Font font11 = new Font("ARIAL", Font.BOLD, 18);
        label11.setFont(font11);
        frame.add(label11);

        String[] c4 = {"Physics", "Data Structure", "Algorithm", "English", "Object Oriented"};
        JComboBox<String> comboBox5 = new JComboBox<>(c4);
        comboBox5.setBounds(200, 525, 150, 25);
        frame.add(comboBox5);

        JLabel label12 = new JLabel();
        label12.setBounds(370, 525, 100, 20);
        label12.setText("CGPA : ");
        Font font12 = new Font("ARIAL", Font.BOLD, 18);
        label12.setFont(font12);
        frame.add(label12);

        JTextField text7 = new JTextField();
        text7.setBounds(470, 525, 150, 25);
        frame.add(text7);

        JButton btn = new JButton("Submit");
        btn.setBounds(300, 600, 100, 25);
        frame.add(btn);
        
        JLabel label13 = new JLabel();
        label13.setBounds(370, 600, 100, 20);
      
        frame.add(label13);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sn = text1.getText();
//                String b = "55";
                String b =  (String) comboBox.getSelectedItem();
                String id = text2.getText();
                String gender = text3.getText();
                String cn1 = (String) comboBox2.getSelectedItem();
                double cg1 = Double.parseDouble(text4.getText());
                String cn2 = (String) comboBox3.getSelectedItem();
                double cg2 = Double.parseDouble(text5.getText());
                String cn3 = (String) comboBox4.getSelectedItem();
                double cg3 = Double.parseDouble(text6.getText());
                String cn4 = (String) comboBox5.getSelectedItem();
                double cg4 = Double.parseDouble(text7.getText());
                Result res = new Result(sn, b, id, gender, cn1, cg1, cn2, cg2, cn3, cg3, cn4, cg4);
                frame.dispose();
            }
            
              
   
        });
        frame.setVisible(true);
    }

    
}
