package harlequinmettle.android.tools.androidsupportlibrary;

import harlequinmettle.android.tools.androidsupportlibrary.overridecustomization.CustomTextView;
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

	public static TextView makeAnotherTextView(String title) {
		Context contextReference = ContextReference.getAppContext();
		CustomTextView text = new CustomTextView(contextReference);
		text.setText(title);
		int padding_in_px_l = getPixelsDensityEquivalent(4);
		int padding_in_px_r = getPixelsDensityEquivalent(16);
		text.setPadding(padding_in_px_l, 0, padding_in_px_r, 0);
		// LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,
		// LayoutParams.MATCH_PARENT, Gravity.CENTER_VERTICAL);
		// text.setLayoutParams(params);
		text.setTextColor(0xffffffff);
		text.setId(title.hashCode());
		// text.setTextAppearance(c, R.style.MyStyle);
		return text;

	}

	public static TextView makeLeftTextView(String title) {
		Context contextReference = ContextReference.getAppContext();
		CustomTextView text = new CustomTextView(contextReference);
		text.setText(title);
		int padding_in_px_l = getPixelsDensityEquivalent(4);
		int padding_in_px_r = getPixelsDensityEquivalent(16);
		text.setPadding(padding_in_px_l, 0, padding_in_px_r, 0);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT, Gravity.CENTER_VERTICAL);
		text.setLayoutParams(params);
		text.setTextColor(0xffffffff);
		text.setId(title.hashCode());
		// text.setTextAppearance(c, R.style.MyStyle);
		return text;

	}

	public static TextView makeDefaultTextView(String title) {
		Context contextReference = ContextReference.getAppContext();
		CustomTextView text = new CustomTextView(contextReference);
		text.setText(title);
		int padding_in_px = getPixelsDensityEquivalent(16);
		text.setPadding(padding_in_px, 0, padding_in_px, 0);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT, Gravity.CENTER_VERTICAL);
		text.setLayoutParams(params);
		text.setTextColor(0xffffffff);
		text.setId(title.hashCode());
		// text.setTextAppearance(c, R.style.MyStyle);
		return text;

	}

	public static int getPixelsDensityEquivalent(int densityPixels) {
		final float scale = ContextReference.getAppContext().getResources().getDisplayMetrics().density;
		return (int) (densityPixels * scale + 0.5f);
	}
}
