package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Created by Carlos Estrada on 9/19/2016.
 */
class ReadArtistL {
    private Scanner fileArtist;

    ReadArtistL(){
        try {
            fileArtist = new Scanner(new File("C:\\Users\\carli\\Documents\\School\\Project 2\\src\\files\\p1artists.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    ArrayList<ArtistL> readFile(ArrayList<ArtistL> list) {
        fileArtist.useDelimiter("\t|\r\n");
        while(fileArtist.hasNext()){
            int id = fileArtist.nextInt();
            String name = fileArtist.next();
            int nextID;
            if (!fileArtist.hasNext())
                nextID = -1;
            else
                nextID = id + 1;
            list.add(new ArtistL(name,id,nextID));
        }
        return list;
    }

    void closeFile(){
        fileArtist.close();
    }
}
