package com.luxoft;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExchangeControllerTest {
    private ExchangeController exchangeController = new ExchangeController();

    @Test
    public void usdCurrency() {
        // given
        String currency = "usd";

        // when
        String result = exchangeController.exchangeRate(currency);

        // then
        assertEquals("1.00", result);
    }
}
