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
public class ic_rate_review extends SVGRenderer {

    public ic_rate_review(Context context) {
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
        
        mPath.moveTo(20.0f, 2.0f);
        mPath.lineTo(4.0f, 2.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        mPath.lineTo(2.0f, 22.0f);
        mPath.rLineTo(4.0f, -4.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(22.0f, 4.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(20.0f, 2.0f);
        mPath.moveTo(6.0f, 14.0f);
        mPath.rLineTo(0f, -2.47f);
        mPath.rLineTo(6.88f, -6.88f);
        mPath.rCubicTo(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        mPath.rLineTo(1.77f, 1.77f);
        mPath.rCubicTo(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        mPath.lineTo(8.47f, 14.0f);
        mPath.lineTo(6.0f, 14.0f);
        mPath.close();
        mPath.moveTo(6.0f, 14.0f);
        mPath.rMoveTo(12.0f, 0.0f);
        mPath.rLineTo(-7.5f, 0f);
        mPath.rLineTo(2.0f, -2.0f);
        mPath.lineTo(18.0f, 12.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(18.0f, 14.0f);
        
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