package lab0;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab0.Variant1;
import lab0.Variant1.Cardinal_Points;

public class Variant1Test {

    public static double EPS = 0.0000001;

    /*@Test
    public void MassTest(){
        assertEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    @Test(enabled = false)
    public void loginOld() {

        assertEquals(new Variant1().booleanTask(3, 3), false);

    }*/

    @Test(dataProvider = "inputProvider")
    public void inputTest(int[] array, int p, int p1) {
        assertEquals(new Variant1().MinMaxTask(array, p), p1);
    }

    @DataProvider
    public Object[][] inputProvider() {
        return new Object[][] { { new int[]{2, -4, 6, 3}, 4 , 2}, { new int[]{3,6,-1,4}, 4, 1} };
    }

    /*@Test(expectedExceptions = AssertionError.class)
    public void negativeInputTest() {
        new Variant1().MinMaxTask(-2);
    }*/

    ////////////////////////////////////////////////

    @Test(dataProvider = "integerProvider")
    public void inputTest(int p1, int p3) {
        assertEquals(new Variant1().integerNumbersTask(p1), p3);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] { { 123, 32 }, { 412, 21 }, { 139, 93 } };
    }

    /*@Test(expectedExceptions = AssertionError.class)
    public void negativeIntegerTest() {
        new Variant1().integerNumbersTask(-2);
    }*/

    ////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p2, int p3) {
        assertEquals(new Variant1().ifTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { { 2, 3 , 1}, { 0, 0 , 0}, { -3, -3 , 0} };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, boolean p3) {
        assertEquals(new Variant1().booleanTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { { 5,6, true }, { 0,4, false }, { -3,5, false } };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "switchProvider")
    public void switchTest(Cardinal_Points p0, int p1, Cardinal_Points p2) {
        assertEquals(new Variant1().switchTask(p0,p1), p2);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] { {  Cardinal_Points.North, 1, Cardinal_Points.West }, { Cardinal_Points.South, -1, Cardinal_Points.West } };
    }

    /*@Test(expectedExceptions = AssertionError.class)
    public void switchNegativeTest() {
        new Variant1().forTask(10);
    }*/

    ///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(int n, double p2) {
        assertEquals(new Variant1().forTask(n), p2, EPS);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] { { 2, 1.5 }, { 3, 1.8333333 }, { 4, 2.0833333 } };
    }

    ///////////////////////////////////////////////////

    //////////////////////////////////////////

    @Test(dataProvider = "whileProvider")
    public void whileTest(int a, int c) {
        assertEquals(new Variant1().whileTask(a), c);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] {  { 4, 1 }, { 10, 2 }, { 30, 3 } };
    }

    /*@Test(expectedExceptions = AssertionError.class, dataProvider = "negativeWhileProvider")
    public void negativeWhileTest(int a, int b) {
        new Variant1().whileTask(a);
    }

    @DataProvider
    public Object[][] negativeWhileProvider() {
        return new Object[][] { { 1, 2 }, { -2, 1 }, { 2, -1 } };
    }*/

    //////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int[] array, int n, int[] value) {
        assertEquals(new Variant1().arrayTask(array, n), value);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] { { new int[] { 10, 2, 3, 4 }, 4, new int[]{10, 2, 4, 3} }, { new int[] { 1, 2, 13 ,6}, 4, new int[]{2, 6,1, 13} },};
    }



    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[][] input, int from, int to, int[][] output) {
        assertEquals(new Variant1().twoDimensionArrayTask(input, from, to), output);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[][] input = {{2, 3, 6, 9, -9},
                {34, 98, -9, 2, 1},
                {-4, 2, 1, 6, 1},
                {-98, 8, 1, 5, 3}};

        int[][] input23 = {{2,  6,  -9},
                {34,  -9,  1},
                {-4,  1,  1},
                {-98,  1,  3}};

        /*int[][] input14 = {{-98, 8, 1, 5, 3},
                {-4, 2, 1, 6, 1},
                {34, 98, -9, 2, 1},
                {2, 3, 6, 9, -9}};*/

        return new Object[][] { {input, 4, 5, input23}  };

    }

    /*@Test
    public void arrayTest2(){
        assertEquals(new int[]{2, 3}, new int[]{2, 3});
    }*/

}