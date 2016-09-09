package java_8_only;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornScript2 {
	
	public static void main(String[] args) {

		ScriptEngineManager engineMgr = new ScriptEngineManager();
		ScriptEngine se = engineMgr.getEngineByName("nashorn");
		try {
			se.eval("print('using the JS');");
			try {
				se.eval(new FileReader("test2.js"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
