package NetworkElements;

import javafx.util.Pair;

/**
 * 光链路定义。
 *
 * 包括：
 *  （1）基本属性：源宿节点对、链路连通性、链路总带宽、链路被占用带宽。
 *  （2）构造器：构造器、Getter/Setter。
 */
public class OpticalLink {
    private Pair<OpticalNode, OpticalNode> srcDst;
    private boolean isConnect;
    private int maxBandwidth;
    private int reservedBandwidth;

    public void setSrcDst(Pair<OpticalNode, OpticalNode> srcDst) {
        this.srcDst = srcDst;
    }

    public void setIsConnect(boolean isConnect) {
        this.isConnect = isConnect;
    }

    public void setMaxBandwidth(int maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public void setReservedBandwidth(int reservedBandwidth) {
        this.reservedBandwidth = reservedBandwidth;
    }

    public Pair<OpticalNode, OpticalNode> getSrcDst() {
        return srcDst;
    }

    public boolean isConnect() {
        return isConnect;
    }

    public int getMaxBandwidth() {
        return maxBandwidth;
    }

    public int getReservedBandwidth() {
        return reservedBandwidth;
    }
}
