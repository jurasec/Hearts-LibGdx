package net.jurasec.json;

public interface ResponseCallback<T> {

    void onResponse(T returnObject);
    void onFail(JsonClientException t);
}