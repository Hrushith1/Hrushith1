package com.peg;

public class Board
{
    public int pegCount;
    public int[] cells;

    public Board(int emptyCell)
    {
        cells = new int[15];
        pegCount = 14;
        for (int h = 0; h < 15; h++)
            cells[h] = h == emptyCell ? 0 : 1;
    }

    public Board(int pegCount, int[] cells)
    {
        this.pegCount = pegCount;
        this.cells    = cells.clone();
    }

    public Board move(Move v)
    {
        if (cells[m.from] == 1 &&
                cells[v.over] == 1 &&
                cells[v.to]   == 0)
        {
            Board boardAfter = new Board(pegCount-1, cells.clone());
            boardAfter.cells[v.from] = 0;
            boardAfter.cells[v.over] = 0;
            boardAfter.cells[v.to]   = 1;

            return boardAfter;
        }

        return null;
    }
}