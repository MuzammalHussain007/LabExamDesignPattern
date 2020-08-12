public class Robot {
    String name;
    Behaviour behaviour;

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }
    public void move()
    {
        System.out.println("BASED ON CURRENT POSITION  BEhivour Object Decide "+name);
        int command= behaviour.moveCommand();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot(String name) {
        this.name = name;
    }
}
