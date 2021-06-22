/* Java 继承 */
// Java支持多重继承，但不支持多继承
//     单继承: public class A {}
//             public class B extends A {}
//     多重继承: public class A {}
//               public class B extends A {}
//                public class C extends B {}
//     不同类继承同一个类: public class A {}
//                        public class B extends A {}
//                         public class C extends A {}
//     多继承: public class A {}
//             public class B {}
//              public class C extends A, B {}
//     Java不支持多继承的方式
// Java 继承的特性：
//     子类拥有父类非 private 的属性、方法
//     子类可以拥有自己的属性和方法，即子类可以对父类进行扩展
//     子类可以用自己的方式实现父类的方法
//     不支持多继承
// 继承可以使用 extends 和 implements 这两个关键字来实现继承
// 所有的类都是继承于 java.lang.Object
// 当一个类没有继承的两个关键字，则默认继承 object 祖先类
// 使用 implements 关键字可以变相的使java具有多继承的特性，使用范围为类继承接口的情况，可以同时继承多个接口
//     public interface A{}
//     public interface B{}
//     public class C implements A, B{}
// 我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类
// this关键字：指向自己的引用
// final 关键字声明类可以把类定义为不能继承的，即最终类；或者用于修饰方法，该方法不能被子类重写
// 子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）
//     如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表
//     如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器


/* Java 重写(Override) 与 重载(Overload) */
// 重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写
//     重写方法不能抛出新的检查异常或者比被重写方法申明更加宽泛的异常
//     这是由于在编译阶段，只是检查参数的引用类型。然而在运行时，Java 虚拟机(JVM)指定对象的类型并且运行该对象的方法
//     访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为 public，那么在子类中重写该方法就不能声明为 protected
//     父类的成员方法只能被它的子类重写
//     声明为 final 的方法不能被重写
//     声明为 static 的方法不能被重写，但是能够被再次声明
//     子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为 private 和 final 的方法
//     子类和父类不在同一个包中，那么子类只能够重写父类的声明为 public 和 protected 的非 final 方法
//     当需要在子类中调用父类的被重写方法时，要使用 super 关键字
// 重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同
// 每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表
// 最常用的地方就是构造器的重载


/* Java多态 */
// 多态存在的三个必要条件
//     继承
//     重写
//     父类引用指向子类对象：Parent p = new Child();
// 当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法
// 重写的方法能在运行时调用，不管编译的时候源代码中引用变量是什么数据类型
// 多态的实现方式：
//     重写与重载
//     接口
//     抽象类和抽象方法


/* Java 抽象类 */
// 在面向对象的概念中，所有的对象都是通过类来描绘的
// 但是并不是所有的类都是用来描绘对象的
// 如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类
// 抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样
// 可以声明一个指向抽象类的引用
// 由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用
// Abstract 关键字同样可以用来声明抽象方法，抽象方法只包含一个方法名，而没有方法体
// 如果一个类包含抽象方法，那么该类必须是抽象类
// 任何子类必须重写父类的抽象方法，或者声明自身为抽象类


/* Java 封装 */
// 封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问
// 要访问该类的代码和数据，必须通过严格的接口控制
// 实现Java封装的步骤：
//     1. 修改属性的可见性来限制对属性的访问（一般限制为private）
//     2. 对每个值属性提供对外的公共方法访问，也就是创建一对赋取值方法，用于对私有属性的访问


/* Java 接口 */
// 接口，在JAVA编程语言中是一个抽象类型，是抽象方法的集合，接口通常以interface来声明
// 一个类通过继承接口的方式，从而来继承接口的抽象方法
// 接口并不是类，编写接口的方式和类很相似，但是它们属于不同的概念
// 类描述对象的属性和方法。接口则包含类要实现的方法
// 接口无法被实例化，但是可以被实现
// 一个实现接口的类，必须实现接口内所描述的所有方法，否则就必须声明为抽象类
// 接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 public abstract（只能是 public abstract，其他修饰符都会报错）
// 接口中可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量（并且只能是 public，用 private 修饰会报编译错误）
// 接口中的方法是不能在接口中实现的，只能由实现接口的类来实现接口中的方法
// 一个类却可以实现多个接口，也就是说接口支持多继承
//     public interface Hockey extends Sports, Event {}
//     以上的程序片段是合法定义的子接口
// 类使用implements关键字实现接口
//     public class ClassName implements InterfaceName {}
// 标记接口是没有任何方法和属性的接口，标记接口主要用于以下两种目的：
//     建立一个公共的父接口
//     向一个类添加数据类型，这种情况是标记接口最初的目的，
//         实现标记接口的类不需要定义任何接口方法(因为标记接口根本就没有方法)，但是该类通过多态性变成一个接口类型


