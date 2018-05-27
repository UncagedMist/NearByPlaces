package kk.techbytecare.nearbyplaces.Common;

import kk.techbytecare.nearbyplaces.Model.Results;
import kk.techbytecare.nearbyplaces.Remote.IGoogleAPIService;
import kk.techbytecare.nearbyplaces.Remote.RetrofitClient;
import kk.techbytecare.nearbyplaces.Remote.RetrofitScalarClient;

public class Common {

    public static Results currentResults;

    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService()   {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }

    public static IGoogleAPIService getGoogleAPIServiceScalars()   {
        return RetrofitScalarClient.getScalarClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
