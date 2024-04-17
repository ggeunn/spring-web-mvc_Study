package com.ohgiraffers.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    /* 최초페이지 지정 */
    @RequestMapping(value = {"/","/main"})
    public String main(){
        return "main";
    }

}
