public class Cup {
    public String name;

    public Cup(String coffeeName) {
        this.name = coffeeName;
    }

    public String getName() {
        return name;
    }

    public class SortKaffe {
        public String size;

        public SortKaffe(String coffeeName, String size) {
            name = coffeeName;
            this.size = size;
        }

        public String customCoffee() {
            return "Coffee: " + name + ", Size: " + size;
        }
    }

    public static void main(String[] args) {
        Cup myCup = new Cup("Latte");
        Cup.SortKaffe mySortKaffe = myCup.new SortKaffe("Latte", "Large");

        System.out.println(mySortKaffe.customCoffee());
    }
}
