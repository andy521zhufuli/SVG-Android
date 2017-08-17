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
public class ic_group_work extends SVGRenderer {

    public ic_group_work(Context context) {
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
        
        mPath.moveTo(12.0f, 2.0f);
        mPath.cubicTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        mPath.rCubicTo(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        mPath.rCubicTo(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        mPath.cubicTo(22.0f, 6.4799995f, 17.52f, 2.0f, 12.0f, 2.0f);
        mPath.close();
        mPath.moveTo(12.0f, 2.0f);
        mPath.moveTo(8.0f, 17.5f);
        mPath.rCubicTo(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        mPath.rCubicTo(0.0f, -1.3799992f, 1.12f, -2.5f, 2.5f, -2.5f);
        mPath.rCubicTo(1.3800001f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        mPath.rCubicTo(0.0f, 1.3800001f, -1.12f, 2.5f, -2.5f, 2.5f);
        mPath.close();
        mPath.moveTo(8.0f, 17.5f);
        mPath.moveTo(9.5f, 8.0f);
        mPath.rCubicTo(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        mPath.rCubicTo(1.3800001f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        mPath.rCubicTo(0.0f, 1.3800001f, -1.12f, 2.5f, -2.5f, 2.5f);
        mPath.cubicTo(10.62f, 10.5f, 9.5f, 9.38f, 9.5f, 8.0f);
        mPath.close();
        mPath.moveTo(9.5f, 8.0f);
        mPath.rMoveTo(6.5f, 9.5f);
        mPath.rCubicTo(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        mPath.rCubicTo(0.0f, -1.3799992f, 1.12f, -2.5f, 2.5f, -2.5f);
        mPath.rCubicTo(1.3800001f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        mPath.rCubicTo(0.0f, 1.3800001f, -1.12f, 2.5f, -2.5f, 2.5f);
        mPath.close();
        mPath.moveTo(16.0f, 17.5f);
        
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