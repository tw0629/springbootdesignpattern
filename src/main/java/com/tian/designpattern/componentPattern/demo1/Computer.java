package com.tian.designpattern.componentPattern.demo1;

/**
 * @author David Tian
 * @desc 组合模式
 * 组合模式是将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *
 *
 * @since 2021-01-02 18:05
 */
public class Computer {
    Cpu cpu;
    Memory memory;
    MainBoard mainBoard;

    public void work() {
        cpu.run();
        memory.store();
        mainBoard.connect();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.cpu = new Cpu();
        computer.mainBoard = new MainBoard();
        computer.memory = new Memory();
        computer.work();
    }
}
