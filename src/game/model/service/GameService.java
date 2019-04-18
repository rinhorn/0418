package game.model.service;

import java.util.List;

import game.model.domain.Game;
import game.model.domain.Game_Img;

public interface GameService {
	public int insert(Game game, String[] img_filename);
	public List selectAll();
	public Game select(int game_id);
	public void update(Game game);
	public void delete(int game_id);
}
