public class RibbomBow extends Decorator {
    public Bouteqe bouteqe;

    public RibbomBow(Bouteqe bouteqe) {
        this.bouteqe = bouteqe;
    }

    @Override
    public double cost() {
        return 50+bouteqe.cost();
    }

    @Override
    public String getDescription() {
        return "RibbomBom"+bouteqe.getDescription();
    }
}
