package phones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/***
 * Created for Jenkins testing demo only. Not a proper solution for ICE
 * @author dancye, 2021
 *
 */
class SmartPhoneTest {

	@Test
	void testSetPrice() {
		SmartPhone testPhone = new SmartPhone();
		testPhone.setPrice(299.99);
		String price = testPhone.getFormattedPrice();
		assertEquals("$299.99", price);
	}

}
