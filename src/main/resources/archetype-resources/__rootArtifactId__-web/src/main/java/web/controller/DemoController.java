#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by ${userName} on ${today}.
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoCore demoCore;

    @RequestMapping(value = "/hello", method = RequestMethod.GET, params = {"!name"})
    public String helloWorld() {
        log.info("{}", demoCore);
        return "hello world";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, params = {"name"})
    public String hello(@RequestParam("name") String name) {
        String result = String.format("%s, 你好", name);
        log.info("{}, result={}", demoCore, result);
        return result;
    }

    @RequestMapping(value = "/date", method = RequestMethod.GET)
    public Date date() {
        Date date = new Date();
        log.info("{}, date={}", demoCore, date);
        return date;
    }
}
