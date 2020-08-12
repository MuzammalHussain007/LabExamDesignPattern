public class GlitterOrnamental extends Decorator {
    Bouteqe bouteqe ;

    public GlitterOrnamental(Bouteqe bouteqe) {
        this.bouteqe = bouteqe;
    }

    @Override
    public double cost() {
        return 60+bouteqe.cost();
    }

    @Override
    public String getDescription() {
        return "GlitterOrnament"+bouteqe.getDescription();
    }
}
