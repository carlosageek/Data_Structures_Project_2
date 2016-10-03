package p1;

        import java.io.FileNotFoundException;
        import java.util.Formatter;

public class WriteOut {
    private String FileName;
    private Formatter x;

    WriteOut(String Filename){
        FileName = Filename;
    }

    public String getFileName() {
        return FileName;
    }

    public void openFile (){
        try{
            x = new Formatter(getFileName());
        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
    public void writeArtists(ArtistL list){
        x.format("%d %-30s %-30d %n", list.getID(), list.getName(), list.getNextArtist());
        //digit, string with padding 30, string with padding 20, digit with padding 20, digit with padding 20, %n = new line
    }

    public void closeFile(){
        x.close();
    }
}
