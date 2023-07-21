package sesac.part21.limit.JobScheduler

import android.app.Service
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : JobService() {

    override fun onCreate() {
        super.onCreate()
        Log.d("ddd", "MyService ,,,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ddd", "MyService ,,,")
    }

    override fun onStartJob(p0: JobParameters?): Boolean {
        Log.d("ddd", "MyService ,,,onStartJob,,,")
        return false
    }

    override fun onStopJob(p0: JobParameters?): Boolean {
        Log.d("ddd", "MyService ,,,onStopJob,,,")
        return false
    }
}