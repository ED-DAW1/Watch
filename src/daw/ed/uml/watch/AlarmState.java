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
public class AlarmState implements WatchState {

    private Watch watch;

    public AlarmState(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void BR() throws Exception {
        System.out.println("Alarm toogle");
        //watch.alarmToogle();
    }

    @Override
    public void BA() throws Exception {
        System.out.println("Set Alarm Mode");
        watch.setState(watch.getSetAlarmState());
    }
    
    @Override
    public void BM() throws Exception {
        System.out.println("Stopwatch mode");
        watch.setState(watch.getStopWatchState());
    }
    
    @Override
    public String toString() {
        return "AlarmState";
    }

}
