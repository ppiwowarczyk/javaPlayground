package beer;

import javaAnotation.Java13_Switch;

@Java13_Switch
public class CraftBeerGrouper implements BeerGrouper
{
    @Override
    public BeerGroup group(BeerType beerType)
    {
        return switch (beerType)
        {
            case FLANDERS, GOSE -> BeerGroup.SOUR;
            case LAGER, PALE_ALE -> BeerGroup.PALE;
            case RIS, STOUT -> BeerGroup.DARK;
        };
    }
}
