package sesac.part23.network.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface INetworkService {
    @GET("api/users")
    fun doGetUserList(@Query("page") page: String): Call<UserListModel>
}