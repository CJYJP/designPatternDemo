package com.yjp.designpattern.creative.memo;

/**
 * 备忘录模式
 * 优点
 * 1、它提供了一种状态恢复的实现机制，使得用户可以方便地回到一个特定的历史步骤，当新的状态无效或者存在问题时，可以使用暂时存储起来的备忘录将状态复原。
 *
 * 2、备忘录实现了对信息的封装，一个备忘录对象是一种原发器对象状态的表示，不会被其他代码所改动。备忘录保存了原发器的状态，采用列表、堆栈等集合来存储备忘录对象可以实现多次撤销操作。
 *
 * 缺点
 * 资源消耗过大，如果需要保存的原发器类的成员变量太多，就不可避免需要占用大量的存储空间，每保存一次对象的状态都需要消耗一定的系统资源。
 *
 * 适用场景
 * 1、保存一个对象在某一个时刻的全部状态或部分状态，这样以后需要时它能够恢复到先前的状态，实现撤销操作。
 *
 * 2、防止外界对象破坏一个对象历史状态的封装性，避免将对象历史状态的实现细节暴露给外界对象。
 */
public class test {
    public static void main(String[] args) {

        Game game = new Game();
        System.out.println("游戏开始，捡到滑板，前进10步");
        game.setPlayerStep(10);
        //备份当前状态
        System.out.println("备份当前状态");
        GameMemento gameMemento = game.createGameMemento();

        Caretaker caretaker = new Caretaker();

        caretaker.saveMemento(gameMemento);
        System.out.println("备份完成");
        game.play();
        System.out.println("踩到便便了，当前步数为："+game.getPlayerStep());
        System.out.println("还原到之前一步");
        game.restore(caretaker.retrieveMemento());

        System.out.println("恢复完成，当前玩家步数是："+game.getPlayerStep());

    }
}
