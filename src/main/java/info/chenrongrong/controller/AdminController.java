package info.chenrongrong.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenrongrong on 2015/12/5.
 */
@RestController
@RequestMapping("admin")
public class AdminController {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public ResponseEntity getGoodsBySkuId(@PathVariable String name) {
        String body =  String.format("hello,{}"+name);
        return new ResponseEntity(name, HttpStatus.OK);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity getGoodsBySkuId() {
        String body =  String.format("hello,{}"+"CHEN");
        return new ResponseEntity(body, HttpStatus.OK);
    }


}
