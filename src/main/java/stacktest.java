/**
 * Project name(项目名称)：算法_基于数组的栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): stacktest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 19:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class stacktest
{
    public static void main(String[] args)
    {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        System.out.println(stack.getTop());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
