package gnius.code.servapipublictop.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "fotoinformations")
public class FotoInformation {
    @Id
    private String id;

    private Image image;

    private String description;
    private Long like;

    private String user;

    public FotoInformation() {
    }

    public FotoInformation(String id, Image image, String description, Long like, String user) {
        this.id = id;
        this.image = image;
        this.description = description;
        this.like = like;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getLike() {
        return like;
    }

    public void setLike(Long like) {
        this.like = like;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

class Image{
    private String public_id;
    private String secure_url;

    public Image() {
    }

    public Image(String public_id, String secure_url) {
        this.public_id = public_id;
        this.secure_url = secure_url;
    }

    public String getPublic_id() {
        return public_id;
    }

    public void setPublic_id(String public_id) {
        this.public_id = public_id;
    }

    public String getSecure_url() {
        return secure_url;
    }

    public void setSecure_url(String secure_url) {
        this.secure_url = secure_url;
    }
}
