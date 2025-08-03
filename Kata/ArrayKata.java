public class ArrayKata {
    public static void main(String[] args) {

    }

    public static int[] maximumInArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int max = array[0];
        for (int number : array) {
            if (number > max) max = number;
        } 
        return max;
    }

    public static int[] minimumInArray(int[] array) {
        if (array == null || array.length == 0) 
            return 0;
        int min = array[0];
        for (int number : array) {
            if (number < min) min = number;
        }
        return min;
    }

    public static int[] sumInArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int sum = 0;
        for (int numbers : array) {
            sum += numbers;
        }
        return sum;
    } 

    public static int[] sumOfEvenNumbers(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        for (int num : array) {
            if (num % 2 == 0)
            sum += num;
        }
        return sum;
    }
    
    public static int[] sumOfOddNumbers(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        for (int num : array) {
            if (num % 2 != 0) 
            sum += num;
        }
        return sum;
    }

    public static int[] getMinMax(int[] array) {
    if (array == null || array.length == 0) return new int[]{0, 0};
    int min = arr[0];
    int max = arr[0];
    for (int num : arr) {
        if (num < min) min = num;
        if (num > max) max = num;
    }
    return new int[]{min, max};
    }

    public static int[] countOfOddNumbers(int[] array) {
    if (array == null || array.length == 0) 
        return 0;
    int count = 0;
    for (int num : array) {
        if (num % 2 != 0) count++;
    }
    return count;
    }

    public static int[] countOfEvenNumbers(int[] array) {
    if (array == null || array.length == 0) 
        return 0;
    int count = 0;
    for (int num : arr) {
        if (num % 2 == 0) count++;
    }
    return count;
    }

    public static int[] getEvenNumbers(int[] array) {
    if (array == null || array.length == 0) 
        return new int[]{};

    int count = 0;
    for (int num : arr) {
        if (num % 2 == 0) count++;
    }
    int[] evenNumbers = new int[count];
    int index = 0;
    for (int num : array) {
        if (num % 2 == 0) {
            evenNumbers[index++] = num;
        }
    }
    
    return evenNumbers;
    }

    public static int[] getOddNumbers(int[] array) {
    if (array == null || array.length == 0) 
        return new int[]{};
    int count = 0;
    for (int num : arr) {
        if (num % 2 != 0) count++;
    }
    int[] oddNumbers = new int[count];
    int index = 0;
    for (int num : arr) {
        if (num % 2 != 0) {
            oddNumbers[index++] = num;
        }
    }
    
    return oddNumbers;
    }

    public static int[] getSquareNumbers(int[] array) {
    if (array == null || array.length == 0) 
        return new int[]{};
    int count = 0;
    for (int num : array) {
        if (num >= 0) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num) count++;
        }
    }
    int[] squareNumbers = new int[count];
    int index = 0;
    for (int num : array) {
        if (num >= 0) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num) {
                squareNumbers[index++] = num;
            }
        }
    }
    
    return squareNumbers;
    }
}
