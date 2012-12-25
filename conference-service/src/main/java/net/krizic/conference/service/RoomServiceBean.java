package net.krizic.conference.service;

import java.util.List;
import java.util.UUID;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.Path;

import net.krizic.conference.Room;
import net.krizic.conference.RoomService;
import net.krizic.conference.monitoring.Monitored;

@Monitored
@Stateless
@LocalBean
@Path("/room")
public class RoomServiceBean implements RoomService {

	@Inject
	private EntityManager em;

	@Override
	public Room addRoom(Room r) {
		if( r.getId() == null ) {
			r.setId( UUID.randomUUID().toString() );
		}
		em.persist(r);
		return r;
	}

	@Override
	public void updateRoom(String rid, Room r) {
		em.merge(r);
	}

	public void deleteRoom(String id) {
		em.remove(em);
	}

	@Override
	public List<Room> readAllRooms() {
		return em.createQuery("select r from Room r", Room.class)
				.getResultList();
	}

}
