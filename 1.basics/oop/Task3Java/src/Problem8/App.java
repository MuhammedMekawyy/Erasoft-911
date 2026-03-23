package Problem8;
//Please Create App facebook & LinkedIn api for posts that accept (id,text,image) and show them
//Look!
//on facbook please print that you are on application facebook
//on LinkedIn please print that you are on application LinkedIn

public abstract class App {
    private int id ;
    private String text;

    public App(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public abstract void print();
}
