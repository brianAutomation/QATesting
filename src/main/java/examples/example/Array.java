package examples.example;

//Java Array
//Array is an object which contains elements of same data type
//the elements of array is stored in a contigous memory location.
//Array is the data structure where we store similar elements.
// Array in java is index based, the first element of an array is stored at 0 and second at 1.

//advantages
//Random access of elements
//code optimization

//disadvantage
// Size limit

//Types
//single Dimensional
//Multi Dimensional

//ways to declare an array
//datatype [] name;
//dataType[] name;
//datatype name [];


public class Array {

    public static void main(String[] args) {
        //arraayExample();
        //Array2();
        // Array2While();
        //ArrayForEach();
        //  forEach2();
        //   print();
        //  int[] a = {11,20,3,44};
        //  a(a);
        //   front("hello");
//        int arr[] = {1,2,3};
//        int arr2[] = {1,2,6};
//        int arr3[] = {6,1,2};
//        firstLast(arr);
//        firstLast(arr2);
//        firstLast(arr3);
        //front("he");
        //beginningLetters("Phi");

        // arrayReverse();
        // getDataType();
//        int a = 10;
//        double dd = 3.14;
//      //  getDataType(dd);
//        re();

        // mArrays();
        //  threeDArray();
//        int[] arr = {1,2,3,30,44,-90,39,-800,56,66};
//        largest(arr);
        //get();

        //printGetThis();
        //printAnotherOne();
        //printAForEachLoop();
       // printTheStringArry();
        int evenCount = countEven();
        System.out.println("Number of even numbers in the array: " + evenCount);
    }

    public static void arraayExample(){
        int a[] = new int[5];
        a[0]= 10;
        a[1]= 20;
        a[2]= 30;
        a[3]= 40;
        a[4]= 50;

        for (int i = 0; i < a.length; i++){
            //(int i : a)
            //(? : )
            System.out.print(a[i] + " ");
        }
    }

    public static void Array2(){
        int a[] ={10,15,20,25,30};
        for (int i = 0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void Array2While(){
        int[] a ={10,15,20,25,30};
        int i =0;
        while (i < a.length){
            System.out.println(a[i]);
            i++;
        }
    }

    public static void ArrayForEach(){
        int[] a ={10,15,20,25,30};

        for (int i : a ) {
            System.out.println("element: " + i );
        }
    }

    public static void forEach2(){
        String [] names = {"Brian","Max","Patric","Kim"};

        for (String n : names) {
            System.out.println(n);
        }
    }

    static int[] get(){
        return new int[]{10,11,12,13,14};
    }

    public static void print(){
        int arr[] = get();
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static int[] getThis(){
        return new int[]{12,8,9,6,7,1};
    }

    public static void printGetThis(){
        int arr[] = getThis();
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + ",");
        }
    }

    public static void printAnotherOne(){
        int arr[] = getThis();
        int i = 0;
        while(i < arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }

    static String [] getThisStringArray (){
        return new String []{"hello","Mr","UFO","Sir"};
    }

    public static void printTheStringArry(){
        String arr [] = getThisStringArray();

        for(String n : arr){
            System.out.println(n);
        }
    }

    public static void printAForEachLoop(){
        int arr [] = getThis();
        for(int i : arr){
            System.out.println(i);
        }
    }

    static void a(int arr[]){
        int min = arr[0];
        for (int i = 0; i<arr.length;i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }System.out.println(min);
    }

// Given a string, we'll say that the front is the first 3 chars of the string.
// If the string length is less than 3,
// the front is whatever is there. Return a new string which is 3 copies of the front.

    public static void front(String str){
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }
        System.out.println(front + front + front);
    }

    public static void beginningLetters(String str){
        String first5;
        if (str.length() >= 5){
            first5 = str.substring(0,5);
        } else {
            first5 = str;
        }
        System.out.println(first5);
    }

//Given two int values, return their sum.
// Unless the two values are the same, then return double their sum.

//(9,1)- 10
//(4,4) - 16

    //Given an array of ints, return true if 6 appears as either the first
    //or last element in the array. The array will be length 1 or more.

    public static void firstLast(int arr []){
        System.out.println(arr[0] == 6 || arr[arr.length -1] == 6);
    }


//Given an array of ints length 3, return a new array with the elements in
//reverse order, so {1, 2, 3} becomes {3, 2, 1}.

    public static int[] reverseArray(int[] nums){
        int[] reversed = new int[3];
        reversed[0] = nums[2];
        reversed[1] = nums[1];
        reversed[2] = nums[0];
        return reversed;
    }

    public static void arrayReverse(){
        int[] array= {1,2,3};
        int[] reversedArray = reverseArray(array);

        for (int nums : reversedArray){
            System.out.print(nums + " ");
        }
    }

    public static void getDataType(Object j){
        String str = "hello World";
        int arr[] ={1,2,3,4,5};
        System.out.println("type of str " + str.getClass().getName());
        System.out.println(arr.getClass().getName());

        if (j instanceof Integer){
            System.out.println("its int");
        }else if (j instanceof Double){
            System.out.println("this is double");
        } else if (j instanceof String) {
            System.out.println("this is a string");
        }
    }

    public static void re(){
        int [] a = {1,2,3,4,5,6,7};
        int i = a.length -1;
        while (i > -1){
            System.out.print(a[i] + " ");
            i--;
        }
    }
    //Multi dimentional Arrays

    public static void mArrays(){
        //2 dimentional Array
        int[] matrix2 ={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < matrix2.length; i++){
            System.out.print( "SA " + matrix2[i] + " ");
        }
        System.out.println(" ");

        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int r = 0; r < matrix.length; r++){
            for (int c = 0;c < matrix.length; c++){
                System.out.print("MD "+ matrix[r][c] + " ");
            }
            System.out.println(" ");
        }

//        for (int row = 0; row< matrix.length;row++){
//            for (int col = 0;col < matrix.length;col++){
//                System.out.print(matrix[row][col] + " ");
//            }
//            System.out.println();
//        }
    }

    public static void threeDArray(){
        int[][] a = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] b = {{1,1,1},{2,2,2},{3,3,3}};

        //((1+1)+(1+2)+(1+3))
        //((2+1)+(2+2)+(2+3))
        //((3+1)+(3+2)+(3+3))

        //in this matrix addition, a one-row element of the first matrix is added
        //by all the columns of the second matrix.


        int[][] c = new int[3][3];

        for (int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                c[i][j]=0;
                for (int k = 0; k < 3;k++){
                    c[i][j] += a[i][k] + b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }


// print the largest number from the given array

    public static void largest(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length;i++){
            if (arr[i] >max)
                max = arr[i];
        }
        System.out.print("Largest number is : " + max);
    }

    static int [] evenCount(){
        return new int [] {1,4,6,7};
    }

    public static int countEven(){
        int arr [] = evenCount();
        int count = 0;

        for(int n : arr){
            if (n % 2 == 0){
                count++;
            }
        }
        return count;
    }

}
