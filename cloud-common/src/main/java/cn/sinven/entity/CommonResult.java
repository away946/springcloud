package cn.sinven.entity;/*

 @author lj

 @create 2020-11-02 11:22
 
 @email 1624058512@qq.com 

 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor//开启有参构造
@NoArgsConstructor//开启无参构造
public class CommonResult <T>{

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data=null;
    }
}
