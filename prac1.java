import java.util.*;
import java.io.FileNotFoundException;

 class prac1{
  public static void main(String args[])throws FileNotFoundException{

  
    
  String nam= readfile();
  System.out.println("the file is succifully found");
  System.out.println("thw file not found exception is now to b eused******->"+nam);
  System.out.println("the file is succifully found");
    }

public static String readfile()throws FileNotFoundException{

  boolean found=false;

  if(!found)
   //System.out.println("the file is found");

   throw new FileNotFoundException("missing file");
   else
     return "hii";
      

}


}

 
