package net.jurasec.json;

import net.jurasec.json.vo.VOCards;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net.HttpRequest;
import com.badlogic.gdx.Net.HttpMethods;
import com.badlogic.gdx.Net.HttpResponse;
import com.badlogic.gdx.Net.HttpResponseListener;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.JsonReader;

//import com.badlogic.gdx.Net.HttpStatus;

public class JsonClient{

    private String baseURL = "http://192.168.1.65:3000";

    //Singleton pattern ------
    private static JsonClient instance;
    private JsonClient() {
    }
    public static synchronized JsonClient getInstance() {
        if(instance == null) {
            instance = new JsonClient();
        }
        return instance;
    }
    //------------------------


    public <T> void sendPost(Object requestObject, String uri, final ResponseCallback<T> callback, final Class<T> clazz) {
        sendRequest(requestObject, uri, "POST", callback, clazz);
    }

    public <T> void sendRequest(Object requestObject, String uri, String method, final ResponseCallback<T> callback, final Class<T> clazz) {

        String requestJson = JsonUtil.getInstance().toJson(requestObject);

        HttpRequest request = new HttpRequest( HttpMethods.POST );
        final String url = getURL(uri);
        
        Gdx.app.log("hearts", "URL: "+ url);
        request.setUrl(url);

        request.setContent(requestJson);

//        request.setHeader("Content-Type", "application/json");
//        request.setHeader("Accept", "application/json");
//        String authHeader = "Basic " + Base64Util.toBase64("user:pass");
//        request.setHeader("Authorization", authHeader);
        
//        Log.d("hearts", "Gdx is null? "+ (Gdx.app == null));
//        Log.d("hearts", "Gdx is null? "+ (Gdx.app == null));
        
//        Gdx.app.log("hearts", "Json request OK.");        
        Gdx.app.log("hearts","request: "+ request.getUrl() );
        Gdx.app.log("hearts","Method: "+ request.getMethod() );
        Gdx.net.sendHttpRequest(request, new HttpResponseListener() {
            public void handleHttpResponse(HttpResponse httpResponse) {

                int statusCode = httpResponse.getStatus().getStatusCode();
                if(statusCode != 200) {
                    callback.onFail(new JsonClientException(url,"Received http status: " + statusCode));
                    return;
                }

                String responseJson = httpResponse.getResultAsString();
                Gdx.app.log("hearts", "=====>> " + responseJson);
//                Object array = new JsonReader().parse(responseJson);
//                Gdx.app.log("hearts", "aaaaa " + ((Array<VOCards>)array).get(0).getCardValue());
                try {
//                	Object responseObject1 = JsonUtil.getInstance().fromJson(Object.class, responseJson);
//                	Gdx.app.log("hearts", "responseObject1: "+responseObject1.toString());
                    T responseObject = JsonUtil.getInstance().fromJson(clazz, responseJson);
                    callback.onResponse(responseObject);
                }
                catch(Exception exception) {
                    callback.onFail(new JsonClientException(url, "Exception parsing response as JSON.", exception));
                }
            }

            public void failed(Throwable t) {
                callback.onFail(new JsonClientException(url, t));
            }
        });

    }

    private String getURL(String uri) {
        return baseURL + uri;
    }
}