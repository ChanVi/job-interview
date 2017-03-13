---
title: 栈和队列的Java实现
date: 2016-07-05 14:04:35
tags: 
- 面试
- java
categories:
---
面试的时候，栈和队列经常会成对出现来考察。本文包含栈和队列的如下考试内容：
<!-- more -->

1. 栈的创建

2. 队列的创建

3. 两个栈实现一个队列

3. 两个队列实现一个栈

3. 设计含最小函数min()的栈，要求min、push、pop、的时间复杂度都是O(1)

3. 判断栈的push和pop序列是否一致

## 1、栈的创建：

我们接下来通过链表的形式来创建栈，方便扩充。

代码实现：
```java
public class Stack {

    public Node head;
    public Node current;

    //方法：入栈操作
    public void push(int data) {
        if (head == null) {
            head = new Node(data);
            current = head;
        } else {
            Node node = new Node(data);
            node.pre = current;//current结点将作为当前结点的前驱结点
            current = node;  //让current结点永远指向新添加的那个结点
        }
    }

    public Node pop() {
        if (current == null) {
            return null;
        }

        Node node = current; // current结点是我们要出栈的结点
        current = current.pre;  //每出栈一个结点后，current后退一位
        return node;

    }

    class Node {
        int data;
        Node pre;  //我们需要知道当前结点的前一个结点

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
    }

}
```
入栈操作时，14、15行代码是关键。
结果：3 2 1

## 2、队列的创建：

队列的创建有两种形式：基于数组结构实现（顺序队列）、基于链表结构实现（链式队列）。

我们接下来通过链表的形式来创建队列，这样的话，队列在扩充时会比较方便。队列在出队时，从头结点head开始。

代码实现：

入栈时，和在普通的链表中添加结点的操作是一样的；出队时，出的永远都是head结点。
```java
public class Queue {
    public Node head;
    public Node curent;

    //方法：链表中添加结点
    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            curent = head;
        } else {
            curent.next = new Node(data);
            curent = curent.next;
        }
    }
    //方法：出队操作
    public int pop() throws Exception {
        if (head == null) {
            throw new Exception("队列为空");
        }
        Node node = head;  //node结点就是我们要出队的结点
        head = head.next; //出队之后，head指针向下移
        return node.data;

    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        //入队操作
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }

        //出队操作
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }
}
```
结果：0 1 2

## 3、两个栈实现一个队列：

思路：

栈1用于存储元素，栈2用于弹出元素，负负得正。

说的通俗一点，现在把数据1、2、3分别入栈一，然后从栈一中出来（3、2、1），放到栈二中，那么，从栈二中出来的数据（1、2、3）就符合队列的规律了，即负负得正。

完整版代码实现：

```java
import java.util.Stack;

/**
 * Created by smyhvae on 2015/9/9.
 */
public class Queue {

    private Stack<Integer> stack1 = new Stack<>();//执行入队操作的栈
    private Stack<Integer> stack2 = new Stack<>();//执行出队操作的栈

    //方法：给队列增加一个入队的操作
    public void push(int data) {
        stack1.push(data);

    }

    //方法：给队列正价一个出队的操作
    public int pop() throws Exception {

        if (stack2.empty()) {//stack1中的数据放到stack2之前，先要保证stack2里面是空的（要么一开始就是空的，要么是stack2中的数据出完了），不然出队的顺序会乱的，这一点很容易忘

            while (!stack1.empty()) {
                stack2.push(stack1.pop());//把stack1中的数据出栈，放到stack2中【核心代码】
            }

        }

        if (stack2.empty()) { //stack2为空时，有两种可能：1、一开始，两个栈的数据都是空的；2、stack2中的数据出完了
            throw new Exception("队列为空");
        }

        return stack2.pop();
    }

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.pop());

        queue.push(4);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }

}
```
注意第22行和第30行代码的顺序，以及注释，需要仔细理解其含义。
结果：1 2 3 4

## 4、两个队列实现一个栈：

思路：

将1、2、3依次入队列一， 然后最上面的3留在队列一，将下面的2、3入队列二，将3出队列一，此时队列一空了，然后把队列二中的所有数据入队列一；将最上面的2留在队列一，将下面的3入队列二。。。依次循环。

代码实现：

