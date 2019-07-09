import java.util.*;
import java.io.FileNotFoundException;

class fallriver extends Exception{

}
class dropoar extends Exception{


}
 public class prac5{

static void crossrapid(int deg)throws fallriver{
  System.out.println("cross rapid");
  if(deg>10)
    throw new fallriver();
}

static void rowraft(String state)throws dropoar{
  System.out.println("cross rapid");
  // we throw the exception  using the throw keyword  
  if(state.equals("nervous"))
     throw new dropoar();
}
  public static void main(String args[])throws FileNotFoundException{

  
  crossrapid(12);
  rowraft("hii");



}

}
 
