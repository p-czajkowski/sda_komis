package komis.model.carModel;

import komis.model.carModel.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Vehicles extends BaseModel {

    @Column(name = "vehicle_type")
    @JoinColumn(name = "vehicleType_id")
    private VehicleType vehicleType;

    @Column(name = "VIN")
    private String vin;

    @Column(name = "prod_year")
    private Integer productionYear;

    @Column(name = "man")
    private String manufacturer;

    @Column(name = "model")
    @JoinColumn
    private CarModel model;

    @Column(name = "insurance_nr")
    private String insuranceNumber;

    @Column(name = "plate_number")
    private String plateNumber;

    @Column(name = "fuel_type")
    @JoinColumn(name = "fuel_id")
    private Fuel fuel;

    @Column(name = "mileage")
    private Integer mileage;

    @Column(name = "engine")
    private String engine;

    @Column(name = "power")
    private Integer power;

    @Column(name = "transmission")
    @JoinColumn(name = "gear_box_id")
    private GearBox gearbox;

    @Column(name = "description")
    private String description;

    @Column(name = "test_drives")
    private Integer testDrives;

    @Column()
    private boolean sold;

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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
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

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
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

    public GearBox getGearbox() {
        return gearbox;
    }

    public void setGearbox(GearBox gearbox) {
        this.gearbox = gearbox;
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
}
