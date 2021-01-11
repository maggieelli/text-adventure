package textadventure;

public class OutsideRoom extends Room {

	public OutsideRoom(String name, String description, World world) {
		super(name, description, world);
		// TODO Auto-generated constructor stub
	}

	public OutsideRoom(String name, String description, boolean isLocked, World world) {
		super(name, description, isLocked, world);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doGo() {
		World.print("Yay! Your carpool has arrived. They're pulling into your driveway right now.\n\n");
		if (!getWorld().getPlayer().isHasBrushedTeeth()) {
			World.print("Your carpool mates smell your stinky breath and realize you haven't brushed your teeth. How embarrassing! Game over!");
			System.exit(0);
		}
		else if (getWorld().getPlayer().getHealth() != 2) {
			World.print("Your stomach churns as you realize you forgot to toast the bread.  You get sick in on the way to school.  How embarrassing!  Game over!");
			System.exit(0);
		}
		else if (!getWorld().getPlayer().isWearingClothes()) {
			World.print("Um... your carpool mates stare at you in shock and then start laughing. You're not wearing any clothes! How embarrassing! Game over!");
			System.exit(0);
		}
		else {
			World.print("You get into the car as you are driven away. You end up having a great day at school! You win!");
			System.exit(0);
		}
	}
}
