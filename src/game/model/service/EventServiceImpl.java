package game.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game.model.domain.Event;
import game.model.repository.EventDAO;
import game.model.repository.Event_GameDAO;

@Service
public class EventServiceImpl implements EventService{
	@Autowired
	private EventDAO eventDAO;
	@Autowired
	private Event_GameDAO event_GameDAO;

	public int insert(Event event) {
		int result=0;
		eventDAO.insert(event);
		for(int i=0;) {
			
		}
		
		return result;
	}

	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event select(int event_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int event_id) {
		// TODO Auto-generated method stub
		
	}

}
