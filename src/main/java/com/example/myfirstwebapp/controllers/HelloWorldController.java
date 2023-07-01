package com.example.myfirstwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloWorldController {

    //@GetMapping("/")
    @RequestMapping(method = RequestMethod.GET, path = "/")
    @ResponseBody
    public String getHelloWorld() {
        return "hello world, bonjour.";
    }

    @RequestMapping("/html")
    @ResponseBody
    public String getHtml(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html>");
        stringBuffer.append("<head>");
        stringBuffer.append("<title> My first HTML page </title>");
        stringBuffer.append("</head>");
        stringBuffer.append("<body>");
        stringBuffer.append("My first html page with body");
        stringBuffer.append("</body>");
        stringBuffer.append("</html>");
        return stringBuffer.toString();
    }

    // src/main/resources/META-INF/resources/WEB-INF/jsp/hello.jsp
    // src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
    // src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
    // src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
    @RequestMapping("/jsp")
    public String getJSP(){
        return "hello";
    }
}
