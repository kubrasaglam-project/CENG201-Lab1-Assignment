public class Track {

    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    // TODO 1: Full constructor
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
        this.isExplicit = isExplicit;
    }

    // TODO 2: Title + artist constructor
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    // TODO 3: Title-only constructor
    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    // TODO 4: Default constructor
    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    // TODO 5: Getters
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getDurationSeconds() { return durationSeconds; }
    public boolean isExplicit() { return isExplicit; }

    // TODO 6: getDurationFormatted()
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    // TODO 7: toString()
    @Override
    public String toString() {
        String output = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";
        if (isExplicit) {
            output += " [EXPLICIT]";
        }
        return output;
    }
}