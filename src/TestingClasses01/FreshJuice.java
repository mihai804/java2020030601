package TestingClasses01;

public class FreshJuice {
    public enum FreshJuiceSize {big, medium, small}

    private FreshJuiceSize juiceSize;

    public void setJuiceSize(FreshJuiceSize juiceSize) {
        this.juiceSize = juiceSize;
    }

    public FreshJuiceSize getJuiceSize() {
        return juiceSize;
    }
}
