package galleries;

import textures.Texture;
import textures.TextureLand;
import textures.TextureWater;

import java.util.HashMap;
import java.util.Map;

public abstract class TextureGallery {
    public enum FieldType {LAND, WATER};

    private Map<FieldType, Texture> textures = new HashMap<>();
    protected abstract TextureWater createTextureWater();
    protected abstract TextureLand createTextureLand();

    public Texture getTexture(FieldType type) {
        if (textures.get(type) == null) {
            if (type == FieldType.LAND) {
                textures.put(type, createTextureLand());
            } else if (type == FieldType.WATER) {
                textures.put(type, createTextureWater());
            }
        }
        return textures.get(type);
    }
}
