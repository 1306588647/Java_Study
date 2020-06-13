public class MyInterfacePrivateImplement implements MyInterfacePrivateA {


    public void methodAnother(){
        //直接访问到了接口中的默认方法，这样是错误的，因为题目要求实现类不能访问共有方法
        //methodCommon专门为接口中两个默认方法提供的
        //methodCommon();
    }
}
