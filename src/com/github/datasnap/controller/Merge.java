package com.github.datasnap.controller;


import org.json.JSONException;
import org.json.JSONObject;


public class Merge{

/**
 * Merge "source" into "target". If fields have equal name, merge them recursively.
 * @return the merged object (target).
 */
public static JSONObject deepMerge(JSONObject source, JSONObject target) throws JSONException {
    for (String key: JSONObject.getNames(source)) {
            Object value = source.get(key);
            if (!target.has(key)) {
                // new value for "key":
                target.put(key, value);
            } else {
                // existing value for "key" - recursively deep merge:
                if (value instanceof JSONObject) {
                    JSONObject valueJson = (JSONObject)value;
                    deepMerge(valueJson, target.getJSONObject(key));
                } else {
                    target.put(key, value);
                }
            }
    }
    return target;
}



/**
 * demo program
 */
public static void main(String[] args) throws JSONException {
	
	Merge mt = new Merge();
    JSONObject a = new JSONObject("{offer: {issue1: value1}, accept: true}");
    JSONObject b = new JSONObject("{offer: {issue2: value2}, reject: false}");
    System.out.println(a+ " + " + b+" = "+ mt.deepMerge(a,b));
    // prints:
    // {"accept":true,"offer":{"issue1":"value1"}} + {"reject":false,"offer":{"issue2":"value2"}} = {"reject":false,"accept":true,"offer":{"issue1":"value1","issue2":"value2"}}
}

}