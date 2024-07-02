import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.hw_01_m7.data.local.dao.Dao
import com.example.hw_01_m7.data.local.mapToCameraModel
import com.example.hw_01_m7.data.local.mapToDoorModel
import com.example.hw_01_m7.data.network.apiService.ApiService
import com.example.hw_01_m7.data.network.models.camerasModel.CamerasBaseResponse
import com.example.hw_01_m7.data.network.models.doorsModel.DoorsBaseResponse
import javax.inject.Inject

class Repository @Inject constructor(
    private val api: ApiService,
    private val dao: Dao
) {

    private val _cameraLv = MutableLiveData<CamerasBaseResponse>()
    val cameraLv: LiveData<CamerasBaseResponse> get() = _cameraLv

    private val _doorLv = MutableLiveData<DoorsBaseResponse>()
    val doorLv: LiveData<DoorsBaseResponse> get() = _doorLv

    suspend fun fetchCameras() {
        try {
            val response = api.getCameras()
            _cameraLv.postValue(response)
            dao.loadCamera(response.mapToCameraModel())
        } catch (e: Exception) {
            Log.e(TAG, "Error fetching cameras: ${e.localizedMessage}")
        }
    }

    suspend fun fetchDoors() {
        try {
            val response = api.getDoors()
            _doorLv.postValue(response)
            dao.loadDoor(response.mapToDoorModel())
        } catch (e: Exception) {
            Log.e(TAG, "Error fetching doors: ${e.localizedMessage}")
        }
    }
}
