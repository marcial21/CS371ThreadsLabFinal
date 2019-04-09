package edu.up.cs301threadslab;

import java.io.Serializable;
import java.util.Random;

public class Starlord extends Thread implements Serializable{
    //AnimationView myAV;
    StarAnimation myStarAnime;

    public Starlord(StarAnimation myStar){
        //this.myAV = myAnime;
        this.myStarAnime = myStar;
    }

    public void run(){
        Random myRand = new Random(2);
        while(true) {
            int randomNumber = myRand.nextInt(2) + 1;
            if (randomNumber == 1) {
                myStarAnime.addStar();
            } else {
                myStarAnime.removeStar();
            }

            try{
                Thread.sleep(40);
            }
            catch(InterruptedException ie){

            }
        }
    }
}
