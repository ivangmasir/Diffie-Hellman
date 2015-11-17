package diffie;
 
import java.io.*;
import java.math.BigInteger;
class Diffie
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("Alice, elige un numero primo (p) (Ejem. 23): ");
        BigInteger p=new BigInteger(br.readLine());
        
        System.out.print("Alice, elige la base(g) menor que: "+p+" (Ejem. 5): ");
        BigInteger g=new BigInteger(br.readLine());
        
        System.out.println("Alice, elige un numero secreto, menor que "+p+" (Ejem. 6):");
        BigInteger x=new BigInteger(br.readLine());
        
        BigInteger R1=g.modPow(x,p);
        
        System.out.println("R1="+R1);
        
        System.out.print("Bob, elige un numero secreto menor que "+p+": (Ejem. 15)");
        BigInteger y=new BigInteger(br.readLine());
       
        BigInteger R2=g.modPow(y,p);
        
        System.out.println("R2="+R2);
        BigInteger k1=R2.modPow(x,p);
        
        System.out.println("la clave calculada para Alice es: "+k1);
        BigInteger k2=R1.modPow(y,p);
        
        System.out.println("La clave calculada para Bob es: "+k2);
        if (k1.compareTo(k2)==0){
            System.out.println("Ambas claves calculadas coinciden, todo a funcionado correctamente!");
        }
        else{
            System.out.println("Ups!, Ha ocurrido un error, introduzca distintos valores.");
        }
    }
}