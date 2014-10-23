package adapters;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.github.datasnap.events.Event;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class RSerializers extends TypeAdapter<Event> {
	    @Override
	    public void write(JsonWriter out, Event m) throws IOException {
	        
	    	System.out.println("waterver");
	       // out.value(m);
	    }

		@Override
		public Event read(JsonReader arg0) throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
	
    public static void main(String args[]){
		Map<Object, String> myMap = new HashMap<Object, String>();
		myMap.put("one", "hello");
		myMap.put("two", "world");

		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(myMap);

		System.out.println(json);
    }
}
