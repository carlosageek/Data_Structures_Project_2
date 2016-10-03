package p1;

import java.util.ArrayList;

/*
 * Created by Carlos Estrada on 9/19/2016.
 */
class Method1 extends Methods{
    private ArrayList<Artist> artist = new ArrayList<>();
    private int size;

    Method1() {
        System.out.println("Method 1:");
        double startTime = System.currentTimeMillis();
        ReadArtist artistFile = new ReadArtist();
        artist = artistFile.readFile(artist);
        artistFile.closeFile();
        size = artist.size();
        part2();
        double stopTime = System.currentTimeMillis();
        double elapseTime = stopTime - startTime;
        System.out.printf("StartTime = " + startTime + " StopTime = " + stopTime + " ElapseTime = " + elapseTime + "\n\n");
    }

    @Override
    public void add(String name){
        artist.add(new Artist(name,size));
        size++;
    }

    @Override
    public void delete(int id){
        boolean found = false;
        for (int i = 0; i < artist.size(); i++) {
            if (id == artist.get(i).getID()) {
                found = true;
                artist.remove(i);
                artist.trimToSize();
            }
        }
        if(found)
            System.out.printf("%d : Deleted\n", id);
        else
            System.out.printf("%d : Not Found!\n", id);
    }
}
