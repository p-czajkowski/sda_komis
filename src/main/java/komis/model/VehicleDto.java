package komis.model;

public class VehicleDto {

    private Integer vehicleType;
    private String vin;
    private Integer productionYear;
    private Integer manufacturer;
    private CarModel model;
    private String insuranceNumber;
    private String carRegistration;
    private Integer fuel;
    private Integer mileage;
    private String engine;
    private Integer power;
    private Integer transmission;
    private String description;
    private Integer testDrives;
    private boolean sold;
    private Integer price;

    public Integer getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Integer vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public Integer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Integer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getTransmission() {
        return transmission;
    }

    public void setTransmission(Integer transmission) {
        this.transmission = transmission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTestDrives() {
        return testDrives;
    }

    public void setTestDrives(Integer testDrives) {
        this.testDrives = testDrives;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
