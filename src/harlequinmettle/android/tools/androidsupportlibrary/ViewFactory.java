package harlequinmettle.android.tools.androidsupportlibrary;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;
import static android.widget.LinearLayout.VERTICAL;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ViewFactory {

	public static final int MAX_BUTTON_WIDTH = 550;

	public static final int TEXT_SMALL = 21;
	public static final int TEXT_MED = 25;
	public static final int TEXT_LARGE = 35;

	public static ViewPager basicViewPager() {
		ViewPager viewpager = new ViewPager(ContextReference.getAppContext());
		LayoutParams params = new ViewGroup.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		viewpager.setLayoutParams(params);

		return viewpager;
	}

	public static Button simpleButton() {
		Button button = new Button(ContextReference.getAppContext());
		button.setHeight(WRAP_CONTENT);
		button.setMaxWidth(MAX_BUTTON_WIDTH);
		button.setMaxLines(5);
		button.setTextSize(TypedValue.COMPLEX_UNIT_DIP, TEXT_MED);
		return button;
	}

	public static RadioButton simpleRadioButton() {
		RadioButton button = new RadioButton(ContextReference.getAppContext());
		button.setHeight(WRAP_CONTENT);
		button.setMaxWidth(MAX_BUTTON_WIDTH);
		button.setMaxLines(5);
		button.setTextSize(TypedValue.COMPLEX_UNIT_DIP, TEXT_SMALL);
		return button;
	}

	public static TextView textView() {
		TextView ta = new TextView(ContextReference.getAppContext());
		ta.setHeight(WRAP_CONTENT);
		ta.setMaxWidth(MAX_BUTTON_WIDTH);
		ta.setMaxLines(5);
		ta.setTextSize(TypedValue.COMPLEX_UNIT_DIP, TEXT_MED);
		return ta;
	}

	// ///////////////////////////////////////
	public static LinearLayout basicLinearLayout() {
		LinearLayout basic = new LinearLayout(ContextReference.getAppContext());
		ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		basic.setLayoutParams(params);
		basic.setOrientation(VERTICAL);
		return basic;
	}

}
