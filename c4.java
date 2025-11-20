
/**
 * Write a description of class c4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class c4{
    public static void main(String[] args){
        int i=10;
        System.out.println(i); 
        //implicit Typecasting
        double db= i;
        System.out.println(db);
        //Explict typecasting
        double dtb=10.09;
        int itr= (int)dtb;
        
        // Exceptions in arithmetic
        
        byte bt=10;
        byte btr=11;
        byte sum= (byte)(bt+btr);
        
        //max,min, size and bytes
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        
        //Escape sequence
        System.out.println("hello\nWorld");
          System.out.println("hamro\tNepal");
            System.out.println("she said \" hi\"");
            
            // unicode escape sequence
              System.out.println("\u2764");
        
    }
        
        
    }

