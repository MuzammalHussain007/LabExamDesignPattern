public class PaperWrapper extends Decorator {
    public Bouteqe bouteqe;

    public PaperWrapper(Bouteqe bouteqe) {
        this.bouteqe = bouteqe;
    }

    @Override
    public double cost() {
        return 40+bouteqe.cost();
    }

    @Override
    public String getDescription() {
        return "PapperWrapper"+bouteqe.getDescription();
    }
}
