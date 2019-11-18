//chmod 777 run
package Parte_Lógica;
import java.util.Scanner;

public class ConjuntoBitwise{
  Bitwise [] Conjunto;
  int dim;
  int NumberOfbit;
  int NumberOfBitwise;
  
  //Constructor
  public ConjuntoBitwise(){
    NumberOfBitwise = 1;
    this.Conjunto = new Bitwise [NumberOfBitwise];//length del vector 1
    dim = 32;
    this.Conjunto[0] = new Bitwise(); //en position 0 hay un bitwise de 32 espacios
    
  }
  
  /*-----------------------------------------*/
  /*-------------- Metodos ------------------*/
  /*-----------------------------------------*/
  //                                   2    1
  //Obtener el número de bitwise C [ 00000 00000 ]
  public int GetNumeroDe_Bitwise(int Position){
    int aux = (Position -1) / 32;
    return aux;
  }
  //                             54321 54321
  //Obtener el número de bit C [ 00000 00000 ]
  public int GetNumeroDe_Bit(int Position){
    int aux = ((Position -1) % 32);
    aux = aux + 1;
    return aux;
  }
  
  private void Redimensionar(int elemento){   
    int NumberOfBitwise = elemento / 32;
    if((elemento % 32) != 0){
      NumberOfBitwise++;

      Bitwise [] AuxConjunto = new Bitwise [NumberOfBitwise];
      for(int i = 0; i < NumberOfBitwise; i++){
        AuxConjunto[i] = new Bitwise();
      }
      
      //Conjunto = new Bitwise [NumberOfBitwise];
      for(int i = 0; i < this.Conjunto.length; i++){
        AuxConjunto[i] = Conjunto[i]; 
      }
      
      dim = elemento; // Esta mal, hay que arreglar
      this.Conjunto = AuxConjunto;
    }
  }
  
  // Insertar en el conjunto de bitwise
  public void Insertar(int elemento){
    if(elemento > dim){   
      Redimensionar(elemento);
      NumberOfBitwise = GetNumeroDe_Bitwise(elemento);
      NumberOfbit = GetNumeroDe_Bit(elemento);
      //System.out.println(String.valueOf(this.Conjunto.length) + " longitud de conjunto en insert");
      this.Conjunto[NumberOfBitwise].Encender(NumberOfbit);   
    }else{
      NumberOfBitwise = GetNumeroDe_Bitwise(elemento);
      NumberOfbit = GetNumeroDe_Bit(elemento);
      this.Conjunto[NumberOfBitwise].Encender(NumberOfbit);
    }
  }
  
  // Eliminar en el conjunto de bitwise
  public void Eliminar(int elemento){
    if(elemento <= dim){
      int NumberOfBitwise = GetNumeroDe_Bitwise(elemento);
      int NumberOfbit = GetNumeroDe_Bit(elemento);
      Conjunto[NumberOfBitwise].Apagar(NumberOfbit);
    }
  }
  
  public boolean Pertenece(int elemento){
    int NumberOfBitwise = GetNumeroDe_Bitwise(elemento);
    int NumberOfbit = GetNumeroDe_Bit(elemento);
    int a = this.Conjunto[NumberOfBitwise].GetBit(NumberOfbit);
    boolean aux = (a == 1);
    return aux;                                   
  }
  
  public void Union(ConjuntoBitwise A, ConjuntoBitwise B){
    for(int i = 1; i <= A.dim; i++){
      if(A.Pertenece(i)){
        Insertar(i);
      }
    }
    for(int i = 1; i <= B.dim; i++){
      if(B.Pertenece(i)){
        Insertar(i);
      }
    }
  }
  
  public void Intersection(ConjuntoBitwise A, ConjuntoBitwise B){
    for(int i = 1; i <= A.dim; i++){
      if(B.Pertenece(i) && A.Pertenece(i)){
        System.out.println(String.valueOf(i));
        Insertar(i);
      }
    }
  }
  
  public String ObtenerTodo(){
    String cadena = "x = {";
    for (int i = 1; i <= dim; i++){
      if(Pertenece(i)){
        cadena = cadena + Integer.toString(i) + ", ";
      }
    }
    cadena = cadena + "}";
    return cadena;
  }
  
}
