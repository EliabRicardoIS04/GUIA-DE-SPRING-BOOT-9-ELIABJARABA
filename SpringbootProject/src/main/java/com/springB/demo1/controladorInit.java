
package com.springB.demo1;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class controladorInit {
    
    @GetMapping("/")
    public String inicio(){
        log.info("este programa se esta ejecutando");
        return "index";
    }
}
