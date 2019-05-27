package com.how2java.tmall.service;
 
import java.util.List;

import com.how2java.tmall.dao.PlanDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.how2java.tmall.pojo.Plan;
 
@Service
public class PlanService {
    @Autowired
    PlanDAO planDAO;
 
    public List<Plan> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return planDAO.findAll(sort);
    }
    public void add(Plan bean){
        planDAO.save(bean);
    }

    public void delete(int id){planDAO.delete(id);}

    public Plan get(int id){
        Plan p=planDAO.findOne(id);
        return p;
    }

    public void update(Plan bean){
        planDAO.save(bean);
    }
}