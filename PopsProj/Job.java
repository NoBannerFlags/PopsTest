
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
    public int income = 100;
    public int production = 10;
    public int projectReq = 100;
    public int KI = 0;

    
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
     * Job Constructor with more values
     *
     * @param slots number of slots for workers to fill
     * @param descr title of the job, defaults to "founders"
     * @param income income for workers. defaults to 100.
     * @param production production per worker. defaults to 10
     * @param projectReq required production before 1 "Project" is done defaults to  100
     */
    public Job(int slots, String descr, int income, int production, int projectReq)
    {
        this.slots = slots;
        this.descr = descr;
        this.income = income;
        this.production = production;
        this.projectReq = projectReq;
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
        return ""+this.descr+": "+this.slots+" avaliable slots. income: "+this.income+"$ for "+this.production+" units of production. "+this.projectReq+" units required for each project.";
    }
    
    /**
     * Method finProject for when a project is finished.
     *
     */
    public void finProject(){
        slots+=(slots/100)+1;
        KI+=projectReq*2;
        KI+=(income/2);
        if(KI>=(income*5)){
            KI=KI-income*4;
            income+=1;
            slots+=1;
            if(projectReq>1){
                projectReq--;
            }
        }
    }
}
