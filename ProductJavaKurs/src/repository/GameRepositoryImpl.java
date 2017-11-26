package repository;

import model.Game;

public class GameRepositoryImpl implements GameRepository {

    private Integer IndexOfEmptyGamePosition;
    private static Game[] games;
    public GameRepositoryImpl(Game[] games) {
        this.games = games;
    }


    @Override
    public void before() {
        // TODO Auto-generated method stub

    }

    @Override
    public void after() {
        // TODO Auto-generated method stub

    }

    @Override
    public void save(Game game) {
        Game foundgame = findGameById(game.getId());
        if (foundgame == null) {
            IndexOfEmptyGamePosition = getIndexOfEmptyGamePosition();
            if (isGameAccessibleToAddNewGame()) {
                games[IndexOfEmptyGamePosition] = game;
            }
        }

    }

    @Override
    public Game findGameById(Integer id) {
        for (Game game: games) {
            if (gameExists(game, id)) {
                return game;
            }
        }
        return null;
    }

    @Override
    public Integer delete(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Game update(Game game) {
        // TODO Auto-generated method stub
        return null;
    }

    private Integer getIndexOfEmptyGamePosition() {
        Integer index = 0;
        for (Game game: games) {
            if (game == null) {
                return index;
            }
            index++;
        }
        return index;
    }



    private Boolean isGameAccessibleToAddNewGame() {
        return IndexOfEmptyGamePosition != null && IndexOfEmptyGamePosition < games.length;
    }

    private Boolean gameExists(Game game, Integer id) {
        return game != null && game.getId().equals(id);
    }
}
