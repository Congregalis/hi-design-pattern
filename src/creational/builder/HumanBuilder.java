package creational.builder;

public class HumanBuilder {
    private String hair;
    private String face;
    private String body;

    HumanBuilder() {
        buildDefault();
    }

    HumanBuilder buildHair(String hair) {
        this.hair = hair;
        return this;
    }

    HumanBuilder buildFace(String face) {
        this.face = face;
        return this;
    }

    HumanBuilder buildBody(String body) {
        this.body = body;
        return this;
    }

    HumanBuilder buildDefault() {
        this.hair = "black and long";
        this.face = "cool";
        this.body = "strong";

        return this;
    }

    public Human build() {
        return new Human (this);
    }

    public String getHair() {
        return hair;
    }

    public String getFace() {
        return face;
    }

    public String getBody() {
        return body;
    }
}
