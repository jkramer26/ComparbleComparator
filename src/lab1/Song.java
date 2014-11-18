package lab1;

import java.util.Objects;

/**
 *
 * @author jkramer26
 */
public class Song implements Comparable<Song>{
    private String trackName; 
    private int trackNumber;
    private int albumId;
    private int artistId;
    private int genreId;

    public Song(String trackName, int trackNumber, int albumId, int artistId, int genreId) {
        this.trackName = trackName;
        this.trackNumber = trackNumber;
        this.albumId = albumId;
        this.artistId = artistId;
        this.genreId = genreId;
    }
    
    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
    
    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
    
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.trackName);
        hash = 29 * hash + this.albumId;
        hash = 29 * hash + this.artistId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.trackName, other.trackName)) {
            return false;
        }
        if (this.albumId != other.albumId) {
            return false;
        }
        if (this.artistId != other.artistId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Song{" + "trackName=" + trackName + ", trackNumber=" + trackNumber + ", albumId=" + albumId + ", artistId=" + artistId + ", genreId=" + genreId + '}';
    }

    

    @Override
    public int compareTo(Song e) {
        Song o = (Song)e;
        
        final int BEFORE = -1;
	final int EQUAL = 0;
	final int AFTER = 1;
//        
//        if(this.equals(e)) return EQUAL;
//        if(this.trackNumber > e.trackNumber) return AFTER;
//        if(this.trackNumber < e.trackNumber) return BEFORE;
        
        int comparison = this.trackName.compareTo(e.getTrackName());
        if( comparison != EQUAL) return comparison;
        
        return EQUAL; // default
    }
    
    
    
    
    
    
    
}
