package net.krizic.conference;

public interface RoomService {
	void addRoom( Room r );
	void updateRoom( Room r );
	void deleteRoom( String id );
}
