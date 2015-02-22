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
public class TimeState implements WatchState {

    private Watch watch;

    public TimeState(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void BR() throws Exception {
        throw new Exception("Operation not valid");
    }

    @Override
    public void BA() throws Exception {
        System.out.println("Set Time Mode");
        watch.setState(watch.getSetTimeState());
    }
    
    @Override
    public void BM() throws Exception {
        System.out.println("Alarm Mode");
        watch.setState(watch.getAlarmState());
    }
    
    @Override
    public String toString() {
        return "TimeState";
    }

}
