import java.util.NoSuchElementException;

/**
 * Project name(项目名称)：算法_基于数组的栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyStack
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 19:38
 * Version(版本): 1.0
 * Description(描述)：
 * 补全push(T item)方法，实现入栈功能；
 * 补全pop()方法，实现出栈功能。
 * to be or not to - be - - that - - - is
 * 预期输出：
 * to be not that or be
 */

public class MyStack<T>
{
    private T[] S;
    private int top;//栈顶元素下标，初始为-1

    public MyStack()
    {
        this(1);
    }

    public MyStack(int capacity)
    {
        S = (T[]) new Object[capacity];
        top = -1;
    }

    /**
     * 入栈操作，把item压入栈中
     *
     * @param item
     */
    public void push(T item)
    {

        int len = S.length;
        if (top == len - 1)
        {
            resize(2 * len);
        }
        /********** Begin *********/
        top++;
        S[top] = item;

        /********** End *********/
    }


    /**
     * 返回栈顶元素并从栈中移除
     *
     * @return
     */
    public T pop()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("栈为空！");
        }
        /********** Begin *********/
        T result = S[top];
        top--;
        return result;

        /********** End *********/
    }

    /**
     * 判断栈是否为空
     *
     * @return
     */
    public boolean isEmpty()
    {
        if (top < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * 动态扩展数组大小
     *
     * @param capacity
     */
    private void resize(int capacity)
    {
        assert capacity > top;
        T[] tmp = (T[]) new Object[capacity];
        for (int i = 0; i <= top; i++)
        {
            tmp[i] = S[i];
        }
        S = tmp;
    }

    public int size()
    {
        return top + 1;
    }

    public T getTop()
    {
        return S[top];
    }

    public void display()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("栈为空！");
        }
        for (int i = 0; i < top; i++)
        {
            System.out.print(S[i] + " ");
        }
        System.out.println(S[top]);
    }
}
