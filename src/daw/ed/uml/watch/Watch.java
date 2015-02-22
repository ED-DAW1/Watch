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
        alarmState = new AlarmState(this);
        stopWatchState = new StopWatchState(this);
        timeState = new TimeState(this);
        setTimeState = new SetTimeState(this);
        setAlarmState = new SetAlarmState(this);
        m_current_state = new TimeState(this);
    }
    
    public void setState(WatchState s)
    {
        m_current_state = s;
    }
    
    public void BM() throws Exception {
        m_current_state.BM();
        System.out.format("[%s]", m_current_state);
    }
    
    public void BR() throws Exception {
        m_current_state.BR();
        System.out.format("[%s]", m_current_state);
    }
    
    public void BA() throws Exception {
        m_current_state.BA();
        System.out.format("[%s]", m_current_state);
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
