import java.util.*;
import java.io.*;
/**
 * Main class, runs everything
 *
 * @author (Malokai Persoff)
 * @version (3/32020)
 */
public class Main
{
    public static void main (String[] args) throws Exception{
        //Stores 2 file locations for later, one for storing data, the other stores extra important data, just in case.
        String fileLoc = "C:\\Users\\Public\\Documents\\popsStoreData\\";
        String fileLoc0 = "C:\\Users\\Public\\Documents\\popsImportantStore\\";
        Pop testingPop = new Pop("Founders",1000,1,1,1,1,1,1);
        Job testingJob = new Job(1,"Founders");
        Job testingJob2 = new Job(1, "Testing job", 1, 1,1);
        Pop testingPop2 = new Pop("Founders",1000,1,1,1,1,1,1, testingJob);
        System.out.println(testingPop.toString());
        System.out.println(testingJob.toString());
        System.out.println(testingJob2.toString());
        System.out.println(testingPop2.popjob.toString());
    }
}
