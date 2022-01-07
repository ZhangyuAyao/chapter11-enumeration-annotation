package com.hspedu.enum_;

/**
 * @author Zhang Yu
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {

    }
}

enum Season2 {

//    public final static Season SPRING = new Season("春天", "温暖");
//    public final static Season WINTER = new Season("冬天", "寒冷");
//    public final static Season AUTUMN = new Season("秋天", "凉爽");
//    public final static Season SUMMER = new Season("夏天", "炎热");

    //1. 使用关键字 enum 替代 class
    //2. public final static Season SPRING = new Season("春天", "温暖")直接使用
    // SPRING("春天", "温暖"),
    //3. 如果有多个常量（对象），使用，号间隔即可
    //4. 如果使用enum来实现枚举，要求定义常量对象，写在最前面
    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"),
    SUMMER("夏天", "炎热"),
    WHAT;
    private String name;
    private String desc;//描述


    private Season2() {//无参构造器
    }

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
