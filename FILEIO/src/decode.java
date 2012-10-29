import java.io.*;
import java.util.*;

public class decode
{

    public static void main( String[] args ) throws IOException 
    {
        BufferedInputStream test = new BufferedInputStream( System.in );
        int i=0;
        while((i=test.read())!=-1) {
            System.out.print((char)(i-13));
        }
    }

}
