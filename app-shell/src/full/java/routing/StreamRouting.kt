package routing

import android.content.Context
import android.content.Intent
import com.loki.astream.AStreamActivity
import com.loki.bstream.BStreamActivity
import com.loki.core.routing.Router

class StreamRouting : Router {

    override fun launchStreamA(context: Context) {
        context.startActivity(Intent(context, AStreamActivity::class.java))
    }

    override fun launchStreamB(context: Context) {
        context.startActivity(Intent(context, BStreamActivity::class.java))
    }
}