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
public class SetAlarmState implements WatchState {

    private Watch watch;

    public SetAlarmState(Watch watch) {
        this.watch = watch;
    }

    @Override
    public void BR() throws Exception {
        System.out.println("Setting up alarm time");
        //watch.timeIncrement();
    }

    @Override
    public void BA() throws Exception {
        System.out.println("Alarm mode");
        watch.setState(watch.getAlarmState());
    }
    
    @Override
    public void BM() throws Exception {
        throw new Exception("Function not yet implemented");
    }
    
    @Override
    public String toString() {
        return "SetAlarmState";
    }

}
