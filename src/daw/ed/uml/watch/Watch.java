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
class Watch
{
    private WatchState m_current_state;
    private WatchState alarmState;
    private WatchState stopWatchState;
    private WatchState timeState;
    private WatchState setTimeState;
    private WatchState setAlarmState;

    
    public Watch()
    {
        m_current_state = new TimeState(this);
    }
    
    public void setState(WatchState s)
    {
        m_current_state = s;
    }
    
    public WatchState getAlarmState() {
        return alarmState;
    }
    
    public WatchState getStopWatchState() {
        return stopWatchState;
    }
    
    public WatchState getTimeState() {
        return timeState;
    }

    public WatchState getSetTimeState() {
        return setTimeState;
    }

    public WatchState getSetAlarmState() {
        return setAlarmState;
    }
    
}
