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
	private boolean isLabelVisible = true;
	private View visibleViewLabel;
	private ScrollObjectOutOfViewCallBack scrollOutOfViewActionable;
	private Rect scrollBounds = new Rect();

	public void registerCallBack(ScrollObjectOutOfViewCallBack scrolloutofviewaction) {
		this.scrollOutOfViewActionable = scrolloutofviewaction;
	}

	public void setVisibleViewLabel(View view) {
		this.visibleViewLabel = view;
		isLabelVisible = isViewVisible(view);

	}

	public boolean isViewVisible(View view) {
		if (view == null)
			return false;
		// Any portion visible
		getHitRect(scrollBounds);
		return visibleViewLabel.getLocalVisibleRect(scrollBounds);
	}

	@Override
	protected void onScrollChanged(int left, int top, int oldLeft, int oldTop) {
		if (top < oldTop)
			scrollingDown = true;
		else
			scrollingDown = false;

		if (isViewVisible(visibleViewLabel)) {
			// if (!isLabelVisible)
			// if (scrollingDown)
			// scrollOutOfViewActionable.doWhenViewScollsIntoView();
			isLabelVisible = true;
		} else {
			if (isLabelVisible)
				if (!scrollingDown)
					scrollOutOfViewActionable.doWhenViewScollsOutOfView();
			isLabelVisible = false;
		}

		super.onScrollChanged(left, top, oldLeft, oldTop);
	}
}
