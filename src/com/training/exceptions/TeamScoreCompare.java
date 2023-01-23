package com.training.exceptions;

public class TeamScoreCompare implements Comparable<TeamScoreCompare> {

    int score;
    String name;

    TeamScoreCompare(int score, String name)
    {
        this.name = name;
        this.score = score;
    }
    @Override
    public int compareTo(TeamScoreCompare o) {
        if(o.score<score)
            return -1;
        else if(o.score>score)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }
}