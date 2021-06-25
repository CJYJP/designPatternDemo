package com.yjp.designpattern.structural.combination;

/**
 * 组合模式
 * 将对象组合成树形结构以表示“部分-整体”的层次结构，使客户端对单个对象和组合对象保持一致的方式处理。
 *
 * 适用于：
 *
 * 客户端可以忽略组合对象与单个对象的差异；
 * 处理树形结构数据。
 * 优点:
 *
 * 层次清晰；
 * 客户端不必关系层次差异，方便控制；
 * 符合开闭原则。
 * 缺点：
 *
 * 树形处理较为复杂。
 */
public class test {
    public static void main(String[] args) {
        Menu userMenu = new Menu("用户管理", "🧑", 2);
        Button createUser = new Button("新增用户");
        Button updateUser = new Button("修改用户");
        Button deleteUser = new Button("删除用户");
        userMenu.add(createUser);
        userMenu.add(updateUser);
        userMenu.add(deleteUser);

        Menu logMenu = new Menu("操作日志", "📃", 2);
        Button export = new Button("导出Excel");
        logMenu.add(export);

        Menu systemMenu = new Menu("系统管理", "🔨", 1);
        systemMenu.add(userMenu);
        systemMenu.add(logMenu);

        systemMenu.print();
    }
}
