
public class ShapeMaker {

    public static String PrintSquare(int size)
    {
        String square = "";
        for(int i = 0; i < size; i++){
            for(int b = 0; b < size; b++){
                square += "* ";
            }
            square += "\n";
        }
        return square;
    }

    public static String PrintRectangle(int length, int height)
    {
        String rectangle = "";
        for(int i = 0; i < height; i++){
            for(int b = 0; b < length; b++){
                rectangle += "* ";
            }
            rectangle += "\n";
        }
        return rectangle;
    }

    public static String PrintRightTriangle(int height)
    {
        String rightTri = "";
        for(int i = 0; i < height; i++){
           for(int b = 0; b <= i; b++){
               rightTri += "* ";
           }
           rightTri += "\n";
        }
        // write your code here
        return rightTri;
    }

    public static String PrintInvertedRightTriangle(int height)
    {
        String invertedRightTri = "";
        for(int i = 0; i < height; i++){
            for(int b = 0; b < height - i; b++){
                invertedRightTri += "* ";
            }
            for(int c = 0; c <= i; c++){
                invertedRightTri += "  ";
            }
            invertedRightTri += "\n";
        }
        // write your code here
        return invertedRightTri;
    }

    public static String PrintBackwardsRightTriangle(int height)
    {
        String backRightTri = "";
        for(int i = 0; i < height; i++){
            for(int b = 0; b < height - i; b++){
                backRightTri += "  ";
            }
            for(int c = 0; c <= i; c++){
                backRightTri += "* ";
            }
            backRightTri += "\n";
        }
        return backRightTri;
    }

    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintEquilateralTriangle(int height)
    {
        String equilTri = "";
        for(int i = 0; i < height; i++){
            for(int b = 0; b < height - i; b++){
                equilTri += " ";
            }
            for(int c = 0; c <= i; c++){
                equilTri += "* ";
            }
            equilTri += "\n";
        }
        return equilTri;
    }
}
