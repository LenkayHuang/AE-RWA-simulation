package Events;

/**
 * 光网络事件枚举类。
 *
 */
public enum EventType {
    //业务到达事件
    SerArrival,

    //业务离去事件
    SerEnd,

    //故障到达事件
    FaultArrival,

    //故障离去事件
    FaultEnd,

    //默认事件
    Default
}
