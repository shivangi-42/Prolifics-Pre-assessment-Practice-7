import java.util.*;
import java.io.*;
//import java.io.FileNotFoundException;

 public class prac7{

  public static void main(String args[])throws FileNotFoundException{

  FileInputStream fis=null;
 /* this should nit b empty try{

}catch(FileNotFoundException e){}
  */try{
  fis=new FileInputStream("/home/shivangi/java_chapter_7/file.txt");
  System.out.println("file opened");
  fis.read();
  System.out.println("file read");

}
/*
we can't keep the final block above the catch otherwise it will show the error

*/

  

catch(FileNotFoundException file ){
  
  System.out.println("file not found read");

}catch(IOException file ){

   System.out.println("io exception read");

}
finally{
   System.out.println("finally");
}




}

}
 
