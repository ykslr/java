/* 基本语法 */
// Java是大小写敏感的
// 对于所有的类来说，类名的首字母应该大写。如果类名由若干单次组成，那么每个单次的首字母应该大写
// 方法名都以小写字母开头。如果方法名包含有若干个单词，则后面的每个单次首字母大写
// 源文件名必须的类名相同，不同则会导致编译错误
// 所有的Java程序由 public static void main(String[] args)方法开始执行


/* Java修饰符 */
// 访问控制修饰符：default, public, protected, private
// 非访问控制修饰符：final, abstract, static, synchronized
//     static 关键字可以用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。
//     final 表示"最后的、最终的"含义，变量一旦赋值后，不能被重新赋值。被 final 修饰的实例变量必须显式指定初始值
//     abstract 抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。
//     synchronized 关键字声明的方法同一时间只能被一个线程访问


/* Java变量 */
// 局部变量：在方法、构造方法或者语句块中定义的变量，声明和初始化都是在方法中，方法结束后，变量自动销毁
//          局部变量是在栈上分配的，且没有默认值，必须舒适化后，才能使用。
// 类变量（静态变量）：类变量声明在类中，方法体之外，但必须声明为 static 类型
//          无论一个类创建了多少个对象，类只拥有类变量的一份拷贝
//          静态变量除了被声明为常量外很少使用，存储在静态存储区
//          在第一次被访问时创建，在程序结束时销毁
//          静态变量可以通过 ClassName.VariableName的方式访问
// 成员变量（非静态变量）：定义在类中且方法体之外的变量
//          成员变量在对象创建的时候创建，在对象被销毁的时候销毁，具有默认值


/* Java继承 */
// 在 Java 中，一个类可以由其他类派生。如果你要创建一个类，而且已经存在一个类具有你所需要的属性或方法，那么你可以将新创建的类继承该类。
// 利用继承的方法，可以重用已存在类的方法和属性，而不用重写这些代码。被继承的类称为超类（super class），派生类称为子类（subclass）。


/* Java接口 */
// 在 Java 中，接口可理解为对象间相互通信的协议。接口在继承中扮演着很重要的角色。
// 接口只定义派生要用到的方法，但是方法的具体实现完全取决于派生类。


/* Java概念 */
// Java作为一种面向对象语言。支持以下基本概念：
// 多态
// 继承
// 封装
// 抽象
// 类：描述一类对象的状态和行为，是对一类事物的抽象
// 对象：类的实例，有状态（属性）和行为（方法）
// 实例
// 方法
// 重载


/* Java包 */
// 包主要用来对类和接口进行分类。当开发 Java 程序时，可能编写成百上千的类，因此很有必要对类和接口进行分类


/* import语句 */
// 在 Java 中，如果给出一个完整的限定名，包括包名、类名，那么 Java 编译器就可以很容易地定位到源代码或者类
// import 语句就是用来提供一个合理的路径，使得编译器可以找到某个类


/* 源文件声明规则 */
// 当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意一下规则：
// 一个源文件中只能有一个 public 类
// 一个源文件可以有多个非 public 类
// 源文件的名称应该和 public 类的类名保持一致
// 如果一个类定义在某个包中，那么 package 语句应该在源文件的首行
// 如果源文件包含 import 语句，那么应该放在 package 语句和类定义之间。如果没有 package 语句，那么 import 语句应该在源文件中最前面
// import 语句和 package 语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明


/* Java基本数据类型 */
// 内置数据类型（4个整数型，2个浮点型，1个字符型，1个布尔型，共8种）
//     byte ：8-bit，有符号数，默认为0
//     short ：16-bit，有符号数，默认为0
//     int ：32-bit，有符号数，默认为0
//     long ：64-bit，有符号数，默认为0L
//     float ：32-bit，单精度浮点数，默认为0.0f
//     double ：64-bit，双精度浮点数，默认为0.0d
//     boolean ：true or false，默认为false
//     char ：16-bit，Unicode字符，默认为u0000
// 引用数据类型
//     引用类型指向一个对象，指向对象的变量是引用变量，这些变量在声明时被指定为一个特定的类型，变量一旦声明后，类型就不能被改变了
//     对象、数组都是引用数据类型
//     所有引用类型的默认值都是null
//     一个引用变量可以用来引用任何与之兼容的类型
//     例子：Site site = new Site("Runoob")


/* Java赋值方式 */
// int decimal = 100;    // 10进制100
// int decimal = 0144;   // 前缀0表示8进制，8进制144 = 10进制100
// int decimal = 0x64;   // 前缀0x表示16进制，16进制64 = 10进制100


/* Java自动类型转换 */
// 整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算
// 转换从低级到高级
// 由低到高分别为：byte, short, char, int, long, float, double
// 数据类型转换必须满足以下规则
//     不能对boolean类型进行类型转换
//     不能把对象类型转换成不相关类的对象
//     在把容量大的类型转换为容量小的类型时必须使用强制类型转换
//     转换过程中可能导致溢出或损失精度
//     浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入


/* Java强制类型转换 */
// 条件是转换的数据类型必须是兼容的
// 格式：(type)value
// 例如，int i=123; byte b=(byte)i;
// 隐含的强制类型转换
//     整数的默认类型是 int
//     浮点型不存在这种情况，因为在定义 float 类型时必须在数字后面跟上 F 或者 f


/* Java instanceof 运算符 */
// 该运算符用于操作对象实例，检查该对象是否是一个特定类型
// 比如：String name = "James";  boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真


/* Java Number & Math类 */
// 一般地，当需要使用数字的时候，我们通常使用内置数据类型，如：byte、int、long、double 等
// 然而，在实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情形
// Java 语言为每一个内置数据类型提供了对应的包装类
// 所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类
// 包装类和基本数据类型的对应关系，首字母大写的为包装类
//     Boolean对应boolean, Byte对应byte, Short对应short, Integer对应int,
//     Long对应long, Character对应char, Float对应float, Double对应double
// Java Math类包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数
// Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用
// 比如 Math.sin(Math.PI/2)
// ceil()返回大于等于给定参数的最小整数，向上取整
// floor()返回小于等于给定参数的最大整数，向下取整
// round()四舍五入，算法为 Math.floor(x+0.5)，即将原来的数字加上0.5后再向下取整


/* Java Character类 */
// 类似于Number类的作用


/* Java String类 */
// 字符串广泛应用 在 Java 编程中，在 Java 中字符串属于对象，Java 提供了 String 类来创建和操作字符串
// String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了
// 如果需要对字符串做很多修改，那么应该选择使用 StringBuffer & StringBuilder 类。


/* Java StringBuffer 和 StringBuilder 类 */
// 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类
// 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象
// StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的
// 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类
// 在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类


public class HelloWorld {
    /* 第一个Java程序
     * 它将输出字符串 Hello World
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
