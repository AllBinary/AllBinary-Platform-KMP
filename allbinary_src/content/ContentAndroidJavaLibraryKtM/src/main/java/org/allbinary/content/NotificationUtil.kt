
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
                *  
                *  By agreeing to this license you and any business entity you represent are
                *  legally bound to the AllBinary Open License Version 1 legal agreement.
                *  
                *  You may obtain the AllBinary Open License Version 1 legal agreement from
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
                *  
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.content



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import org.allbinary.android.AndroidInfoFactory
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class NotificationUtil
            : Object
         {
        

        companion object {


    private val SINGLETON: NotificationUtil = NotificationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NotificationUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var notificationManager: NotificationManager = ResourceUtil.getInstance()!!.getContext()!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    private val notificationBuilder: NotificationBuilder
private constructor        ()
            : super()
        {
    var SDK_VERSION: Int = AndroidInfoFactory.getInstance()!!.getVersion()!!
            


    
                        if(SDK_VERSION > 22)
                        
                                    {
                                    notificationBuilder= NotificationBuilderAPI23()

                                    }
                                
                        else {
                            notificationBuilder= NotificationBuilder.NULL_NOTIFICATION_BUILDER

                        }
                            
}


open fun notify(command: Command, resource: String, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command


                    var resource = resource


                    var message = message

    var context: Context = ResourceUtil.getInstance()!!.getContext()!!
            


    var intent: Intent = CommandUriAction.getInstance()!!.getIntent(command)!!
            


    var integer: Integer = ResourceUtil.getInstance()!!.getResourceId(resource)!!
            


    var FLAG_IMMUTABLE: Int = 1 shl 26


    var SDK_VERSION: Int = AndroidInfoFactory.getInstance()!!.getVersion()!!
            


    var pendingIntent: PendingIntent = PendingIntent.getActivity(context, 0, intent, if(SDK_VERSION > 22) {
                            
                            FLAG_IMMUTABLE
                        
                            } else {
                            0
                            }
    )!!
            


    
                        if(notificationBuilder == 
                                    null
                                )
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.NOT_IMPLEMENTED)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
notificationBuilder!!.build(context, command, message, integer, pendingIntent)
}


}
                
            

