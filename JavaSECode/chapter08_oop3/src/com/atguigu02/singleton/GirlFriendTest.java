package com.atguigu02.singleton;

/**
 * ClassName: GirlFriendTest
 * Package: com.atguigu02.singleton
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 22/12/2024 下午8:27
 */
public class GirlFriendTest {
}

class GirlFriend {

    //1. 类的构造器私有化
    private GirlFriend() {}

    //2. 声明当前的实例,必须声明为static
    private static GirlFriend instance = null;

    //3. 通过getXxx()获得当前的实例，如果未创建对象，则在方法内部进行实例化，必须声明为static
    public GirlFriend getInstance(){
        if(instance == null){
            instance = new GirlFriend();
        }
        return instance;
    }
}
