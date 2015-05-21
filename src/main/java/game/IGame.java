package game;

import java.util.ArrayList;
import java.util.List;

import player.Computer;
import player.Human;
import player.Player;
//сомневаюсь в необходимости этого интерфейса
public interface IGame{
	public void start();
	public void play();
	public  void end() ;
	
}
