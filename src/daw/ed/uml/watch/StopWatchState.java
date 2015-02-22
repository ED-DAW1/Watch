/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.ed.uml.watch;

/**
 *
 * @author carlos
 */
public class StopWatchState implements WatchState {

    private Watch watch;

    public StopWatchState(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void BR() throws Exception {
        System.out.println("On/Off stopwatch");
        //watch.alarmToogle();
    }

    @Override
    public void BA() throws Exception {
        System.out.println("Restart stopwatch");
        //watch.restart();
    }
    
    @Override
    public void BM() throws Exception {
        System.out.println("Time mode");
        watch.setState(watch.getTimeState());
    }
    
    @Override
    public String toString() {
        return "StopWatchState";
    }

}
