package com.frico.website.web;


import com.frico.website.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User: Administrator
 * Date: 2018/3/20
 * Time: 14:43
 * Java gives me life and I have to work hard.
 */
@RestController
@RequestMapping("home")
public class HomeController {

//    @Autowired
//    private
//    VideoMapper videoMapper;

    @RequestMapping("demo")
    public
    Result demo(){
        System.out.println("hello world");
        System.out.print("1111");
        System.out.print("2222");
        return Result.success();
    }

//    @RequestMapping("getVideo")
//    public Result getVideo(Integer integer){
//        Video video = videoMapper.selectByPrimaryKey(integer);
//        return Result.success(video);
//    }

    public static void main(String[] arg){
//        int a ;
////        a = add(3);
////        System.out.print(a);

        System.out.print(qwe(1));
        System.out.print(qwe(2));
        System.out.print(qwe(3));
        System.out.print(qwe(4));
        System.out.print(qwe(5));
        System.out.print(qwe(6));
        System.out.print(qwe(7));
    }

    public static int add(int n){

        if(n<3)
            return n=1;
        return add(n-1)+add(n-2);

    }

    public static int qwe(int n){
        if(n<3)
            return n=1;
        int f1=1;
        int f2 =1;
        int f3=0;
        for(int i=2;i<n;i++) {
            f3 = f2+f1;
            f1=f2;
            f2 =f3;
        }
        return f3;
    }

}
