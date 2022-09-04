import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        Playlist.add("Riptide");
        Playlist.add("Notion");
        Playlist.add("Disco");
        Playlist.add("False Confidence");
        Playlist.add("Feed the Machine");


        // Adds a new song at the front of the Playlist
        System.out.println(" ");
        Playlist.addFirst("Hell's Comin with Me");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("Prodigal");

        // Display node at the front in the LinkedList
        System.out.println("Playing: " + Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "Devils Price");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
        
    }
}
