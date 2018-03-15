package urbanclap.com.marketviewsample.market.entity;

import urbanclap.com.marketview.frame_work.navigation_bar.Routable;

/**
 * @author : Adnaan 'Zohran' Ahmed <adnaanahmed@urbanclap.com>
 * @version : 1.0.0
 * @since : 15 Mar 2018 4:08 PM
 */


public class PokemonSectionItem implements PokemonCartBaseItem, Routable<String> {

    private String title;

    public PokemonSectionItem(String title) {
        this.title = title;
    }

    @Override
    public int getCartItemType() {
        return TYPE_SECTION;
    }

    @Override
    public String id() {
        return title.toLowerCase();
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String getRouteViewModel() {
        return title;
    }

    @Override
    public String getRouteUUID() {
        return title.toLowerCase();
    }

    @Override
    public int getRouteViewType() {
        return 0;
    }
}