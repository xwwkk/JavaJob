package com.atguigu07._abstract.template;

/**
 * ClassName: TemplateTest
 * Package: com.atguigu07._abstract.template
 * Description:
 *  模板方法的设计模式
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午8:53
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumer p = new PrintPrimeNumer();

        p.spendTime();
    }
}

abstract class Template{
    //计算某段代码的执行，需要花费的时间
    public void spendTime(){
        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println("spendTime: " + (end - start));
    }

    public abstract void code();
}

class PrintPrimeNumer extends Template{
    @Override
    public void code() {
        for(int i = 2; i <= 10000; i++){
            int j = 2;
            for(; j < Math.sqrt(i); j++){
                if(i % j == 0){
                    break;
                }
            }
            if(j > Math.sqrt(i)){
                System.out.println(i);
            }
        }
    }
}