/*
-https://darkbyteblog.wordpress.com/2011/01/06/java-las-clausulas-package-e-import/
-http://www.edu4java.com/es/java/constructores-palabra-clave-this.html
-http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/clases1/arays.htm
*/
import Parte_Lógica.ConjuntoBitwise;

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JOptionPane;


public class Ventana_SetBitwise{
  /*-----------*/
  /* Atributos */
  /*-----------*/
  /*oooooooooooooooooooooooooooooooooo*/
  //Set = Conjunto en ingles
  private ConjuntoBitwise A = new ConjuntoBitwise();
  private ConjuntoBitwise B = new ConjuntoBitwise();
  private ConjuntoBitwise C = new ConjuntoBitwise();
  private ConjuntoBitwise D = new ConjuntoBitwise();
  
  /* Ventana */
  private JFrame Ventana;
  
  /*Button*/
  private JButton InsertarA;
  private JButton InsertarB;
  private JButton Eliminar_Elemento;
  private JButton Union;
  private JButton Intersection;  
  
  /*Caja de texto*/
  private JTextField  InsertarA_Txt;
  private JTextField  InsertarB_Txt;
  private JTextField  Eliminar_ElementoTxt;
  private JTextField  ResultadoTxt1;
  private JTextField  ResultadoTxt2;
  private JTextField  A_Txt;
  private JTextField  B_Txt;
  
  /* Labels */
  private JLabel label_A;
  private JLabel label_B;
  private JLabel label_Union;
  private JLabel label_Interseccion;
  
  /*oooooooooooooooooooooooooooooooooo*/
  //Clase pincipal
  public static void main(String[] args){  
    new Ventana_SetBitwise();
  }
  
