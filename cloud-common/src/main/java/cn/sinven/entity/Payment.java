package cn.sinven.entity;/*

 @author lj

 @create 2020-11-02 11:00
 
 @email 1624058512@qq.com 

 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor//开启有参构造
@NoArgsConstructor//开启无参构造
public class Payment {
    Long id;
    String serial;


    public Payment(Long id, String endorser) {
    }
}
