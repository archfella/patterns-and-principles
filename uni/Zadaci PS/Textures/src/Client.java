import galleries.TextureGallery;
import galleries.TextureGalleryEarth;
import textures.Texture;

public class Client {
    public static void main(String[] args) {
        TextureGallery textureGallery = new TextureGalleryEarth();

        Texture texture1 = textureGallery.getTexture(TextureGallery.FieldType.LAND);
        Texture texture2 = textureGallery.getTexture(TextureGallery.FieldType.WATER);
        Texture texture3 = textureGallery.getTexture(TextureGallery.FieldType.LAND);
        Texture texture4 = textureGallery.getTexture(TextureGallery.FieldType.WATER);

        texture1.draw();
        texture2.draw();
        texture3.draw();
        texture4.draw();

        if (texture1 == texture3) {
            System.out.println("Flyweight used!");
        }

        if (texture2 == texture4) {
            System.out.println("Flyweight used again!");
        }
    }
}