```java
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class StackByQueue {
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;
	
	public 	StackByQueue(){
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}

	
	public boolean push(Integer item) {
		return queue1.offer(item);
	}


	public  Integer pop() throws Exception {
		if(queue1.isEmpty()){
			if(queue2.isEmpty()){
				System.out.println("Stack is empty!!!");
				throw new Exception();
			}
			while(!(queue2.size()==1))
				queue1.offer(queue2.poll());
			return queue2.poll();
		}else {
			while(!(queue1.size()==1))
				queue2.offer(queue1.poll());
			return queue1.poll();
		}
	}
	
	
}
public class Q7_1_StackWithTwoQueues {

	public static void main(String[] args) throws Exception {
		StackByQueue sq = new StackByQueue();
		int[] data = new int[]{1,2,3};
		for (int j = 0; j < data.length; j++) {
			sq.push(data[j]);
		}
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		sq.push(4);
		System.out.println(sq.pop());
		System.out.println(sq.pop());
	}

}
```
结果：3 2 1


## 5、设计含最小函数min()的栈
要求min、push、pop、的时间复杂度都是O(1)。min方法的作用是：就能返回是栈中的最小值。【微信面试题】

普通思路：

一般情况下，我们可能会这么想：利用min变量，每次添加元素时，都和min元素作比较，这样的话，就能保证min存放的是最小值。但是这样的话，会存在一个问题：如果最小的元素出栈了，那怎么知道剩下的元素中哪个是最小的元素呢？

改进思路：

这里需要加一个辅助栈，用空间换取时间。辅助栈中，栈顶永远保存着当前栈中最小的数值。具体是这样的：原栈中，每次添加一个新元素时，就和辅助栈的栈顶元素相比较，如果新元素小，就把新元素的值放到辅助栈中，如果新元素大，就把辅助栈的栈顶元素再copy一遍放到辅助栈的栈顶；原栈中，出栈时，

完整代码实现：
```java

import java.util.Stack;

/**
 * Created by smyhvae on 2015/9/9.
 */
public class MinStack {

    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>(); //辅助栈：栈顶永远保存stack中当前的最小的元素

    public void push(int data) {
        stack.push(data);  //直接往栈中添加数据

        //在辅助栈中需要做判断
        if (minStack.size() == 0 || data < minStack.peek()) {
            minStack.push(data);
        } else {
            minStack.add(minStack.peek());   //【核心代码】peek方法返回的是栈顶的元素
        }
    }

    public int pop() throws Exception {
        if (stack.size() == 0) {
            throw new Exception("栈中为空");
        }

        int data = stack.pop();
        minStack.pop();  //核心代码
        return data;
    }

    public int min() throws Exception {
        if (minStack.size() == 0) {
            throw new Exception("栈中空了");
        }
        return minStack.peek();
    }

    public static void main(String[] args) throws Exception {
        MinStack stack = new MinStack();
        stack.push(4);
        stack.push(3);
        stack.push(5);

        System.out.println(stack.min());
    }
}
```
运行结果：3


## 6、判断栈的push和pop序列是否一致

通俗一点讲：已知一组数据1、2、3、4、5依次进栈，那么它的出栈方式有很多种，请判断一下给出的出栈方式是否是正确的？

例如：

数据：

1、2、3、4、5

出栈1：

5、4、3、2、1（正确）

出栈2：

4、5、3、2、1（正确）

出栈3：

4、3、5、1、2（错误）

完整版代码：

```java
import java.util.Stack;

/**
 * Created by smyhvae on 2015/9/9.
 */
public class StackTest {

    //方法：data1数组的顺序表示入栈的顺序。现在判断data2的这种出栈顺序是否正确
    public static boolean sequenseIsPop(int[] data1, int[] data2) {
        Stack<Integer> stack = new Stack<Integer>(); //这里需要用到辅助栈

        for (int i = 0, j = 0; i < data1.length; i++) {
            stack.push(data1[i]);

            while (stack.size() > 0 && stack.peek() == data2[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        int[] data1 = {1, 2, 3, 4, 5};
        int[] data2 = {4, 5, 3, 2, 1};
        int[] data3 = {4, 5, 2, 3, 1};

        System.out.println(sequenseIsPop(data1, data2));
        System.out.println(sequenseIsPop(data1, data3));
    }
}
```
代码比较简洁，但也比较难理解，要仔细体会。

运行效果：true false
