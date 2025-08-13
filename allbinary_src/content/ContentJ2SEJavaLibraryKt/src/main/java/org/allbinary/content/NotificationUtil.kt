
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
import org.allbinary.data.resource.ResourceUtil

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
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var notificationManager: NotificationManager = ResourceUtil.getInstance()!!.getContext()!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

open fun notify(command: Command, resource: String, message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command


                    var resource = resource


                    var message = message

    var context: Context = ResourceUtil.getInstance()!!.getContext()!!
            


    var intent: Intent = CommandUriAction.getInstance()!!.getIntent(command)!!
            


    var integer: Integer = ResourceUtil.getInstance()!!.getResourceId(resource)!!
            


    var notification: Notification = Notification(integer.toInt(), message, System.currentTimeMillis())


    var pendingIntent: PendingIntent = PendingIntent.getActivity(context, 0, intent, 0)!!
            

notification.setLatestEventInfo(context, command.getLabel(), message, pendingIntent)
notificationManager!!.notify(command.hashCode(), notification)
}


}
                
            

