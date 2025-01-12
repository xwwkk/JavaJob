package com.atguigu2.two.exer3;

/**
 * ClassName: ArrayTest03
 * Package: com.atguigu2.two.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午7:07
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        String[][] employees = {
                {"10", "1", "xwk", "20", "100000", "15000", "2000"},
                {"11", "2", "cc", "20", "10000"},
                {"12", "3", "dd", "19", "100"},
                {"13", "4", "ee", "20", "1000"}
        };

        System.out.println("员工类型\t\t编号\t\t姓名\t\t年龄\t\t薪资\t\t\t奖金\t\t\tS股票");
        for (int i = 0; i < employees.length; i++) {

            String employeeType = employees[i][0];
            switch (employeeType) {
                case "10":
                    System.out.print("架构师\t\t");
                    break;
                    case "11":
                        System.out.print("程序员\t\t");
                        break;
                        case "12":
                            System.out.print("设计师\t\t");
                            break;
                            case "13":
                                System.out.print("普通职员\t\t");
                                break;
            }

            for (int j = 1; j < employees[i].length; j++) {
                System.out.print(employees[i][j] + "\t\t");
            }

            System.out.println();
        }
    }
}
