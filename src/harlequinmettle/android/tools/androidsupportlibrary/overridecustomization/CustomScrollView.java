package harlequinmettle.android.tools.androidsupportlibrary.overridecustomization;

import harlequinmettle.android.tools.androidsupportlibrary.ContextReference;
import harlequinmettle.android.tools.androidsupportlibrary.interfaces.ScrollObjectOutOfViewCallBack;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;

public class CustomScrollView extends ScrollView {
	// Context context;
	public CustomScrollView(Context context) {
		super(context);
	}

	public CustomScrollView() {
		super(ContextReference.getAppContext());
	}

	private boolean scrollingDown = false;
	private boolean isVisible = true;
	private View visibleView;
	private ScrollObjectOutOfViewCallBack scrollOutOfViewActionable;
	private Rect scrollBounds = new Rect();

	public void registerCallBack(ScrollObjectOutOfViewCallBack scrolloutofviewaction) {
		this.scrollOutOfViewActionable = scrolloutofviewaction;
	}

	public void setVisibleView(View view) {
		this.visibleView = view;
		isVisible = isViewVisible(view);
	}

	public boolean isViewVisible(View view) {

		// Any portion visible
		getHitRect(scrollBounds);
		return visibleView.getLocalVisibleRect(scrollBounds);
	}

	@Override
	protected void onScrollChanged(int left, int top, int oldLeft, int oldTop) {
		if (top < oldTop)
			scrollingDown = true;
		else
			scrollingDown = false;

		if (isViewVisible(visibleView)) {
			// if (!isVisible)
			// if (scrollingDown)
			// scrollOutOfViewActionable.doWhenViewScollsIntoView();
			isVisible = true;
		} else {
			if (isVisible)
				if (!scrollingDown)
					scrollOutOfViewActionable.doWhenViewScollsOutOfView();
			isVisible = false;
		}
		super.onScrollChanged(left, top, oldLeft, oldTop);
	}
}
