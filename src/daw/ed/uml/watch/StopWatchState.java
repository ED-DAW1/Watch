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
        //System.out.print("Baking the pizza...");
        //pizza.setState(pizza.getBakedState());
    }

    @Override
    public void BA() throws Exception {
        throw new Exception("Can't deliver a pizza not baked yet");
    }
    
    @Override
    public void BM() throws Exception {
        throw new Exception("Can't deliver a pizza not baked yet");
    }

}
