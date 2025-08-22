
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import android.app.Notification
import android.app.Notification.Builder
import android.app.PendingIntent
import android.content.Context
import android.os.Parcelable

open public class NotificationBuilderAPI23 : NotificationBuilder {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun build(context: Context, command: Command, message: String, integer: Integer, pendingIntent: PendingIntent)
        //nullable = true from not(false or (false and false)) = true
: Parcelable{

                    var context = context


                    var command = command


                    var message = message


                    var integer = integer


                    var pendingIntent = pendingIntent

    var notification: Notification = Builder(context).
                            setSmallIcon(integer.toInt())!!.setTicker(message)!!.setWhen(System.currentTimeMillis())!!.setContentTitle(command.getLabel())!!.setContentText(message)!!.setContentIntent(pendingIntent)!!.build()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return notification
}


}
                
            

