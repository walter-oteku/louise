public class airvehicles extends Locomotive{
    private int numberOfEngine;
    private String purpose;

    public airvehicles(String manufacturer, String capacity,int numberOfEngine, String purpose){
        super(manufacturer, capacity);
        this.numberOfEngine=numberOfEngine;
        this.purpose=purpose;
    }

    public int getNumberOfEngine() {
        return numberOfEngine;
    }

    public void setNumberOfEngine(int numberOfEngine) {
        this.numberOfEngine = numberOfEngine;
    }
    public String getPurpose(){
        return purpose:
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}

