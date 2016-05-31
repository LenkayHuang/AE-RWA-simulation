package Events;

/**
 * 光网络事件基类。
 *
 */
public class Event {

    private EventType eventType;
    private int eventId;
    private long arriveTime;
    private long holdTime;
    private long startTime;//原始的事件到达事件，用于计算时延

    public EventType getEventType() {
        return eventType;
    }

    public int getEventId() {
        return eventId;
    }

    public long getArriveTime() {
        return arriveTime;
    }

    public long getHoldTime() {
        return holdTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setArriveTime(long arriveTime) {
        this.arriveTime = arriveTime;
    }

    public void setHoldTime(long holdTime) {
        this.holdTime = holdTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void updateArriveTime(long addTime) {
        this.arriveTime += addTime;
    }

    public void updateHoldTime(long addTime) {
        this.holdTime += addTime;
    }

    public Event() {
        this.eventType = EventType.Default;
        this.eventId = 0;
        this.arriveTime = 0;
        this.holdTime = 0;
        this.startTime = 0;
    }

    public Event(EventType eventType, int eventId, long arriveTime, long holdTime) {
        this.eventType = eventType;
        this.eventId = eventId;
        this.arriveTime = arriveTime;
        this.holdTime = holdTime;
        this.startTime = arriveTime;
    }

}
