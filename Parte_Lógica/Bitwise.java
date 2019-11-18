package Parte_Lógica;

import java.util.Scanner;

public class Bitwise{
  int x;
  
  public Bitwise(){
    x=0;
  }
  
  public void Encender(int position){
    int mask = 1;
    mask = mask << position -1;
    x = x | mask;
  }
  
  public void Apagar(int position){
    int mask = 1;
    mask = mask << position -1;
    mask = ~ mask;
    x = x & mask;
  }
  
  public int GetBit(int position){
    int mask = 1;
    mask = mask << position -1;
    mask = mask & x;
    mask = mask >>> position -1;
    return mask;
  }
  
  public String ObtenerTodo(){
    String cadena = "x = ";
    for (int i = 32;i >= 1;i--){
      cadena = cadena + GetBit(i) + " ";
      System.out.println(i);
    }
    return cadena;
  }
 // System.out.println("Funciona");

}
