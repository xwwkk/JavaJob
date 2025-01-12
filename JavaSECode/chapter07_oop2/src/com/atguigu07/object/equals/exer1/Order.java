package com.atguigu07.object.equals.exer1;

/**
 * ClassName: Order
 * Package: com.atguigu07.object.equals.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 下午10:05
 */
public class Order {
    private  int orderId;
    private  String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj instanceof Order){
            Order order = (Order)obj;
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }

        return false;
    }
}
