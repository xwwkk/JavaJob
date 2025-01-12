package com.atguigu04.block.exer;

/**
 * ClassName: User1
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 上午12:23
 */
public class User1 {
    private String userName;
    private String password;
    private long registrationTime;

    public User1() {
//        System.out.println("新用户注册");
//        registrationTime = System.currentTimeMillis();
        userName = registrationTime + "";
        password = "123456";
    }

    public User1(String userName, String password) {
//        System.out.println("新用户注册");
//        registrationTime = System.currentTimeMillis();
        this.userName = userName;
        this.password = password;
    }

    public String getInfo() {
        return "用户名: " + userName + " 密码：" + password + " 创建时间： " + registrationTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
    }
}
