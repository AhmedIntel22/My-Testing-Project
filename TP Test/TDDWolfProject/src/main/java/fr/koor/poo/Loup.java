package fr.koor.poo;

/**
 *
 * @author ahmed
 */

public class Loup {
    private Orientation orientation = Orientation.NORD;

    public Orientation getOrientation() {
        return orientation;
    }
    public void tourner() {
    this.orientation = switch (this.orientation) {
        case NORD  -> Orientation.EST;
        case EST   -> Orientation.SUD;
        case SUD   -> Orientation.OUEST;
        case OUEST -> Orientation.NORD; };
    }
}