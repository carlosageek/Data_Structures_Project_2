package p1;

class Artist{
    private String name;
    private int id;


    Artist(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String arg) {
        this.name = arg;
    }

    int getID() {
        return id;
    }

    void setID(int arg) {
        this.id = arg;
    }

    public String toString(){
        return (id + "\t" + name);
    }
}