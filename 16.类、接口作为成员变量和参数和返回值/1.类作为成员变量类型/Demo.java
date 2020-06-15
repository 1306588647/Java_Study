public class Demo {

    public static void main(String[] args) {

        //创建一个英雄角色
        Hero hero = new Hero();
        //为英雄去一个名字，并且设置年龄
        hero.setName("盖伦");
        hero.setAge(20);

        //创建一个武器对象
        Weapon weapon = new Weapon("多兰剑");
        //为英雄配备武器
        hero.setWeapon(weapon);

        hero.attack();


    }
}
