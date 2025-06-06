package x310.plantain.hook;

import com.velocitypowered.proxy.protocol.MinecraftPacket;

import java.util.function.Supplier;

public interface PacketHook {
    Supplier<MinecraftPacket> getHook();

    Class<? extends MinecraftPacket> getType();

    Class<? extends MinecraftPacket> getHookClass();
}
