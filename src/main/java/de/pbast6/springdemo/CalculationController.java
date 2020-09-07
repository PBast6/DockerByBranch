package de.pbast6.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CalculationController {

    @Autowired
    private CalculationService calculator;

    @RequestMapping("/sum")
    String sum(@RequestParam("a") Integer a,
               @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }

    @RequestMapping("/sub")
    String sub(@RequestParam("a") Integer a,
               @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sub(a, b));
    }

    @RequestMapping("/")
    String sub() {
        return "Hello wolrd";
    }

    // @RequestMapping("/subdomain/{id}")
    @RequestMapping(value="**",method = RequestMethod.GET)
    String subsub(HttpServletRequest request) {


        return "Hello subdomain on " + request.getRequestURI();
    }
}
