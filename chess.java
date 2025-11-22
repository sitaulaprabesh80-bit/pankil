public class chess {
  byte b;
 short s;
 int i;
 long l;
double d;
char c;
boolean bo;
float f;

public static void main(String[] args) {
    chess value=new chess();
    System.out.println(value.b);
    System.out.println(value.s);
    System.out.println(value.i);
    System.out.println(value.l);
    System.out.println(value.d);
    System.out.println(value.c);
    System.out.println(value.bo);
    System.out.println(value.f);
    /*
     * java doesnt assign values to local variables by default it only assigns to global variables if we try to run by assigning to local variables
     than it throws compilation error.
      
    
     */
}
}





