public class Booth{
    //私有变量
    private long id;//摊号
    private String name;//摊主姓名
    private int total;//在售西瓜数
    private boolean isClosed;//是否休摊整改
    //构造方法(有参构造)
    public Booth(long id,String name,int total,boolean isClosed) {
        this.id=id;
        this.name =name;
        this.total=total;
        this.isClosed=isClosed;
    }
    //上述私有变量的get和set方法

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name ) {
        this.name=name;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total=total;
    }
    public boolean getIsclosed() {
        return isClosed;
    }
    public void setisClosed(boolean isClosed) {
        this.isClosed=isClosed;
    }
    //一个重写的 toString()方法来输出 该西瓜摊的所有信息
    public String toString(){
        return ("该商家的摊号为"+id+"该摊主姓名为"+name+"在售西瓜数为"+total+"休摊情况为"+isClosed);
    }
    //购买西瓜
    public static void purchase(Booth booth,int purchasenum){
        if(purchasenum<0) {
            System.out.println("购买失败");
        } else if (purchasenum> booth.getTotal()) {
            System.out.println("购买失败，数量不足");
        } else if (booth.isClosed) {
            System.out.println("购买失败，已休摊");
        }else {
            booth.setTotal(booth.getTotal()-purchasenum);
            System.out.println("购买成功");
        }
    }
    //进西瓜
    public void restock(Booth booth,int restocknum){
        if(restocknum>200) {
            System.out.println("进货失败");
        } else if (restocknum<0) {
            System.out.println("进货失败");
        }else {
            booth.setTotal(booth.getTotal()+restocknum);
            System.out.println("进货成功");
        }
    }
    //歇业
    public static void closeBooth(Booth[] booths){
        for(int i=0;i<booths.length;i++){
            if(!booths[i].getIsclosed()){
                booths[i].setisClosed(true);
            }else {
                System.out.println(booths[i].toString());
            }
        }
    }



}