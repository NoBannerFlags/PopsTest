
/**
 * Class containing all values for regular pops.
 *
 * @author (Malokai Persoff)
 * @version (3/5/2020)
 */
public class Pop
{
    //title of pop, if left unchanged, defaults to "Founders"
    private String title = "Founders";
    private int population;
    private int money=0;
    private int needsCost;
    private int families;
    private int fampop;
    private int elderly=0;
    private int income;
    private int employed;
    private int unemployed;
    public Job popjob;

    

    /**
     * Pop Constructor
     *
     * @param title name of the pop, defaults to "Founders".
     * @param population number of units in the pop.
     * @param money ammount of money units the population has. Defaults to 0.
     * @param needsCost yearly cost of pop needs.
     * @param families number of families in pop.
     * @param elderly number of elderly units in pop. Defaults to 0.
     * @param income yearly money gain. Increases int money.
     * @param employed number of employed units in pop.
     */
    public Pop(String title, int population, int money, int needsCost, int families, int elderly, int income, int employed)
    {
       this.title=title;
       this.population=population;
       this.money=money;
       this.needsCost=needsCost;
       this.families=families;
       this.income=income;
       this.elderly=elderly;
       this.unemployed=unemployed;
    }
    
    /**
     * Pop Constructor
     *
     * @param title name of the pop, defaults to "Founders".
     * @param population number of units in the pop.
     * @param money ammount of money units the population has. Defaults to 0.
     * @param needsCost yearly cost of pop needs.
     * @param families number of families in pop.
     * @param elderly number of elderly units in pop. Defaults to 0.
     * @param income yearly money gain. Increases int money.
     * @param employed number of employed units in pop.
     * @param popjob Job of population
     */
    public Pop(String title, int population, int money, int needsCost, int families, int elderly, int income, int employed, Job popjob)
    {
       this.title=title;
       this.population=population;
       this.money=money;
       this.needsCost=needsCost;
       this.families=families;
       this.income=income;
       this.elderly=elderly;
       this.unemployed=unemployed;
       this.popjob=popjob;
    }

    /**
     * Method toString - returns values as a string
     *
     * @return All values of the pop put into text
     */
    public String toString(){
        return "This population is titled "+this.title+", money:"+this.money+"$, population:"+this.population+" units, needs:"+this.needsCost+"$, has "+families+" families, earns "+this.income+"$ over "+this.employed+" jobs";
    }
    
    public void yrAdvance(){
        
    }
}
