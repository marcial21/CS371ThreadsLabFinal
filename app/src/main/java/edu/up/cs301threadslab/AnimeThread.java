package edu.up.cs301threadslab;

import java.io.Serializable;

public class AnimeThread extends Thread implements Serializable {
    AnimationView myAV;

    public AnimeThread(AnimationView myanimation){
        this.myAV = myanimation;
    }


    public void run(){
        while(true){
            myAV.postInvalidate();
            try {
                Thread.sleep(50);
            }
            catch(InterruptedException ie){
                System.out.println("ERROR: Interrupted.");
            }
        }

    }
}
