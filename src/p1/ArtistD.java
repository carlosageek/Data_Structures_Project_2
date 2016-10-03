package p1;

/**
 * Created by Carlos Estrada on 9/14/2016.
 *
 */
class ArtistD extends Artist{
    private boolean deleteByte;
    ArtistD(int id, String name, boolean deleteByte) {
        super(name, id);
        this.deleteByte = deleteByte;
    }
    void setDeleteByte(boolean ifDelete){
        this.deleteByte = ifDelete;
    }
    boolean getDeleteByte() {
        return deleteByte;
    }
    @Override
    public String toString(){
        return (super.toString() + "\t" + deleteByte);
    }
}
