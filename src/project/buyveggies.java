/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author MeanRegression
 */


import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Cursor;
import javax.swing.JOptionPane;

public class buyveggies implements ItemListener,ActionListener
{
    float a=0,b=0,c=0,d=0;
    public static float total=0;
    JFrame f;
    JPanel jp;
    JLabel lb,lb1,lb2,lb3,lb4,lb5,lb6;
    ImageIcon ii;
    Choice c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
    JTextField tf,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20;
    JButton jb,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,cal,pay,home;
    
   
    public buyveggies()
    {
         f=new JFrame();
         f.setVisible(true);
         f.setResizable(false);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setSize(1366, 768);
         ii=new ImageIcon("img/background-floral-wallpaper-wallpapers-texture-colour-media.jpg");
         lb=new JLabel(ii);
         f.add(lb);
         jp=new JPanel();
         jp.setOpaque(false);
         jp.setLayout(null);
         jp.setBounds(0, 0, 1366, 768);
         lb.add(jp);
         c1=new Choice();
         c1.addItemListener(this);
         c1.setBounds(310  , 150, 150, 40);
        
         c1.add("POTATOES");
         c1.add("TOMATOES");
         c1.add("ONIONS");
         c1.add("CABBAGE");
         c1.add("CAULIFLOWER");
         c1.add("CARROTS");
         c1.add("GREEN CHILLIES");
         c1.add("SPINACH");
         c1.add("CORIANDER LEAVES");
         c1.add("PUMPKIN");
         c1.add("RADDISH");
         c1.add("GINGER");
         c1.add("GARLIC");
         c1.add("LEMON");
         c1.add("CORN");
         c1.add("BITTER GOURD");
         c1.add("GOURD");
         c1.add("LADY FINGER");
         c1.add("BOROCCLI");
         c1.add("MUSHROOMS");
         c1.add("GREEN PEAS");
         c1.add("GREEN BELLPEPPER");
         c1.add("RED BELLPEPPPER");
         c1.add("YELLOW BELLPEPER");
         jp.add(c1);
         c2=new Choice();
          c2.setBounds(310  , 200, 150, 40);
          c2.addItemListener(this);
         c2.add("POTATOES");
         c2.add("TOMATOES");
         c2.add("ONIONS");
         c2.add("CABBAGE");
         c2.add("CAULIFLOWER");
         c2.add("CARROTS");
         c2.add("GREEN CHILLIES");
         c2.add("SPINACH");
         c2.add("CORIANDER LEAVES");
         c2.add("PUMPKIN");
         c2.add("RADDISH");
         c2.add("GINGER");
         c2.add("GARLIC");
         c2.add("LEMON");
         c2.add("CORN");
         c2.add("BITTER GOURD");
         c2.add("GOURD");
         c2.add("LADY FINGER");
         c2.add("BOROCCLI");
         c2.add("MUSHROOMS");
         c2.add("GREEN PEAS");
         c2.add("GREEN BELLPEPPER");
         c2.add("RED BELLPEPPPER");
         c2.add("YELLOW BELLPEPER");
         jp.add(c2);
         
         tf=new JTextField("25");
         tf.setBounds(610, 150, 150, 20);
         jp.add(tf);
        jb=new JButton("SLOT 1");
         jb.setBounds(10, 150, 150, 20);
         jp.add(jb);
         jb1=new JButton("SLOT 2");
         jb1.setBounds(10, 200, 150, 20);
         jp.add(jb1);
         jb2=new JButton("SLOT 3");
         jb2.setBounds(10, 250, 150, 20);
         jp.add(jb2);
         jb3=new JButton("SLOT 4");
         jb3.setBounds(10, 300, 150, 20);
         jp.add(jb3);
         jb4=new JButton("SLOT 5");
         jb4.setBounds(10, 350, 150, 20);
         jp.add(jb4);
         jb5=new JButton("SLOT 6");
         jb5.setBounds(10, 400, 150, 20);
         jp.add(jb5);
         jb6=new JButton("SLOT 7");
         jb6.setBounds(10, 450, 150, 20);
         jp.add(jb6);
         jb7=new JButton("SLOT 8");
         jb7.setBounds(10, 500, 150, 20);
         jp.add(jb7);
         jb8=new JButton("SLOT 9");
         jb8.setBounds(10, 550, 150, 20);
         jp.add(jb8);
         jb9=new JButton("SLOT 10");
         jb9.setBounds(10, 600, 150, 20);
         jp.add(jb9);
         tf1=new JTextField("25");
         tf1.setBounds(610, 200, 150, 20);
         jp.add(tf1);
         c3=new Choice();
          c3.setBounds(310  , 250, 150, 40);
         c3.add("POTATOES");
         c3.add("TOMATOES");
         c3.add("ONIONS");
         c3.add("CABBAGE");
         c3.add("CAULIFLOWER");
         c3.add("CARROTS");
         c3.add("GREEN CHILLIES");
         c3.add("SPINACH");
         c3.add("CORIANDER LEAVES");
         c3.add("PUMPKIN");
         c3.add("RADDISH");
         c3.add("GINGER");
         c3.add("GARLIC");
         c3.add("LEMON");
         c3.add("CORN");
         c3.add("BITTER GOURD");
         c3.add("GOURD");
         c3.add("LADY FINGER");
         c3.add("BOROCCLI");
         c3.add("MUSHROOMS");
         c3.add("GREEN PEAS");
         c3.add("GREEN BELLPEPPER");
         c3.add("RED BELLPEPPPER");
         c3.add("YELLOW BELLPEPER");
         c3.addItemListener(this);
         jp.add(c3);
          c4=new Choice();
            c4.addItemListener(this);
          c4.setBounds(310  , 300, 150, 40);
         c4.add("POTATOES");
         c4.add("TOMATOES");
         c4.add("ONIONS");
         c4.add("CABBAGE");
         c4.add("CAULIFLOWER");
         c4.add("CARROTS");
         c4.add("GREEN CHILLIES");
         c4.add("SPINACH");
         c4.add("CORIANDER LEAVES");
         c4.add("PUMPKIN");
         c4.add("RADDISH");
         c4.add("GINGER");
         c4.add("GARLIC");
         c4.add("LEMON");
         c4.add("CORN");
         c4.add("BITTER GOURD");
         c4.add("GOURD");
         c4.add("LADY FINGER");
         c4.add("BOROCCLI");
         c4.add("MUSHROOMS");
         c4.add("GREEN PEAS");
         c4.add("GREEN BELLPEPPER");
         c4.add("RED BELLPEPPPER");
         c4.add("YELLOW BELLPEPER");
         jp.add(c4);
          c5=new Choice();
          c5.setBounds(310  , 350, 150, 40);
          c5.addItemListener(this);
         c5.add("POTATOES");
         c5.add("TOMATOES");
         c5.add("ONIONS");
         c5.add("CABBAGE");
         c5.add("CAULIFLOWER");
         c5.add("CARROTS");
         c5.add("GREEN CHILLIES");
         c5.add("SPINACH");
         c5.add("CORIANDER LEAVES");
         c5.add("PUMPKIN");
         c5.add("RADDISH");
         c5.add("GINGER");
         c5.add("GARLIC");
         c5.add("LEMON");
         c5.add("CORN");
         c5.add("BITTER GOURD");
         c5.add("GOURD");
         c5.add("LADY FINGER");
         c5.add("BOROCCLI");
         c5.add("MUSHROOMS");
         c5.add("GREEN PEAS");
         c5.add("GREEN BELLPEPPER");
         c5.add("RED BELLPEPPPER");
         c5.add("YELLOW BELLPEPER");
         jp.add(c5);
         c6=new Choice();
          c6.setBounds(310  , 400, 150, 40);
          c6.addItemListener(this);
         c6.add("POTATOES");
         c6.add("TOMATOES");
         c6.add("ONIONS");
         c6.add("CABBAGE");
         c6.add("CAULIFLOWER");
         c6.add("CARROTS");
         c6.add("GREEN CHILLIES");
         c6.add("SPINACH");
         c6.add("CORIANDER LEAVES");
         c6.add("PUMPKIN");
         c6.add("RADDISH");
         c6.add("GINGER");
         c6.add("GARLIC");
         c6.add("LEMON");
         c6.add("CORN");
         c6.add("BITTER GOURD");
         c6.add("GOURD");
         c6.add("LADY FINGER");
         c6.add("BOROCCLI");
         c6.add("MUSHROOMS");
         c6.add("GREEN PEAS");
         c6.add("GREEN BELLPEPPER");
         c6.add("RED BELLPEPPPER");
         c6.add("YELLOW BELLPEPER");
         jp.add(c6);
          c7=new Choice();
          c7.addItemListener(this);
          c7.setBounds(310  , 450, 150, 40);
         c7.add("POTATOES");
         c7.add("TOMATOES");
         c7.add("ONIONS");
         c7.add("CABBAGE");
         c7.add("CAULIFLOWER");
         c7.add("CARROTS");
         c7.add("GREEN CHILLIES");
         c7.add("SPINACH");
         c7.add("CORIANDER LEAVES");
         c7.add("PUMPKIN");
         c7.add("RADDISH");
         c7.add("GINGER");
         c7.add("GARLIC");
         c7.add("LEMON");
         c7.add("CORN");
         c7.add("BITTER GOURD");
         c7.add("GOURD");
         c7.add("LADY FINGER");
         c7.add("BOROCCLI");
         c7.add("MUSHROOMS");
         c7.add("GREEN PEAS");
         c7.add("GREEN BELLPEPPER");
         c7.add("RED BELLPEPPPER");
         c7.add("YELLOW BELLPEPER");
         jp.add(c7);
         c8=new Choice();
         c8.addItemListener(this);
          c8.setBounds(310  , 500, 150, 40);
         c8.add("POTATOES");
         c8.add("TOMATOES");
         c8.add("ONIONS");
         c8.add("CABBAGE");
         c8.add("CAULIFLOWER");
         c8.add("CARROTS");
         c8.add("GREEN CHILLIES");
         c8.add("SPINACH");
         c8.add("CORIANDER LEAVES");
         c8.add("PUMPKIN");
         c8.add("RADDISH");
         c8.add("GINGER");
         c8.add("GARLIC");
         c8.add("LEMON");
         c8.add("CORN");
         c8.add("BITTER GOURD");
         c8.add("GOURD");
         c8.add("LADY FINGER");
         c8.add("BOROCCLI");
         c8.add("MUSHROOMS");
         c8.add("GREEN PEAS");
         c8.add("GREEN BELLPEPPER");
         c8.add("RED BELLPEPPPER");
         c8.add("YELLOW BELLPEPER");
         jp.add(c8);
          c9=new Choice();
          c9.addItemListener(this);
          c9.setBounds(310  , 550, 150, 40);
         c9.add("POTATOES");
         c9.add("TOMATOES");
         c9.add("ONIONS");
         c9.add("CABBAGE");
         c9.add("CAULIFLOWER");
         c9.add("CARROTS");
         c9.add("GREEN CHILLIES");
         c9.add("SPINACH");
         c9.add("CORIANDER LEAVES");
         c9.add("PUMPKIN");
         c9.add("RADDISH");
         c9.add("GINGER");
         c9.add("GARLIC");
         c9.add("LEMON");
         c9.add("CORN");
         c9.add("BITTER GOURD");
         c9.add("GOURD");
         c9.add("LADY FINGER");
         c9.add("BOROCCLI");
         c9.add("MUSHROOMS");
         c9.add("GREEN PEAS");
         c9.add("GREEN BELLPEPPER");
         c9.add("RED BELLPEPPPER");
         c9.add("YELLOW BELLPEPER");
         jp.add(c9);
          c10=new Choice();
          c10.setBounds(310  , 600, 150, 40);
          c10.addItemListener(this);
         c10.add("POTATOES");
         c10.add("TOMATOES");
         c10.add("ONIONS");
         c10.add("CABBAGE");
         c10.add("CAULIFLOWER");
         c10.add("CARROTS");
         c10.add("GREEN CHILLIES");
         c10.add("SPINACH");
         c10.add("CORIANDER LEAVES");
         c10.add("PUMPKIN");
         c10.add("RADDISH");
         c10.add("GINGER");
         c10.add("GARLIC");
         c10.add("LEMON");
         c10.add("CORN");
         c10.add("BITTER GOURD");
         c10.add("GOURD");
         c10.add("LADY FINGER");
         c10.add("BOROCCLI");
         c10.add("MUSHROOMS");
         c10.add("GREEN PEAS");
         c10.add("GREEN BELLPEPPER");
         c10.add("RED BELLPEPPPER");
         c10.add("YELLOW BELLPEPER");
         jp.add(c10);
         tf2=new JTextField("25");
         tf2.setBounds(610, 250, 150, 20);
         jp.add(tf2);
         tf3=new JTextField("25");
         tf3.setBounds(610, 300, 150, 20);
         jp.add(tf3);
         tf4=new JTextField("25");
         tf4.setBounds(610, 350, 150, 20);
         jp.add(tf4);
         tf5=new JTextField("25");
         tf5.setBounds(610, 400, 150, 20);
         jp.add(tf5);
         tf6=new JTextField("25");
         tf6.setBounds(610, 450, 150, 20);
         jp.add(tf6);
         tf7=new JTextField("25");
         tf7.setBounds(610, 500, 150, 20);
         jp.add(tf7);
         tf8=new JTextField("25");
         tf8.setBounds(610, 550, 150, 20);
         jp.add(tf8);
         tf9=new JTextField("25");
         tf9.setBounds(610, 600, 150, 20);
         jp.add(tf9);
         c11=new Choice();
         c11.setBounds(910, 200, 150, 40);
         c11.addItemListener(this);
         c11.add(""+0);
         c11.add(""+0.100);
         c11.add(""+0.200);
         c11.add(""+0.250);
         c11.add(""+0.500);
         c11.add(""+0.750);
         c11.add(""+1.0);
         c11.add(""+1.250);
         c11.add(""+1.500);
         c11.add(""+1.750);
         c11.add(""+2.0);         
         c11.add(""+2.250);
         c11.add(""+2.500);
         c11.add(""+2.750);
          c11.add(""+3.0);
         c11.add(""+3.250);
         c11.add(""+3.500);
         c11.add(""+3.750);
         c11.add(""+4.0);
         c11.add(""+4.250);
         c11.add(""+4.500);
         c11.add(""+4.750);
         c11.add(""+5.0);
         jp.add(c11);
//         lb1=new JLabel("<html11>start buying vegetables as per the instructions given!!!!<br><hr></br></html>");
//         lb1.setForeground(Color.WHITE);
//         Font f=new Font("comic sans ms", Font.BOLD|Font.ITALIC, 12);
//         lb1.setFont(f);
//         lb1.setBounds(10, 10, 1300, 40);
         //jp.add(lb1);
         lb1=new JLabel("<html><ul><li>there are 10 slots among which you have to choose vegetables.If the slots are filled completely"
                 + "you can login again and continue the process again.</li><br><li>the first category is of vegetables"
                 + ",the second displays price per kg,third category allows you to choose preferable quantities in kilograms,the fourth categor"
                 + "y displays the price of your purchased items</li></ul><hr></html>");
         lb1.setForeground(Color.WHITE);
         Font f =new Font("comic sans ms", Font.BOLD|Font.ITALIC, 12);
         lb1.setFont(f);
         lb1.setBounds(10, 10, 1366, 150);
         jp.add(lb1);
        c12=new Choice();
        c12.addItemListener(this);
         c12.setBounds(910, 250, 150, 40);
         c12.add(""+0);
         c12.add(""+0.100);
         c12.add(""+0.200);
         c12.add(""+0.250);
         c12.add(""+0.500);
         c12.add(""+0.750);
         c12.add(""+1.0);
         c12.add(""+1.250);
         c12.add(""+1.500);
         c12.add(""+1.750);
         c12.add(""+2.0);         
         c12.add(""+2.250);
         c12.add(""+2.500);
         c12.add(""+2.750);
          c12.add(""+3.0);
         c12.add(""+3.250);
         c12.add(""+3.500);
         c12.add(""+3.750);
         c12.add(""+4.0);
         c12.add(""+4.250);
         c12.add(""+4.500);
         c12.add(""+4.750);
         c12.add(""+5.0);
         jp.add(c12);
         c13=new Choice();
         c13.setBounds(910, 300, 150, 40);
         c13.addItemListener(this);
         c13.add(""+0);
         c13.add(""+0.100);
         c13.add(""+0.200);
         c13.add(""+0.250);
         c13.add(""+0.500);
         c13.add(""+0.750);
         c13.add(""+1.0);         
         c13.add(""+1.250);
         c13.add(""+1.500);
         c13.add(""+1.750);
         c13.add(""+2.0);         
         c13.add(""+2.250);
         c13.add(""+2.500);
         c13.add(""+2.750);
          c13.add(""+3.0);
         c13.add(""+3.250);
         c13.add(""+3.500);
         c13.add(""+3.750);
         c13.add(""+4.0);
         c13.add(""+4.250);
         c13.add(""+4.500);
         c13.add(""+4.750);
         c13.add(""+5.0);
         jp.add(c13);
          c14=new Choice();
         c14.setBounds(910, 350, 150, 40);
         c14.addItemListener(this);
         c14.add(""+0);
         c14.add(""+0.100);
         c14.add(""+0.200);
         c14.add(""+0.250);
         c14.add(""+0.500);
         c14.add(""+0.750);
         c14.add(""+1.0);
         c14.add(""+1.250);
         c14.add(""+1.500);
         c14.add(""+1.750);
         c14.add(""+2.0);         
         c14.add(""+2.250);
         c14.add(""+2.500);
         c14.add(""+2.750);
          c14.add(""+3.0);
         c14.add(""+3.250);
         c14.add(""+3.500);
         c14.add(""+3.750);
         c14.add(""+4.0);
         c14.add(""+4.250);
         c14.add(""+4.500);
         c14.add(""+4.750);
         c14.add(""+5.0);
         jp.add(c14);
         c15=new Choice();
         c15.setBounds(910, 400, 150, 40);
         c15.addItemListener(this);
         c15.add(""+0);
         c15.add(""+0.100);
         c15.add(""+0.200);
         c15.add(""+0.250);
         c15.add(""+0.500);
         c15.add(""+0.750);
         c15.add(""+1.0);
         c15.add(""+1.250);
         c15.add(""+1.500);
         c15.add(""+1.750);
         c15.add(""+2.0);         
         c15.add(""+2.250);
         c15.add(""+2.500);
         c15.add(""+2.750);
          c15.add(""+3.0);
         c15.add(""+3.250);
         c15.add(""+3.500);
         c15.add(""+3.750);
         c15.add(""+4.0);
         c15.add(""+4.250);
         c15.add(""+4.500);
         c15.add(""+4.750);
         c15.add(""+5.0);
         jp.add(c15);
          c16=new Choice();
         c16.setBounds(910, 450, 150, 40);
         c16.addItemListener(this);
         c16.add(""+0);
         c16.add(""+0.100);
         c16.add(""+0.200);
         c16.add(""+0.250);
         c16.add(""+0.500);
         c16.add(""+0.750);
         c16.add(""+1.0);
         c16.add(""+1.250);
         c16.add(""+1.500);
         c16.add(""+1.750);
         c16.add(""+2.0);         
         c16.add(""+2.250);
         c16.add(""+2.500);
         c16.add(""+2.750);
          c16.add(""+3.0);
         c16.add(""+3.250);
         c16.add(""+3.500);
         c16.add(""+3.750);
         c16.add(""+4.0);
         c16.add(""+4.250);
         c16.add(""+4.500);
         c16.add(""+4.750);
         c16.add(""+5.0);
         jp.add(c16);
         c17=new Choice();
         c17.addItemListener(this);
         c17.setBounds(910, 500, 150, 40);
         c17.add(""+0);
         c17.add(""+0.100);
         c17.add(""+0.200);
         c17.add(""+0.250);
         c17.add(""+0.500);
         c17.add(""+0.750);
         c17.add(""+1.0);
         c17.add(""+1.250);
         c17.add(""+1.500);
         c17.add(""+1.750);
         c17.add(""+2.0);         
         c17.add(""+2.250);
         c17.add(""+2.500);
         c17.add(""+2.750);
          c17.add(""+3.0);
         c17.add(""+3.250);
         c17.add(""+3.500);
         c17.add(""+3.750);
         c17.add(""+4.0);
         c17.add(""+4.250);
         c17.add(""+4.500);
         c17.add(""+4.750);
         c17.add(""+5.0);
         jp.add(c17);
          c18=new Choice();
         c18.setBounds(910, 550, 150, 40);
         c18.addItemListener(this);
         c18.add(""+0);
         c18.add(""+0.100);
         c18.add(""+0.200);
         c18.add(""+0.250);
         c18.add(""+0.500);
         c18.add(""+0.750);
         c18.add(""+1.0);
         c18.add(""+1.250);
         c18.add(""+1.500);
         c18.add(""+1.750);
         c18.add(""+2.0);         
         c18.add(""+2.250);
         c18.add(""+2.500);
         c18.add(""+2.750);
          c18.add(""+3.0);
         c18.add(""+3.250);
         c18.add(""+3.500);
         c18.add(""+3.750);
         c18.add(""+4.0);
         c18.add(""+4.250);
         c18.add(""+4.500);
         c18.add(""+4.750);
         c18.add(""+5.0);
         jp.add(c18);
          c19=new Choice();
          c19.addItemListener(this);
         c19.setBounds(910, 600, 150, 40);
         c19.add(""+0);
         c19.add(""+0.100);
         c19.add(""+0.200);
         c19.add(""+0.250);
         c19.add(""+0.500);
         c19.add(""+0.750);
         c19.add(""+1.0);
         c19.add(""+1.250);
         c19.add(""+1.500);
         c19.add(""+1.750);
         c19.add(""+2.0);         
         c19.add(""+2.250);
         c19.add(""+2.500);
         c19.add(""+2.750);
          c19.add(""+3.0);
         c19.add(""+3.250);
         c19.add(""+3.500);
         c19.add(""+3.750);
         c19.add(""+4.0);
         c19.add(""+4.250);
         c19.add(""+4.500);
         c19.add(""+4.750);
         c19.add(""+5.0);
         jp.add(c19);
         c20=new Choice();
         c20.setBounds(910, 155, 150, 40);
         c20.addItemListener(this);
          c20.add(""+0);
         c20.add(""+0.100);
         c20.add(""+0.200);
         c20.add(""+0.250);
         c20.add(""+0.500);
         c20.add(""+0.750); 
         c20.add(""+1.0);
         c20.add(""+1.250);
         c20.add(""+1.500);
         c20.add(""+1.750);
         c20.add(""+2.0);         
         c20.add(""+2.250);
         c20.add(""+2.500);
         c20.add(""+2.750);
          c20.add(""+3.0);
         c20.add(""+3.250);
         c20.add(""+3.500);
         c20.add(""+3.750);
         c20.add(""+4.0);
         c20.add(""+4.250);
         c20.add(""+4.500);
         c20.add(""+4.750);
         c20.add(""+5.0);
         jp.add(c20);
         tf10=new JTextField("0");
         tf10.setBounds(1200, 150, 150, 20);
         jp.add(tf10);
          tf11=new JTextField("0");
         tf11.setBounds(1200, 200, 150, 20);
         jp.add(tf11);
            tf12=new JTextField("0");
         tf12.setBounds(1200, 250, 150, 20);
         jp.add(tf12);
          tf13=new JTextField("0");
         tf13.setBounds(1200, 300, 150, 20);
         jp.add(tf13);
          tf14=new JTextField("0");
         tf14.setBounds(1200, 350, 150, 20);
         jp.add(tf14);
         tf15=new JTextField("0");
         tf15.setBounds(1200, 400, 150, 20);
         jp.add(tf15);
          tf16=new JTextField("0");
         tf16.setBounds(1200, 450, 150, 20);
         jp.add(tf16);
         tf17=new JTextField("0");
           tf17.setBounds(1200, 500, 150, 20);
         jp.add(tf17);
         tf18=new JTextField("0");
           tf18.setBounds(1200, 550, 150, 20);
         jp.add(tf18);
         tf19=new JTextField("0");
           tf19.setBounds(1200, 600, 150, 20);
         jp.add(tf19);
         tf20=new JTextField("0.0");
         tf20.setBounds(1200, 650, 150, 20);
         jp.add(tf20);
         cal=new JButton("PURCHASE");
         cal.setFont(new Font("arial",  Font.BOLD, 14));
         cal.setBounds(900, 650, 150, 20);
         Cursor cur=new Cursor(Cursor.HAND_CURSOR);
         cal.setCursor(cur);
         cal.addActionListener(this);
         jp.add(cal);
        
    }
    public static void main(String args[])
    {
        new buyveggies();
    }


