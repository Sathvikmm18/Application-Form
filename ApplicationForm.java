/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.applicationform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationForm {
    public static void main(String[] args) {
        JFrame f=new JFrame("Student Detatils");
        JLabel l=new JLabel("Application Form");
        l.setBounds(500,10, 600, 180);
        //name
        JLabel l1=new JLabel("Student Name");
        l1.setBounds(300,50,600,180);
        JTextField t1=new JTextField();
        t1.setBounds(300,150,100,20);
        //usn
        JLabel l2=new JLabel("Student USN");
        l2.setBounds(300,110,750,180);
        JTextField t2=new JTextField();
        t2.setBounds(300,210,100,20);
        //NUMBER
        JLabel l3=new JLabel("Phone Number");
        l3.setBounds(300,170,750,180);
        JTextField t3=new JTextField();
        t3.setBounds(300,270,100,20);
        //GMAIL
        JLabel l4=new JLabel("G-Mail");
        l4.setBounds(300,230,750,180);
        JTextField t4=new JTextField();
        t4.setBounds(300,330,100,20);
        //college
        JLabel l8=new JLabel("Enter the College Name");
        l8.setBounds(300,290,750,180);
        JTextField t5=new JTextField();
        t5.setBounds(300,390,100,20);
        //12th marks
        JLabel l10=new JLabel("12th marks in Percentage");
        l10.setBounds(300,350,750,180);
        JTextField t6=new JTextField();
        t6.setBounds(300,450,100,20);
        
        //GENDER
        ButtonGroup bg=new ButtonGroup();
        JLabel l5=new JLabel("Gender");
        l5.setBounds(700,117,100,20);
        JRadioButton rb1=new JRadioButton();
        rb1.setText("MALE");
        rb1.setBounds(700,137,100,20);
        JRadioButton rb2=new JRadioButton();
        rb2.setText("FEMALE");
        rb2.setBounds(800,137,100,20);
        bg.add(rb1);
        bg.add(rb2);
        
        //BRANCH
        
        JLabel l6=new JLabel("Select the Branch");
        l6.setBounds(700,165,160,20);
        String branch[]={"SELECT","CSE","ISE","ECE","CIVIL","AEROSPACE"};
        JComboBox cb=new JComboBox(branch);
        cb.setBounds(700,192,190,20);
        //subject
        JLabel l7=new JLabel("Select the Subjects");
        l7.setBounds(700,230,200,20);
        JCheckBox ob1=new JCheckBox("JAVA");
        ob1.setBounds(700,250,60,20);
        JCheckBox ob2=new JCheckBox("C++");
        ob2.setBounds(700,270,60,20);
        JCheckBox ob3=new JCheckBox("PYTHON");
        ob3.setBounds(700,290,100,20);
        JCheckBox ob4=new JCheckBox("SWIFT");
        ob4.setBounds(700,310,100,20);
        JCheckBox ob5=new JCheckBox("KOTLIN");
        ob5.setBounds(700,330,100,20);
        
        /*Admission Year
        //JLabel l9=new JLabel("Admission Year");
        l9.setBounds(700,370,200,30);
        JCheckBox ob6=new JCheckBox("2018");
        ob6.setBounds(700,390,60,25);
        JCheckBox ob7=new JCheckBox("2019");
        ob7.setBounds(700,410,60,25);
        JCheckBox ob8=new JCheckBox("2020");
        ob8.setBounds(700,430,60,25);
        JCheckBox ob9=new JCheckBox("2021");
        ob9.setBounds(700,450,60,25);
        JCheckBox ob10=new JCheckBox("2022");
        ob10.setBounds(700,470,60,25);
        JCheckBox ob11=new JCheckBox("2023");
        ob11.setBounds(700,490,60,25);*/
        //Admission Year
        JLabel l9=new JLabel("Admission Year");
        l9.setBounds(700,340,160,60);
        String Admission[]={"Select","2019","2020","2021","2022","2023","2024"};
        JComboBox cb1=new JComboBox(Admission);
        cb1.setBounds(700,380,190,20);
        
        //blood group
        JLabel l11=new JLabel("Blood group");
        l11.setBounds(700,400,160,60);
        String blood[]={"Select","O+","O-","A+","A-","B+","B-","AB+","AB-"};
        JComboBox cb2=new JComboBox(blood);
        cb2.setBounds(700,440,190,20);
        //SAVE AND CANCEL
        JPanel p=new JPanel();
        JButton b1=new JButton("Summit");  
        b1.setBounds(480,490,80,20);
        JButton b2=new JButton("Cancel");  
        b2.setBounds(590,490,80,20);
        
        
        TextField tf=new TextField();  
        tf.setBounds(460,530,250,20);
        b1.addActionListener(new ActionListener(){  
            
            public void actionPerformed(ActionEvent e){  
                
               tf.setText("Application Successfully Submitted");  
            }  
        });
        b2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               tf.setText("cancelled");  
            }  
        });
        p.add(b1);
        p.add(b2);
        
        f.add(tf);
        f.add(p);
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(l11);
        
        f.add(b1);
        f.add(b2);
        
        
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        
        f.add(rb1);
        f.add(rb2);
        f.add(cb);
        f.add(cb1);
        f.add(cb2);
        
        
        f.add(ob1);
        f.add(ob2);
        f.add(ob3);
        f.add(ob4);
        f.add(ob5);
        /*f.add(ob6);
        f.add(ob7);
        f.add(ob8);
        f.add(ob9);
        f.add(ob10);
        f.add(ob11);*/
        
    
        f.setSize(1400, 1400);
        f.setLayout(null);
        f.setVisible(true);
        

    }
}
        
        
        
        
        
        
        
        
        

        
        
        
        

       

       
        
        
        
        

        
        
        
        