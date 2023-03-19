package gui.elements;

/**
 * This class contains elementary graphical tree parameters.
 * 
 * @author Tianxiao.Liu@u-cergy.fr
 */
public class GTParameters {
	
	public static final int WINDOW_WIDTH = 1200;

	public static final int BASIC = WINDOW_WIDTH / 1200;

	public static final int WINDOW_HEIGHT = BASIC * 500;

	public static final int SCALE = BASIC * 40;

	public static final Position START_POINT = new Position(WINDOW_WIDTH / SCALE / 2, 1, SCALE);

	public static final int RADIUS = BASIC * 40;

	// These parameters are used for a centered printing of arithmetic operations.
	public static final int MULTIPLICATION_AJUSTEMENT = BASIC * 6;
	public static final int SUBTRACTION_AJUSTEMENT = BASIC * 5;
	public static final int ADDITION_STRING_AJUSTEMENT = BASIC * 9;

	public static final int STRING_AJUSTEMENT = BASIC * 10;

	public static final int POLICE_SIZE = BASIC * 30;

}