/* Java 枚举 */
// Java 枚举是一个特殊的类，一般表示一组常量
// Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 , 来分割
//     enum Color{RED, GREEN, BLUE};
// 每个枚举都是通过 Class 在内部实现的，且所有的枚举值都是 public static final 的
// 可以使用for语句来迭代枚举元素
//     for (Color myVar : Color.values()) {}
// 枚举类常应用于 switch 语句中
// values() 返回枚举类中所有的值
// ordinal() 可以找到每个枚举常量的索引，就像数组索引一样
// valueOf() 返回指定字符串值的枚举常量
// 枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用 private 访问修饰符，所以外部无法调用
// 枚举既可以包含具体方法，也可以包含抽象方法。 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它


/* Java 包 */
// 为了更好地组织类，Java 提供了包机制，用于区别类名的命名空间
//     把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用
//     如同文件夹一样，包也采用了树形目录的存储方式。
//         同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的，
//         当同时调用两个不同包中相同类名的类时，应该加上包名加以区别。因此，包可以避免名字冲突
//     包也限定了访问权限，拥有包访问权限的类才能访问某个包中的类
// 以下是一些 Java 中的包：
//     java.lang - 打包基础的类
//     java.io - 包含输入输出功能的函数
// 创建包
//     包声明应该在源文件的第一行，每个源文件只能有一个包声明，这个文件中的每个类型都应用于它
//     如果一个源文件中没有使用包声明，那么其中的类，函数，枚举，注释等将被放在一个无名的包（unnamed package）中
//     package animals; 创建名字为animals的包
// 为了能够使用某一个包的成员，我们需要在 Java 程序中明确导入该包。使用 "import" 语句可完成此功能
// 在 java 源文件中 import 语句应位于 package 语句之后，所有类的定义之前，可以没有，也可以有多条
// 如果在一个包中，一个类想要使用本包中的另一个类，那么该包名可以省略
// 类放在包中会有两种主要的结果
//     包名成为类名的一部分：使用时需要 packageName.ClassName
//     包名必须与相应的字节码所在的目录结构相吻合，也就是说包的名字和所在的文件夹的名字相同
// 编译之后的 .class 文件应该和 .java 源文件一样，它们放置的目录应该跟包的名字对应起来
//     但是并不要求 .class 文件的路径跟相应的 .java 的路径一样
//     可以分开来安排源码和类的目录，将你的类目录分享给其他的编程人员，而不用透露自己的源码
//     <path-one>\sources\com\runoob\test\Runoob.java
//     <path-two>\classes\com\runoob\test\Google.class
//     类目录的绝对路径叫做 class path。设置在系统变量 CLASSPATH 中
//     <path- two>\classes 是 class path，package 名字是 com.runoob.test
// 用下面的命令显示当前的CLASSPATH变量：
//     Windows 平台（DOS 命令行下）：C:\> set CLASSPATH
//     UNIX 平台（Bourne shell 下）：# echo $CLASSPATH
// 删除当前CLASSPATH变量内容:
//     Windows 平台（DOS 命令行下）：C:\> set CLASSPATH=
//     UNIX 平台（Bourne shell 下）：# unset CLASSPATH; export CLASSPATH
// 设置CLASSPATH变量:
//     Windows 平台（DOS 命令行下）： C:\> set CLASSPATH=<path-two>\classes
//     UNIX 平台（Bourne shell 下）：# CLASSPATH=<path-two>\classes; export CLASSPATH

public class ObjectOriented{
    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());

        Animal a = new Cat();
        a.eat();   // 父类的引用会使用子类重写的方法
        Cat c = (Cat)a;
        c.work();
    }

    public static void show(Animal a) {
        a.eat();   // 父类的引用会使用子类重写的方法
        if(a instanceof Cat) {
            Cat c = (Cat)a;
            c.work();
        } else if(a instanceof Dog) {
            Dog d = (Dog)a;
            d.work();
        }
    }
}


class Animal{
    void eat() {
        System.out.println("eat");
    }
}


class Cat extends Animal {
    public void eat() {
        System.out.println("eat fish");
    }
    public void work() {
        System.out.println("catch mouse");
    }
}


class Dog extends Animal {
    public void eat() {
        System.out.println("eat bone");
    }
    public void work() {
        System.out.println("look after the house");
    }
}
