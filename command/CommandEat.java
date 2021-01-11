package command;

import interfaces.Edible;
import items.Item;
import textadventure.World;

public class CommandEat extends Command {

	public CommandEat() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String[] getCommandWords() {
		// TODO Auto-generated method stub
		return new String[]{"eat", "consume", "bite"};
	}

	@Override
	public void doCommand(String cmd, String[] params, World world) {
		// TODO Auto-generated method stub
		if (params.length != 1) {
			System.out.println("What do you want to eat?");
			return;
		}
		String foodName = params[0];
		if (!world.getPlayer().hasItem(foodName)) {
			System.out.println("You don't have the " + foodName);
			return;
		}
		else {
			Item item = world.getPlayer().getItem(foodName);
			if (item instanceof Edible) {
				((Edible)item).doEat();
			}
			else {
				System.out.println("That's plainly inedible!");
			}
		}
	}

	@Override
	public String getHelpDescription() {
		// TODO Auto-generated method stub
		return "[item]";
	}

}
