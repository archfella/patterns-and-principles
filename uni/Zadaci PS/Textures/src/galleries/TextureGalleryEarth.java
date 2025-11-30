package galleries;


import textures.TextureLand;
import textures.TextureLandEarth;
import textures.TextureWater;
import textures.TextureWaterEarth;

public class TextureGalleryEarth extends TextureGallery{


    @Override
    protected TextureWater createTextureWater() {
        return new TextureWaterEarth();
    }

    @Override
    protected TextureLand createTextureLand() {
        return new TextureLandEarth();
    }
}
