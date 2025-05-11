package x310.plantain;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.command.PostCommandInvocationEvent;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(id = "plantain", name = "plantain", version = "1.0", description = "Logs all commands executed in the proxy")
public class Plantain {

    @Inject
    private Logger logger;

    @Subscribe
    public void onCommandExecuted(PostCommandInvocationEvent event) {
        logger.info("{} Executed: {} ", event.getCommandSource(), event.getCommand());
    }
}
