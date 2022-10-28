package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if(args[0].equals("sin"))
            System.out.println(mat.sin(Integer.parseInt(args[1])));
        else
            System.out.println(mat.factorial(Integer.parseInt(args[1])));
        if(args.length==0)
            System.out.println("Nije ok");
        
    }
}