  //Constructor De la Ventana
  public Ventana_SetBitwise(){
    //Variablede tipo JFrame    
    Ventana = new JFrame("Ventanita Conjunto Bitwise");
    Ventana.setSize(850,550);
    Ventana.getContentPane().setBackground(Color.white);
    Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*Finaliza el programa*/
    Ventana.setLayout(new GridBagLayout());
    
    Color lightBlue = new Color(51, 153, 255);
    
    //Declaramos la caja InsertarA_Txt
    InsertarA_Txt = new JTextField("");
    Border BorderInsertarA_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    InsertarA_Txt.setBorder(BorderInsertarA_Txt);
    
    //Declaramos la caja InsertarB_Txt
    InsertarB_Txt = new JTextField("");
    Border BorderInsertarB_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    InsertarB_Txt.setBorder(BorderInsertarB_Txt);
    
    //Declaramos la caja Eliminar_ElementoTxt
    Eliminar_ElementoTxt = new JTextField("");
    Border BorderEliminar_ElementoTxt = BorderFactory.createLineBorder(lightBlue, 2);
    Eliminar_ElementoTxt.setBorder(BorderEliminar_ElementoTxt);
    
    //Declaramos la caja ResultadoTxt1
    ResultadoTxt1 = new JTextField("");
    Border BorderResultadoTxt1 = BorderFactory.createLineBorder(lightBlue, 2);
    ResultadoTxt1.setBorder(BorderResultadoTxt1);
    
     //Declaramos la caja ResultadoTxt2
    ResultadoTxt2 = new JTextField("");
    Border BorderResultadoTxt2 = BorderFactory.createLineBorder(lightBlue, 2);
    ResultadoTxt2.setBorder(BorderResultadoTxt2);
    
    //Declaramos la caja A_Txt
    A_Txt = new JTextField("");
    Border BorderA_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    A_Txt.setBorder(BorderA_Txt);
    
    //Declaramos la caja B_Txt
    B_Txt = new JTextField("");
    Border BorderB_Txt = BorderFactory.createLineBorder(lightBlue, 2);
    B_Txt.setBorder(BorderB_Txt);
    
    //Declaramos todos los labels    
    label_A= new JLabel("       A");
    label_A.setFont(new Font("Arial", 0, 18));
    
    label_B= new JLabel("       B");
    label_B.setFont(new Font("Arial", 0, 18));
    
    label_Union = new JLabel("Unión");
    label_Union.setFont(new Font("Arial", 0, 18));
    
    label_Interseccion = new JLabel("Intersección");
    label_Interseccion.setFont(new Font("Arial", 0, 18));
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*+++Declaramos todos los Botones+++*/
    /*+++++++++++++++++++++++++++++++++*/
     

    //Declaramos botón InsertarA
    InsertarA = new JButton("Insertar en A");
    InsertarA.setForeground(Color.white);
    InsertarA.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
    InsertarA.setBackground(lightBlue);
    
    //Declaramos botón InsertarA
    InsertarB = new JButton("Insertar en B");
    InsertarB.setForeground(Color.white);
    InsertarB.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
    InsertarB.setBackground(lightBlue);
    
    //Declaramos botón Eliminar_Elemento
    Eliminar_Elemento = new JButton("Eliminar");
    Eliminar_Elemento.setForeground(Color.white);
    Eliminar_Elemento.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
    Eliminar_Elemento.setBackground(lightBlue);
    
    //Declaramos botón Union
    Union = new JButton("Union");
    Union.setForeground(Color.white);
    Union.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
    Union.setBackground(lightBlue);
    
    //Declaramos botón Intersection
    Intersection = new JButton("Intersección");
    Intersection.setForeground(Color.white);
    Intersection.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
    Intersection.setBackground(lightBlue);
    
    
    /*-------Objeto de configuración del grid-------*/
    GridBagConstraints gridConf = new GridBagConstraints();
    gridConf.fill = GridBagConstraints.HORIZONTAL;
    /*---------------------------------------------*/
    
    /*-------------------------------*/
    /* Adherir elementos a la ventana*/
    /*-------------------------------*/
    
    /*+++++++++++++*/
    /*Caja de Texto*/
    /*+++++++++++++*/
    
    /* Confi de InsertarA_Txt */
    gridConf.gridx = 1;
    gridConf.gridy = 1;
    gridConf.ipady = 20;
    gridConf.ipadx = 50;
    gridConf.gridwidth = 1;
    gridConf.insets = new Insets(0,0,6,6); //padding
    //Añadir InsertarA_Txt en la ventana
    Ventana.add(InsertarA_Txt,gridConf);
    gridConf.gridwidth = 1;
    
    /* Confi de InsertarB_Txt */
    gridConf.gridy = 2;
    gridConf.gridwidth = 1;
    //Añadir InsertarB_Txt en la ventana
    Ventana.add(InsertarB_Txt,gridConf);
    gridConf.gridwidth = 1;
    
    /* Confi de Eliminar_ElementoTxt */
    gridConf.gridy = 3;
    gridConf.gridwidth = 1;
    //Añadir Eliminar_ElementoTxt en la ventana
    Ventana.add(Eliminar_ElementoTxt,gridConf);
    gridConf.gridwidth = 1;
    
    /* Confi de A_Txt */
    gridConf.gridy = 5;
    gridConf.ipadx = 450;
    gridConf.gridwidth = 2;
    //Añadir A_Txt en la ventana
    Ventana.add(A_Txt,gridConf);
    gridConf.gridwidth = 1;
    
    /* Confi de B_Txt */
    gridConf.gridy = 6;
    gridConf.ipadx = 450;
    gridConf.gridwidth = 2;
    //Añadir B_Txt en la ventana
    Ventana.add(B_Txt,gridConf);
    gridConf.gridwidth = 1;
    
    /* Confi de ResultadoTxt1 */
    gridConf.gridy = 7;
    gridConf.ipadx = 450;
    gridConf.gridwidth = 2;
    //Añadir ResultadoTxt en la ventana
    Ventana.add(ResultadoTxt1,gridConf);
    gridConf.gridwidth = 1;
    
    /* Confi de ResultadoTxt2 */
    gridConf.gridy = 8;
    gridConf.ipadx = 450;
    gridConf.gridwidth = 2;
    //Añadir ResultadoTxt en la ventana
    Ventana.add(ResultadoTxt2,gridConf);
    gridConf.gridwidth = 1;
    
    /*+++++++*/
    /*Botones*/
    /*+++++++*/
    
    //Confi de InsertarA
    gridConf.ipady = 20;
    gridConf.ipadx = 20;
    gridConf.gridwidth = 1;
    //Ayadir InsertarA en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 1;
    Ventana.add(InsertarA, gridConf);
    
    //Confi de InsertarB
    //Ayadir InsertarB en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 2;
    Ventana.add(InsertarB, gridConf);
    
    //Confi de Eliminar_Elemento
    //Ayadir Eliminar_Elemento en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 3;
    Ventana.add(Eliminar_Elemento, gridConf);
    
    //Confi de Union
    //Ayadir Union en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 4;
    Ventana.add(Union, gridConf);
    
    //Confi de Intersection
    //Ayadir Intersection en la ventana
    gridConf.gridx = 1;
    gridConf.gridy = 4;
    gridConf.ipady = 20;
    gridConf.ipadx = 20;
    gridConf.gridwidth = 1;
    //gridConf.insets = new Insets(10,10,10,10);
    Ventana.add(Intersection, gridConf);
    
    /****************/
    /*   Labels     */ 
    /****************/
      
    //Añadir labels a la ventana
      gridConf.gridx = 0;
      gridConf.gridy = 5;
      gridConf.ipadx = 15;
      Ventana.add(label_A, gridConf); 
      
      gridConf.gridy = 6;
      Ventana.add(label_B, gridConf);
      
      gridConf.gridy = 7;
      Ventana.add(label_Union, gridConf);
      
      gridConf.gridy = 8;
      Ventana.add(label_Interseccion, gridConf);
      
    /*****************************************/
    /*******Onclick De los Botoncitos*********/
    /*****************************************/
    
    
    //onclick InsertarA
    InsertarA.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        InsertarA_Click();
      }
    });
    
    //onclick InsertarB
    InsertarB.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        InsertarB_Click();
      }
    });
    
    //onclick Eliminar_Elemento
    Eliminar_Elemento.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Eliminar_Elemento_Click();
      }
    });
    
    //onclick Union
    Union.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Union_Click();
      }
    });
    
    //onclick Intersection
    Intersection.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Intersection_Click();
      }
    });
    
    /*------------------------*/
    //ventanaM.pack();
    Ventana.setVisible(true);//Configurando visualización de la ventana
    /*------------------------*/  
  }
  
  
  
  public void InsertarA_Click(){
    int InsertarA_Aux = Integer.parseInt(InsertarA_Txt.getText());
    A.Insertar(InsertarA_Aux);
    A_Txt.setText(A.ObtenerTodo());
  }
  
  public void InsertarB_Click(){
  
    int InsertarB_Aux = Integer.parseInt(InsertarB_Txt.getText());
    B.Insertar(InsertarB_Aux);
    B_Txt.setText(B.ObtenerTodo());
  }
  
  public void Union_Click(){ 
    C.Union(A,B);
    ResultadoTxt1.setText(C.ObtenerTodo());
  }
  
  public void Intersection_Click(){ 
    D.Intersection(A,B);
    ResultadoTxt2.setText(D.ObtenerTodo());
  }
  
  public void Eliminar_Elemento_Click(){
  
    int Eliminar_Elemento_Aux = Integer.parseInt(Eliminar_ElementoTxt.getText());
    /***********/
    //Declaring a variable 
    int number;
    number = Integer.parseInt(JOptionPane.showInputDialog(Ventana," Delete en A insert 1;\n Delete en B insert 2;\n Delete en C;\n Delete en D "));
    //Switch expression
    switch (number){
      //Case statements
      case 1:
        A.Eliminar(Eliminar_Elemento_Aux);
        A_Txt.setText(A.ObtenerTodo());
        break;
      case 2:
        B.Eliminar(Eliminar_Elemento_Aux);
        B_Txt.setText(B.ObtenerTodo());
        break;
      case 3:
        C.Eliminar(Eliminar_Elemento_Aux);
        ResultadoTxt1.setText(C.ObtenerTodo());
        break;
      case 4:
        D.Eliminar(Eliminar_Elemento_Aux);
        ResultadoTxt2.setText(D.ObtenerTodo());
        break;
        //Default case statement
      default:
        System.out.println("Not in 1 or 2 ");
    }
    /***********/
  }
  
  
}
