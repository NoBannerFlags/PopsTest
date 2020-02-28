import java.util.*;
import java.io.*;
/**
 * Main class, runs everything
 *
 * @author (Malokai Persoff)
 * @version (2/28/2020)
 */
public class Main
{
    public static void main (String[] args) throws Exception{
        //Stores 2 file locations for later, one for storing data, the other stores extra important data, just in case.
        String fileLoc = "C:\\Users\\Public\\Documents\\popsStoreData\\";
        String fileLoc0 = "C:\\Users\\Public\\Documents\\popsImportantStore\\";
        Pop testingPop = new Pop("Founders",1000,1,1,1,1,1,1);
        System.out.println(testingPop.toString());
    }
}
