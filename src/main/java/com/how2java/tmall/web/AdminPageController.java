package com.how2java.tmall.web;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class AdminPageController {
    @GetMapping(value="/admin")
    public String admin(){
        return "redirect:admin_plan_list";
    }
    @GetMapping(value="/admin_plan_list")
    public String listCategory(){
        return "admin/listPlan";
    }//跳转到对应的html文件

    @GetMapping(value="/admin_plan_edit")
    public String editPlan() {return "admin/editPlan";}

    @GetMapping(value="/admin_plan_index")
    public String turnindex() {return "admin/index";}
}