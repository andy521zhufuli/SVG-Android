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
public class ic_alarm_add extends SVGRenderer {

    public ic_alarm_add(Context context) {
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
        
        mPath.moveTo(7.88f, 3.39f);
        mPath.lineTo(6.6f, 1.86f);
        mPath.lineTo(2.0f, 5.71f);
        mPath.rLineTo(1.29f, 1.53f);
        mPath.rLineTo(4.59f, -3.85f);
        mPath.close();
        mPath.moveTo(7.88f, 3.39f);
        mPath.moveTo(22.0f, 5.72f);
        mPath.rLineTo(-4.6f, -3.86f);
        mPath.rLineTo(-1.29f, 1.53f);
        mPath.rLineTo(4.6f, 3.86f);
        mPath.lineTo(22.0f, 5.72f);
        mPath.close();
        mPath.moveTo(22.0f, 5.72f);
        mPath.moveTo(12.0f, 4.0f);
        mPath.rCubicTo(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        mPath.rCubicTo(0.0f, 4.9699993f, 4.02f, 9.0f, 9.0f, 9.0f);
        mPath.rCubicTo(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        mPath.rCubicTo(0.0f, -4.9699993f, -4.03f, -9.0f, -9.0f, -9.0f);
        mPath.close();
        mPath.moveTo(12.0f, 4.0f);
        mPath.rMoveTo(0.0f, 16.0f);
        mPath.rCubicTo(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        mPath.rCubicTo(0.0f, -3.869999f, 3.13f, -7.0f, 7.0f, -7.0f);
        mPath.rCubicTo(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        mPath.rCubicTo(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        mPath.close();
        mPath.moveTo(12.0f, 20.0f);
        mPath.rMoveTo(1.0f, -11.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.lineTo(8.0f, 12.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -3.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-3.0f, 0f);
        mPath.lineTo(13.0f, 9.0f);
        mPath.close();
        mPath.moveTo(13.0f, 9.0f);
        
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