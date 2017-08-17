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
public class ic_camera_rear extends SVGRenderer {

    public ic_camera_rear(Context context) {
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
        
        mPath.moveTo(10.0f, 20.0f);
        mPath.lineTo(5.0f, 20.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(5.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(3.0f, -3.0f);
        mPath.rLineTo(-3.0f, -3.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(10.0f, 20.0f);
        mPath.rMoveTo(4.0f, 0.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(5.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-5.0f, 0f);
        mPath.close();
        mPath.moveTo(14.0f, 20.0f);
        mPath.rMoveTo(3.0f, -20.0f);
        mPath.lineTo(7.0f, 0.0f);
        mPath.cubicTo(5.9f, 0.0f, 5.0f, 0.9f, 5.0f, 2.0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(10.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(19.0f, 2.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(17.0f, 0.0f);
        mPath.rMoveTo(-5.0f, 6.0f);
        mPath.rCubicTo(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        mPath.rCubicTo(0.0f, -1.0999999f, 0.89f, -2.0f, 1.99f, -2.0f);
        mPath.rCubicTo(1.0999994f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        mPath.cubicTo(14.0f, 5.1f, 13.1f, 6.0f, 12.0f, 6.0f);
        mPath.close();
        mPath.moveTo(12.0f, 6.0f);
        
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