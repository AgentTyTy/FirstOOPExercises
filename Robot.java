import java.util.concurrent.TimeUnit;

public class Robot {
    public static void main(String[] args) {
        Piston frontPiston = new Piston(5);
        Piston backPiston = new Piston(8);
        System.out.println("Number of pistons: " + Piston.getNumPistons());
        frontPiston.extend();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Number of extended pistons: " + Piston.getNumExtendedPistons());

        frontPiston.retract();
        System.out.println("Number of extended pistons: " + Piston.getNumExtendedPistons());


        backPiston.extend();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Number of extended pistons: " + Piston.getNumExtendedPistons());

        backPiston.retract();
        System.out.println("Number of extended pistons: " + Piston.getNumExtendedPistons());

    }
}