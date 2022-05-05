package com.company;

public class Move {
    public int from, over, to;

    public Move(int from, int over, int to)
    {
        this.from = from;
        this.over = over;
        this.to   = to;
    }

    public Move reversed()
    { return new Move(to, over, from); }
}
