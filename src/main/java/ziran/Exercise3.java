package ziran;

public class Exercise3 {

  public static long triangle(long x){
    if (x >= 0){
      long val = (x*(x +1))/2;
      return val;
    }
    else {
      System.out.println("you entered an negative int");
      System.exit(3);
    }
    return 0;
  } // end triangle method

  public static long lazy(long x){
    if (x >= 0){
      long val = ((x*x + x + 2)/2);
      return val;
    }
    else {
      System.out.println("you entered a negative int");
      System.exit(3);
    }
    return 0;
  } // end lazy method

  public static void main(String[] args) {
    if (args.length != 2){
    System.out.println("plz give two args");
    }

    if (args.length == 2){
      if (args[0].equals("triangle")){
        try {
          long num = triangle(Long.parseLong(args[1]));
          System.out.println("The triangle value is: " + num);
        }
        catch (NumberFormatException ex){
          System.out.println("Argument not a valid integer");
          System.exit(2);
        } // end catch
      } // end triangle block


      else if (args[0].equals("lazy")){
        try {
          long num = lazy(Long.parseLong(args[1]));
          System.out.println("The lazy value is: " + num);
        }
        catch (NumberFormatException ex){
          System.out.println("Argument not a valid integer");
          System.exit(2);
        } // end catch
      } // end lazy block

      else{
        System.out.println("Need a valid first argument");
        System.exit(1);
      }
    } // end if args == 2
  } // end main
} // end class
