public class Demo {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("寒冰射手");//设置英雄名称

        //设置英雄技能
        hero.setSkill(new SkillImplment());//设置单独定义的实现类
        hero.attack();

        //还可以使用匿名内部类
        Skill skill = new Skill(){
            @Override
            public void use() {
                System.out.println("papappappa");
            }
        };
        hero.setSkill(skill);
        hero.attack();

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("棒棒棒");
            }
        });
        hero.attack();
    }
}
