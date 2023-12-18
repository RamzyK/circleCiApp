package com.example.testingciapp

import org.junit.Assert.*

import org.junit.Test

class UtilsKtTest {

    @Test
    fun test_ValidPassword() {
        // Setup
        val password = "Passw0rd!"

        // Action
        val results = verifyPassword(password)

        // Result
        assertTrue(results.isEmpty())
    }

    @Test
    fun `Password less than 6 alphanumerical characters`() {
        // Setup
        val password = "Pwd1!"

        // Action
        val results = verifyPassword(password)

        // Result
        assertEquals(results.size, 1)
        assertEquals("Le mot de passe doit contenir au moins 6 caractères.", results[0])

    }

}