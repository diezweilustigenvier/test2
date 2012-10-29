import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class Myreader extends FilterReader
{
    public Myreader( Reader in )
    {
        super( in );
    }

    public int read() throws IOException
    {
        return Character.toLowerCase( (char)in.read());
    }
    /* (non-Javadoc)
     * @see java.io.FilterReader#read(char[], int, int)
     */
    @Override
    public int read( char[] cbuf, int off, int len ) throws IOException
    {
        int temp = super.read(cbuf,off,len);
        for( int i = off; i < off+temp ; i++ )cbuf[i]=Character.toLowerCase( cbuf[i] );
        return temp;
    }
    
    

}
