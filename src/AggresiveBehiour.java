public class AggresiveBehiour implements Behaviour {
    @Override
    public int moveCommand() {
        System.out.println("attack");
        return 1;
    }

}
