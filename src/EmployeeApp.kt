import retrofit2.Call
import retrofit2.http.GET

interface ApiClient {
    @GET("/api/data")
    fun fetchData(): Call<String>
}
