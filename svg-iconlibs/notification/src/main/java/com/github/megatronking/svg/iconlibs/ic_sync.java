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
public class ic_sync extends SVGRenderer {

    public ic_sync(Context context) {
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
        
        mPath.moveTo(12.0f, 4.0f);
        mPath.lineTo(12.0f, 1.0f);
        mPath.lineTo(8.0f, 5.0f);
        mPath.rLineTo(4.0f, 4.0f);
        mPath.lineTo(12.0f, 6.0f);
        mPath.rCubicTo(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        mPath.rCubicTo(0.0f, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f);
        mPath.rLineTo(1.46f, 1.46f);
        mPath.cubicTo(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f);
        mPath.rCubicTo(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        mPath.close();
        mPath.moveTo(12.0f, 4.0f);
        mPath.rMoveTo(0.0f, 14.0f);
        mPath.rCubicTo(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        mPath.rCubicTo(0.0f, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f);
        mPath.lineTo(5.24f, 7.74f);
        mPath.cubicTo(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f);
        mPath.rCubicTo(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.rLineTo(4.0f, -4.0f);
        mPath.rLineTo(-4.0f, -4.0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.close();
        mPath.moveTo(12.0f, 18.0f);
        
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