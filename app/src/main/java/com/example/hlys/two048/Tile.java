package com.example.hlys.two048;

/**
*卡片类
 */

public class Tile extends Cell {
    private int value;//值
    private Tile[] mergedFrom = null;

    public Tile(int x, int y, int value) {
        super(x, y);
        this.value = value;
    }

    public Tile(Cell cell, int value) {
        super(cell.getX(), cell.getY());
        this.value = value;
    }

    /**
     * 更新坐标位置
     * @param cell
     */
    public void updatePosition(Cell cell) {
        this.setX(cell.getX());
        this.setY(cell.getY());
    }

    /**
     * 获取值
     * @return
     */
    public int getValue() {
        return this.value;
    }

    /**
     *
     * @return
     */
    public Tile[] getMergedFrom() {
        return mergedFrom;
    }

    /**
     *集合
     * @param tile
     */
    public void setMergedFrom(Tile[] tile) {
        mergedFrom = tile;
    }
}
