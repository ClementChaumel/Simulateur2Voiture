package AppliSimu;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testConversionMetresPixels() {
		
		ObserverVoiture obs = new ObserverVoiture();
		
		int xPixels = obs.calculerPositionPixels(110);
		
		assertEquals(55, xPixels);
	}

}
