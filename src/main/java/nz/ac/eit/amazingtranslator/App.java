package nz.ac.eit.amazingtranslator;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Hello world! :)
 *
 */
public class App 
{
    private static Hashtable<Integer,String> frenchTranslations=new Hashtable<>();
    private static Hashtable<Integer,String> germanTranslations=new Hashtable<>();

    private static void initializeTranslation(){
        frenchTranslations.put(1,"Un");
        germanTranslations.put(1,"Einz");
    }

    public static void main( String[] args )
    {
        System.out.println( "Select a number to translate" );
        Scanner scan=new Scanner(System.in);
        String numberAsString=scan.nextLine();
        int numberToTranslate=Integer.parseInt(numberAsString);
        System.out.println( "enter a language to translate" );
        String language=scan.nextLine();
        String translated=null;
        if (language.equals("French")){
            translated=frenchTranslations.get(numberToTranslate);

        }
        else if (language.equals("German")){
            translated=germanTranslations.get(numberToTranslate);
        }
        System.out.println( "The translation is "+ translated );
    }
}
