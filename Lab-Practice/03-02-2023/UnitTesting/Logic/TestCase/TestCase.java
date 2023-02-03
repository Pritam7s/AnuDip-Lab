package testcase;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exercise.FindMax;
@SuppressWarnings("unused")
public class TestCase {


		@Test
		public void testFindMax(){
			assertEquals(4,FindMax.findMax(new int[]{1,3,4,2}));
			//assertEquals(-2,FindMax.findMax(new int[]{-12,-3,-4,-2}));
		}
	}


