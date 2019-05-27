package com.how2java.tmall.dao;
  
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.how2java.tmall.pojo.Plan;
 
public interface PlanDAO extends JpaRepository<Plan,Integer>{
 //增删改查分页全部提供
}