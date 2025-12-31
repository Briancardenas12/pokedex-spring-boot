package pokemon_client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;



@JsonIgnoreProperties(ignoreUnknown = true) // Solo mapeamos los que nos interesan
public class Pokemon {

    private int id;
    private String name;
    private int height;
    private int weight;
    private Sprites sprites;
    private List<TypeSlot> types;


    public Pokemon() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public List<TypeSlot> getTypes() {
        return types;
    }

    public void setTypes(List<TypeSlot> types) {
        this.types = types;
    }



    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Sprites {

        private String front_default;

        public Sprites() {
        }

        public String getFront_default() {
            return front_default;
        }

        public void setFront_default(String front_default) {
            this.front_default = front_default;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypeSlot {

        private Type type;

        public TypeSlot() {
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Type {

        private String name;

        public Type() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
