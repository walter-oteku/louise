public class landvehicles extends Locomotive {
    private int numberOfWheels;
    private int amountOfFuel;
    private String purpose;

    public landvehicles(String manufacturer, String capacity, String purpose, int numberOfWheels, int amountOfFuel) {
        super(manufacturer, capacity)
        this.purpose = purpose;
        this.numberOfWheels = numberOfWheels;
        this.amountOfFuel = amountOfFuel;
    }

}

    public String getPurpose(){
        return purpose;
    }
    public void setPurpose(String purpose){

    }
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels=numberOfWheels
    }
    public int getAmountOfFuel(){
        return amountOfFuel;
    }
    public void  setAmountOfFuel(int amountOfFuel){
        this.amountOfFuel=amountOfFuel;
    }
}