    @Override
    public void itemStateChanged(ItemEvent e)
    {
        Object obj=e.getSource();
        if(obj==c1)
        {
            String s=c1.getSelectedItem();
            if(s=="POTATOES")
            {
                tf.setText(""+25);
            }
            else if(s=="TOMATOES")
            {
                tf.setText(""+20);
            }
            else if(s=="ONIONS")
            {
                tf.setText(""+25);
            }
            else if(s=="CABBAGE")
            {
                tf.setText(""+40);
            }
            else if(s=="CAULIFLOWER")
            {
                tf.setText(""+50);
            }
            else if(s=="CARROTS")
            {
                tf.setText(""+35);
            }
            else if(s=="GREEN CHILLIES")
            {
                tf.setText(""+25);
            }
            else if(s=="SPINACH")
            {
                tf.setText(""+60);
            }
            else if(s=="CORIANDER LEAVES")
            {
                tf.setText(""+25);
            }
            else if(s=="PUMPKIN")
            {
                tf.setText(""+70);
            }
            else if(s=="RADDISH")
            {
                tf.setText(""+45);
            }
            else if(s=="GINGER")
            {
                tf.setText(""+100);
            }
            else if(s=="GARLIC")
            {
                tf.setText(""+160);
            }
            else if(s=="LEMON")
            {
                tf.setText(""+85);
            }
            else if(s=="CORN")
            {
                tf.setText(""+40);
            }
            else if(s=="BITTER GOURD")
            {
                tf.setText(""+50);
            }
            else if(s=="GOURD")
            {
                tf.setText(""+40);
            }
            else if(s=="LADY FINGER")
            {
                tf.setText(""+45);
            }
            else if(s=="BOROCCLI")
            {
                tf.setText(""+70);
            }
            else if(s=="MUSHROOMS")
            {
                tf.setText(""+100);
            }
            else if(s=="GREEN PEAS")
            {
                tf.setText(""+80);
            }
            else if(s=="GREEN BELLPEPPERS")
            {
                tf.setText(""+60);
            }
            else if(s=="RED BELLPEPPERS")
            {
                tf.setText(""+100);
            }
            else if(s=="YELLOW BELLPEPPERS")
            {
                tf.setText(""+100);
            }
        }
         if(obj==c2)
        {
            String s=c2.getSelectedItem();
            if(s=="POTATOES")
            {
                tf1.setText(""+25);
            }
            else if(s=="TOMATOES")
            {
                tf1.setText(""+20);
            }
            else if(s=="ONIONS")
            {
                tf1.setText(""+25);
            }
            else if(s=="CABBAGE")
            {
                tf1.setText(""+40);
            }
            else if(s=="CAULIFLOWER")
            {
                tf1.setText(""+50);
            }
            else if(s=="CARROTS")
            {
                tf1.setText(""+35);
            }
            else if(s=="GREEN CHILLIES")
            {
                tf1.setText(""+25);
            }
            else if(s=="SPINACH")
            {
                tf1.setText(""+60);
            }
            else if(s=="CORIANDER LEAVES")
            {
                tf1.setText(""+25);
            }
            else if(s=="PUMPKIN")
            {
                tf1.setText(""+70);
            }
            else if(s=="RADDISH")
            {
                tf1.setText(""+45);
            }
            else if(s=="GINGER")
            {
                tf1.setText(""+100);
            }
            else if(s=="GARLIC")
            {
                tf1.setText(""+160);
            }
            else if(s=="LEMON")
            {
                tf1.setText(""+85);
            }
            else if(s=="CORN")
            {
                tf1.setText(""+40);
            }
            else if(s=="BITTER GOURD")
            {
                tf1.setText(""+50);
            }
            else if(s=="GOURD")
            {
                tf1.setText(""+40);
            }
            else if(s=="LADY FINGER")
            {
                tf1.setText(""+45);
            }
            else if(s=="BOROCCLI")
            {
                tf1.setText(""+70);
            }
            else if(s=="MUSHROOMS")
            {
                tf1.setText(""+100);
            }
            else if(s=="GREEN PEAS")
            {
                tf1.setText(""+80);
            }
            else if(s=="GREEN BELLPEPPERS")
            {
                tf1.setText(""+60);
            }
            else if(s=="RED BELLPEPPERS")
            {
                tf1.setText(""+100);
            }
            else if(s=="YELLOW BELLPEPPERS")
            {
                tf1.setText(""+100);
            }
        }
          if(obj==c3)
        {
            String s=c3.getSelectedItem();
            if(s=="POTATOES")
            {
                tf2.setText(""+25);
            }
            else if(s=="TOMATOES")
            {
                tf2.setText(""+20);
            }
            else if(s=="ONIONS")
            {
                tf2.setText(""+25);
            }
            else if(s=="CABBAGE")
            {
                tf2.setText(""+40);
            }
            else if(s=="CAULIFLOWER")
            {
                tf2.setText(""+50);
            }
            else if(s=="CARROTS")
            {
                tf2.setText(""+35);
            }
            else if(s=="GREEN CHILLIES")
            {
                tf2.setText(""+25);
            }
            else if(s=="SPINACH")
            {
                tf2.setText(""+60);
            }
            else if(s=="CORIANDER LEAVES")
            {
                tf2.setText(""+25);
            }
            else if(s=="PUMPKIN")
            {
                tf2.setText(""+70);
            }
            else if(s=="RADDISH")
            {
                tf2.setText(""+45);
            }
            else if(s=="GINGER")
            {
                tf2.setText(""+100);
            }
            else if(s=="GARLIC")
            {
                tf2.setText(""+160);
            }
            else if(s=="LEMON")
            {
                tf2.setText(""+85);
            }
            else if(s=="CORN")
            {
                tf2.setText(""+40);
            }
            else if(s=="BITTER GOURD")
            {
                tf2.setText(""+50);
            }
            else if(s=="GOURD")
            {
                tf2.setText(""+40);
            }
            else if(s=="LADY FINGER")
            {
                tf2.setText(""+45);
            }
            else if(s=="BOROCCLI")
            {
                tf2.setText(""+70);
            }
            else if(s=="MUSHROOMS")
            {
                tf2.setText(""+100);
            }
            else if(s=="GREEN PEAS")
            {
                tf2.setText(""+80);
            }
            else if(s=="GREEN BELLPEPPERS")
            {
                tf2.setText(""+60);
            }
            else if(s=="RED BELLPEPPERS")
            {
                tf2.setText(""+100);
            }
            else if(s=="YELLOW BELLPEPPERS")
            {
                tf2.setText(""+100);
            }
        }
           if(obj==c4)
        {
            String s=c4.getSelectedItem();
            if(s=="POTATOES")
            {
                tf3.setText(""+25);
            }
            else if(s=="TOMATOES")
            {
                tf3.setText(""+20);
            }
            else if(s=="ONIONS")
            {
                tf3.setText(""+25);
            }
            else if(s=="CABBAGE")
            {
                tf3.setText(""+40);
            }
            else if(s=="CAULIFLOWER")
            {
                tf3.setText(""+50);
            }
            else if(s=="CARROTS")
            {
                tf3.setText(""+35);
            }
            else if(s=="GREEN CHILLIES")
            {
                tf3.setText(""+25);
            }
            else if(s=="SPINACH")
            {
                tf3.setText(""+60);
            }
            else if(s=="CORIANDER LEAVES")
            {
                tf3.setText(""+25);
            }
            else if(s=="PUMPKIN")
            {
                tf3.setText(""+70);
            }
            else if(s=="RADDISH")
            {
                tf3.setText(""+45);
            }
            else if(s=="GINGER")
            {
                tf3.setText(""+100);
            }
            else if(s=="GARLIC")
            {
                tf3.setText(""+160);
            }
            else if(s=="LEMON")
            {
                tf3.setText(""+85);
            }
            else if(s=="CORN")
            {
                tf3.setText(""+40);
            }
            else if(s=="BITTER GOURD")
            {
                tf3.setText(""+50);
            }
            else if(s=="GOURD")
            {
                tf3.setText(""+40);
            }
            else if(s=="LADY FINGER")
            {
                tf3.setText(""+45);
            }
            else if(s=="BOROCCLI")
            {
                tf3.setText(""+70);
            }
            else if(s=="MUSHROOMS")
            {
                tf3.setText(""+100);
            }
            else if(s=="GREEN PEAS")
            {
                tf3.setText(""+80);
            }
            else if(s=="GREEN BELLPEPPERS")
            {
                tf3.setText(""+60);
            }
            else if(s=="RED BELLPEPPERS")
            {
                tf3.setText(""+100);
            }
            else if(s=="YELLOW BELLPEPPERS")
            {
                tf3.setText(""+100);
            }
        }
           if(obj==c5)
           {
           String s=c5.getSelectedItem();
            if(s=="POTATOES")
            {
                tf4.setText(""+25);
            }
            else if(s=="TOMATOES")
            {
                tf4.setText(""+20);
            }
            else if(s=="ONIONS")
            {
                tf4.setText(""+25);
            }
            else if(s=="CABBAGE")
            {
                tf4.setText(""+40);
            }
            else if(s=="CAULIFLOWER")
            {
                tf4.setText(""+50);
            }
            else if(s=="CARROTS")
            {
                tf4.setText(""+35);
            }
            else if(s=="GREEN CHILLIES")
            {
                tf4.setText(""+25);
            }
            else if(s=="SPINACH")
            {
                tf4.setText(""+60);
            }
            else if(s=="CORIANDER LEAVES")
            {
                tf4.setText(""+25);
            }
            else if(s=="PUMPKIN")
            {
                tf4.setText(""+70);
            }
            else if(s=="RADDISH")
            {
                tf4.setText(""+45);
            }
            else if(s=="GINGER")
            {
                tf4.setText(""+100);
            }
            else if(s=="GARLIC")
            {
                tf4.setText(""+160);
            }
            else if(s=="LEMON")
            {
                tf4.setText(""+85);
            }
            else if(s=="CORN")
            {
                tf4.setText(""+40);
            }
            else if(s=="BITTER GOURD")
            {
                tf4.setText(""+50);
            }
            else if(s=="GOURD")
            {
                tf4.setText(""+40);
            }
            else if(s=="LADY FINGER")
            {
                tf4.setText(""+45);
            }
            else if(s=="BOROCCLI")
            {
                tf4.setText(""+70);
            }
            else if(s=="MUSHROOMS")
            {
                tf4.setText(""+100);
            }
            else if(s=="GREEN PEAS")
            {
                tf4.setText(""+80);
            }
            else if(s=="GREEN BELLPEPPERS")
            {
                tf4.setText(""+60);
            }
            else if(s=="RED BELLPEPPERS")
            {
                tf4.setText(""+100);
            }
            else if(s=="YELLOW BELLPEPPERS")
            {
                tf4.setText(""+100);
            }
        }
            if(obj==c6)
           {
           String s=c6.getSelectedItem();
            if(s=="POTATOES")
            {
                tf5.setText(""+25);
            }
            else if(s=="TOMATOES")
            {
                tf5.setText(""+20);
            }
            else if(s=="ONIONS")
            {
                tf5.setText(""+25);
            }
            else if(s=="CABBAGE")
            {
                tf5.setText(""+40);
            }
            else if(s=="CAULIFLOWER")
            {
                tf5.setText(""+50);
            }
            else if(s=="CARROTS")
            {
                tf5.setText(""+35);
            }
            else if(s=="GREEN CHILLIES")
            {
                tf5.setText(""+25);
            }
            else if(s=="SPINACH")
            {
                tf5.setText(""+60);
            }
            else if(s=="CORIANDER LEAVES")
            {
                tf5.setText(""+25);
            }
            else if(s=="PUMPKIN")
            {
                tf5.setText(""+70);
            }
            else if(s=="RADDISH")
            {
                tf5.setText(""+45);
            }
            else if(s=="GINGER")
            {
                tf5.setText(""+100);
            }
            else if(s=="GARLIC")
            {
                tf5.setText(""+160);
            }
            else if(s=="LEMON")
            {
                tf5.setText(""+85);
            }
            else if(s=="CORN")
            {
                tf5.setText(""+40);
            }
            else if(s=="BITTER GOURD")
            {
                tf5.setText(""+50);
            }
            else if(s=="GOURD")
            {
                tf5.setText(""+40);
            }
            else if(s=="LADY FINGER")
            {
                tf5.setText(""+45);
            }
            else if(s=="BOROCCLI")
            {
                tf5.setText(""+70);
            }
            else if(s=="MUSHROOMS")
            {
                tf5.setText(""+100);
            }
            else if(s=="GREEN PEAS")
            {
                tf5.setText(""+80);
            }
            else if(s=="GREEN BELLPEPPERS")
            {
                tf5.setText(""+60);
            }
            else if(s=="RED BELLPEPPERS")
            {
                tf5.setText(""+100);
            }
            else if(s=="YELLOW BELLPEPPERS")
            {
                tf5.setText(""+100);
            }
        }
             if(obj==c7)
           {
           String s=c7.getSelectedItem();
            if(s=="POTATOES")
            {
                tf6.setText(""+25);
            }
            else if(s=="TOMATOES")
            {
                tf6.setText(""+20);
            }
            else if(s=="ONIONS")
            {
                tf6.setText(""+25);
            }
            else if(s=="CABBAGE")
            {
                tf6.setText(""+40);
            }
            else if(s=="CAULIFLOWER")
            {
                tf6.setText(""+50);
            }
            else if(s=="CARROTS")
            {
                tf6.setText(""+35);
            }
            else if(s=="GREEN CHILLIES")
            {
                tf6.setText(""+25);
            }
            else if(s=="SPINACH")
            {
                tf6.setText(""+60);
            }
            else if(s=="CORIANDER LEAVES")
            {
                tf6.setText(""+25);
            }
            else if(s=="PUMPKIN")
            {
                tf6.setText(""+70);
            }
            else if(s=="RADDISH")
            {
                tf6.setText(""+45);
            }
            else if(s=="GINGER")
            {
                tf6.setText(""+100);
            }
            else if(s=="GARLIC")
            {
                tf6.setText(""+160);
            }
            else if(s=="LEMON")
            {
                tf6.setText(""+85);
            }
            else if(s=="CORN")
            {
                tf6.setText(""+40);
            }
            else if(s=="BITTER GOURD")
            {
                tf6.setText(""+50);
            }
            else if(s=="GOURD")
            {
                tf6.setText(""+40);
            }
            else if(s=="LADY FINGER")
            {
                tf6.setText(""+45);
            }
            else if(s=="BOROCCLI")
            {
                tf6.setText(""+70);
            }
            else if(s=="MUSHROOMS")
            {
                tf6.setText(""+100);
            }
            else if(s=="GREEN PEAS")
            {
                tf6.setText(""+80);
            }
            else if(s=="GREEN BELLPEPPERS")
            {
                tf6.setText(""+60);
            }
            else if(s=="RED BELLPEPPERS")
            {
                tf6.setText(""+100);
            }
            else if(s=="YELLOW BELLPEPPERS")
            {
                tf6.setText(""+100);
            }
        }
        if(obj==c8)
           {
           String s=c8.getSelectedItem();
            if(s=="POTATOES")
            {
                tf7.setText(""+25);
            }
            else if(s=="TOMATOES")
            {
                tf7.setText(""+20);
            }
            else if (s=="ONIONS")
            {
                tf7.setText(""+25);
            }
            else if(s=="CABBAGE")
            {
                tf7.setText(""+40);
            }
            else if(s=="CAULIFLOWER")
            {
                tf7.setText(""+50);
            }
            else if(s=="CARROTS")
            {
                tf7.setText(""+35);
            }
            else if(s=="GREEN CHILLIES")
            {
                tf7.setText(""+25);
            }
            else if(s=="SPINACH")
            {
                tf7.setText(""+60);
            }
            else if(s=="CORIANDER LEAVES")
            {
                tf7.setText(""+25);
            }
            else if(s=="PUMPKIN")
            {
                tf7.setText(""+70);
            }
            else if(s=="RADDISH")
            {
                tf7.setText(""+45);
            }
            else if(s=="GINGER")
            {
                tf7.setText(""+100);
            }
            else if(s=="GARLIC")
            {
                tf7.setText(""+160);
            }
            else if(s=="LEMON")
            {
                tf7.setText(""+85);
            }
            else if(s=="CORN")
            {
                tf7.setText(""+40);
            }
            else if(s=="BITTER GOURD")
            {
                tf7.setText(""+50);
            }
            else if(s=="GOURD")
            {
                tf7.setText(""+40);
            }
            else if(s=="LADY FINGER")
            {
                tf7.setText(""+45);
            }
            else if(s=="BOROCCLI")
            {
                tf7.setText(""+70);
            }
            else if(s=="MUSHROOMS")
            {
                tf7.setText(""+100);
            }
            else if(s=="GREEN PEAS")
            {
                tf7.setText(""+80);
            }
            else if(s=="GREEN BELLPEPPERS")
            {
                tf7.setText(""+60);
            }
            else if(s=="RED BELLPEPPERS")
            {
                tf7.setText(""+100);
            }
            else if(s=="YELLOW BELLPEPPERS")
            {
                tf7.setText(""+100);
            }
        } 
        if(obj==c9)
           {
           String s=c9.getSelectedItem();
            if(s=="POTATOES")
            {
                tf8.setText(""+25);
            }
            else if(s=="TOMATOES")
            {
                tf8.setText(""+20);
            }
            else if (s=="ONIONS")
            {
                tf8.setText(""+25);
            }
            else if(s=="CABBAGE")
            {
                tf8.setText(""+40);
            }
            else if(s=="CAULIFLOWER")
            {
                tf8.setText(""+50);
            }
            else if(s=="CARROTS")
            {
                tf8.setText(""+35);
            }
            else if(s=="GREEN CHILLIES")
            {
                tf8.setText(""+25);
            }
            else if(s=="SPINACH")
            {
                tf8.setText(""+60);
            }
            else if(s=="CORIANDER LEAVES")
            {
                tf8.setText(""+25);
            }
            else if(s=="PUMPKIN")
            {
                tf8.setText(""+70);
            }
            else if(s=="RADDISH")
            {
                tf8.setText(""+45);
            }
            else if(s=="GINGER")
            {
                tf8.setText(""+100);
            }
            else if(s=="GARLIC")
            {
                tf8.setText(""+160);
            }
            else if(s=="LEMON")
            {
                tf8.setText(""+85);
            }
            else if(s=="CORN")
            {
                tf8.setText(""+40);
            }
            else if(s=="BITTER GOURD")
            {
                tf8.setText(""+50);
            }
            else if(s=="GOURD")
            {
                tf8.setText(""+40);
            }
            else if(s=="LADY FINGER")
            {
                tf8.setText(""+45);
            }
            else if(s=="BOROCCLI")
            {
                tf8.setText(""+70);
            }
            else if(s=="MUSHROOMS")
            {
                tf8.setText(""+100);
            }
            else if(s=="GREEN PEAS")
            {
                tf8.setText(""+80);
            }
            else if(s=="GREEN BELLPEPPERS")
            {
                tf8.setText(""+60);
            }
            else if(s=="RED BELLPEPPERS")
            {
                tf8.setText(""+100);
            }
            else if(s=="YELLOW BELLPEPPERS")
            {
                tf8.setText(""+100);
            }
        }     
         if(obj==c10)
           {
           String s=c10.getSelectedItem();
            if(s=="POTATOES")
            {
                tf9.setText(""+25);
            }
            else if(s=="TOMATOES")
            {
                tf9.setText(""+20);
            }
            else if (s=="ONIONS")
            {
                tf9.setText(""+25);
            }
            else if(s=="CABBAGE")
            {
                tf9.setText(""+40);
            }
            else if(s=="CAULIFLOWER")
            {
                tf9.setText(""+50);
            }
            else if(s=="CARROTS")
            {
                tf9.setText(""+35);
            }
            else if(s=="GREEN CHILLIES")
            {
                tf9.setText(""+25);
            }
            else if(s=="SPINACH")
            {
                tf9.setText(""+60);
            }
            else if(s=="CORIANDER LEAVES")
            {
                tf9.setText(""+25);
            }
            else if(s=="PUMPKIN")
            {
                tf9.setText(""+70);
            }
            else if(s=="RADDISH")
            {
                tf9.setText(""+45);
            }
            else if(s=="GINGER")
            {
                tf9.setText(""+100);
            }
            else if(s=="GARLIC")
            {
                tf9.setText(""+160);
            }
            else if(s=="LEMON")
            {
                tf9.setText(""+85);
            }
            else if(s=="CORN")
            {
                tf9.setText(""+40);
            }
            else if(s=="BITTER GOURD")
            {
                tf9.setText(""+50);
            }
            else if(s=="GOURD")
            {
                tf9.setText(""+40);
            }
            else if(s=="LADY FINGER")
            {
                tf9.setText(""+45);
            }
            else if(s=="BOROCCLI")
            {
                tf9.setText(""+70);
            }
            else if(s=="MUSHROOMS")
            {
                tf9.setText(""+100);
            }
            else if(s=="GREEN PEAS")
             {
                tf9.setText(""+80);
            }
            else if(s=="GREEN BELLPEPPERS")
            {
                tf9.setText(""+60);
            }
            else if(s=="RED BELLPEPPERS")
            {
                tf9.setText(""+100);
            }
            else if(s=="YELLOW BELLPEPPERS")
            {
                tf9.setText(""+100);
            }
        }
         if(obj==c11)
         {
             a=Float.parseFloat(c11.getSelectedItem());
             b=Float.parseFloat(tf1.getText());
             c=a*b;
            tf11.setText(""+c);
         }
        if(obj==c20)
        {
            float d=Float.parseFloat(c20.getSelectedItem());
            float e1=Float.parseFloat(tf.getText());
            float f=d*e1;
            tf10.setText(""+f);
        }
         if(obj==c12)
        {
            float d=Float.parseFloat(c12.getSelectedItem());
            float e1=Float.parseFloat(tf2.getText());
            float f=d*e1;
            tf12.setText(""+f);
        }
         if(obj==c13)
        {
            float d=Float.parseFloat(c13.getSelectedItem());
            float e1=Float.parseFloat(tf3.getText());
            float f=d*e1;
            tf13.setText(""+f);
        }
         if(obj==c14)
        {
            float d=Float.parseFloat(c14.getSelectedItem());
            float e1=Float.parseFloat(tf4.getText());
            float f=d*e1;
            tf14.setText(""+f);
        }
         if(obj==c15)
        {
            float d=Float.parseFloat(c15.getSelectedItem());
            float e1=Float.parseFloat(tf5.getText());
            float f=d*e1;
            tf15.setText(""+f);
        }
          if(obj==c16)
        {
            float d=Float.parseFloat(c16.getSelectedItem());
            float e1=Float.parseFloat(tf6.getText());
            float f=d*e1;
            tf16.setText(""+f);
        }
          if(obj==c17)
        {
            float d=Float.parseFloat(c17.getSelectedItem());
            float e1=Float.parseFloat(tf7.getText());
            float f=d*e1;
            tf17.setText(""+f);
        }
          if(obj==c18)
        {
            float d=Float.parseFloat(c18.getSelectedItem());
            float e1=Float.parseFloat(tf8.getText());
            float f=d*e1;
            tf18.setText(""+f);
        }
           if(obj==c19)
        {
            float d=Float.parseFloat(c19.getSelectedItem());
            float e1=Float.parseFloat(tf9.getText());
            float f=d*e1;
            tf19.setText(""+f);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj=e.getSource();
        if(obj==cal)
        {
          total=Float.parseFloat(tf10.getText())+Float.parseFloat(tf11.getText())+Float.parseFloat(tf12.getText())+Float.parseFloat(tf13.getText())+
                  Float.parseFloat(tf14.getText())+Float.parseFloat(tf15.getText())+Float.parseFloat(tf16.getText())+Float.parseFloat(tf17.getText())+
                  Float.parseFloat(tf18.getText())+Float.parseFloat(tf19.getText());
          tf20.setText(""+total);
          if(total==0)
          {
              JOptionPane.showMessageDialog(f, "At least buy something");
          }
          else
          {
            JOptionPane.showMessageDialog(f, "your bill is rs."+total+" .You are being processed to the payment gateway");
            f.setVisible(false);
            f.dispose();
            
        }
    }
    }

    void setVissible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
