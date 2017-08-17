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
public class ic_phonelink_off extends SVGRenderer {

    public ic_phonelink_off(Context context) {
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
        
        mPath.moveTo(22.0f, 6.0f);
        mPath.lineTo(22.0f, 4.0f);
        mPath.lineTo(6.82f, 4.0f);
        mPath.rLineTo(2.0f, 2.0f);
        mPath.lineTo(22.0f, 6.0f);
        mPath.close();
        mPath.moveTo(22.0f, 6.0f);
        mPath.moveTo(1.92f, 1.65f);
        mPath.lineTo(0.65f, 2.92f);
        mPath.rLineTo(1.82f, 1.82f);
        mPath.cubicTo(2.18f, 5.08f, 2.0f, 5.52f, 2.0f, 6.0f);
        mPath.rLineTo(0f, 11.0f);
        mPath.lineTo(0.0f, 17.0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.rLineTo(17.73f, 0f);
        mPath.rLineTo(2.35f, 2.35f);
        mPath.rLineTo(1.27f, -1.27f);
        mPath.lineTo(3.89f, 3.62f);
        mPath.lineTo(1.92f, 1.65f);
        mPath.close();
        mPath.moveTo(1.92f, 1.65f);
        mPath.moveTo(4.0f, 6.27f);
        mPath.lineTo(14.73f, 17.0f);
        mPath.lineTo(4.0f, 17.0f);
        mPath.lineTo(4.0f, 6.27f);
        mPath.close();
        mPath.moveTo(4.0f, 6.27f);
        mPath.moveTo(23.0f, 8.0f);
        mPath.rLineTo(-6.0f, 0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 4.18f);
        mPath.rLineTo(2.0f, 2.0f);
        mPath.lineTo(18.0f, 10.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rLineTo(0f, 7.0f);
        mPath.rLineTo(-2.18f, 0f);
        mPath.rLineTo(3.0f, 3.0f);
        mPath.lineTo(23.0f, 20.0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.lineTo(24.0f, 9.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(23.0f, 8.0f);
        
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