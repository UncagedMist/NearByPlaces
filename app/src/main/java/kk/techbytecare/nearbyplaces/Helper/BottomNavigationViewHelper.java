package kk.techbytecare.nearbyplaces.Helper;

import android.annotation.SuppressLint;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;

import java.lang.reflect.Field;

public class BottomNavigationViewHelper {

    @SuppressLint("RestrictedApi")
    public static void disableShiftMode(BottomNavigationView view)  {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView)view.getChildAt(0);

        try {
            Field shiftMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftMode.setAccessible(true);
            shiftMode.setBoolean(menuView,false);
            shiftMode.setAccessible(false);

            if (menuView.getChildCount() < 5)   {
                for (int i = 0; i < menuView.getChildCount(); i++)  {
                    BottomNavigationItemView item = (BottomNavigationItemView)menuView.getChildAt(i);

                    item.setShiftingMode(false);
                    item.setChecked(item.getItemData().isChecked());
                }
            }


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
