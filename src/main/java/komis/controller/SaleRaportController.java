package komis.controller;

import komis.model.Dto.ReportDto;
import komis.model.Dto.VehicleDto;
import komis.model.Vehicle;
import komis.service.ReportService;
import komis.service.VehicleDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller("/saleReport")
public class SaleRaportController {

//    private String dateFrom;
//    private String dateTo;
//    private VehicleDataService vehicleDataService;
//    private ReportService reportService;
//
//    public SaleRaportController(VehicleDataService vehicleDataService, ReportService reportService) {
//        this.vehicleDataService = vehicleDataService;
//        this.reportService = reportService;
//    }
//
//    @RequestMapping("/raport")
//    public String saleRaportForm(Model model) {
//        model.addAttribute("saleRaport", new ReportDto());
//        return "saleForm";
//    }
//
//    @PostMapping
//    public String saveDateForSaleRaport(@ModelAttribute("saleRaport") ReportDto reportDto, Model model){
//        dateFrom = reportDto.getDateFrom();
//        dateTo = reportDto.getDateTo();
//
//        return "redirect:/pages/salefilter";
//    }

//    @RequestMapping("/salefilter")
//    public String ShowSaleRaport(Model model){
//        Date date1 = null;
//        Date date2 = null;
//        String strDate1 = dateFrom;
//        String strDate2 = dateTo;
//        try {
//            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(strDate1);
//            date2 = new SimpleDateFormat("yyyy-MM-dd").parse(strDate2);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        List<VehicleDto> list = reportService.SaleFilter(date1,date2);
//        List<Vehicle> list2 = reportService.showSoldVehiclesWithMarginAndProfit();
////        Long value = reportService.CalculateSaleFilterValue(list);
////        Long value2 = reportService.CalculateProfit(list2);
//
//        String formattedStrDate1 = new SimpleDateFormat("yyyy-MM-dd").format(date1);
//        String formattedStrDate2 = new SimpleDateFormat("yyyy-MM-dd").format(date2);
//
//        model.addAttribute("list",list2);
////        model.addAttribute("value",value);
////        model.addAttribute("value2",value2);
//        model.addAttribute("date1",formattedStrDate1);
//        model.addAttribute("date2",formattedStrDate2);
//
//        return "pages/saleRaportsPage";
//    }
}
