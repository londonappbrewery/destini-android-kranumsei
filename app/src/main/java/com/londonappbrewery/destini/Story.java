package com.londonappbrewery.destini;

public class Story {
    private int text;
    private int topAwnserId;
    private int bottomAwnserId;

    public Story(int textId, int topAwnserId, int bottomAwnserId){
        this.text = textId;
        this.topAwnserId = topAwnserId;
        this.bottomAwnserId = bottomAwnserId;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public int getTopAwnserId() {
        return topAwnserId;
    }

    public void setTopAwnserId(int topAwnserId) {
        this.topAwnserId = topAwnserId;
    }

    public int getBottomAwnserId() {
        return bottomAwnserId;
    }

    public void setBottomAwnserId(int bottomAwnserId) {
        this.bottomAwnserId = bottomAwnserId;
    }
}
