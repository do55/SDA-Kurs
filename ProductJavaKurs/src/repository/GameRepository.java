package repository;

import model.Game;

public interface GameRepository extends Logable {

    void save(Game game);

    Game findGameById(Integer id);

    Integer delete(Integer id);

    Game update(Game game);

}
