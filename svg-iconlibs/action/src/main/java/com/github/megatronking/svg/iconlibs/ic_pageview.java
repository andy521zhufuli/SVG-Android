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
public class ic_pageview extends SVGRenderer {

    public ic_pageview(Context context) {
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
        
        mPath.moveTo(11.5f, 9.0f);
        mPath.cubicTo(10.12f, 9.0f, 9.0f, 10.12f, 9.0f, 11.5f);
        mPath.rCubicTo(0.0f, 1.3800001f, 1.12f, 2.5f, 2.5f, 2.5f);
        mPath.rCubicTo(1.3800001f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        mPath.cubicTo(14.0f, 10.12f, 12.88f, 9.0f, 11.5f, 9.0f);
        mPath.close();
        mPath.moveTo(11.5f, 9.0f);
        mPath.moveTo(20.0f, 4.0f);
        mPath.lineTo(4.0f, 4.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(22.0f, 6.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(20.0f, 4.0f);
        mPath.rMoveTo(-3.21f, 14.21f);
        mPath.rLineTo(-2.91f, -2.91f);
        mPath.rCubicTo(-0.69f, 0.44f, -1.51f, 0.7f, -2.39f, 0.7f);
        mPath.cubicTo(9.01f, 16.0f, 7.0f, 13.99f, 7.0f, 11.5f);
        mPath.cubicTo(7.0f, 9.01f, 9.01f, 7.0f, 11.5f, 7.0f);
        mPath.cubicTo(13.99f, 7.0f, 16.0f, 9.01f, 16.0f, 11.5f);
        mPath.rCubicTo(0.0f, 0.88f, -0.26f, 1.69f, -0.7f, 2.39f);
        mPath.rLineTo(2.91f, 2.9f);
        mPath.rLineTo(-1.42f, 1.42f);
        mPath.close();
        mPath.moveTo(16.79f, 18.21f);
        
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