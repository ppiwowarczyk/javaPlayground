package beer;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CraftBeerGrouperTest
{
    @Test
    public void shouldReturnPaleBeer()
    {
        // given
        BeerGrouper beerGrouper = new CraftBeerGrouper();

        // when
        BeerGroup group = beerGrouper.group(BeerType.LAGER);

        // then
        assertThat(group).isEqualTo(BeerGroup.PALE);
    }

    @Test
    public void shouldReturnDarkBeer()
    {
        // given
        BeerGrouper beerGrouper = new CraftBeerGrouper();

        // when
        BeerGroup group = beerGrouper.group(BeerType.RIS);

        // then
        assertThat(group).isEqualTo(BeerGroup.DARK);
    }

    @Test
    public void shouldReturnSourBeer()
    {
        // given
        BeerGrouper beerGrouper = new CraftBeerGrouper();

        // when
        BeerGroup group = beerGrouper.group(BeerType.GOSE);

        // then
        assertThat(group).isEqualTo(BeerGroup.SOUR);
    }

}