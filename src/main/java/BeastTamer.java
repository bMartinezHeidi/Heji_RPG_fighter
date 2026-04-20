public class BeastTamer extends Character{

    private int BeastType;
    private String[] beasts;
    private String beastUsed;
    public BeastTamer(int health, int magic, Weapon weapon, Armor armor, String name, int max, int initiative) {
        super(health, magic, weapon, armor, name, max, initiative);
        BeastType=(int)(Math.random()*(3-0+1)+0);
        beasts=new String[]{"Rats","Bears","Pandas","Fish"};
        beastUsed=beasts[BeastType];
        //need to ask about weapons and armor
    }
    @Override
    public int dealDamage(){
       int damage;
       if (beastUsed.equals("Rats")){
           damage=10;
        } else if (beastUsed.equals("Bears")) {
           damage=30;
       } else if (beastUsed.equals("Panda")) {
           damage=20;
       } else{
           //Fish can't do damage on land silly people
           damage=0;
       }
        return damage;
    }
}
