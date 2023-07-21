package sesac.part23.network.retrofit

import com.google.gson.annotations.SerializedName

data class UserModel (
    @SerializedName("first_name")
    var firstName: String,
    @SerializedName("last_name")
    var lastName: String
)