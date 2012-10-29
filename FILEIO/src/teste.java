
/**
 * 
 */

/**
 * Typ- bzw. Klassenkommentar
 * @author tkessels
 */
public class teste
{

    /**
     * 
     */
    public teste()
    {
        // TODO Auto-generated constructor stub
    }


    /**
     * @param args
     */
    public static void main( String[] args )
    {
        for(int  i = 0; i < 256; i++ ){
            System.out.println(" "+i + " : " +(byte)i + " : " +(char)i + " : " +Integer.toHexString( i ) +  " : " +Integer.toHexString( (short)((byte)i )&0xff) );
        }

    }

}
