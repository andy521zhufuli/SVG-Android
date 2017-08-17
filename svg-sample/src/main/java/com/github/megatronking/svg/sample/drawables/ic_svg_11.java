package com.github.megatronking.svg.sample.drawables;

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
public class ic_svg_11 extends SVGRenderer {

    public ic_svg_11(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(48.0f);
        mHeight = dip2px(48.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 455.731f;
        final float scaleY = h / 455.731f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(0.0f, 0.0f);
        mPath.rLineTo(455.731f, 0f);
        mPath.rLineTo(0f, 455.731f);
        mPath.rLineTo(-455.731f, 0f);
        mPath.close();
        mPath.moveTo(0.0f, 0.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-487383, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(349.922f, 190.236f);
        mPath.rLineTo(-14.072f, 0f);
        mPath.rCubicTo(-11.015f, 0.0f, -19.944f, -8.929f, -19.944f, -19.944f);
        mPath.rLineTo(0f, -1.389f);
        mPath.rCubicTo(0.0f, -46.252f, -37.495f, -83.747f, -83.747f, -83.747f);
        mPath.rLineTo(-62.547f, 0f);
        mPath.rCubicTo(-46.252f, 0.0f, -83.747f, 37.495f, -83.747f, 83.747f);
        mPath.rLineTo(0f, 117.927f);
        mPath.rCubicTo(0.0f, 46.252f, 37.495f, 83.747f, 83.747f, 83.747f);
        mPath.rLineTo(116.507f, 0f);
        mPath.rCubicTo(46.252f, 0.0f, 83.747f, -37.495f, 83.747f, -83.747f);
        mPath.rLineTo(0f, -76.649f);
        mPath.cubicTo(369.866f, 199.165f, 360.936f, 190.236f, 349.922f, 190.236f);
        mPath.close();
        mPath.moveTo(349.922f, 190.236f);
        mPath.moveTo(173.196f, 157.576f);
        mPath.rLineTo(66.74f, 0f);
        mPath.rCubicTo(9.019f, 0.0f, 16.33f, 7.311f, 16.33f, 16.33f);
        mPath.rCubicTo(0.0f, 9.018997f, -7.311f, 16.33f, -16.33f, 16.33f);
        mPath.rLineTo(-66.74f, 0f);
        mPath.rCubicTo(-9.019f, 0.0f, -16.33f, -7.311f, -16.33f, -16.33f);
        mPath.cubicTo(156.86598f, 164.88701f, 164.177f, 157.576f, 173.196f, 157.576f);
        mPath.close();
        mPath.moveTo(173.196f, 157.576f);
        mPath.moveTo(283.956f, 298.156f);
        mPath.rLineTo(-110.76f, 0f);
        mPath.rCubicTo(-9.019f, 0.0f, -16.33f, -7.311f, -16.33f, -16.33f);
        mPath.rCubicTo(0.0f, -9.019f, 7.311f, -16.33f, 16.33f, -16.33f);
        mPath.rLineTo(110.76f, 0f);
        mPath.rCubicTo(9.019f, 0.0f, 16.33f, 7.311f, 16.33f, 16.33f);
        mPath.cubicTo(300.286f, 290.844f, 292.974f, 298.156f, 283.956f, 298.156f);
        mPath.close();
        mPath.moveTo(283.956f, 298.156f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-1, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}