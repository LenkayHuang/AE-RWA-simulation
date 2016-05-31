package Events;

import NetworkElements.OpticalLink;
import NetworkElements.OpticalNode;

/**
 * ����������¼��ࡣ
 *
 */

public class FaultEvent extends Event{

    private FaultType faultType;
    private OpticalLink faultLink;//������·
    private OpticalNode faultNode;//���Ͻڵ�

    public FaultType getFaultType() {
        return faultType;
    }

    public OpticalLink getFaultLink() {
        return faultLink;
    }

    public OpticalNode getFaultNode() {
        return faultNode;
    }

    public void setFaultType(FaultType faultType) {
        this.faultType = faultType;
    }

    public void setFaultLink(OpticalLink faultLink) {
        this.faultLink = faultLink;
    }

    public void setFaultNode(OpticalNode faultNode) {
        this.faultNode = faultNode;
    }

    public FaultEvent(int eventId, long arriveTime, long holdTime) {
        this.setEventType(EventType.FaultArrival);
        this.setEventId(eventId);
        this.setArriveTime(arriveTime);
        this.setHoldTime(holdTime);
        this.setStartTime(arriveTime);
    }
}
