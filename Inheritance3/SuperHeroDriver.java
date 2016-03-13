import java.util.ArrayList;
public class SuperHeroDriver
{
    public static void main ( String[] args )
    {
        ウルトラマン um = new ウルトラマン();
        AsteroidMan am = new AsteroidMan();
        FriedEggMan fm = new FriedEggMan();

        um.setSuitColor("Gray");
        am.setSuitColor("White");
        fm.setSuitColor("Yellow");
        um.setCape(false);
        am.setCape(false);
        fm.setCape(true);
        um.setName("ウルトラマン");
        am.setName("AsteroidMan");
        fm.setName("FriedEggMan");

        SuperHero[][] cape = new SuperHero[3][3];
        ArrayList<SuperHero> hero = new ArrayList<SuperHero>();
        hero.add(um);
        hero.add(am);
        hero.add(fm);
        int i = 0;

        System.out.println("Original Heroes: ");
        for(SuperHero h : hero)
        {
            System.out.println(h);
        }
        for(int row = 0; row < cape.length; row++)
        {
            for(int col = 0; col < cape[0].length; col++)
            {
                if(i < hero.size())
                {
                    if(hero.get(i).isCaped() == true)
                    {
                        cape[row][col] = hero.get(i);
                        hero.remove(hero.get(i));
                    }
                    else
                    {
                        i++;
                    }
                }
            }
        }

        System.out.println("\nCaped Heroes: ");
        for(int row = 0; row < cape.length; row++)
        {
            for(int col = 0; col < cape[0].length; col++)
            {
                if(cape[row][col] != null)
                {
                    System.out.print(cape[row][col].getName() + "\t");
                }
                else
                {
                    System.out.print(cape[row][col] + "\t");
                }
                i++;
            }
            System.out.println();
        }

        System.out.println("\nCaped Heroes: ");
        for(int row = 0; row < cape.length; row++)
        {
            for(int col = 0; col < cape[0].length; col++)
            {
                if(cape[row][col] != null)
                {
                    System.out.println(cape[row][col] + "\t");
                    i++;
                }
            }
        }

        System.out.println("\nLeftover Heroes: ");
        for(SuperHero h : hero)
        {
            System.out.println(h);
        }
    }
}