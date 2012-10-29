import java.io.*;
public class dateien
{



    /**
     * @param args
     */
    public static void main( String[] args )
    {
        File test= new File("res/wordlist.txt");
        
        FileReader fr=null;
        BufferedReader bfr=null;
        try
        {
            fr = new FileReader(test);
            
            
            int unbuffTemp=0;
            int buffTemp=0;
            int chars=0;
            int lines=0;

            long unbufftimer=System.currentTimeMillis();
            while((unbuffTemp=fr.read())!=-1) {
                chars++;
            }
            unbufftimer=System.currentTimeMillis()-unbufftimer;
            fr.close();
            
            fr=new FileReader( test );
            bfr = new BufferedReader(fr);
            
            
            long bufftimer=System.currentTimeMillis();
            while((buffTemp=bfr.read())!=-1) {
                lines++;
            }
            bufftimer=System.currentTimeMillis()-bufftimer;
            System.out.println(chars + " : " + unbufftimer);
            System.out.println(lines + " : " + bufftimer);

            
            bfr.close();
            
            fr.close();
        }
        catch(FileNotFoundException e) {
            System.err.println("Datei nicht vorhanden!!!");
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }
        
        

    }

}
