
// ---------------------------------------------------
// Assignment 1
// © Divya Divya
// Written by: Divya DIVYA, Student ID : 40190738
// ---------------------------------------------------

/**
 * The Cricketer class represents a cricketer and their attributes.
 */
public class Cricketer {

    /** The unique ID of the cricketer. */
    private long cricketerID;

    /** The name of the cricketer. */
    private String cricketerName;

    /** The batting average of the cricketer. */
    private float battingAvg;

    /** The bowling average of the cricketer. */
    private float bowlingAvg;

    /** The strike rate of the cricketer. */
    private float strikeRate;

    /** The economy rate of the cricketer. */
    private float economyRate;

    /** Whether the cricketer is available for selection. */
    private boolean isAvailable;

    /** The total number of cricketers created. */
     private static int noOfCricketers = 0;

    /** The static ID counter for generating unique cricketer IDs. */
    private static long id = 0; // Static Variable

    /**
     * Default constructor for the Cricketer class.
     * Initializes cricketer attributes to default values and increments the cricketer count.
     */
    public Cricketer()
    {
        this.cricketerID = id;
        id++;
        this.cricketerName = "";
        this.battingAvg = 0.0f;
        this.bowlingAvg = 0.0f;
        this.strikeRate = 0.0f;
        this.economyRate = 0.0f;
        this.isAvailable = true;
        noOfCricketers++;
    }

    /**
     * Parameterized constructor for the Cricketer class.
     * Initializes cricketer attributes with the provided values and increments the cricketer count.
     *
     * @param cricketerName The name of the cricketer.
     * @param battingAvg The batting average of the cricketer.
     * @param bowlingAvg The bowling average of the cricketer.
     * @param strikeRate The strike rate of the cricketer.
     * @param economyRate The economy rate of the cricketer.
     * @param isAvailable Whether the cricketer is available for selection.
     */
    public Cricketer(String cricketerName, float battingAvg, float bowlingAvg, float strikeRate, float economyRate, boolean isAvailable)
    {
        this.cricketerID = id;
        System.out.println("New Cricketer Created ID "+id);
        id++;
        this.cricketerName = cricketerName;
        this.battingAvg = battingAvg;
        this.bowlingAvg = bowlingAvg;
        this.strikeRate = strikeRate;
        this.economyRate = economyRate;
        this.isAvailable = isAvailable;
        noOfCricketers++;

    }

    /**
     * Get the name of the cricketer.
     *
     * @return The name of the cricketer.
     */
    public String getCricketerName()
    {
        return cricketerName;
    }

    /**
     * Set the name of the cricketer.
     *
     * @param cricketerName The new name for the cricketer.
     */
    public void setCricketerName(String cricketerName)
    {
        this.cricketerName = cricketerName;
    }

    /**
     * Get the batting average of the cricketer.
     *
     * @return The batting average of the cricketer.
     */
    public float getBattingAvg()
    {
        return battingAvg;
    }

    /**
     * Set the batting average of the cricketer.
     *
     * @param battingAvg The new batting average for the cricketer.
     */
    public void setBattingAvg(float battingAvg)
    {
        this.battingAvg = battingAvg;
    }

    /**
     * Get the bowling average of the cricketer.
     *
     * @return The bowling average of the cricketer.
     */
    public float getBowlingAvg()
    {
        return bowlingAvg;
    }

    /**
     * Set the bowling average of the cricketer.
     *
     * @param bowlingAvg The new bowling average for the cricketer.
     */
    public void setBowlingAvg(float bowlingAvg)
    {
        this.bowlingAvg = bowlingAvg;
    }

    /**
     * Get the strike rate of the cricketer.
     *
     * @return The strike rate of the cricketer.
     */
    public float getStrikeRate()
    {
        return strikeRate;
    }

    /**
     * Set the strike rate of the cricketer.
     *
     * @param strikeRate The new strike rate for the cricketer.
     */
    public void setStrikeRate(float strikeRate)
    {
        this.strikeRate = strikeRate;
    }

    /**
     * Get the economy rate of the cricketer.
     *
     * @return The economy rate of the cricketer.
     */
    public float getEconomyRate()
    {
        return economyRate;
    }

    /**
     * Set the economy rate of the cricketer.
     *
     * @param economyRate The new economy rate for the cricketer.
     */
    public void setEconomyRate(float economyRate)
    {
        this.economyRate = economyRate;
    }

    /**
     * Check whether the cricketer is available for selection.
     *
     * @return true if the cricketer is available, false otherwise.
     */
    public boolean getIsAvailable()
    {
        return isAvailable;
    }

    /**
     * Set the availability of the cricketer.
     *
     * @param isAvailable Whether the cricketer is available for selection.
     */
    public void setIsAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }

    /**
     * Get the unique ID of the cricketer.
     *
     * @return The unique ID of the cricketer.
     */
    public long getCricketerID()
    {
        return this.cricketerID;
    }

    /**
     * Get the total number of cricketers created.
     *
     * @return The total number of cricketers created.
     */
    public static int getNumberOfCricketers()
    {
        return noOfCricketers;
    }

    /**
     * Generate a string representation of the cricketer's details.
     *
     * @return A string containing the cricketer's details.
     */

    @Override
    public String toString()
    {
        return "Cricketer: # "  +  this.getCricketerID()  + "\n" +
                "ID: " +  this.getCricketerID() + " \n" +
                "Name: " +  this.getCricketerName() + " \n" +
                "Batting Average: " +  this.getBattingAvg() + " \n" +
                "Balling Average: " +  this.getBowlingAvg() + " \n" +
                "Strike Rate: " +  this.getBowlingAvg() + " \n" +
                "Economy Rate: " +  this.getEconomyRate() + " \n" +
                "Availability: " +  this.getIsAvailable() + " \n";
    }

    /**
     * Compare the current cricketer with another cricketer for equality based on ID and availability.
     *
     * @param  obj the other cricketer to compare with.
     * @return true if the cricketers are equal, false otherwise.
     */
//    public boolean equals(Cricketer C)
//    {
//        if((this.cricketerID == C.getCricketerID() ) && ( this.isAvailable == C.getIsAvailable()) )
//        {
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        Cricketer otherCricketer = (Cricketer) obj;

        return this.cricketerID == otherCricketer.cricketerID && this.isAvailable == otherCricketer.isAvailable;
    }
}
