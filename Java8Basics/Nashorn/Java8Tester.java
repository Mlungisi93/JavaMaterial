package Java8Basics.Nashorn;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Java8Tester {

    public static void main(String args[]) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        String name = "Mahesh";
        Integer result = null;

        try {
            nashorn.eval("print('" + name + "')"); // java variable to nashorn
            result = (Integer) nashorn.eval("10 + 2");// nashron variable to java

        } catch(ScriptException e) {
            System.out.println("Error executing script: "+ e.getMessage());
        }
        System.out.println(result.toString());
    }
}