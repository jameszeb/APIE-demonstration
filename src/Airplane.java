public abstract class Airplane {
    int weight;
    String length;

    public Airplane(int weight, String length) {
        this.weight = weight;
        this.length = length;
    }
    public Airplane(){};

    public int getWeight() {
        return weight;
    }

    public String getLength() {
        return length;
    }
}
