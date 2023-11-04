 class oldTestBall {
    String colour="Red";
}
class newTestBall extends oldTestBall {
    String colour="Pink";
    void printColour(){
        System.out.println(colour);
        System.out.println(super.colour);
    }
}
class Test{
    public static void main(String[] args) {
       newTestBall ntb= new newTestBall();
       ntb.printColour();
    }
}
