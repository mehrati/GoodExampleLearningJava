import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Nashorn {

	public static void main(String[] srgs) throws ScriptException, FileNotFoundException {
        
      ScriptEngineManager sman = new ScriptEngineManager();
      ScriptEngine se = sman.getEngineByName("nashorn");
      se.eval(new FileReader("res/main.js"));
		
	}

}

