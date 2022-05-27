package PatternBased.YoutubeSubscribers.Actors;

import PatternBased.YoutubeSubscribers.Interface.Observer;

public class User implements Observer {

    String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String content) {
        System.out.println("New Update : " + content);
    }
}
