package API;

public class ResponseRegister {
    private Integer id;

    private String token;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

    public ResponseRegister(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public ResponseRegister() {
    }
}

