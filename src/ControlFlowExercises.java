public class ControlFlowExercises {
    public static void main(String[] args) {
//        for(int i=5 ;i<=15;i++ ){
//        System.out.print(i+" " );
//    }
//        for(int i=0 ;i<=100;i=i+2 ){
//        System.out.println(i);
//    }

        for (float i = 2; i < 1000000; i *= i) {
            System.out.printf("%.0f%n", i);
        }



    }
}