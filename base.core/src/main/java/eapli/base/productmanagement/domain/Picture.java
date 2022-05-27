package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.List;

@Embeddable
public class Picture implements ValueObject {
    private String picturePaths;

    public Picture(String picturePaths){
        this.picturePaths = picturePaths;
    }

    public Picture(){
        // empty constructor
    }

    public String picturePath() {
        return picturePaths;
    }

    public static Picture valueOf(final String path){
        return new Picture(path);
    }


}
