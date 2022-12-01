package turniplabs.autosavefix.mixin;

import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import turniplabs.autosavefix.AutosaveFix;

@Mixin(value = World.class, remap = false)
public class WorldMixin {

    @Shadow
    protected int autosavePeriod;

    @Inject(method = "<init>(Lnet/minecraft/src/ISaveHandler;Ljava/lang/String;JLnet/minecraft/src/Dimension;)V", at = @At("TAIL"))
    private void autosavefix_World(CallbackInfo ci) {
        autosavePeriod = AutosaveFix.autosavePeriod;
    }

}
