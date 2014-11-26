package harlequinmettle.android.tools.androidsupportlibrary;

import android.content.Context;
import android.view.Gravity;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

public class TextViewFactory {
	// public static Context contextReference;
	//
	// public static void setContext(Context contextReferenceVar) {
	// contextReference = contextReferenceVar;
	// }

	public static TextView makeDefaultTextView(String title) {
		Context contextReference = ContextReference.getAppContext();
		CustomTextView text = new CustomTextView(contextReference);
		text.setText(title);
		int padding_in_px = getPixelsDensityEquivalent(16);
		text.setPadding(padding_in_px, 0, padding_in_px, 0);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT, Gravity.CENTER_VERTICAL);
		text.setLayoutParams(params);
		text.setTextColor(0xffffffff);
		// text.setTextAppearance(c, R.style.MyStyle);
		return text;

	}

	private static int getPixelsDensityEquivalent(int densityPixels) {
		final float scale = ContextReference.getAppContext().getResources().getDisplayMetrics().density;
		return (int) (densityPixels * scale + 0.5f);
	}
}
