package observer.weather.optimal_design;

/**
 * 观察者接口，update用于"推"模式。主题对象调用update方法向观察者们推送消息
* */
public interface Observer {
    public void update(Subject subject);
}
