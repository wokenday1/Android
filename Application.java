package oop.Demo08;

public class Application {
    public static void main(String[] args) {
      //instanceof判断两个之间能否转换
        Object object=new Student();
        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof String);

        Person student = new Student();
        ((Student)student).go();
        //强制转换


    }
}
