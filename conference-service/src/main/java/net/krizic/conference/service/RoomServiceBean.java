package net.krizic.conference.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import net.krizic.conference.Room;
import net.krizic.conference.RoomService;
import net.krizic.conference.monitoring.Monitored;

@Monitored
@Stateless
@LocalBean
public class RoomServiceBean implements RoomService {

	@Inject
	private EntityManager em;

	@Override
	public void addRoom(Room r) {
		em.persist(em);
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
