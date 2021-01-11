package items;

import textadventure.DemoWorld;
import textadventure.World;

public class Keys extends Item {

	public Keys(World world, String name, int weight, boolean takeable, String description) {
		super(world, name, weight, takeable, description);
		// TODO Auto-generated constructor stub
	}

	public Keys(World world, String name, int weight, String description) {
		super(world, name, weight, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doUse() {
		// TODO Auto-generated method stub
		if (getWorld().getPlayer().getCurrentRoom().getName().equals(DemoWorld.HALLWAY)) {
			getWorld().getRoom(DemoWorld.BATHROOM).doUnlock();
			World.print("You unlocked the bathroom.\n\n");
		}
		else if (getWorld().getPlayer().getCurrentRoom().getName().equals(DemoWorld.KITCHEN)) {
			getWorld().getRoom(DemoWorld.OUTSIDE).doUnlock();
			World.print("You unlock the door leading outside.\n\n");
		}
		else {
			World.print("The " + getName() + " doesn't fit anything here.\n\n");
		}
	}
}