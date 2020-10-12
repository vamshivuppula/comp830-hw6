package hw6;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiceBagTest {
	
	DiceBag db;
	Token t =new Token("Tom");
	@BeforeEach
	void setUp() throws Exception {
		db =  new DiceBag();
	}

	@AfterEach
	void tearDown() throws Exception {
		db=null;
	}

	@Test
	void testAddToken() {
		when(db.addToken(t)).thenReturn(true);
		assertEquals(db.addToken(t),true);
		//fail("Not yet implemented");
	}

	@Test
	void testDrawToken() {
		when(db.drawToken()).thenReturn(null);
		assertEquals(db.drawToken(),null);
		//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		
		assertEquals(db.toString()," Dice left: 0\n");
		
	//	fail("Not yet implemented");
	}

}
