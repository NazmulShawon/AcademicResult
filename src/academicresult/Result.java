
package academicresult;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Result {

    // , String c1, double cg1, String c2, double cg2, String c3, double cg3, String c4, double cg4
    Result(String name, String batch, String id, String g, String c1, double cg1, String c2, double cg2, String c3, double cg3, String c4, double cg4) {
        double cgpa = (cg1 + cg2 + cg3 + cg4) / 4;
        String cgpast =  Double.toString(cgpa);
        JFrame frame = new JFrame();
        frame.setSize(700, 700);
        frame.setTitle("Academic Result");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(40, 40, 200, 25);
        label1.setText("Academic Result");
        Font font1 = new Font("ARIAL", Font.BOLD, 22);
        label1.setFont(font1);
        frame.add(label1);
        
        JLabel label2 = new JLabel();
        label2.setBounds(40, 80, 70, 25);
        label2.setText("Name:");
        Font font2 = new Font("ARIAL", Font.BOLD, 17);
        label2.setFont(font2);
        frame.add(label2);
        
         JLabel label3 = new JLabel();
        label3.setBounds(95, 80, 200, 25);
        label3.setText(name);
        Font font3 = new Font("ARIAL", Font.BOLD, 17);
        label3.setFont(font3);
        frame.add(label3);
        
        JLabel label4 = new JLabel();
        label4.setBounds(40, 105, 40, 25);
        label4.setText("ID:");
        Font font4 = new Font("ARIAL", Font.BOLD, 17);
        label4.setFont(font4);
        frame.add(label4);
        
        JLabel label5 = new JLabel();
        label5.setBounds(95, 105, 150, 25);
        label5.setText(id);
        Font font5 = new Font("ARIAL", Font.BOLD, 17);
        label5.setFont(font5);
        frame.add(label5);
        
//        course title 
        JLabel label6 = new JLabel();
        label6.setBounds(40, 150, 200, 25);
        label6.setText("Title");
        Font font6 = new Font("ARIAL", Font.BOLD, 17);
        label6.setFont(font6);
        frame.add(label6);
        
        
        JLabel label7 = new JLabel();
        label7.setBounds(40, 195, 200, 25);
        label7.setText(c1);
        Font font7 = new Font("ARIAL", Font.PLAIN, 16);
        label7.setFont(font7);
        frame.add(label7);
        
         
        JLabel label8 = new JLabel();
        label8.setBounds(40, 240, 200, 25);
        label8.setText(c2);
        Font font8 = new Font("ARIAL", Font.PLAIN, 16);
        label8.setFont(font8);
        frame.add(label8);
        
        JLabel label9 = new JLabel();
        label9.setBounds(40, 285, 200, 25);
        label9.setText(c3);
        Font font9 = new Font("ARIAL", Font.PLAIN, 16);
        label9.setFont(font9);
        frame.add(label9);
        
        JLabel label10 = new JLabel();
        label10.setBounds(40, 330, 200, 25);
        label10.setText(c4);
        Font font10 = new Font("ARIAL", Font.PLAIN, 16);
        label10.setFont(font10);
        frame.add(label10);
        
      
        //        course CG 
        JLabel label11 = new JLabel();
        label11.setBounds(280, 150, 200, 25);
        label11.setText("CP/CH");
        Font font11 = new Font("ARIAL", Font.BOLD, 17);
        label11.setFont(font11);
        frame.add(label11);
        
        
         JLabel label12 = new JLabel();
        label12.setBounds(280, 195, 200, 25);
        label12.setText(Double.toString(cg1));
        Font font12 = new Font("ARIAL", Font.PLAIN, 16);
        label12.setFont(font12);
        frame.add(label12);
        
         
         JLabel label13 = new JLabel();
        label13.setBounds(280, 240, 200, 25);
        label13.setText(Double.toString(cg2));
        Font font13 = new Font("ARIAL", Font.PLAIN, 16);
        label13.setFont(font13);
        frame.add(label13);
        
         JLabel label14 = new JLabel();
        label14.setBounds(280, 285, 200, 25);
        label14.setText(Double.toString(cg3));
        Font font14 = new Font("ARIAL", Font.PLAIN, 16);
        label14.setFont(font14);
        frame.add(label14);
        
         JLabel label15 = new JLabel();
        label15.setBounds(280, 330, 200, 25);
        label15.setText(Double.toString(cg4));
        Font font15 = new Font("ARIAL", Font.PLAIN, 16);
        label15.setFont(font15);
        frame.add(label15);
        
        
        JLabel label16 = new JLabel();
        label16.setBounds(40, 370, 60, 25);
        label16.setText("CGPA: ");
        Font font16 = new Font("ARIAL", Font.BOLD, 17);
        label16.setFont(font16);
        frame.add(label16);
        
        
        JLabel label17 = new JLabel();
        label17.setBounds(102, 370, 100, 25);
        label17.setText(Double.toString(cgpa));
        Font font17 = new Font("ARIAL", Font.BOLD, 17);
        label17.setFont(font17);
        frame.add(label17);
        frame.setVisible(true);
    }
}
