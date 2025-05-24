package x310.plantain;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.command.CommandExecuteEvent;
import com.velocitypowered.api.event.player.PlayerChatEvent;
import com.velocitypowered.api.proxy.Player;

public class GenericListener {
    @Subscribe
    public void onPlayerCommandEvent(CommandExecuteEvent event) {
        if (!(event.getCommandSource() instanceof Player player)) {
            return;
        }

        event.setResult(CommandExecuteEvent.CommandResult.forwardToServer());

        Plantain.LOGGER.info(
                "Player {} executed command '{}'",
                player.getUsername(),
                event.getCommand()
        );
    }

    @Subscribe
    public void onPlayerChatEvent(PlayerChatEvent event) {
        Plantain.LOGGER.info(
                "Player {} sent chat message: {}",
                event.getPlayer().getUsername(),
                event.getMessage()
        );
    }
}
