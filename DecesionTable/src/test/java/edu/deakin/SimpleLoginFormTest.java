// SimpleLoginFormTest.java
package edu.deakin;

import org.junit.Assert;
import org.junit.Test;

public class SimpleLoginFormTest {

    @Test
    public void testValidCredentials() {
        String result = SimpleLoginForm.login("testuser", "testpass");
        Assert.assertEquals(result, "success");
    }

    @Test
    public void testInvalidUsername() {
        String result = SimpleLoginForm.login("invaliduser", "testpass");
        Assert.assertEquals(result, "username mismatch");
    }

    @Test
    public void testInvalidPassword() {
        String result = SimpleLoginForm.login("testuser", "invalidpass");
        Assert.assertEquals(result, "password mismatch");
    }

    @Test
    public void testBothInvalid() {
        String result = SimpleLoginForm.login("invaliduser", "invalidpass");
        Assert.assertEquals(result, "username mismatch");
    }
}
