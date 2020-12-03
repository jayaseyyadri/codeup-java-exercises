public class ControlFlowExercises {
    public static void main(String[] args) {

/*  increment by two's  till 100*/
//int i = 0;
//do{
//    System.out.println(i);
//    i+=2;
//}while(i<=100);

        /*  decrease by 5 till -10  */
//      int i =100;
// do {
//     System.out.println(i);
//     i-=5;
// }while (i>=-10);

        /*  start at 2 till 1000000  */
        float i= 2;
do{
    System.out.printf("%.0f%n",i);
    i=(float)Math.pow(i,2.0);
}while(i<=1000000);

    }
}