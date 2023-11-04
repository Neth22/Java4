 class englandCricket {
    void playing(){
        System.out.println("Bowling");
     }
}
class sriLankaCricket extends englandCricket{
    @Override
    void playing() {
        System.out.println("Batting");
    }
    void practising(){
        System.out.println("Fielding");
    }
    void selection(){
        super.playing();
        practising();
    }
}
class Test1{
    public static void main(String[] args) {
        sriLankaCricket sl= new sriLankaCricket();
        sl.selection();
    }
}
