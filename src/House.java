 class House {
    House(){
        System.out.println("Family in the House");
    }
}
class Room extends House{
    Room(){
        super();
        System.out.println("Son in the Room");
    }

    public static void main(String[] args) {
        Room r=new Room();

    }
}
