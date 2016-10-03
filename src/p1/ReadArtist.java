package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Created by Carlos Estrada on 9/19/2016.
 */
class ReadArtist {
    private Scanner fileArtist;
    ReadArtist(){
        try {
            fileArtist = new Scanner(new File("C:\\Users\\carli\\Documents\\School\\Project 2\\src\\files\\p1artists.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    ArrayList<Artist> readFile(ArrayList<Artist> list) {
        fileArtist.useDelimiter("\t|\r\n");
        while(fileArtist.hasNext()){
            int id = fileArtist.nextInt();
            String name = fileArtist.next();
            list.add(new Artist(name, id));
        }
        return list;
    }
    void closeFile(){
        fileArtist.close();
    }


}
