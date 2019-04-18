package game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import game.common.file.FileManager;
import game.model.domain.Category;
import game.model.domain.Game;
import game.model.service.CategoryService;
import game.model.service.GameService;

@RestController
public class GameController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private GameService gameService;
	@Autowired
	private FileManager fileManager;
	
	@RequestMapping(value="/admin/categories", method=RequestMethod.GET)
	public List getCategory() {
		List<Category> ctList=categoryService.selectAll();
		return ctList;
	}
	
	@RequestMapping(value="/admin/games", method=RequestMethod.POST)
	public int registGame(Game game, String[] img_filename) {
		return gameService.insert(game, img_filename);
	}
}
