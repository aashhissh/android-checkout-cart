package urbanclap.com.marketview.frame_work.cart;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * @author : Adnaan 'Zohran' Ahmed <adnaanahmed@urbanclap.com>
 * @version : 1.0.0
 * @since : 12 Mar 2018 3:23 PM
 */


public interface ICart<I> {

    @NonNull
    List<I> getItems();

    double getTotalPrice();

    long getTotalQuantity();

    long getQuantity(@NonNull String uuid);

    double getPrice(@NonNull String uuid);

    boolean increment(@NonNull String uuid, @NonNull I item);

    boolean decrement(@NonNull String uuid);

    I getItem(@NonNull String uuid);

    I remove(@NonNull String uuid);

    void clear();
}
