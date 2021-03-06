import static org.junit.Assert.*;
import org.junit.Test;

public class JugSolverTest {

    @Test
	public void testZeroPoursNeeded() {
		JugSolver zeroNeeded = new JugSolver(4, 4, 4, 4);
		JugContents initial = new JugContents(4, 0, 0);
		assertTrue(zeroNeeded.tryPouring(initial));
	}

    @Test
	public void testOnePourNeeded() {
		JugSolver onePourNeeded = new JugSolver(5, 4, 4, 4);
		JugContents initial = new JugContents(5, 0, 0);
		assertTrue(onePourNeeded.tryPouring(initial));
	}

    @Test
	public void testPuzzleFromLeathalWeapon() {
		JugSolver manyPoursNeeded = new JugSolver(100, 5, 3, 4);
		JugContents initial = new JugContents(100, 0, 0);
		assertTrue(manyPoursNeeded.tryPouring(initial));
	}

    @Test
	public void testManyPoursNeeded() {
		JugSolver manyPoursNeeded = new JugSolver(8, 5, 3, 4);
		JugContents initial = new JugContents(8, 0, 0);
		assertTrue(manyPoursNeeded.tryPouring(initial));
	}

}
