package PatternBased.YoutubeSubscribers.Actors;

import PatternBased.YoutubeSubscribers.Interface.Observer;
import PatternBased.YoutubeSubscribers.Interface.Subject;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    String name;
    List<Observer> subscribers;

    public Channel(String name) {
        this.name = name;
        subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyAllObserver(String message) {
        for(Observer o : subscribers)
            o.update("Channel name " + name + " - " + message);
    }

    public void videoUpload(String videoName) {
        notifyAllObserver(videoName);
    }
}
