public class Test {
    public static void main(String[] args) {
        //菜净移负责卖瓜
        Booth booth1 = new Booth(1,"菜净移",300,false);
        booth1.purchase(booth1,100);
        booth1.purchase(booth1,-1);
        booth1.setisClosed(true);
        booth1.purchase(booth1,100);
        booth1.setisClosed(false);
        booth1.purchase(booth1,100);
        System.out.println("==============================");
        //晨踩莉负责进瓜
        Booth booth2 = new Booth(2,"晨踩莉",300,false);
        booth2.restock(booth2,300);
        booth2.restock(booth2,-1);
        booth2.restock(booth2,100);
        System.out.println("==============================");
        //苛下擎负责关门
        Booth booth3 = new Booth(3,"苛下擎",200,false);
        Booth booth4 = new Booth(4,"messi",100,true);
        Booth booths[]={booth3,booth4};
        Booth.closeBooth(booths);

    }
}
