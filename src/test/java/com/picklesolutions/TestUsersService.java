package com.picklesolutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestUsersService {

    @Test
    public void testCount() {
        UsersService usersService = new UsersService();

        assertEquals(10, usersService.count());
    }
}
