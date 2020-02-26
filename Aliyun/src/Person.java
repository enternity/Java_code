/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-25 6:24 pm
 */
public class Person {
    private String name;
    private int age;
    public static String country="中华民国";

    public String getName() {
        return name;
    }


    public Person(){
        System.out.println("【构造方法】：构造方法执行");
    }

    static {
        System.out.println("【静态代码块块】：静态代码块执行");
    }

    {
        System.out.println("【构造块】：构造块执行");
    }

    public Person(String name){
        this();//调用无参构造
        this.name=name;
    }
    public Person(String name, int age) {
        this(name);//调用单参构造
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void tell(){
        System.out.println("\n姓名："+name+"\n年龄："+age+"\n国家："+country);
    }

    public static void main(String[] args) {
//        Person per1=new Person("张三",14);
//        Person per2=new Person("李四",14);
//        Person per3=new Person("王五",14);
//        per1.country="中华人民共和国";
//        per1.tell();
//        per2.tell();
//        per3.tell();
        new Person();
        new Person();
        new Person();



    }
}
