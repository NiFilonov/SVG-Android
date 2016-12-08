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
public class ic_battery_unknown extends SVGRenderer {

    public ic_battery_unknown(Context context) {
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
        
        mPath.moveTo(15.67f, 4.0f);
        mPath.lineTo(14.0f, 4.0f);
        mPath.lineTo(14.0f, 2.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.lineTo(8.33f, 4.0f);
        mPath.cubicTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        mPath.rLineTo(0f, 15.33f);
        mPath.cubicTo(7.0f, 21.4f, 7.6f, 22.0f, 8.33f, 22.0f);
        mPath.rLineTo(7.33f, 0f);
        mPath.rCubicTo(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        mPath.lineTo(17.0f, 5.33f);
        mPath.cubicTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        mPath.close();
        mPath.moveTo(15.67f, 4.0f);
        mPath.rMoveTo(-2.72f, 13.95f);
        mPath.rLineTo(-1.9f, 0f);
        mPath.rLineTo(0f, -1.9f);
        mPath.rLineTo(1.9f, 0f);
        mPath.rLineTo(0f, 1.9f);
        mPath.close();
        mPath.moveTo(12.95f, 17.95f);
        mPath.rMoveTo(1.35f, -5.26f);
        mPath.rCubicTo(0.0f, 0.0f, -0.38f, 0.42f, -0.67f, 0.71f);
        mPath.rCubicTo(-0.48f, 0.48f, -0.83f, 1.15f, -0.83f, 1.6f);
        mPath.rLineTo(-1.6f, 0f);
        mPath.rCubicTo(0.0f, -0.83f, 0.46f, -1.52f, 0.93f, -2.0f);
        mPath.rLineTo(0.93f, -0.94f);
        mPath.rCubicTo(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f);
        mPath.rCubicTo(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        mPath.rCubicTo(-0.8299999f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        mPath.lineTo(9.0f, 11.000002f);
        mPath.rCubicTo(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        mPath.rCubicTo(1.6599998f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        mPath.rCubicTo(0.0f, 0.66f, -0.27f, 1.26f, -0.7f, 1.69f);
        mPath.close();
        mPath.moveTo(14.3f, 12.690001f);
        
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