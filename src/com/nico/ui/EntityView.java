package com.nico.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class EntityView extends LinearLayout {

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
//		canvas.
	}

	public EntityView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public EntityView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public EntityView(Context context) {
		super(context);
	}

	public EntityView(Context ctx, String type) {
		super(ctx);
	}

	
}
