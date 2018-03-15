package urbanclap.com.marketview.frame_work.sticky;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author : Adnaan 'Zohran' Ahmed <adnaanahmed@urbanclap.com>
 * @version : 1.0.0
 * @since : 15 Mar 2018 5:15 PM
 */


public interface IStickyViewItem {
    View createView(@NonNull ViewGroup parent);
}
