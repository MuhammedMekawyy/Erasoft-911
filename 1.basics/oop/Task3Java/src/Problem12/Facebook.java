package Problem12;

class Facebook {

    private int id;
    private String text;
    private String image;

    public Facebook(int id, String text) {
        this.id = id;
        this.text = text;
        this.image = null; // no image
    }

    public Facebook(int id, String text, String image) {
        this.id = id;
        this.text = text;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getText() {
        return text;
    }
}