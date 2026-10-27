package First;

public class Vector2D {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Vector2D(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getDx() {
        return this.x2 - this.x1;
    }

    public double getDy() {
        return this.y2 - this.y1;
    }

    public Vector2D add(Vector2D other) {
        double totalDx = this.getDx() + other.getDx();
        double totalDy = this.getDy() + other.getDy();

        double newX1 = this.x1;
        double newY1 = this.y1;
        double newX2 = newX1 + totalDx;
        double newY2 = newY1 + totalDy;

        return new Vector2D(newX1, newY1, newX2, newY2);
    }

    public double scalar(Vector2D other){
        return (this.getDx() * other.getDx() + this.getDy() * other.getDy());
    }

    public Vector2D multiply(double k){
        double newDx = this.getDx() * k;
        double newDy = this.getDy() * k;

        return new Vector2D(this.x1, this.y1, this.x1 + newDx, this.y1 + newDy);
    }

    public double len(){
        return Math.sqrt(Math.pow(this.getDx(),2) + Math.pow(this.getDy(),2));
    }

    @Override
    public String toString() {
        return "Firsth.Vector2D: (" + this.x1 + ", " + this.y1 + ") -> (" + this.x2 + ", " + this.y2 + ")";
    }
}
