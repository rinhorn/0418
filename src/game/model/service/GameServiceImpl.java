package game.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game.model.domain.Game;
import game.model.domain.Game_Img;
import game.model.repository.GameDAO;
import game.model.repository.Game_ImgDAO;

@Service
public class GameServiceImpl implements GameService {
	@Autowired
	private GameDAO gameDAO;
	@Autowired
	private Game_ImgDAO game_imgDAO;

	public int insert(Game game, String[] img_filename) {
		int result=0;
		gameDAO.insert(game);
		for(int i=0;i<img_filename.length;i++) {
			Game_Img game_img=new Game_Img();
			game_img.setGame(game);
			game_img.setImg_filename(img_filename[i]);
			game_imgDAO.insert(game_img);
		}
		result=1;
		return result;
	}

	public List selectAll() {
		return null;
	}

	public Game select(int game_id) {
		return null;
	}

	public void update(Game game) {

	}

	public void delete(int game_id) {

	}
}
