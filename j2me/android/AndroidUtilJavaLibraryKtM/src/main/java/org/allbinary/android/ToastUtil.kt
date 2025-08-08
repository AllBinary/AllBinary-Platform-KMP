
        /* Generated Code Do Not Modify */
        package org.allbinary.android



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.content.Context
import android.view.View
import android.widget.Toast
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ToastUtil
            : Object
         {
        

        companion object {


    private val instance: ToastUtil = ToastUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ToastUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

open fun makeToast(view: View, context: Context, message: String, time: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var view = view


                    var context = context


                    var message = message


                    var time = time

open class MakeToast
            : Object
        
                , Runnable {
        

    val string: String
public constructor        (string: String)
            : super()
        {

                    var string = string
this.string= string
}


open fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            Toast.makeText(context, string, time)!!.show()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            
view.post(MakeToast(message))
}


}
                
            

