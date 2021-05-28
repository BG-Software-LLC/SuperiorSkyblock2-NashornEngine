package com.bgsoftware.superiorskyblock.scripts;

import com.bgsoftware.superiorskyblock.api.scripts.IScriptEngine;
import org.openjdk.nashorn.api.scripting.NashornScriptEngineFactory;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;

public final class NashornScript implements IScriptEngine {

    private static final NashornScript instance = new NashornScript();
    private static final String[] JAVASCRIPT_ENGINE_NAMES = new String[] {
            "js", "JS", "javascript", "JavaScript", "ecmascript", "ECMAScript", "nashorn", "Nashorn"
    };

    public static NashornScript getInstance() {
        return instance;
    }

    private final ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    private final ScriptEngine engine;

    private NashornScript(){
        ScriptEngineFactory factory = new NashornScriptEngineFactory();
        Arrays.stream(JAVASCRIPT_ENGINE_NAMES).forEach(n -> scriptEngineManager.registerEngineName(n, factory));
        engine = scriptEngineManager.getEngineByName("nashorn");
    }

    @Override
    public Object eval(String stringToEvaluate) throws ScriptException {
        return engine.eval(stringToEvaluate);
    }

    @Override
    public Object eval(String stringToEvaluate, Bindings bindings) throws ScriptException {
        return engine.eval(stringToEvaluate, bindings);
    }

}
