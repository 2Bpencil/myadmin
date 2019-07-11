package com.tyf.myadmin.config.webMvc;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @auther: tyf
 * @Date: 2019/7/11 19:41
 * @Description:自定义错误页面
 */
@Controller
public class SysBasicErrorController implements  ErrorController {

    private static final String ERROR_PATH = "/error";

    @Override
    public String getErrorPath() {
        return null;
    }
    @RequestMapping(value =ERROR_PATH,produces = {MediaType.TEXT_HTML_VALUE})
    public String errorHtml(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");

        if(statusCode == 400){
            return "/exception/400";
        }else if(statusCode == 404){
            return "/exception/404";
        }else{
            return "/exception/500";
        }
    }
}
