package com.epam.rd.autotasks;

/**
 * Represents a song described by its title, artist and release year.
 * Values are supplied from {@code application.properties} by
 * {@link com.epam.rd.autotasks.config.SongConfig}.
 */
public class Song {

    private String title;
    private String artist;
    private String year;

    /**
     * Creates an empty song.
     */
    public Song() {
    }

    /**
     * Creates a song with all attributes set.
     *
     * @param title  title of the song
     * @param artist performer of the song
     * @param year   release year of the song
     */
    public Song(String title, String artist, String year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{title='" + title + "', artist='" + artist + "', year='" + year + "'}";
    }
}
