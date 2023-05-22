package com.example.review_backend;

import java.io.Console;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.util.IOUtils;  

@RestController  
@CrossOrigin(origins="*")   
public class SpringBootJdbcController {  

    @RequestMapping(path = "/testrequest", method = RequestMethod.POST)
    
    public String testGetRequest(
         
    @RequestBody String request ) throws IOException {
        System.out.print(request);
        return request;
    }

    @Autowired  
    JdbcTemplate jdbc;    
    @RequestMapping("/insert")  
    public String index(){  
        jdbc.execute("INSERT INTO `sys`.`all_items` (`item_id`, `item_title`, `item_price`) VALUES ('4', 'GAqgqg', '750')");
        return"data inserted Successfully";  
    }  
}

