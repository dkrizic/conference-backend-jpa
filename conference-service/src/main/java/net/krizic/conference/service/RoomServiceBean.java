package net.krizic.conference.service;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import net.krizic.conference.Room;
import net.krizic.conference.RoomService;
import net.krizic.conference.monitoring.Monitored;

@Monitored
public class RoomServiceBean implements RoomService {

	@Inject
	private EntityManager em;

	public void addRoom(Room r) {
		em.persist( em );
	}

	public void updateRoom(Room r) {
		em.merge( em );
	}

	public void deleteRoom(String id) {
		em.remove( em );
	}

}
