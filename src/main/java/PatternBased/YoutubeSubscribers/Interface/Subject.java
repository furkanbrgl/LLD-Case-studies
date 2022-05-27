package PatternBased.YoutubeSubscribers.Interface;

public interface Subject {

    public void subscribe(Observer observer);
    public void unSubscribe(Observer observer);
    public void notifyAllObserver(String message);

}
