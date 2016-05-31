package Events;

import NetworkElements.OpticalNode;

/**
 * 光网络业务事件类。
 *
 */

public class ServiceEvent extends Event{

    private OpticalNode srcNode;
    private OpticalNode destNode;
    private int requiredBandwidth;

    public void setSrcNode(OpticalNode srcNode) {
        this.srcNode = srcNode;
    }

    public void setDestNode(OpticalNode destNode) {
        this.destNode = destNode;
    }

    public void setRequiredBandwidth(int requiredBandwidth) {
        this.requiredBandwidth = requiredBandwidth;
    }

    public OpticalNode getSrcNode() {
        return srcNode;
    }

    public OpticalNode getDestNode() {
        return destNode;
    }

    public int getRequiredBandwidth() {
        return requiredBandwidth;
    }

    public ServiceEvent(int eventId, long arriveTime, long holdTime) {
        this.setEventType(EventType.SerArrival);
        this.setEventId(eventId);
        this.setArriveTime(arriveTime);
        this.setHoldTime(holdTime);
        this.setStartTime(arriveTime);
    }
}
