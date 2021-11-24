package creational.builder;

public  class Human {
    private String hair;
    private String face;
    private String body;

    public Human(HumanBuilder humanBuilder) {
        this.hair = humanBuilder.getHair();
        this.face = humanBuilder.getFace();
        this.body = humanBuilder.getBody();
    }


    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Human{" +
                "hair='" + hair + '\'' +
                ", face='" + face + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
