import junit.framework.TestCase;

public class GradeBookTest extends TestCase {
	GradeBook g1, g2;

	protected void setUp() throws Exception {
		super.setUp();
		//create at least two objects of Gradebook to hold 5 scores
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		//call the addScore method for each of the Gradebook 
		//objects at least twice
		g1.addScore(48.0);
		g1.addScore(75.5);
		
		g2.addScore(98.0);
		g2.addScore(95.5);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		//set the two objects of Gradebook to null
		g1 = null;
		g2 = null;
	}

	public void testGetScoreSize() {
		//fail("Not yet implemented");
	}

	public void testToString() {
		//fail("Not yet implemented");
		
	}

	public void testAddScore() {
		//fail("Not yet implemented");
		
		//Compare the scoreSize to the expected number of scores entered
        assertEquals(2.0, g1.getScoreSize(), 0.01);
        assertEquals(2.0, g2.getScoreSize(), 0.01);
		
		//compare the contents of what is in the scores array 
		//to what is expected to be in the scores array 
        assertTrue(g1.toString().equals("48.0 75.5 "));  
        assertTrue(g2.toString().equals("98.0 95.5 "));
	}

	public void testSum() {
		//fail("Not yet implemented");
		
		//Compare what is returned by sum() to the 
		//expected sum of the scores entered
		assertEquals(123.5, g1.sum(), 0.0001);
		assertEquals(193.5, g2.sum(), 0.0001);
	}

	public void testMinimum() {
		//fail("Not yet implemented");
		
		//Compare what is returned by minimum() to the 
		//expected minimum of the scores entered.
		assertEquals(48, g1.minimum(), 0.001);
		assertEquals(95.5, g2.minimum(), 0.001);
	}

	public void testFinalScore() {
		//fail("Not yet implemented");
		
		//Compare what is returned by finalScore() to the expected 
		//finalScore of the scores entered.
		assertEquals(75.5, g1.finalScore(), 0.0);
		assertEquals(98.0, g2.finalScore(), 0.0);
	}

}
