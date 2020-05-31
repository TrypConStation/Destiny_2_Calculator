import java.util.Scanner;

public class Destiny_2_Calculator {
    //Menu Credit: Tryp_Con_Station
    static Scanner input = new Scanner(System.in);
    static String equation = "";

    public static void main(String[] args) throws ArithmeticException {
        String response = "";
        do
        {
            System.out.println("Choose a function: \n1: Weapon Calculation");
            int res = input.nextInt();
            Weapon_Consistancy();
            input.nextLine();
            System.out.println("Preform another calculation? (y/n)");
            input.hasNextLine();
            response = input.nextLine();
        } while (response.equalsIgnoreCase("y"));
        System.out.println("Thank you Guardian.");
    }

    // Weapon Stats (GENERIC FORMULA TEST NOT OFFICIAL)
    public static double Weapon_Consistancy()
    {
        weapon [] weapons = new weapon [44];
        populateArray(weapons);
        System.out.println(weapons[0].name + " " + weapons[0].rpm + " " + weapons[0].impact);
        System.out.println("Provide the Weapon's Numerical Values:");
        // Bad or Good
        int HOLD_MY_BEER = 4;
        int Amazing = 3;
        int Great = 2;
        int Good = 1;
        int Bad = 0;
        // Impact
        System.out.println("Impact Value: ");
        double impact = input.nextDouble();
        // Range
        System.out.println("Range Value: ");
        double range = input.nextDouble();
        double FinalRange = range/10;
        if (FinalRange >= 8) {
            FinalRange = HOLD_MY_BEER;
        }
        else if (FinalRange >= 6) {
            FinalRange = Amazing;
        }
        else if (FinalRange >= 5.5) {
            FinalRange = Great;
        }
        else if (FinalRange >= 4.5) {
            FinalRange = Good;
        }
        else {
            FinalRange = Bad;
        }
        // Stability
        System.out.println("Stability Value: ");
        double stability = input.nextDouble();
        double FinalStability = stability/10;
        if (FinalStability >= 8) {
            FinalStability = HOLD_MY_BEER;
        }
        else if (FinalStability >= 6) {
            FinalStability = Amazing;
        }
        else if (FinalStability >= 5.5) {
            FinalStability = Great;
        }
        else if (FinalStability >= 4.5) {
            FinalStability = Good;
        }
        else {
            FinalStability = Bad;
        }
        // Handling
        System.out.println("Handling Value: ");
        double handling = input.nextDouble();
        double FinalHandling = handling/10;
        if (FinalHandling >= 8) {
            FinalHandling = HOLD_MY_BEER;
        }
        else if (FinalHandling >= 6) {
            FinalHandling = Amazing;
        }
        else if (FinalHandling >= 5.5) {
            FinalHandling = Great;
        }
        else if (FinalHandling >= 4.5) {
            FinalHandling = Good;
        }
        else {
            FinalHandling = Bad;
        }
        // Aim Assistance
        System.out.println("Aim Assistance Value: ");
        double aim_assist = input.nextDouble();
        double FinalAim_Assist = aim_assist/10;
        if (FinalAim_Assist >= 8) {
            FinalHandling = HOLD_MY_BEER;
        }
        else if (FinalAim_Assist >= 6) {
            FinalAim_Assist = Amazing;
        }
        else if (FinalAim_Assist >= 5.5) {
            FinalAim_Assist = Great;
        }
        else if (FinalAim_Assist >= 4.5) {
            FinalAim_Assist = Good;
        }
        else {
            FinalAim_Assist = Bad;
        }
        // Recoil
        System.out.println("Recoil Value: ");
        double recoil = input.nextDouble();
        double FinalRecoil = recoil/10;
        if (FinalRecoil >= 8) {
            FinalRecoil = HOLD_MY_BEER;
        }
        else if (FinalRecoil >= 6) {
            FinalRecoil = Amazing;
        }
        else if (FinalRecoil >= 5.5) {
            FinalRecoil = Great;
        }
        else if (FinalRecoil >= 4.5) {
            FinalRecoil = Good;
        }
        else {
            FinalRecoil = Bad;
        }
        // Rounds Per Minute
        System.out.println("Rounds Per Minute Value: ");
        double RPM = input.nextDouble();
        // Damage Per Second
        double DPS = impact * RPM / 60;
        System.out.println("Your Optimal Damage Per Second is: ");
        System.out.println(DPS);
        // Consistency
        System.out.println("Your Weapon Consistency is: ");
        double FinalConsistency = FinalRange + FinalStability + FinalHandling + FinalAim_Assist + FinalRecoil / 5;
        System.out.println(FinalConsistency);
        return FinalConsistency;
    }

    public static weapon [] populateArray(weapon [] weps) {
        weps[0] = new weapon ("Hand Cannon", 100, 92);
        return weps;
    }

    private static class weapon {
        String name;
        int rpm;
        int impact;
        double chargeTime;
        double drawTime;
        boolean bow;

        weapon (String n, int rpm, int impact) {
            this.name = n;
            this.rpm = rpm;
            this.impact = impact;
        }

        weapon (String n, int rpm, double ct, int impact) {
            this.name = n;
            this.rpm = rpm;
            this.chargeTime = ct;
            this.impact = impact;
        }

        weapon (String n, int rpm, double dt, int impact, boolean bow) {
            this.name = n;
            this.rpm = rpm;
            this.chargeTime = dt;
            this.impact = impact;
            this.bow = bow;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRpm() {
            return rpm;
        }

        public void setRpm(int rpm) {
            this.rpm = rpm;
        }

        public int getImpact() {
            return impact;
        }

        public void setImpact(int impact) {
            this.impact = impact;
        }
    }
}
