package routing

import android.content.Context
import android.content.Intent
import com.techery.astream.AStreamActivity
import com.techery.bstream.BStreamActivity
import com.techery.core.routing.Router

class StreamRouting : Router {

    override fun launchStreamA(context: Context) {
        context.startActivity(Intent(context, AStreamActivity::class.java))
    }

    override fun launchStreamB(context: Context) {
        context.startActivity(Intent(context, BStreamActivity::class.java))
    }
}