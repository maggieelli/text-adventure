package items;

import textadventure.World;

public class Toothbrush extends Item {

	public Toothbrush(World world, String name, int weight, boolean takeable, String description) {
		super(world, name, weight, takeable, description);
		// TODO Auto-generated constructor stub
	}

	public Toothbrush(World world, String name, int weight, String description) {
		super(world, name, weight, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doUse() {
		// TODO Auto-generated method stub
		World.print("Good, you've successfully brushed your teeth! Your breath smells much better now.\n\n");
		getWorld().getPlayer().setHasBrushedTeeth(true);
	}

}
