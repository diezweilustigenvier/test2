import java.io.*;
public class FiletoHex{
    public static void main( String[] args ){
        String[] cheapHex = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        if( args.length == 1 ){
            byte[] mybuffer;
            int length = 0;
            try{
                BufferedInputStream in = new BufferedInputStream( new FileInputStream( args[0] ) );
                while( ( length = in.read( mybuffer = "                ".getBytes() ) ) != -1 ){
                    String x="";
//                    for( int i = 0; i < 16; System.out.printf( (i<=length)?"%02x ":"   ", mybuffer[i++]));
                    for( int i = 0; i < 16; i++ )
                    {
                        x+=cheapHex[(mybuffer[i]&240)>>>4]+cheapHex[mybuffer[i]&15]+" ";
                    }
                    x+=new String(mybuffer).replaceAll( "[^\\x20-\\x7E]", "." );
//                    System.out.println( " :  " + new String(mybuffer).replaceAll( "[^\\x20-\\x7E]", "." ));
                }
                in.close();
            }
            catch( IOException e ){
                System.err.println( e.getMessage() );
            }
        }
        else System.err.println( "Syntax Fehler!\njava filesorter %INPUTFILE%" );
    }
}
