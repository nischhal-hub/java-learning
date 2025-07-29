public class ArrayTest {
    public static void main(String a[]){
        int[] numArr = new int[5];
        numArr[0] = 23;
        System.out.println(numArr[0]);
        System.out.println(numArr[1]);

        String[] names = {"Hello","Ram","Gita","Sita"};

        //foreach loop
        for(String s:names){
            System.out.println(s);
        }

        //normal loop
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        int[][] multiDimensional = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
                //prints only diagonal elements
                if(i == j){
                System.out.println(multiDimensional[i][j]);
            }
            }
            System.out.println('\n');
        }
    }
}
