package komis.service;

import komis.repository.ReportSoldVehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultReportSoldVehicles {

    @Autowired
    ReportSoldVehicles reportSoldVehicles;


}
