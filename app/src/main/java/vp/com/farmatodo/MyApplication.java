package vp.com.farmatodo;

import android.app.Application;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import timber.log.Timber;


public class MyApplication extends Application {

    private static MyApplication myApplication;
    String endpoint = "https://gateway.marvel.com/";
    Retrofit mRestAdapter;


    public static MyApplication getInstance() {
        return myApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }



        OkHttpClient.Builder okHttpClient = new OkHttpClient().newBuilder();
        okHttpClient.addInterceptor(chain -> {
            Timber.d(chain.toString());
            Request request = chain.request();
            HttpUrl url = request.url().newBuilder().addQueryParameter("ts", "1")
                    .addQueryParameter("apikey", "f130fb5b67b82dd2ce8e07cb05bce699")
                    .addQueryParameter("hash", "178f8e1f27158ece5219788d8ec4a022").build();
            request = request.newBuilder().url(url).build();
            return chain.proceed(request);
        });

        mRestAdapter = new Retrofit.Builder().baseUrl(endpoint).addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient.build())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
    }

    public Retrofit getRestAdapter() {
        return mRestAdapter;
    }

}
