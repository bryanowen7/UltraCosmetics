package be.isach.ultracosmetics.cosmetics.type;

import be.isach.ultracosmetics.cosmetics.Category;
import be.isach.ultracosmetics.cosmetics.Cosmetic;
import be.isach.ultracosmetics.util.ServerVersion;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;

/**
 * Represents a Cosmetic Type with a Material, a Data, and an Entity Type.
 *
 * @author iSach
 * @since 08-04-2016
 */
public abstract class CosmeticEntType<T extends Cosmetic> extends CosmeticMatType<T> {
	
	private EntityType entityType;
	
	public CosmeticEntType(Category category, String configName, String permission, String description, Material material, byte data, EntityType entityType, Class clazz, ServerVersion baseVersion) {
		super(category, configName, permission, description, material, data, clazz, baseVersion);
		this.entityType = entityType;
	}
	
	public EntityType getEntityType() {
		return entityType;
	}
}
