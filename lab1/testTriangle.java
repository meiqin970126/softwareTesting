package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTriangle{
	Triangle triangle = new Triangle();
    String equilateral = "该三角形为等边三角形";
    String isosceles = "该三角形为等腰三角形";
    String scalene = "该三角形为不等边三角形";
    String nonATriangle = "这不是一个三角形";
    String result;

    @Test
    public void testEquilateral(){
        result = triangle.check(3, 3, 3);
        assertEquals(equilateral, result);
    }

    @Test
    public void testIsosceles(){
        result = triangle.check(3, 1, 3);
        assertEquals(isosceles, result);
    }

    @Test
    public void testScalene(){
        result = triangle.check(2, 3, 4);
        assertEquals(scalene, result);
    }

    @Test
    public void testNonTri(){
        result = triangle.check(3, 2, 5);
        assertEquals(nonATriangle, result);
    }

}
