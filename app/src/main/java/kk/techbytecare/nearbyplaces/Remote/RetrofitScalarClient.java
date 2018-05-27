package kk.techbytecare.nearbyplaces.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitScalarClient {

    private static Retrofit retrofit = null;
    public static Retrofit getScalarClient(String baseUrl)    {

        if (retrofit == null)   {

            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
