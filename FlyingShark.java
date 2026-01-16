public class FlyingShark extends Shark implements Flyable {
    @Override
    public void fly() {
        System.out.println("FlyingShark is gliding through the air! ");
    }

    // Inherit eat(Fish fish) from Shark class automatically

    // Overload eat method to handle Flyable creatures
    public void eat(Flyable creature) {
        System.out.println("FlyingShark caught a flying creature!");
    }
}