package repository;

import model.Music;

public interface MusicRepository extends Logable {

    void save(Music music);

    Music findMusicById(Integer id);

    Integer delete(Integer id);

    Music delete(Music music);

}
