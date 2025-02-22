package dev.optimistic.prophet.mixin;

import dev.optimistic.prophet.Allahfy;
import net.minecraft.network.chat.contents.TranslatableContents;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TranslatableContents.class)
public class TranslatableContentsMixin {
  @Shadow
  @Final
  @Mutable
  private @Nullable String fallback;

  @Shadow
  @Final
  @Mutable
  private String key;

  @Inject(method = "<init>", at = @At("TAIL"))
  private void onInit(String key, String fallback, Object[] args, CallbackInfo ci) {
    this.key = Allahfy.allahfy(key);
    this.fallback = Allahfy.allahfy(fallback);
  }
}
