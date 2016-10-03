package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Created by Carlos Estrada on 9/19/2016.
 */
abstract class Methods implements ArtistInterface{
    private Scanner fileChange;

    void part2(){
        try {
            fileChange = new Scanner(new File("C:\\Users\\carli\\Documents\\School\\Project 2\\src\\files\\p2changes.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        fileChange.useDelimiter("\t|\r\n");
        while(fileChange.hasNext()){
            String codeStr = fileChange.next();
            if (codeStr.charAt(0) == 'D') {
                delete(fileChange.nextInt());
            } else if(codeStr.charAt(0) == 'A'){
                add(fileChange.next());
            } else
                System.out.println("Somethings wrong! Code unrecognized!");
        }
        fileChange.close();
    }
}
