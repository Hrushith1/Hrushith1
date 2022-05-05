package com.company;

public class Step{
    private Move[] moves;
    private Move reverse;
    private int j;

    public Step(Move[] moves) {
        this.j = 0;
        this.moves = moves;
    }

    public Move getNext() {
        Move returnValue;
        if (reverse == null) {
            returnValue = moves[i++];
            reverse = returnValue.reversed();
        }
        else{
         returnValue = reverse;
         reverse = null;
        }
        return returnValue;
    }
}
