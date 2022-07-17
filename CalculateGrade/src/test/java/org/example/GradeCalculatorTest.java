package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {
    GradeCalculator calculator = new GradeCalculator();

    /** For 3 credit course **/

    // F grade

    @Test
    void gradeFLowerBoundaryTest1_3(){ assertEquals('F', calculator.graderForThreeCreditCourse("0")); }
    @Test
    void gradeFLowerBoundaryTest2_3(){ assertEquals('F', calculator.graderForThreeCreditCourse("0.36")); }
    @Test
    void gradeFSafeRangeTest1_3(){ assertEquals('F', calculator.graderForThreeCreditCourse("88.4")); }
    @Test
    void gradeFSafeRangeTest2_3(){ assertEquals('F', calculator.graderForThreeCreditCourse("174.6")); }
    @Test
    void gradeFSafeRangeTest3_3(){ assertEquals('F', calculator.graderForThreeCreditCourse("161.4")); }
    @Test
    void gradeFSafeRangeTest4_3(){
        assertEquals('F', calculator.graderForThreeCreditCourse("45.9"));
    }
    @Test
    void gradeFUpperBoundaryTest1_3(){
        assertEquals('C', calculator.graderForThreeCreditCourse("179.02"));
    }
    @Test
    void gradeFUpperBoundaryTest2_3(){
        assertEquals('C', calculator.graderForThreeCreditCourse("179.68"));
    }


    // C grade

    @Test
    void gradeCLowerBoundaryTest1_3(){
        assertEquals('C', calculator.graderForThreeCreditCourse("180"));
    }
    @Test
    void gradeCLowerBoundaryTest2_3(){
        assertEquals('C', calculator.graderForThreeCreditCourse("180.004"));
    }
    @Test
    void gradeCSafeRangeTest1_3(){
        assertEquals('C', calculator.graderForThreeCreditCourse("192.7"));
    }
    @Test
    void gradeCSafeRangeTest2_3(){
        assertEquals('C', calculator.graderForThreeCreditCourse("203.3"));
    }
    @Test
    void gradeCSafeRangeTest3_3(){
        assertEquals('C', calculator.graderForThreeCreditCourse("205.1"));
    }
    @Test
    void gradeCFSafeRangeTest4_3(){
        assertEquals('C', calculator.graderForThreeCreditCourse("208.9"));
    }
    @Test
    void gradeCUpperBoundaryTest1_3(){
        assertEquals('B', calculator.graderForThreeCreditCourse("209.01"));
    }
    @Test
    void gradeCUpperBoundaryTest2_3(){
        assertEquals('B', calculator.graderForThreeCreditCourse("209.8"));
    }


    // B grade

    @Test
    void gradeBLowerBoundaryTest1_3(){
        assertEquals('B', calculator.graderForThreeCreditCourse("210"));
    }
    @Test
    void gradeBLowerBoundaryTest2_3(){ assertEquals('B', calculator.graderForThreeCreditCourse("210.31")); }
    @Test
    void gradeBSafeRangeTest1_3(){
        assertEquals('B', calculator.graderForThreeCreditCourse("217.6"));
    }
    @Test
    void gradeBSafeRangeTest2_3(){
        assertEquals('B', calculator.graderForThreeCreditCourse("235.9"));
    }
    @Test
    void gradeBSafeRangeTest3_3(){
        assertEquals('B', calculator.graderForThreeCreditCourse("231.4"));
    }
    @Test
    void gradeBFSafeRangeTest4_3(){
        assertEquals('B', calculator.graderForThreeCreditCourse("222.2"));
    }
    @Test
    void gradeBUpperBoundaryTest1_3(){
        assertEquals('A', calculator.graderForThreeCreditCourse("239.44"));
    }
    @Test
    void gradeBUpperBoundaryTest2_3(){
        assertEquals('A', calculator.graderForThreeCreditCourse("239.79"));
    }


    // A grade

    @Test
    void gradeALowerBoundaryTest1_3(){
        assertEquals('A', calculator.graderForThreeCreditCourse("240"));
    }
    @Test
    void gradeALowerBoundaryTest2_3(){
        assertEquals('A', calculator.graderForThreeCreditCourse("240.17"));
    }
    @Test
    void gradeASafeRangeTest1_3(){
        assertEquals('A', calculator.graderForThreeCreditCourse("250.9"));
    }
    @Test
    void gradeASafeRangeTest2_3(){
        assertEquals('A', calculator.graderForThreeCreditCourse("263.4"));
    }
    @Test
    void gradeASafeRangeTest3_3(){
        assertEquals('A', calculator.graderForThreeCreditCourse("277.7"));
    }
    @Test
    void gradeAFSafeRangeTest4_3(){
        assertEquals('A', calculator.graderForThreeCreditCourse("292.4"));
    }
    @Test
    void gradeAUpperBoundaryTest1_3(){
        assertEquals('A', calculator.graderForThreeCreditCourse("299.003"));
    }
    @Test
    void gradeAUpperBoundaryTest2_3(){
        assertEquals('A', calculator.graderForThreeCreditCourse("299.9"));
    }


    /** For 4 credit course **/

    @Test
    void gradeFLowerBoundaryTest1_4(){ assertEquals('F', calculator.graderForFourCreditCourse("0")); }

    @Test
    void gradeFLowerBoundaryTest2_4(){ assertEquals('F', calculator.graderForFourCreditCourse("0.03")); }

    @Test
    void gradeFSafeRangeTest1_4(){ assertEquals('F', calculator.graderForFourCreditCourse("88.4")); }

    @Test
    void gradeFSafeRangeTest2_4(){ assertEquals('F', calculator.graderForFourCreditCourse("174.6")); }

    @Test
    void gradeFSafeRangeTest3_4(){ assertEquals('F', calculator.graderForFourCreditCourse("161.4")); }

    @Test
    void gradeFSafeRangeTest4_4(){
        assertEquals('F', calculator.graderForFourCreditCourse("235.6"));
    }
    @Test
    void gradeFUpperBoundaryTest1_4(){
        assertEquals('C', calculator.graderForFourCreditCourse("239.22"));
    }
    @Test
    void gradeFUpperBoundaryTest2_4(){
        assertEquals('C', calculator.graderForFourCreditCourse("239.98"));
    }


    // C grade

    @Test
    void gradeCLowerBoundaryTest1_4(){
        assertEquals('C', calculator.graderForFourCreditCourse("240"));
    }
    @Test
    void gradeCLowerBoundaryTest2_4(){
        assertEquals('C', calculator.graderForFourCreditCourse("240.4"));
    }
    @Test
    void gradeCSafeRangeTest1_4(){
        assertEquals('C', calculator.graderForFourCreditCourse("252.7"));
    }
    @Test
    void gradeCSafeRangeTest2_4(){
        assertEquals('C', calculator.graderForFourCreditCourse("267.3"));
    }
    @Test
    void gradeCSafeRangeTest3_4(){
        assertEquals('C', calculator.graderForFourCreditCourse("272.1"));
    }
    @Test
    void gradeCFSafeRangeTest4_4(){
        assertEquals('C', calculator.graderForFourCreditCourse("277.9"));
    }
    @Test
    void gradeCUpperBoundaryTest1_4(){
        assertEquals('B', calculator.graderForFourCreditCourse("279.0001"));
    }
    @Test
    void gradeCUpperBoundaryTest2_4(){
        assertEquals('B', calculator.graderForFourCreditCourse("279.38"));
    }


    // B grade

    @Test
    void gradeBLowerBoundaryTest1_4(){
        assertEquals('B', calculator.graderForFourCreditCourse("280"));
    }
    @Test
    void gradeBLowerBoundaryTest2_4(){
        assertEquals('B', calculator.graderForFourCreditCourse("280.001"));
    }
    @Test
    void gradeBSafeRangeTest1_4(){
        assertEquals('B', calculator.graderForFourCreditCourse("297.6"));
    }
    @Test
    void gradeBSafeRangeTest2_4(){
        assertEquals('B', calculator.graderForFourCreditCourse("305.9"));
    }
    @Test
    void gradeBSafeRangeTest3_4(){
        assertEquals('B', calculator.graderForFourCreditCourse("311.4"));
    }
    @Test
    void gradeBFSafeRangeTest4_4(){
        assertEquals('B', calculator.graderForFourCreditCourse("314.2"));
    }
    @Test
    void gradeBUpperBoundaryTest1_4(){
        assertEquals('A', calculator.graderForFourCreditCourse("319.4"));
    }
    @Test
    void gradeBUpperBoundaryTest2_4(){
        assertEquals('A', calculator.graderForFourCreditCourse("319.9"));
    }


    // A grade

    @Test
    void gradeALowerBoundaryTest1_4(){
        assertEquals('A', calculator.graderForFourCreditCourse("320"));
    }
    @Test
    void gradeALowerBoundaryTest2_4(){
        assertEquals('A', calculator.graderForFourCreditCourse("320.07"));
    }
    @Test
    void gradeASafeRangeTest1_4(){
        assertEquals('A', calculator.graderForFourCreditCourse("330.9"));
    }
    @Test
    void gradeASafeRangeTest2_4(){
        assertEquals('A', calculator.graderForFourCreditCourse("353.4"));
    }
    @Test
    void gradeASafeRangeTest3_4(){
        assertEquals('A', calculator.graderForFourCreditCourse("377.7"));
    }
    @Test
    void gradeAFSafeRangeTest4_4(){
        assertEquals('A', calculator.graderForFourCreditCourse("382.4"));
    }
    @Test
    void gradeAUpperBoundaryTest1_4(){
        assertEquals('A', calculator.graderForFourCreditCourse("399.3"));
    }
    @Test
    void gradeAUpperBoundaryTest2_4(){
        assertEquals('A', calculator.graderForFourCreditCourse("399.9"));
    }


    /** Out of bound value checking **/
    @Test
    void threeCreditOuterBoundaryTest1(){
        Throwable expectedEx = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.graderForThreeCreditCourse("300.0007"));
        assertEquals(expectedEx.getMessage(), "Marks can't be more than 300 for a 3 credit course");
    }

    @Test
    void threeCreditOuterBoundaryTest2(){
        Throwable expectedEx = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.graderForThreeCreditCourse("315"));
        assertEquals(expectedEx.getMessage(), "Marks can't be more than 300 for a 3 credit course");
    }

    @Test
    void fourCreditOuterBoundaryTest1(){
        Throwable expectedEx = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.graderForFourCreditCourse("400.14"));
        assertEquals(expectedEx.getMessage(), "Marks can't be more than 400 for a 3 credit course");
    }

    @Test
    void fourCreditOuterBoundaryTest2(){
        Throwable expectedEx = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.graderForFourCreditCourse("408"));
        assertEquals(expectedEx.getMessage(), "Marks can't be more than 400 for a 3 credit course");
    }

    /** Negative number check **/
    @Test
    void threeCreditNegBoundaryTest1(){
        Throwable expectedEx = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.graderForThreeCreditCourse("-7.32"));
        assertEquals(expectedEx.getMessage(), "Marks can't be negative!");
    }

    @Test
    void threeCreditNegBoundaryTest2(){
        Throwable expectedEx = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.graderForThreeCreditCourse("-0.0005"));
        assertEquals(expectedEx.getMessage(), "Marks can't be negative!");
    }

    @Test
    void fourCreditNegBoundaryTest1(){
        Throwable expectedEx = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.graderForFourCreditCourse("-7.32"));
        assertEquals(expectedEx.getMessage(), "Marks can't be negative!");
    }

    @Test
    void fourCreditNegBoundaryTest2(){
        Throwable expectedEx = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.graderForFourCreditCourse("-0.0023"));
        assertEquals(expectedEx.getMessage(), "Marks can't be negative!");
    }

    /** Illegal Input **/
    @Test
    void threeCreditIllegalInputTest1(){
        Throwable expectedEx = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.graderForThreeCreditCourse("123abc"));
        assertEquals(expectedEx.getMessage(), "Input marks is not a number!");
    }

    @Test
    void fourCreditIllegalInputTest1(){
        Throwable expectedEx = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.graderForFourCreditCourse("def456"));
        assertEquals(expectedEx.getMessage(), "Input marks is not a number!");
    }
}