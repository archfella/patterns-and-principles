package galleries;

import textures.TextureLand;
import textures.TextureLandMars;
import textures.TextureWater;
import textures.TextureWaterMars;

public class TextureGalleryMars extends TextureGallery {

    @Override
    protected TextureWater createTextureWater() {
        return new TextureWaterMars();
    }

    @Override
    protected TextureLand createTextureLand() {
        return new TextureLandMars();
    }
}
