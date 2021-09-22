package lab0;

import static java.lang.Math.abs;

public class Variant1 {

    public enum Cardinal_Points{
        North, West, South, East
    }

    /**
     *
     * @param array,n is square side
     * @return perimeter
     */
    public int MinMaxTask(int[] array, int n) {
        int extremum=abs(array[0]);
        int num_extremum=0;
        for(int i=1;i<n;i++)
        {
            if(extremum<abs(array[i]))
            {
                extremum=abs(array[i]);
                num_extremum=i;
            }
        }
        return num_extremum;
    }

    /**
     *
     * @param k is distance in cm
     * @return distance in m
     */

    public int integerNumbersTask(int k) {
        int new_number=k%10;
        k=k/10;
        new_number*=10;
        new_number=new_number+(k%10);

        return new_number;
    }

    /**
     *
     * @param number1,number2
     * @return true, if number is possitive
     */
    public boolean booleanTask(int number1, int number2) {
        if(abs(number1%2)+abs(number2%2)==1)
            return true;
        else
            return false;
    }


    /**
     *
     * @param number1,number2 is integer number
     * @return transformed number
     */
    public int ifTask(int number1,int number2) {
        if(number1==number2)
        {
            number1=0;
            number2=0;
            return 0;
        }else{
            number1+=number2;
            number2=number1;
            return 1;
        }

    }


    /**
     *
     * @param starts,number1
     * @return day of week day represented number1
     */
    public Cardinal_Points switchTask(Cardinal_Points starts,int number1) {
        switch (starts) {
            case  East :
                if(number1==1)
                    return Cardinal_Points.North;
                else if(number1==-1)
                    return Cardinal_Points.South;
                else
                    return Cardinal_Points.East;

            case North:
                if(number1==1)
                    return Cardinal_Points.West;
                else if(number1==-1)
                    return Cardinal_Points.East;
                else
                    return Cardinal_Points.North;


            case South:
                if(number1==1)
                    return Cardinal_Points.East;
                else if(number1==-1)
                    return Cardinal_Points.West;
                else
                    return Cardinal_Points.South;


            case West:
                if(number1==1)
                    return Cardinal_Points.South;
                else if(number1==-1)
                    return Cardinal_Points.North;
                else
                    return Cardinal_Points.West;

            default:
                return starts;

        }
    }


    /**
     *
     * @param n is integer number
     * @return approximated value of exp(1)
     */
    public double forTask(int n) {
        assert n >0: "Argument should be more than zero";
        double sum=0;
        for(int i=1;i<=n;i++)
            sum+=(double)1/i;
        return sum;
    }


    public int whileTask(int a) {
        //assert (a >0 ): "Argument should be more than zero";
        int k=0;
        while(Math.pow(3, k) < a){
            k++;
        }
        return --k;
    }

    public int[] arrayTask(int[] array, int n) {
        int[] new_array;
        new_array=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(array[i]%2==0)
            {
                new_array[j]=array[i];
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(array[i]%2==1)
            {
                new_array[j]=array[i];
                j++;
            }
        }

        return new_array;
    }

    /**
     *
     * @param array
     * @param k1
     * @param k2
     * @return transformed array where row with indexes k1 and k2 was changed
     */
    public int[][]  twoDimensionArrayTask(int[][] array, int k1, int k2) {
        int new_array[][];
        int n=k1;
        int m=k2/2;
        if(k2%2==1)
            m+=1;
        new_array=new int[n][m];
        for(int i=0;i<k1;i++)
        {
            for(int j=0;j<k2;j+=2)
            {
                new_array[i][j/2]=array[i][j];
                //System.out.println(array[i][j]);
            }
        }
        return new_array;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}