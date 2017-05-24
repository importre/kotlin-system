package com.importre.system

import org.junit.Test
import kotlin.test.assertEquals

class SystemUtilsTest {

    @Test
    fun test() {
        val actual = booleanArrayOf(isWindows, isMacOS, isLinux, isOther)
            .count { it }
        assertEquals(1, actual)
    }
}
