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
public class ic_rotate_90_degrees_ccw extends SVGRenderer {

    public ic_rotate_90_degrees_ccw(Context context) {
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
        
        mPath.moveTo(7.34f, 6.41f);
        mPath.lineTo(0.86f, 12.9f);
        mPath.rLineTo(6.49f, 6.48f);
        mPath.rLineTo(6.49f, -6.48f);
        mPath.rLineTo(-6.5f, -6.49f);
        mPath.close();
        mPath.moveTo(7.34f, 6.41f);
        mPath.moveTo(3.69f, 12.9f);
        mPath.rLineTo(3.66f, -3.66f);
        mPath.lineTo(11.0f, 12.9f);
        mPath.rLineTo(-3.66f, 3.66f);
        mPath.rLineTo(-3.65f, -3.66f);
        mPath.close();
        mPath.moveTo(3.69f, 12.9f);
        mPath.rMoveTo(15.67f, -6.26f);
        mPath.cubicTo(17.61f, 4.88f, 15.3f, 4.0f, 13.0f, 4.0f);
        mPath.lineTo(13.0f, 0.76f);
        mPath.lineTo(8.76f, 5.0f);
        mPath.lineTo(13.0f, 9.24f);
        mPath.lineTo(13.0f, 6.0f);
        mPath.rCubicTo(1.79f, 0.0f, 3.58f, 0.68f, 4.95f, 2.05f);
        mPath.rCubicTo(2.73f, 2.73f, 2.73f, 7.17f, 0.0f, 9.9f);
        mPath.cubicTo(16.58f, 19.32f, 14.79f, 20.0f, 13.0f, 20.0f);
        mPath.rCubicTo(-0.97f, 0.0f, -1.94f, -0.21f, -2.84f, -0.61f);
        mPath.rLineTo(-1.49f, 1.49f);
        mPath.cubicTo(10.02f, 21.62f, 11.51f, 22.0f, 13.0f, 22.0f);
        mPath.rCubicTo(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        mPath.rCubicTo(3.52f, -3.51f, 3.52f, -9.21f, 0.0f, -12.72f);
        mPath.close();
        mPath.moveTo(19.36f, 6.6399994f);
        
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