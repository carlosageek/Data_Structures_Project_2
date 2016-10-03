package p1;

/*
 * Created by Carlos Estrada on 9/19/2016.
 */
class ArtistL extends Artist {
    private int nextArtist;

    ArtistL(String name, int id, int next) {
        super(name, id);
        this.nextArtist = next;
    }

    int getNextArtist() {
        return nextArtist;
    }

    void setNextArtist(int nextArtist) {
        this.nextArtist = nextArtist;
    }

    @Override
    public String toString(){
        return (super.toString() + "\t" + nextArtist);
    }
}
