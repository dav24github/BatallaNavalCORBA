package navalApp;


/**
* navalApp/navalOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from navalApp.idl
* lunes 4 de junio de 2018 02:47:00 PM BOT
*/

public interface navalOperations 
{
  int getId ();
  void ListoParaJugar (int id);
  boolean getListoParaJugarRival (int id);
  boolean pedirTurno (int id);
  void pasarTurno (int id);
  void setMiMatrix (int[][] array, int id);
  int[][] getMiMatrix (int id);
  void setMiMatrixBool (boolean[][] array, int id);
  boolean[][] getMiMatrixBool (int id);
  void setSuMatrix (int[][] array, int id);
  int[][] getSuMatrix (int id);
  void setSuMatrixBool (boolean[][] array, int id);
  boolean[][] getSuMatrixBool (int id);
  void heGanado (int id);
  boolean[] ganadorPerdedor (int id);
  void reiniciarPartida (int id);
  boolean validarCelda (int f, int c);
  boolean validarPosicionBarco (int[][] array, int tam, int f, int c, int hor);
  void colocarBarco (int[][] array, int tam);
  boolean victoria (int[][] array1, boolean[][] array2);
  boolean disparo (int[][] array1, int valor, boolean[][] array2);
  void shutdown ();
} // interface navalOperations