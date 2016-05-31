package NetworkElements;

import java.util.List;

/**
 * 光网络业务路径，用于算路和路由。
 *
 */
public class OpticalPath {
    private List<OpticalNode> singlePath;

    public List<OpticalNode> getSinglePath() {
        return singlePath;
    }

    public void setSinglePath(List<OpticalNode> singlePath) {
        this.singlePath = singlePath;
    }

}
