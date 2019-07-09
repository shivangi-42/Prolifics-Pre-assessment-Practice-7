import java.util.*;
import java.io.*;
//import java.io.FileNotFoundException;

 public class prac6{

  public static void main(String args[])throws FileNotFoundException{

  FileInputStream fis=null;

  try{
  fis=new FileInputStream("file.txt");
  System.out.println("file opened");
  fis.read();
  System.out.println("file read");

}catch(FileNotFoundException file ){
  
  System.out.println("file not found read");

}catch(IOException file ){

   System.out.println("io exception read");

}

finally{
   System.out.println("finally");
}




}

}
 

