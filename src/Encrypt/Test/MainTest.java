package Encrypt.Test;

import Encrypt.Main;
import junit.framework.*;

public class MainTest extends TestCase {

    Main main1;
    public MainTest(){}

    public void testEncrypt() {
        assertTrue(("Hello").equals("Hello"));
        assertFalse(main1.encrypt("Hello").equals("Hello"));
    }

    public void testDecrypt() {
        assertFalse(main1.encrypt("Hello").equals("Hello"));
        assertTrue(main1.decrypt(main1.encrypt("Hello")).equals("Hello"));
    }

}
