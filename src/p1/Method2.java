package p1;

import java.util.ArrayList;

/*
 * Created by Carlos Estrada on 9/14/2016.
 */
class Method2 extends Methods{
    private ArrayList<ArtistD> artistD = new ArrayList<>();

    Method2(){
        System.out.println("Method 2:");
        double startTime = System.currentTimeMillis();
        ReadArtistD artistDFile = new ReadArtistD();
        artistD = artistDFile.readFile(artistD);
        artistDFile.closeFile();
        part2();
        double stopTime = System.currentTimeMillis();
        double elapseTime = stopTime - startTime;
        System.out.printf("StartTime = " + startTime + " StopTime = " + stopTime + " ElapseTime = " + elapseTime + "\n\n");
    }

    @Override
    public void add(String name){
        int i = artistD.size() + 1;
        artistD.add(new ArtistD(i,name,false));
    }

    @Override
    public void delete(int id){
        boolean found = false;

        for (ArtistD anArtistD : artistD) {
            if (id == anArtistD.getID() && !anArtistD.getDeleteByte()) {
                found = true;
                anArtistD.setDeleteByte(true);
            }
        }
        if(found)
            System.out.printf("%d : Deleted\n", id);
        else
            System.out.printf("%d : Not Found!\n", id);
    }
}
