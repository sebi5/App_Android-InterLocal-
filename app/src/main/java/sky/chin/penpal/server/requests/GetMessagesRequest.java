package sky.chin.penpal.server.requests;

import com.android.volley.Request;

import sky.chin.penpal.configs.Url;

public class GetMessagesRequest extends ServerRequest {
    @Override
    public int method() {
        return Request.Method.POST;
    }

    @Override
    public String url() {
        return Url.MESSAGES;
    }

    private String id;
    private String userId;
    private String userPassword;
    private String limit;
    private String skip;
    private String lastId;

    private GetMessagesRequest(Builder builder) {
        setId(builder.id);
        setUserId(builder.userId);
        setUserPassword(builder.userPassword);
        setSkip(builder.skip);
        setLimit(builder.limit);
        setLastId(builder.lastId);
    }

    public void setId(String id) {
        this.id = id;
        addParam("id", this.id);
    }

    public void setUserId(String userId) {
        this.userId = userId;
        addParam("u_id", this.userId);
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        addParam("u_pass", this.userPassword);
    }

    public void setSkip(String skip) {
        this.skip = skip;
        addParam("skip", this.skip);
    }

    public void setLimit(String limit) {
        this.limit = limit;
        addParam("limit", this.limit);
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
        addParam("last_id", this.lastId);
    }

    public static class Builder {

        private String id;
        private String userId;
        private String userPassword;
        private String limit;
        private String skip;
        private String lastId;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder userId(String value){
            this.userId = value;
            return this;
        }

        public Builder userPassword(String value){
            this.userPassword = value;
            return this;
        }

        public Builder limit(String value){
            this.limit = value;
            return this;
        }

        public Builder skip(String value){
            this.skip = value;
            return this;
        }

        public Builder lastId(String value){
            this.lastId = value;
            return this;
        }

        public GetMessagesRequest build(){ return new GetMessagesRequest(this); }

    }
}
