package harlequinmettle.android.tools.androidsupportlibrary;

import android.content.Context;

public class ContextReference {
	public static Context appContext;

	public ContextReference(Context ctx) {
		appContext = ctx;
	}

	public static Context getAppContext() {
		return appContext;
	}

}
