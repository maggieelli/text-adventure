package items;

import interfaces.Closeable;
import textadventure.World;

public class CloseableContainer extends Container implements Closeable {

	private boolean isOpen;
	
	public CloseableContainer(World world, String name, String description, boolean isOpen) {
		super(world, name, description);
		// TODO Auto-generated constructor stub
		this.isOpen = isOpen;
	}

	public CloseableContainer(World world, String name, int weight, boolean takeable, String description, boolean isOpen) {
		super(world, name, weight, takeable, description);
		// TODO Auto-generated constructor stub
		this.isOpen = isOpen;
	}

	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		return isOpen;
	}

	@Override
	public void doOpen() {
		// TODO Auto-generated method stub
		isOpen = Closeable.OPEN;
		System.out.println("Opened.\n");
	}

	@Override
	public void doClose() {
		// TODO Auto-generated method stub
		isOpen = Closeable.CLOSED;
		System.out.println("Closed.\n");
	}

	@Override
	public void doExamine() {
		if (isOpen == false) {
			System.out.println("The " + getName() + " is closed.\n");
		}
		else {
			System.out.println("Inside the " + getName() + " you see " + getItemString() + ".\n");
		}
	}
	
	@Override
	public Item doTake(Item item) {
		if (isOpen == false) {
			System.out.println("It is not open!\n");
			return null;
		}
		else {
			return super.doTake(item);
		}
	}
	
	@Override
	public Item doPut(Item item, Container source) {
		if (isOpen == false) {
			System.out.println("It is not open!\n");
			return null;
		}
		else {
			return super.doPut(item, source);
		}
	}
}
