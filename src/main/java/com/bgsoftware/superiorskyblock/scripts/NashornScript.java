package com.bgsoftware.superiorskyblock.scripts;

import com.bgsoftware.superiorskyblock.api.scripts.IScriptEngine;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public final class NashornScript implements IScriptEngine {

    private static final NashornScript instance = new NashornScript();

    public static NashornScript getInstance() {
        return instance;
    }

    private final ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

    private NashornScript(){

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
