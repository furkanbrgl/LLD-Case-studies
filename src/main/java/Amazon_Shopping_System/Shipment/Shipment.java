package Amazon_Shopping_System.Shipment; /* Created by FurkanBrgl on 6/2/2022 */

import java.util.Date;
import java.util.List;

public class Shipment {
    private String shipmentNumber;
    private Date shipmentDate;
    private Date estimatedArrival;
    private String shipmentMethod;
    private List<ShipmentLog> shipmentLogs;

    public boolean addShipmentLog(ShipmentLog shipmentLog) {
        return false;
    }
}
