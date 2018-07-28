package komis.controller;

import komis.model.Vehicle;
import komis.service.ReportService;
import komis.service.SellingService;
import komis.service.VehicleDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/reports")
public class RaportController {
    private VehicleDataService vehicleDataService;
    private ReportService reportService;

    private SellingService sellingService;

    public RaportController(VehicleDataService vehicleDataService, ReportService reportService, SellingService sellingService) {
        this.vehicleDataService = vehicleDataService;
        this.reportService = reportService;
        this.sellingService = sellingService;
    }

    @GetMapping("/soldReport")
    public String soldVehiclesReport(){
        return "pages/soldVehiclesReportPage";
    }

    @GetMapping("/boughtReport")
    public String boughtVehiclesReport() {
        return "pages/boughtVehiclesReportPage";
    }
}
