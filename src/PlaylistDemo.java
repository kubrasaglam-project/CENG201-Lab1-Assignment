public class PlaylistDemo {

    public static void main(String[] args) {
        System.out.println("=== Playlist Track Demo ===\n");

        // --- Default constructor ---
        System.out.println("Default Track: ");
        Track track1 = new Track();
        System.out.println(track1.toString() + "\n");

        // --- Title-only constructor ---
        System.out.println("Title-only track:");
        Track track2 = new Track("Neon Lights");
        System.out.println(track2.toString() + "\n");

        // --- Title + artist constructor ---
        System.out.println("Title + Artist Track:");
        Track track3 = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println(track3.toString() + "\n");

        // --- Full constructor ---
        System.out.println("Full Track (non-explicit):");
        Track track4 = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println(track4.toString() + "\n");

        // --- Invalid duration test ---
        System.out.println("Invalid Duration Test:");
        Track track5 = new Track("Broken Clock", "Static Noise", -10, false);
        System.out.println(track5.toString() + "\n");

        // --- Getter test ---
        System.out.println("Getter Test:");
        Track track6 = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Title:     " + track6.getTitle());
        System.out.println("Artist:    " + track6.getArtist());
        System.out.println("Duration:  " + track6.getDurationFormatted());
        System.out.println("Explicit:  " + track6.isExplicit());
    }
}