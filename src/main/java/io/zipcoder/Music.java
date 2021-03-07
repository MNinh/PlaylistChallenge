package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

    int nextSong = 0;
    int prevSong = 0;
    int currIndex = 0;


    for (int i = 0; i < playList.length; i++){
        if (playList[(startIndex + i) % playList.length] == selection) {
            break;
        }
        nextSong++;

        if (playList[(((startIndex - i) % playList.length)+ playList.length) % playList.length] == selection){
            break;
        }
        prevSong++;

        System.out.println("Next song count" + nextSong);
        System.out.println("Prev song count" + prevSong);

    }
        if (nextSong < prevSong) {
            return nextSong;
        }else{
            return prevSong;
        }
    }

}
