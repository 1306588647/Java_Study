public class ProcessControl {
    public static void main(String[] args) {
    //顺序结构
        System.out.println("今天天日风和日丽！");
        System.out.println("我特别想出来玩啊！");



    //选择结构（判断语句）
        //1.单if语句
        int age=19;
        if(age>=18){
            System.out.println("您可以进入网吧");
        }


        //2.if-else语句
        int num =10;
        if(num%2==0){
            System.out.println("偶数");
        }
        else{
            System.out.println("奇数");
        }


        //3.if..else if...else语句
        int score = 93;
        if(score>=90){
            System.out.println("优秀");
        }
        else if(score>=80){
            System.out.println("良好");
        }
        else if(score>=60){
            System.out.println("及格");
        }
        else{
            System.out.println("不及格");
        }


        //4.三元运算符和if-else等效替换
        int a=3;
        int b=4;
        int min;
        int max;
        if(a>b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        System.out.println("max="+max+",min="+min);

        max = a>b?a:b;
        min = a<b?a:b;
        System.out.println("max="+max+",min="+min);


        //switch语句
        int week = 8;
        switch(week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("错误！");
        }




    //循环结构
        //1.for循环
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            sum = sum+i;
        }
        System.out.println(sum);


        //2.while循环
        int sum1=0;
        int j=1;
        while (j<=100){
            sum1=sum1+j;
            j++;
        }
        System.out.println(sum1);


        //3.do-while循环
        int sum2=0;
        int k=1;
        do {            //第一次无条件执行一次
            sum2=sum2+k;
            k++;
        }while(k<=100);
        System.out.println(sum2);




    //跳出语句
        //1.break语句
        for (int i = 1; i <=10 ; i++) {
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        //2.contine语句
        for (int i = 1; i <=10 ; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
