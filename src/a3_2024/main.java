package a3_2024;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

//Call Program
public class main {
  public ArrayList<String> ToSend = new ArrayList<>();
    public static void main(String[] args) {
      Tela_inicio tela_inicio = new Tela_inicio();
      tela_inicio.setVisible(true);
    }
    public static void Send(ArrayList Lista){
      System.out.println(Lista);
    }
}
