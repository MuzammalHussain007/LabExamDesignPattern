public class DefensiveBehaviour implements Behaviour {
    @Override
    public int moveCommand() {
        System.out.println("Robot Run");
        return -1;
    }
}
