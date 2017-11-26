package repository;

import model.Music;

public class MusicRepositoryImpl implements MusicRepository {

    private Integer IndexOfEmptyMusicPosition;
    private static Music[] cds;
    public MusicRepositoryImpl(Music[] cds) {
        this.cds = cds;
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
    public void save(Music music) {
        Music foundmusic = findMusicById(music.getId());
        if (foundmusic == null) {
            IndexOfEmptyMusicPosition = getIndexOfEmptyMusicPosition();
            if (isMusicAccessibleToAddNewMusic()) {
                cds[IndexOfEmptyMusicPosition] = music;
            }
        }

    }

    @Override
    public Music findMusicById(Integer id) {
        for (Music music: cds) {
            if (musicExists(music, id)) {
                return music;
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
    public Music delete(Music music) {
        // TODO Auto-generated method stub
        return null;
    }

    private Integer getIndexOfEmptyMusicPosition() {
        Integer index = 0;
        for (Music music: cds) {
            if (music ==  null) {
                return index;
            }
            index++;
        }
        return index;

    }
    private Boolean isMusicAccessibleToAddNewMusic() {
        return IndexOfEmptyMusicPosition != null && IndexOfEmptyMusicPosition < cds.length;
    }

    private Boolean musicExists(Music music, Integer id) {
        return music != null && music.getId().equals(id);
    }
}
