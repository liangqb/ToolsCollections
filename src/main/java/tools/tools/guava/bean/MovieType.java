package tools.tools.guava.bean;

import java.io.Serializable;

public class MovieType implements Serializable {

    private Integer id;
    private String typeName;

    public MovieType() {
    }

    public MovieType(Integer id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "MovieType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
