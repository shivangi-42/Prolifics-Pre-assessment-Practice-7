import java.util.*;
import java.io.FileNotFoundException;

 public class prac2{
  public static void main(String args[])throws FileNotFoundException{

  
    
  String nam= readfile(null);
  System.out.println("the file is succifully found");
  System.out.println("thw file not found exception is now to b eused******->"+nam);
  System.out.println("the file is succifully found");
    }

public static String readfile(String name)throws FileNotFoundException,NullPointerException{

  if(name==null) 
     throw new NullPointerException();
  boolean found=false;

  if(!found)
   //System.out.println("the file is found");

   throw new FileNotFoundException("missing file");
   else
     return "hii";
      

}


}

 
