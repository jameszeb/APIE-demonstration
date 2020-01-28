public class Boeing extends Airplane{
    private String color;

    public Boeing(int weight, String length, String color) {
        super(weight, length);
        this.color = color;
    }

    public Boeing(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
