package p1;

import java.util.ArrayList;

/*
 * Created by Carlos Estrada on 9/19/2016.
 */
class Method3 extends Methods{
    private ArrayList<ArtistL> artistL = new ArrayList<>();

    Method3(){
        System.out.println("Method 3:");
        double startTime = System.currentTimeMillis();
        ReadArtistL artistLFile = new ReadArtistL();
        artistL = artistLFile.readFile(artistL);
        artistLFile.closeFile();
        part2();
        double stopTime = System.currentTimeMillis();
        double elapseTime = stopTime - startTime;
        System.out.printf("StartTime = " + startTime + " StopTime = " + stopTime + " ElapseTime = " + elapseTime + "\n");
    }

    @Override
    public void add(String name){
        int i = artistL.size();
        artistL.add(new ArtistL(name, (i + 1), -1));
        artistL.get(i - 1).setNextArtist(i);
    }

    @Override
    public void delete(int id){
        boolean found = false;
        int i = 0;
        while (i > -1){
            if (artistL.get(i).getID() == id && artistL.get(i).getNextArtist() != 0){
                found = true;
                artistL.get(i).setNextArtist(0);
                artistL.get(id-2).setNextArtist(i);
            } else if (artistL.get(i).getNextArtist() == -1){
                i = -1;
            }else
                i++;
        }

        if(found)
            System.out.printf("%d : Deleted\n", id);
        else
            System.out.printf("%d : Not Found!\n", id);
    }
}
