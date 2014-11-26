package harlequinmettle.android.tools.androidsupportlibrary;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListMap;

public class FloatStringBimap {

	ConcurrentSkipListMap<String, String> bimap = new ConcurrentSkipListMap<String, String>();

	public float getFloatFromStringKey(String key) {
		return (float) tryToParse(bimap.get(key), Float.NaN);
		// return (float) NumberTool.tryToParseDouble(bimap.get(key),
		// Double.NaN);
	}

	public static float tryToParse(String parsableNumber, float defaultValue) {
		try {
			return Float.parseFloat(parsableNumber.replaceAll(",", ""));
		} catch (Exception e) {
		}
		return defaultValue;
	}

	public ArrayList<String> put(String val, String val2) {
		ArrayList<String> previous = new ArrayList<String>();
		if (bimap.containsKey(val))
			previous.add(bimap.get(val));
		if (bimap.containsKey(val2))
			previous.add(bimap.get(val2));
		bimap.put(val, val2);
		bimap.put(val2, val);
		return previous;
	}

	public ArrayList<String> put(Float val, String val2) {
		// TODO: check for string equals float.tostring
		ArrayList<String> previous = new ArrayList<String>();
		if (bimap.containsKey(val))
			previous.add(bimap.get(val));
		if (bimap.containsKey(val2))
			previous.add(bimap.get(val2));
		bimap.put(val.toString(), val2);
		bimap.put(val2, val.toString());
		return previous;
	}

	public ArrayList<String> put(String val, Float val2) {
		ArrayList<String> previous = new ArrayList<String>();
		if (bimap.containsKey(val))
			previous.add(bimap.get(val));
		if (bimap.containsKey(val2))
			previous.add(bimap.get(val2));
		bimap.put(val, val2.toString());
		bimap.put(val2.toString(), val);
		return previous;
	}
}
