package java_8_only;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornScript1 {

	public static String fun(String name){
		System.out.println("Hi there from Java, %s"+name);
		return "GoodBye Java";
	}
	public static void main(String[] args) {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("nashorn");
		try {
			Object obj1 = engine.eval("2+3");
			Object obj2 = engine.eval("load(\"" + "src" + "/" + "test.js" + "\");");
			Object obj3 = engine.eval("function hi(){\nvar a = 'PROSPER'.toLowerCase(); \nmiddle()"
					+ "; \nprint('Live long and' + a)}\n function middle(){\n var b = 1;"
					+ " for(var i=0, max = 5; i<max;i++){\nb++;\n}\n print('b is '+b);}hi();");
			System.out.println("Printing the output of eval obj1 : " + obj1);
			System.out.println("Printing the output of eval obj2 : " + obj2);
			System.out.println("Printing the output of eval obj3 : " + obj3);
			
// Going to call the function defined in JavaSCript from Java
			Invocable invocable = (Invocable)engine;
			try {
				Object result = invocable.invokeFunction("fun1","Amit");
				System.out.println(" Result of calling function from JS "+result);
				System.out.println("REsult class : "+result.getClass());
			
				Object result2 = invocable.invokeFunction("fun2", "TEsting");
				System.out.println("Result2 of function calling : "+result2);
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		} catch (ScriptException e) {
			e.printStackTrace();
		}

	}

}
