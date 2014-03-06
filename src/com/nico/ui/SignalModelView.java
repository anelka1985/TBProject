package com.nico.ui;


import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
/**
 * 2014-03-04
 * 功能模块view
 * @author Administrator
 *
 */
public class SignalModelView extends View {

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint p = new Paint();
		p.setColor(0XFFFFFF);
		p.setTextAlign(Align.CENTER);
		p.setTypeface(Typeface.MONOSPACE);
		canvas.drawPaint(p);

		Bitmap bmp = Bitmap.createBitmap(100, 100, Config.ARGB_8888);
		bmp.setPixel(100, 100, 0x00FF00);
		canvas.setBitmap(bmp);
//		canvas.drawBitmap(bitmap, left, top, paint)
		
	}

	@Override
	protected void onLayout(boolean changed, int left, int top, int right,
			int bottom) {
		super.onLayout(changed, left, top, right, bottom);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	public SignalModelView(Context context) {
		super(context);
	}

	public SignalModelView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public SignalModelView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	

}
