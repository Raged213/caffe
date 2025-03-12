public class Choco {
    Size size;
    private String skum;

public String getSkum() {
return skum;
}
public void setSkum(String skum) {
this.skum = skum;
}

public Choco(String skum, String size){
this.skum = skum;
this.size = Size.valueOf(size);

}
}
