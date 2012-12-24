package net.krizic.conference;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Local
@Path("/room")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface RoomService {

	@GET
	List<Room> readAllRooms();

	@POST
	void addRoom(Room r);

	@PUT
	@Path("{rid}")
	void updateRoom(@PathParam("rid") String rid, Room r);

	@DELETE
	@Path("{rid}")
	void deleteRoom(String rid);
}
