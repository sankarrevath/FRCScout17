/**
 * @(#)FRCScout.java
 *
 * FRCScout 2017 - STEAMWORKS
 *
 * @Revath Sankar 
 * @version 1.00 2017/3/9
 */
import java.util.Scanner; 
public class FRCScout {
    
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Team Number: ");
    		int number = scan.nextInt();
    		
    		//autonomous scoring
    		System.out.println("Auton Rotors: ");
    			double autonrotors = scan.nextDouble();
    		System.out.println("Average Balls in high goal (auton): ");
    			double autonballhigh = scan.nextDouble();
    		System.out.println("Average Balls in low goal (auton): ");
    			double autonballslow = scan.nextDouble();
    		System.out.println("Base Line: ");
    			double baseline = scan.nextDouble();
    		
    		
    		double autonrotorsf = autonrotors * 60;
    		double autonhighfinal = autonballhigh * 1;
    		double autonlowfinal = autonballslow * 0.33333;
    		double baselinefinal = baseline * 5;
    		
    		
    		double autonscore = autonrotorsf + autonhighfinal + autonlowfinal + baselinefinal;
    		
    		//teleop scoring
    		System.out.println("Auton Score =  " + autonscore);
    	System.out.println("Teleop Average Gears per match: ");
    		int gear = scan.nextInt();
    	System.out.println("Teleop Avg rotors turning per match: ");
    		double rotor = 	scan.nextDouble();
    	System.out.println("Teleop Shooting (high) bps (balls per second) ");
    		double ball = scan.nextDouble();
    	System.out.println("Teleop Shooting (low) bps (balls per second) ");
    		double balls = scan.nextDouble();
    	System.out.println("Hang: ");
    		int hang = scan.nextInt();
    		
    		
    		
    		
    		//weight per object here
    		double rotorfinal = rotor * 40;
    		double ballhighfinal = ball * 0.333333;
    		double ballslow = balls * 0.111111;
    		double hangfinal = hang * 50;
    		
    		 double totalscore = rotorfinal + ballhighfinal + hangfinal + ballslow;
    		System.out.println("Team: " + number + " scored approximately: " + totalscore + " per match");
    		
    		//compatibility testing
    		
    		double comprotor = rotor * 2;
    		double compballhigh = ball * 1;
    		double comphang = hang * 1.5;
    		double compballs = balls * 0.333;
    		double autoncomprotor = autonrotors * 3;
    		double autoncomphigh = autonballhigh * 2.25;
    		double autoncomplow = autonballslow * 1.5;
    		double autonbaseline = baseline * 1.25;
    		
    		double compatibility = comprotor + compballhigh + comphang + compballs + autoncomprotor + autoncomphigh + autoncomplow + autonbaseline ;
    		System.out.println("Compatibility Index: " + compatibility);
    		
    		scan.close();
    		
    		
    		
    
    }
}
