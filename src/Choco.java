public class Choco {
    private Size size;
    private boolean skum;

    public boolean getSkum() {
        return skum;
    }

    public void setSkum(boolean skum) {
        this.skum = skum;
    }

    public Choco(boolean skum, String size) {
        this.skum = skum;
        this.size = Size.valueOf(size);
    }

    @Override

    public String toString() {
        return this.size + " - " + this.skum;
    }
}
