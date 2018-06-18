package com.test.lookandsay;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.exam.lookandsay.LookAndSay;

public class LookAndSayTest {
	
    LookAndSay lookAndSayClass = new LookAndSay(); 
    
    @Test
    public void LookAndSayTestFunctionSingleIteration() {

        assertEquals("Expected Output is '21'", "21", lookAndSayClass.LookAndSay("11", 1));
    }
    @Test
    public void LookAndSayTestFunctionNoIteration() {

        assertEquals("Expected Output is '11'", "11", lookAndSayClass.LookAndSay("11", 0));
    }
    @Test
    public void LookAndSayTestFunctionTwoIteration() {
        assertEquals("Expected Output is '12112221'", "12112221", lookAndSayClass.LookAndSay("11221", 2));
    }
    
    @Test
    public void LookAndSayTestFunctionThreeIteration() {
        assertEquals("Expected Output is '3123212211'","3123212211", lookAndSayClass.LookAndSay("3121", 3));
    }
}
