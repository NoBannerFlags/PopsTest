
/**
 * A job for a unit in a pop to take.
 *
 * @author (Malokai Persoff)
 * @version (3/3/2020)
 */
public class Job
{
    
    private int slots;
    private String descr = "founders";

    
    /**
     * Job Constructor
     *
     * @param slots number of slots for workers to fill
     * @param descr title of the job, defaults to "founders"
     */
    public Job(int slots, String descr)
    {
        this.slots = slots;
        this.descr = descr;
    }
    
    /**
     * Method setSlots sets the value of <code>slots</code>
     *
     * @param newSlots new value for <code>slots</code>
     */
    public void setSlots(int newSlots){
        this.slots = newSlots;
    }
    
    /**
     * Method setDescr sets the value of <code>descr</code>
     *
     * @param newDescr new value for <code>descr</code>
     */
    public void setDescr(String newDescr){
        this.descr = newDescr;
    }
    
    /**
     * Method getSlots gets value of <code>slots</code>
     *
     * @return <code>slots</code>
     */
    public int getSlots(){
        return this.slots;
    }
    
    /**
     * Method getDescr gets value of <code>descr</code>
     *
     * @return <code>descr</code>
     */
    public String getDescr(){
        return this.descr;
    }
    
    /**
     * Method toString returns values in string form.
     *
     * @return values of this job put into string
     */
    public String toString(){
        return ""+this.descr+": "+this.slots+" avaliable slots.";
    }
    
}
