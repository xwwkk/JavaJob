package com.atguigu08._interface.apply;

/**
 * ClassName: USBTest
 * Package: com.atguigu08._interface.apply
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午10:18
 */
public class USBTest {
    public static void main(String[] args) {
        computer computer = new computer();
        Printer printer = new Printer();

        computer.transferDate(printer);
        computer.transferDate(new Camera());

        USB usb1 = new USB(){

            @Override
            public void start() {
                System.out.println("工作开始");
            }

            @Override
            public void stop() {
                System.out.println("工作结束");
            }
        };
        computer.transferDate(usb1);

        computer.transferDate(new USB() {
            @Override
            public void start() {
                System.out.println("扫描仪开始工作");
            }

            @Override
            public void stop() {
                System.out.println("扫描仪开始工作");
            }
        });
    }
}

class computer{
    public void transferDate(USB usb){
        System.out.println("设备连接成功");
        usb.start();
        System.out.println("数据传输的细节操作");
        usb.stop();
    }
}

class Camera implements USB{

    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机结束工作");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
interface USB{
    //声明的常量

    //方法
    void start();
    void stop();
}
