package com.yjp.designpattern.creative.observer;

/**
 * 观察者模式
 * 观察者模式定义了对象之间的一对多依赖，让多个观察者同时监听某个主题对象，当主体对象发生变化时，它的所有观察者都会收到响应的通知。
 *
 * 优点：
 *
 * 观察者和被观察者之间建立一个抽象的耦合；
 * 观察者模式支持广播通信。
 * 缺点：
 *
 * 观察者之间有过多的细节依赖，提高时间消耗及程序复杂度；
 * 应避免循环调用。
 */
public class test {
    public static void main(String[] args) {
        Blog blog = new Blog("Java从入门到放弃");
        Author author = new Author("yjp");

        // 添加观察者
        blog.addObserver(author);

        Comment comment = new Comment("Scott",
                "感谢楼主的文章，让我及时放弃Java，回家继承了千万家产。");
        blog.comment(comment);
    }
}
