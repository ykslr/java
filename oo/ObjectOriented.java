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
// 
