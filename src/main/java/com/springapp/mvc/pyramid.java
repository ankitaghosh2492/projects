package main.java.com.springapp.mvc;

/**
 * Created by komal.kochar on 1/14/2016.
 */
public class pyramid {

  public static void main(String args[]) {
    int n =9;
    for (int i=0;i<n;i++){
      for(int j=0; j < (2*n-1); j=j+2){
        System.out.print("$");
      }
      System.out.println();
    }
  }
}
