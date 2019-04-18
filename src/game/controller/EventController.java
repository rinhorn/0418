package game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import game.common.file.FileManager;
import game.model.domain.Event_Game;
import game.model.service.EventService;

@RestController
public class EventController {
	@Autowired
	private EventService eventService;
	@Autowired
	private FileManager fileManager;

}
