package com.picklesolutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestUsersService {

    @Test
    public void testCount() {
        UsersService usersService = new UsersService();

        assertEquals(10, usersService.count());
        assertNotEquals(11, usersService.count());
    }

    @Test
    public void testAuthentication() {
        UsersService usersService = new UsersService();

        assertTrue(usersService.AuthenticateUser("admin", "adminpass"));
        assertFalse(usersService.AuthenticateUser("admin", "adminpass2"));
        assertFalse(usersService.AuthenticateUser("admin2", "adminpass2"));
    }
}
