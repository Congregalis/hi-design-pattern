package creational.builder;

public class Client {
    public static void main(String[] args) {

        // 默认的建造 A
        Human humanA = new HumanBuilder().build();
        // 一步一步的建造 B & C
        Human humanB = new HumanBuilder().buildHair("yellow and short").buildBody("weak").build();
        Human humanC = new HumanBuilder().buildHair("white and short").buildFace("handsome").buildBody("weak").build();

        System.out.println("HumanA's info: " + humanA);
        System.out.println("HumanB's info: " + humanB);
        System.out.println("HumanC's info: " + humanC);
    }
}
