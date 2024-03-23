package com.sachin.springboot.todolistwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayhelloController {
    @RequestMapping("say-hello")
    @ResponseBody
   public String sayHellotxt() {
        StringBuffer sb=new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My First HTML</title>");
        sb.append("</head>");
        sb.append("<body><h1>First Html Web app returned by sachin</h1></body>");
        sb.append("</html>");
       return sb.toString();
   }

    @RequestMapping("say-hello-jsp")
    public String sayHello() {
        return "sayHello";
    }

   //JSP-> JAva server page
}
