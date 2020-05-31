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
        //Cleared = Values are ready
        //Not Cleared = Impact Value is incorrect

           //I found a site for precision modifiers but I am unsure if they are correct.
           //I can check with what I have so far but still unsure.
           //I think using in game data that is hard coded would be better. 



//Hand Cannons: Cleared
//Total: 4 
weps[0] = new weapon ("Hand Cannon", 110, 92); 
weps[1] = new weapon ("Hand Cannon", 140, 70);
weps[2] = new weapon ("Hand Cannon", 150, 68);
weps[3] = new weapon ("Hand Cannon", 180, 57);

//Auto Rifles: Cleared
//Total: 4 
weps[4] = new weapon ("Auto Rifle", 360, 35);
weps[5] = new weapon ("Auto Rifle", 450, 27);
weps[6] = new weapon ("Auto Rifle", 600, 25);
weps[7] = new weapon ("Auto Rifle", 720, 20);

//Pulse Rifles: Cleared
//Total: 4 
weps[8] = new weapon ("Pulse Rifle", 340, 34);
weps[9] = new weapon ("Pulse Rifle", 390, 31);
weps[10] = new weapon ("Pulse Rifle", 450, 25);
weps[11] = new weapon ("Pulse Rifle", 540, 24);

//Scout Rifles: Cleared 
//Total: 4
wep[12] = new weapon ("Scout Rifle", 150, 68);
wep[13] = new weapon ("Scout Rifle", 180, 38);
wep[14] = new weapon ("Scout Rifle", 200, 54);
wep[15] = new weapon ("Scout Rifle", 260, 47);

//Submachine Guns: Cleared (-1 archetype.)
//Total: 3
wep[16] = new weapon ("Submachine Gun", 600, 23);
wep[17] = new weapon ("Submachine Gun", 750, 22);
wep[18] = new weapon ("Submachine Gun", 900, 17);

//Sidearms: Cleared (+1 Archetype)
//We may need a new formula for 491 (3 Burst Side Arms) 
// Total: 5
wep[19] = new weapon ("Sidearm", 260, 57);
wep[20] = new weapon ("Sidearm", 300, 51);
wep[21] = new weapon ("Sidearm", 360, 44);
wep[22] = new weapon ("Sidearm", 450, 36);
wep[23] = new weapon ("Sidearm", 491, 33); //33*3 = total damage per burst

//Sniper Rifles: Cleared (-1 Archetype) 
//Total: 3
wep[24] = new weapon ("Sniper Rifle", 72, 474);
wep[25] = new weapon ("Sniper Rifle", 90, 387);
wep[26] = new weapon ("Sniper Rifle", 140, 293);

//Linear Fusion Rifles: Cleared  (-1 Archetype)
//Total: 3
wep[27] = new weapon ("Linear Fusion Rifle", 1024, 901);
wep[28] = new weapon ("Linear Fusion Rifle", 533, 497); //THERE ARE DIFFERENT CHARGE TIMES DUE TO GUN PERKS 
wep[29] = new weapon ("Linear Fusion Rifle", 633, 542);

//Slug Shotguns: Cleared (-2 Archetype)
//Total: 2
wep[30] = new weapon ("Slug Shotgun", 65, 264);
wep[31] = new weapon ("Slug Shotgun", 70, 264);


//Shotguns: Cleared 
//Total: 4
wep[32] = new weapon ("Shotgun", 55, 25); //25*11= total damage per pellete spread
wep[33] = new weapon ("Shotgun", 60, 23); //23*11 = total damage per pellete spread
wep[34] = new weapon ("Shotgun", 80,19 ); //19*11 = total damage per pellete spread
wep[35] = new weapon ("Shotgun", 140, 17); //17*11 = total damage per pellete spread

//Bows: Not Cleared (Test Wish Ender) (-1 Archetype)
//Total: 3+ (?)_(for now 2+ due to Draw Time Inconsist.)
//Create Formula for Draw Speed -> Impact
wep[36] = new weapon ("Bow", 576, 138);
wep[37] = new weapon ("Bow", 612, 151);
wep[38] = new weapon ("Bow", 756, 156);

//Fusion Rifles: Not Cleared (Gather Data) (? Archetypes/Charge Times)
//Total: 3-4 Frames (Use 3 Blues, One Purple) 
//Create Formula for Charge time -> Impact

//Trace Rifles: Cleared (-1 Archetypes)
Total: 3 (all are 1000 RPM, so we took average of 3 damage variations due to Exotic perks)
wep[39] = new weapon ("Trace Rifle", 1000, 18);

//Rocket Launcher: Cleared (-1 Archetype)
Total: 3
wep[40] = new weapon ("Rocket Launcher", 10, 300);
wep[41] = new weapon ("Rocket Launcher", 15, 300);
wep[42] = new weapon ("Rocket Launcher", 20, 300);

//Machine Gun: Cleared (-1 Archetype)
Total: 3
wep[43] = new weapon ("Machine Gun", 450, 41);
wep[44] = new weapon ("Machine Gun", 360, 48);
wep[45] = new weapon ("Machine Gun", 900, 24);

//Grenade Launcher: Cleared 
Total: 4
wep[46] = new weapon ("Grenade Launcher", 72, 158); // The on hit damage = 28 + Splash damage (130) = 158
wep[47] = new weapon ("Grenade Launcher", 90, 182); 
wep[48] = new weapon ("Grenade Launcher", 120, 226);
wep[49] = new weapon ("Grenade Launcher", 150, 174); //The on hit damage = 72 + Splash damage (153) = 174
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
