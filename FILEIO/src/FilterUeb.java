import java.io.*;
import java.util.ArrayList;
public class FilterUeb
{
    
    public static void main( String[] args ) throws IOException
    {
        int zeichencounter[]=new int[256];
        
        

   
        
        if( args.length == 1 ){
            byte[] mybuffer=new byte[32];
            int tmp = 0;
            try{
                BufferedInputStream in = new BufferedInputStream( new FileInputStream( args[0] ) );
                while( (tmp = in.read()) != -1 )
                {
                    zeichencounter[tmp]++;
                
                }
                in.close();
            }
            catch( IOException e ){
                System.err.println( e.getMessage() );
            }
            int x = 0;
            for( int i = 0; i < 256; i++ )
            {
                
                if(zeichencounter[i]>0) {
                    System.out.printf(" %03d : %07d :%S\n",i,zeichencounter[i] ,Character.getName( (char) i ) );
                    x++;
                }
              
            }
            System.out.println(x);
            
        }
        else System.err.println( "Syntax Fehler!\njava filesorter %INPUTFILE%" );
   
        
        

    }

}
