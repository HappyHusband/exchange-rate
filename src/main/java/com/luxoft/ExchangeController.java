package com.luxoft;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qtr-ptc-8 on 9/1/2016.
 */
@RestController
public class ExchangeController {
    @RequestMapping(value="/{currency}/exchange-rate", method = RequestMethod.GET)
    public String exchangeRate(@PathVariable String currency) {
        if (currency.equals("usd")) {
            return "1.00";
        }
        return "not supported";
    }
}
