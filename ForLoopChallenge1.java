public class ForLoopChallenge1 {
    public static void main(String[] args) {
        int i = 0;
        //for(i = 0; i <= 10; i++){
            //System.out.println(i);
        //}
        while (true) {           //Its infinite loop
            if(i == 15){         //but when it reaches 14, it will stop
                break;           //break when condition satisfied
            }
            System.out.println(i);
            i++;                         //increment
        }
    }
}
