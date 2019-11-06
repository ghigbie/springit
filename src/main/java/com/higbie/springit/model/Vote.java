package com.higbie.springit.model;

public class Vote {

    private long id;
    private int vote;

    //user
    //link

    public Vote(){ }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }
}
