public class Watch 
{
    private String brand;
    private String type;
    private String model;
    private String madeDate;
    private String manufacturer;
    private double cost;
    private double serialNum;
    //private String made_out_of; percentage add on? 
    public Watch(String brand, String type, String model, String madeDate, String manufacturer, double cost, double serialNum) 
    {
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.madeDate = madeDate;
        this.manufacturer = manufacturer;
        this.cost = cost;
        this.serialNum = serialNum;
    }//end Wrist_Watch()
    
    public String getBrand() 
    {
        return brand;
    }//end getBrand()
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }//end setBrand
    public String getMake() 
    {
        return type;
    }//end getMake()
    public void setMake(String make) 
    {
        this.type = make;
    }//end setMake
    public String getModel() 
    {
        return model;
    }//end getModel()
    public void setModel(String model) 
    {
        this.model = model;
    }//end setModel
    public String getMadeDate() 
    {
        return madeDate;
    }//end getMadeDate()
    public void setMadeDate(String madeDate) 
    {
        this.madeDate = madeDate;
    }//end setMadeDate
    public String getManufacturer() 
    {
        return manufacturer;
    }//end getManufacturer()
    public void setManufacturer(String manufacturer) 
    {
        this.manufacturer = manufacturer;
    }//end setManufacturer
    public double getCost() 
    {
        return cost;
    }//end getCost()
    public void setCost(double cost)
    {
        this.cost = cost;
    }//end setCost
    public double getSerialNum() 
    {
        return serialNum;
    }//end getSerialNum() 
    public void setSerialNum(double serialNum) 
    {
        this.serialNum = serialNum;
    }//end setSerialNum
    public String toString() 
    {
        return  "Model:" + model + "\nBrand: " + brand + "\nType: " + type + "\nMadeDate: " + madeDate
                + "\nManufacturer: " + manufacturer + "\nCost:" + cost + "\nSerialNum: " + serialNum;
    }//end toString()
    
}//end Wrist_Watch 
