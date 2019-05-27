package com.how2java.tmall.web;
 
import com.how2java.tmall.pojo.Plan;
import com.how2java.tmall.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController//返回类型转换成json对象数组
public class PlanController {
    @Autowired
    PlanService planService;
     
    @GetMapping("/plans")
    public List<Plan> list() throws Exception {
        return planService.list();
    }

    @PostMapping("/plans")
    public Object add(Plan bean)throws Exception{
        planService.add(bean);
        return bean;
    }

    @DeleteMapping("/plans/{id}")
    public String delete(@PathVariable int id){
        planService.delete(id);
        return  null;
    }
    @GetMapping("/plans/{id}")
    public Plan get(@PathVariable("id") int id)throws Exception{
        Plan bean=planService.get(id);
        return bean;
    }
    @PostMapping("/plans/{id}")
    public Object update(Plan bean,HttpServletRequest request)throws Exception{
//        String content=request.getParameter("content");
//        System.out.println("更新的内容为"+content);
//        bean.setContent(content);
        planService.update(bean);
        return bean;
    }
}