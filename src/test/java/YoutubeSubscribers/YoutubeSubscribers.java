package YoutubeSubscribers;

import PatternBased.ClashOfClans.Actors.Barbarian;
import PatternBased.ClashOfClans.Actors.Dragon;
import PatternBased.YoutubeSubscribers.Actors.Channel;
import PatternBased.YoutubeSubscribers.Actors.User;
import org.junit.Test;

public class YoutubeSubscribers {

    @Test
    public void clashOfClans() {

        Channel channel = new Channel("Furkan's Channel");

        User user = new User("Emily");


        channel.subscribe(user);
        channel.videoUpload("How to do this");

    }
}
