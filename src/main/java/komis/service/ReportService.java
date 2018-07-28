package komis.service;

import komis.model.Dto.VehicleDto;
import komis.model.Vehicle;
import komis.repository.BuyingAgreementRepository;
import komis.repository.SellingAgreementRepository;
import komis.repository.VehicleRepository;
import komis.repository.VehicleSoldRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Math.round;

@Service
public class ReportService {

    private final SellingAgreementRepository sellingAgreementRepository;
    private final BuyingAgreementRepository buyingAgreementRepository;
    private final VehicleDataService vehicleDataService;
    private final VehicleRepository vehicleRepository;



    public ReportService(SellingAgreementRepository sellingAgreementRepository,
                         BuyingAgreementRepository buyingAgreementRepository, VehicleDataService vehicleDataService,
                         VehicleRepository vehicleRepository) {
        this.sellingAgreementRepository = sellingAgreementRepository;
        this.buyingAgreementRepository = buyingAgreementRepository;
        this.vehicleDataService = vehicleDataService;
        this.vehicleRepository = vehicleRepository;

    }

    public List<Vehicle> showSoldVehiclesWithMarginAndProfit() {
        List<Vehicle> soldVehicles = vehicleDataService.showSoldVehicles();
        List<Vehicle> boughtVehicles = vehicleDataService.getAllVehicles();
        for (Vehicle sv : soldVehicles) {
            for (Vehicle bv : boughtVehicles) {
                if(sv.getId().equals(bv.getId())){
                    Integer profit = sv.getBuyPrice() - bv.getSellPrice();
                    float margin = (((float)profit / sv.getBuyPrice()) * 100);
                    float margin_round = round(margin * 10.0f) / 10.0f;

                    break;
                }
            }
        }
        return soldVehicles;
    }

//    public List<VehicleDto> SaleFilter(Date dateFrom, Date dateTo) {
//        List<Vehicle> listIn = vehicleRepository.findAllBySoldIsTrue();
//        List<Vehicle> listOut = new ArrayList<>();
//        dateTo.setHours(23);
//        dateTo.setMinutes(59);
//        dateTo.setSeconds(59);
//
//        for (Vehicle dtoShowCar : listIn) {
//            Date date = dtoShowCar.getDate();
//            if ((date.after(dateFrom))) {
//                if ((date.before(dateTo))) {
//
//                    listOut.add(dtoShowCar);
//                }
//            }
//        }
//        return listOut;
//    }

}
