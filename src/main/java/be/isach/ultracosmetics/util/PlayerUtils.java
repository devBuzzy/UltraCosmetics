package be.isach.ultracosmetics.util;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

/**
 * Created by Sacha on 17/10/15.
 */
public class PlayerUtils {

    public static Vector getHorizontalDirection(Player player) {
        Vector vector = new Vector();
        double rotX = (double)player.getLocation().getYaw();
        double rotY = 0;
        vector.setY(-Math.sin(Math.toRadians(rotY)));
        double xz = Math.cos(Math.toRadians(rotY));
        vector.setX(-xz * Math.sin(Math.toRadians(rotX)));
        vector.setZ(xz * Math.cos(Math.toRadians(rotX)));
        return vector;
    }

}
