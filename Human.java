package когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.Person;

public class Human implements Person {
    private final String name;
    private final int jumpHeight;
    private final int runLength;

    public Human(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public int runDistance() {
        System.out.printf("Human %s способен прыгнуть %d%n", this.name, this.runLength);
        return this.runLength;
    }

    @Override
    public int jumpHeight() {
        System.out.printf("Human %s может пробежать %d%n", this.name, this.jumpHeight);
        return this.jumpHeight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", runLength=" + runLength +
                '}';
    }
}
