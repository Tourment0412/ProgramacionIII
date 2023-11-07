package co.uniquindio.programacionIII.integralesdobles;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Evaluacion {
	
	 // Función para evaluar la función en un número dado.
    public static double evaluarFuncion(String funcion, double x) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        try {
            engine.put("x", x);
            Object result = engine.eval(funcion);
            if (result instanceof Number) {
                return ((Number) result).doubleValue();
            } else {
                throw new IllegalArgumentException("La expresión de la función es inválida.");
            }
        } catch (ScriptException e) {
            throw new IllegalArgumentException("La expresión de la función es inválida.");
        }
    }

}
