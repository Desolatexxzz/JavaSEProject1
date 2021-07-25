import java.util.Scanner;

public class Project1 {
    static String case1 = "收支\t账户金额\t收支金额\t说明\n";
    static double money = 10000;//账户金额：默认为10000元
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean x = true;
        while (x){
            //主界面
            System.out.println("-----------------家庭收支记账软件-----------------");
            System.out.println("                 1 收支明细                      ");
            System.out.println("                 2 登记收入                      ");
            System.out.println("                 3 登记支出                      ");
            System.out.println("                 4 退 出                        ");
            System.out.println("                 请选择(1-4)：                   ");
            char flag = Utility.readMenuSelection();
            switch (flag){
                case '1':
                    new Project1().case1();
                    break;
                case '2':
                    new Project1().case2();
                    break;
                case '3':
                    new Project1().case3();
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N)：");
                    char key = Utility.readConfirmSelection();
                    if (key == 'Y'){
                        x = false;
                    }
                    break;
                default:
                    break;
            }
        }
    }
    //收支明细方法
    public void case1(){
        System.out.println("-----------------当前收支明细记录-----------------");
        System.out.println(case1);
    }
    //登记收入方法
    public void case2(){
        System.out.println("本次收入金额：");
        int money1 = Utility.readNumber();
        money += money1;
        System.out.println("本次收入说明：");
        String str = Utility.readString();
        case1 += "收入\t" + money + "\t" + money1 + "\t   " + str  +"\n";
        System.out.println("记录成功!!!");
    }
    //登记支出方法
    public void case3(){
        System.out.println("本次支出金额：");
        int money1 = Utility.readNumber();
        money -= money1;
        System.out.println("本次支出说明：");
        String str = Utility.readString();
        case1 += "支出\t" + money + "\t" + money1 + "\t   " + str + "\n";
        System.out.println("记录成功!!!");
    }
}

