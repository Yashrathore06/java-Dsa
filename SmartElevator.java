public class SmartElevator {
    public static void main(String[] args) {
        int currentFloor=5;

        int upRequest=7;
        int downRequest=3;

        if(upRequest>currentFloor){
            System.out.println("Next floor :"+upRequest);
        }else if(downRequest<currentFloor){
            System.out.println("Next floor :"+downRequest);
        }
    }
}
