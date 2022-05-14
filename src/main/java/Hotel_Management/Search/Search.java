package Hotel_Management.Search;

import Hotel_Management.Enums.RoomStyle;
import Hotel_Management.Hotel.Room;

import java.util.Date;
import java.util.List;

public interface Search {
    public List<Room> search(RoomStyle style, Date startDate, int duration);
}
