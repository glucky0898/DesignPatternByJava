package observer.weather.optimal_design;
/**
* 主题接口，包含了注册观察者、删除观察者以及向观察者推送服务三个方法
* */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
