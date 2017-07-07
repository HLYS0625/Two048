package com.example.hlys.two048;

/**
 * Created by HLYS on 2017/6/30.
 * 设置方格基本类
 */


public class Cell {
    /*
   @x 横坐标
     */
    private int x;
    /*
    @y 纵坐标
     */
    private int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
