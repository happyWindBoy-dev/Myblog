package com.how2java.tmall.pojo;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
@Entity
@Table(name = "plan")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
 
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    @Column(name = "finish")
    String finish;

    @Column(name = "content")
    String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
}
}