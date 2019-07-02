public class Piston {
 
    int PistonLength;
    static int numPistons;
    static int numExtendedPistons;

public static int getNumPistons() {
    return numPistons;
}

public static int getNumExtendedPistons() {
    return numExtendedPistons;
}

public Piston(int PistonLength) {
this.PistonLength = PistonLength;
numPistons++;
}

    public void extend() {
        System.out.println (PistonLength);
        numExtendedPistons++;
    }

    public void retract() {
        System.out.println (PistonLength);
        numExtendedPistons--;
    }

}