package org.bridj.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author ochafik
 */
public class ProcessUtilsTest {
    @Test
    public void testPid() {
        int pid = ProcessUtils.getCurrentProcessId();
        assertTrue(pid > 0);
    }
}
