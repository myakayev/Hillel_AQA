import homework_14.QuadraticEquation;
import homework_14.QuadraticEquationSolution;
import org.apache.commons.math3.complex.Complex;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquationSolutionTest {
    @Test
    public void twoRootsTest() {
        // local variable - input data + expected result
        List<Object> expectedResult = new ArrayList<>();
        expectedResult.add(3.0);
        expectedResult.add(-7.0);

        //business logic  -  steps

        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 4, -21);
        List<Object> actualResult = QuadraticEquationSolution.getSolution(quadraticEquation);

        //return  - assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void oneRootTest() {
        // local variable - input data + expected result
        List<Object> expectedResult = new ArrayList<>();
        expectedResult.add(3.0);
        //business logic  -  steps
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, -6, 9);
        List<Object> actualResult = QuadraticEquationSolution.getSolution(quadraticEquation);

        //return  - assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void complexRootsTest() {
        // local variable - input data + expected result
        List<Object> expectedResult = new ArrayList<>();
        Complex firstComplexRoot = new Complex(-2.0, 4.123105625617661);
        expectedResult.add(firstComplexRoot);

        Complex secondComplexRoot = new Complex(-2.0, -4.123105625617661);
        expectedResult.add(secondComplexRoot);

        //business logic  -  steps
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 4, 21);
        List<Object> actualResult = QuadraticEquationSolution.getSolution(quadraticEquation);

        //return  - assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
