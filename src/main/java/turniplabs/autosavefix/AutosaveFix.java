package turniplabs.autosavefix;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AutosaveFix implements ModInitializer {
    public static final String MOD_ID = "autosavefix";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static String name(String name) {
        return AutosaveFix.MOD_ID + "." + name;
    }

    public static int autosavePeriod = 4 * 60 * 20; // every 4 minutes

    @Override
    public void onInitialize() {
        LOGGER.info("AutosaveFix initialized.");
    }
}
