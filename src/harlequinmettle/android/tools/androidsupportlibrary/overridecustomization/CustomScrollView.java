package harlequinmettle.android.tools.androidsupportlibrary.overridecustomization;

import harlequinmettle.android.tools.androidsupportlibrary.ContextReference;
import harlequinmettle.android.tools.androidsupportlibrary.interfaces.ScrollObjectOutOfViewCallBack;
import android.content.Context;
import android.graphics.Rect;
import android.widget.ScrollView;

public class CustomScrollView extends ScrollView {
	// Context context;
	public CustomScrollView(Context context) {
		super(context);
	}

	public CustomScrollView() {
		super(ContextReference.getAppContext());
	}

	private ScrollObjectOutOfViewCallBack scrollOutOfViewActionable;
	private Rect scrollBounds = new Rect();

	public void registerCallBack(ScrollObjectOutOfViewCallBack scrolloutofviewaction) {
		this.scrollOutOfViewActionable = scrolloutofviewaction;
	}

	// public boolean isViewVisible(View view) {
	// if (view == null)
	// return false;
	// // Any portion visible
	// getHitRect(scrollBounds);
	// }

	@Override
	protected void onScrollChanged(int left, int top, int oldLeft, int oldTop) {

		scrollOutOfViewActionable.notifyTopAfterScrollEvent(top);

		super.onScrollChanged(left, top, oldLeft, oldTop);
	}
}
