package com.bgsoftware.superiorskyblock.modules.nashornengine;

import com.bgsoftware.superiorskyblock.api.SuperiorSkyblock;
import com.bgsoftware.superiorskyblock.api.commands.SuperiorCommand;
import com.bgsoftware.superiorskyblock.api.modules.PluginModule;
import com.bgsoftware.superiorskyblock.scripts.NashornScript;
import org.bukkit.event.Listener;

public final class NashornModule extends PluginModule {

    public NashornModule(){
        super("nashorn-engine", "Ome_R");
    }

    @Override
    public void onEnable(SuperiorSkyblock superiorSkyblock) {
        superiorSkyblock.setScriptEngine(NashornScript.getInstance());
    }

    @Override
    public void onReload(SuperiorSkyblock superiorSkyblock) {

    }

    @Override
    public void onDisable(SuperiorSkyblock superiorSkyblock) {
        superiorSkyblock.setScriptEngine(null);
    }

    @Override
    public Listener[] getModuleListeners(SuperiorSkyblock superiorSkyblock) {
        return null;
    }

    @Override
    public SuperiorCommand[] getSuperiorCommands(SuperiorSkyblock superiorSkyblock) {
        return null;
    }

    @Override
    public SuperiorCommand[] getSuperiorAdminCommands(SuperiorSkyblock superiorSkyblock) {
        return null;
    }

}
