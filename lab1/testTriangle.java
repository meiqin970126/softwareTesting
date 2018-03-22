package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTriangle{
	Triangle triangle = new Triangle();
    String equilateral = "��������Ϊ�ȱ�������";
    String isosceles = "��������Ϊ����������";
    String scalene = "��������Ϊ���ȱ�������";
    String nonATriangle = "�ⲻ��һ��������";
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
