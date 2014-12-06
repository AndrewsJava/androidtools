package harlequinmettle.android.tools.androidsupportlibrary.overridecustomization;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;

public class CustomTextView extends TextView {

	public CustomTextView(Context context) {
		super(context);
	}

	@Override
	public void draw(Canvas canvas) {
		Paint strokePaint = new Paint();
		strokePaint.setARGB(255, 255, 255, 255);
		// strokePaint.setStrokeWidth(2);

		int h = getHeight();
		int w = getWidth();
		canvas.drawLine(0, h - 1, w, h - 1, strokePaint);

		super.draw(canvas);
	}
}
