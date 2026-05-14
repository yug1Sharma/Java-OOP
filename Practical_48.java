import java.util.LinkedList;

class Practical_48
{
    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Initial Playlist:");
        System.out.println(playlist);

        System.out.println("\nFull Playlist:");
        for (String song : playlist)
        {
            System.out.println(song);
        }

        if (!playlist.isEmpty())
        {
            String played = playlist.removeFirst();
            System.out.println("\nPlaying: " + played);
            System.out.println("Playlist after playing first song:");
            System.out.println(playlist);
        }

        if (!playlist.isEmpty())
        {
            String skipped = playlist.removeLast();
            System.out.println("\nSkipped: " + skipped);
            System.out.println("Playlist after skipping last song:");
            System.out.println(playlist);
        }

        System.out.println("\nFinal Playlist:");
        System.out.println(playlist);
    }
}