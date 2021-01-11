package items;

import interfaces.Edible;
import textadventure.World;

public class Food extends Item implements Edible {

	public Food(World world, String name, int weight, boolean takeable, String description) {
		super(world, name, weight, takeable, description);
		// TODO Auto-generated constructor stub
	}

	public Food(World world, String name, int weight, String description) {
		super(world, name, weight, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doUse() {
		// TODO Auto-generated method stub
		doEat();
	}

	@Override
	public void doEat() {
		System.out.println("You eat the " + getName() + " and feel stronger!");
		getWorld().getPlayer().removeItem(this);
		getWorld().getPlayer().setHealth(getWorld().getPlayer().getHealth() + this.getWeight());
		getWorld().getPlayer().setHasBrushedTeeth(false);
	}
	
}
