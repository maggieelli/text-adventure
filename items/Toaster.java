package items;

import textadventure.World;

public class Toaster extends Container {

	public Toaster(World world, String name, String description) {
		super(world, name, description);
		// TODO Auto-generated constructor stub
	}

	public Toaster(World world, String name, int weight, boolean takeable, String description) {
		super(world, name, weight, takeable, description);
		weight = 2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doUse() {
		if (numItems() > 1) {
			World.print("There are too many items in the " + getName() + ".\n\n");
			return;
		}
		if (numItems() < 1) {
			World.print("There's nothing in the " + getName() + " to toast!\n\n");
			return;
		}
		Item item = getItems().get(0);
		if (item.getName().equals("bread")) {
			World.print("You toast the " + item.getName() + " transforming it into a warm and lightly crispy piece of toast, your favorite!.\n\n");
			removeItem("bread");
			addItem(new Food(getWorld(), "toast", 2, "A warm and lightly crispy piece of toast, your favorite!"));
		}
		else {
			World.print("You attempt to toast the " + item.getName() + " but it quickly liquifies and " +
						"causes an electrical fire which in turn burns down your house.  You survive the " +
					    "fire but you're sure your parents will kill instead.\n\nGame over :(");
			System.exit(0);
		}
	}
}