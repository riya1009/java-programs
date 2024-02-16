import java.util.*;
abstract class reservation {
    int trainnumber;
    int seatnumber;
    reservation(int trainnum){
        this.trainnumber = trainnum;
    }
    reservation(int trainnum , int seatnum){
        this.trainnumber = trainnum;
        this.seatnumber  = seatnum;
    }
    abstract void reservation();

    public void cancellation(){
        System.out.println("reservation cancelled");
    }
} 
 class railwayreservation extends reservation{
        void reservation(){
                System.out.println("reservation done");
        }
        railwayreservation(){
            super(2345,45);
        }
        public static void main(String [] args){
            reservation r = new railwayreservation();
            System.out.println(r.trainnumber);
            System.out.println(r.seatnumber);
            r.cancellation();
            r.reservation();

        }
    
}


