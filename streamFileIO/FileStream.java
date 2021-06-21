/* Java 流(Stream)、文件(File)和IO */
// Java.io 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标
// Java 为 I/O 提供了强大的而灵活的支持，使其更广泛地应用到文件传输和网络编程中
// FileInputStream 用于从文件读取数据
// FileOutputStream 用于创建一个文件并向文件中写数据
// 还有一些关于文件和I/O的类：File Class、FileReader Class、FileWriter Class


/* Java 中的目录 */
// 创建目录
//     mkdir()方法创建一个文件夹，成功返true，失败返回false。失败表明路径已存在或者父路径不存在
//     mkdirs()方法创建一个文件夹和它的所有父文件夹
//     File d = new File(dirname);   d.mkdirs();  会创建dirname的文件夹
// 读取目录
//     如果创建一个 File 对象并且它是一个目录，那么调用 isDirectory() 方法会返回 true
//     使用list()方法检查一个文件夹中包含的内容
// 删除目录或文件
//     java.io.File.delete()方法
//     必须保证该目录为空，否则删除失败


/* Java Scanner 类 */
// 我们可以通过 Scanner 类来获取用户的输入


/* Java 异常处理 */
// Exception类的层次
//                         Throwable
//                          /      \
//                     Error        Exception
//                    /     \        \        \
//                   /       \       |         \
//     OutofMemoryError  IOError  IOException  RuntimeException
//                                    /                    \
//                                FileNotFoundException   NullPointerException
// 
// Error用来指示运行时环境发生的错误，一般地，程序不会从错误中恢复
// 使用 try 和 catch 关键字可以捕获异常
// 如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明
// throws 关键字放在方法签名的尾部
// 也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的
// 一个方法可以声明抛出多个异常，多个异常之间用逗号隔开
// finally 关键字用来创建在 try 代码块后面执行的代码块
// 无论是否发生异常，finally 代码块中的代码总会被执行
// 在 Java 中你可以自定义异常
//     所有异常都必须是 Throwable 的子类
//     如果希望写一个检查性异常类，则需要继承 Exception 类
//     如果你想写一个运行时异常类，那么需要继承 RuntimeException 类
// 通用异常
//     JVM(Java虚拟机) 异常：由 JVM 抛出的异常或错误。例如：NullPointerException 类，ArrayIndexOutOfBoundsException 类，ClassCastException 类
//     程序级异常：由程序或者API程序抛出的异常。例如 IllegalArgumentException 类，IllegalStateException 类



import java.io.*;

public class FileStream {
    public static void main(String[] args) throws IOException{
        
        /* 
         * 文件名
         */
        
        String file_name;

        if(args.length == 0) {
            file_name = new String("text.txt");
        } else {
            file_name = args[0];
        }

        /* 
         * 写入文件 
         */

        // 构建FileoutputStream对象，文件存在将会从头开始写入文件，文件不存在会自动创建
        FileOutputStream fos = new FileOutputStream(file_name);

        // 构建OutPutStreamWriter对象，参数可以指定编码，默认为操作系统默认编码
        OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");

        // 写入到缓冲区
        writer.append("中文输入\r\n");

        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
        writer.append("English\r\n");

        // 关闭写入流,同时会把缓冲区内容写入文件
        writer.close();
        
        // 关闭输出流,释放系统资源
        fos.close();

        /* 
         * 读取文件 
         */

        // 构建FileInputStream对象
        FileInputStream fis = new FileInputStream(file_name);

        // 构建InputStreamReader对象,编码与写入相同
        InputStreamReader reader = new InputStreamReader(fis, "UTF-8");

        StringBuffer sb = new StringBuffer();
        while(reader.ready()) {
            // 转成char加到StringBuffer对象中
            sb.append((char) reader.read());
        }

        // 输出到系统输出
        System.out.println(sb.toString());

        // 关闭读取流
        reader.close();
        
        // 关闭输入流,释放系统资源
        fis.close();
    }
}
