import java.util.Date;


//basically instead of field to be public make them private and use getter and setter.
public class Vehicle {
    private Date launchDate;
    private Integer ModelNumber;
    private String Model;

    public Vehicle(Date launchDate, Integer modelNumber, String model) {
        this.launchDate = launchDate;
        ModelNumber = modelNumber;
        Model = model;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public Integer getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(Integer modelNumber) {
        ModelNumber = modelNumber;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
