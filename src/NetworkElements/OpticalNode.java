package NetworkElements;

/**
 * 光节点定义.
 *
 * 包括：
 * （1）基本属性:波长一致性、波长连续性、节点ID。
 * （2）构造器：构造器、Getter/Setter。
 */
public class OpticalNode {
    private boolean waveConsistency;
    private boolean waveContinuity;
    private int nodeId;

    public OpticalNode(int nodeId, boolean waveConsis, boolean waveContin) {
        this.waveConsistency = waveConsis;
        this.waveContinuity = waveContin;
        this.nodeId = nodeId;
    }

    public boolean isWaveContinuity() {
        return waveContinuity;
    }

    public boolean isWaveConsistency() {
        return waveConsistency;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setWaveConsistency(boolean waveConsistency) {
        this.waveConsistency = waveConsistency;
    }

    public void setWaveContinuity(boolean waveContinuity) {
        this.waveContinuity = waveContinuity;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }
}
