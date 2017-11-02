package com.github.megatronking.svg.sample.drawables;


import com.github.megatronking.svg.sample.R;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;

import com.github.megatronking.svg.support.SVGDrawable;
import com.github.megatronking.svg.support.SVGHelper;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.<br><br>
 *
 * Call the follow in your Application: 
 *
 * <pre class="prettyprint">
 * public class MyApplication extends Application {
 *
 *    public void onCreate() {
 *        SVGLoader.load(this)
 *    }
 *
 * }
 * </pre>
 */
public class SVGLoader  {

    private static LongSparseArray<Drawable.ConstantState> sPreloadedDrawables;

    public static void load(Context context) {
        sPreloadedDrawables = SVGHelper.hackPreloadDrawables(context.getResources());
        if (sPreloadedDrawables == null) {
            return;
        }
        add(context, R.drawable.ic_android_red, SVGDrawable.SVGDrawableConstantState.create(new ic_android_red(context)));
        add(context, R.drawable.ic_svg_01, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_01(context)));
        add(context, R.drawable.ic_svg_02, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_02(context)));
        add(context, R.drawable.ic_svg_03, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_03(context)));
        add(context, R.drawable.ic_svg_04, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_04(context)));
        add(context, R.drawable.ic_svg_05, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_05(context)));
        add(context, R.drawable.ic_svg_06, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_06(context)));
        add(context, R.drawable.ic_svg_07, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_07(context)));
        add(context, R.drawable.ic_svg_08, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_08(context)));
        add(context, R.drawable.ic_svg_09, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_09(context)));
        add(context, R.drawable.ic_svg_10, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_10(context)));
        add(context, R.drawable.ic_svg_11, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_11(context)));
        add(context, R.drawable.ic_svg_12, SVGDrawable.SVGDrawableConstantState.create(new ic_svg_12(context)));
    }

    private static void add(Context context, int resId, SVGDrawable.SVGDrawableConstantState state) {
        sPreloadedDrawables.put(SVGHelper.resKey(context, resId), state);
    }

}