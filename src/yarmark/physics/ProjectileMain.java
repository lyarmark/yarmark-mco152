package yarmark.physics;

public class ProjectileMain {
	public static void main(String[] args) {

		Projectile test = new Projectile(31, 20, 2.7);

		for (int counter = 0; counter <= 10; counter++) {
			test.setTime(counter);
			System.out.println("Location of ball at " + counter + " seconds:\t" + test.getX() + ", " + test.getY()
					+ ")");
		}

	}
}