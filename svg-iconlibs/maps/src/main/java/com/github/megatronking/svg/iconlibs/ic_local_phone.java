package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_local_phone extends SVGRenderer {

    public ic_local_phone(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(6.62f, 10.79f);
        mPath.rCubicTo(1.44f, 2.83f, 3.76f, 5.14f, 6.59f, 6.59f);
        mPath.rLineTo(2.2f, -2.2f);
        mPath.rCubicTo(0.27f, -0.27f, 0.67f, -0.36f, 1.02f, -0.24f);
        mPath.rCubicTo(1.12f, 0.37f, 2.33f, 0.57f, 3.57f, 0.57f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        mPath.lineTo(21.0f, 20.0f);
        mPath.rCubicTo(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        mPath.rCubicTo(-9.39f, 0.0f, -17.0f, -7.61f, -17.0f, -17.0f);
        mPath.rCubicTo(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        mPath.rLineTo(3.5f, 0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        mPath.rCubicTo(0.0f, 1.25f, 0.2f, 2.45f, 0.57f, 3.57f);
        mPath.rCubicTo(0.11f, 0.35f, 0.03f, 0.74f, -0.25f, 1.02f);
        mPath.rLineTo(-2.2f, 2.2f);
        mPath.close();
        mPath.moveTo(6.62f, 10.79f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}