package komis.model;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle extends BaseModel {

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "vehicleTypeId")
    private VehicleType vehicleType;
    @Column(name = "VIN")
    private String vin;
    @Column(name = "prod_year")
    private Integer productionYear;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "carManufacturerId")
    private Manufacturer manufacturer;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "carModelId")
    private CarModel model;
    @Column(name = "insuranceNo")
    private String insuranceNumber;
    @Column(name = "carRegistration")
    private String carRegistration;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "fuelId")
    private Fuel fuel;
    @Column(name = "mileage")
    private Integer mileage;
    @Column(name = "engine")
    private String engine;
    @Column(name = "power")
    private Integer power;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "transmissionId")
    private Transmission transmission;
    @Column(name = "description")
    private String description;
    @Column(name = "test_drives")
    private Integer testDrives;
    @Column()
    private boolean sold;
    @Column()
    private Integer price;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
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

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
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

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
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

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
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
