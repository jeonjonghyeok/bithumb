package jjh.api.customer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeController {
    public String home() {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());

    }
}
