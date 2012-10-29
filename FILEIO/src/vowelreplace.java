import java.io.*;
public class vowelreplace
{
    public static void main( String[] args )
    {
        try
        {
            if( ( args.length == 2 ) && args[1].matches( "[aeiouAEIOU]" ) )
            {
                BufferedReader readin = new BufferedReader( new FileReader( args[0] ) );
                BufferedWriter writeout = new BufferedWriter( new FileWriter( args[0] + ".ausgabe_" + args[1] ) );
                String readTMP = "";
                while( ( readTMP = readin.readLine() ) != null )
                {
                    readTMP = readTMP.replaceAll( "[aeiou]", args[1].toLowerCase() ).replaceAll( "[AEIOU]", args[1].toLowerCase().toUpperCase() );
                    System.out.println( readTMP );
                    writeout.write( readTMP );
                    writeout.newLine();
                }
                readin.close();
                writeout.flush();
                writeout.close();
            }
            else System.err.println( "Syntaxfehler: vowelreplace %DATEINAME% %VOKAL%" );
        }
        catch( IOException e )
        {
            System.err.println( e.getMessage() );
        }
    }
}
