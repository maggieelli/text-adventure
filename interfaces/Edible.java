package interfaces;

public interface Edible {
	
	public final static boolean POISON = true;
	public final static boolean NOT_POISON = false;
	public final static boolean RIPE = true;
	public final static boolean NOT_RIPE = false;
	
	/** Eats this object */
	public void doEat();
}
