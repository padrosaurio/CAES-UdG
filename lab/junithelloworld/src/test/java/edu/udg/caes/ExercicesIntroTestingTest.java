package edu.udg.caes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercicesIntroTestingTest {

    @Test
    public void testFindLast(){
        final int result = ExercicesIntroTesting.findLast(new int []{2, 3, 5}, 2);
        assertEquals(result, 0);
    }

    @Test
    public void testLastZero(){
        final int result = ExercicesIntroTesting.lastZero(new int []{0, 1, 0});
        assertEquals(result, 2);
    }

    @Test
    public void testCountPositive(){
        final int result = ExercicesIntroTesting.countPositive(new int []{-4, 2, 0, 2});
        assertEquals(result, 2);
    }

    @Test
    public void testOddOrPos(){
        final int result = ExercicesIntroTesting.oddOrPos(new int []{-3, -2, 0, 1, 4});
        assertEquals(result, 3);
    }




    @Test
    public void new_testFindLast(){
        final int result = ExercicesIntroTesting.findLast(new int []{1, 2, 5}, 2);
        assertEquals(result, 1);
    }

    @Test
    public void new_testLastZero(){
        final int result = ExercicesIntroTesting.lastZero(new int []{1, 1, 1});
        assertEquals(result, -1);
    }

    @Test
    public void new_testCountPositive(){
        final int result = ExercicesIntroTesting.countPositive(new int []{-4, 2, 2, 2});
        assertEquals(result, 3);
    }

    @Test
    public void new_testOddOrPos(){
        final int result = ExercicesIntroTesting.oddOrPos(new int []{-2, -2, 1, 1, 4});
        assertEquals(result, 3);
    }
}
