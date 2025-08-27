
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2019 AllBinary 
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
        package org.allbinary.android




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

//import java.util.List
import android.app.ActivityManager
import android.app.ActivityManager.RunningServiceInfo
import android.content.ComponentName
import android.content.Context
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AndroidServicesUtil
            : Object
         {
        

        companion object {
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AndroidServicesUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private val instance: AndroidServicesUtil = AndroidServicesUtil()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!

    private val SERVICE_LIMIT_MAX: Int = 1000

    private val IS_SERVICE_RUNNING: String = "isServiceRunning"

    private val SERVICE_NOT_FOUND_RUNNING: String = "Service not found Running: "

open fun isServiceRunning(name: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var name = name

    var activityManager: ActivityManager = resourceUtil!!.getContext()!!.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager


    var runningServicesList: List<RunningServiceInfo> = activityManager!!.getRunningServices(SERVICE_LIMIT_MAX)!!


    var runningServiceInfo: ActivityManager.RunningServiceInfo


    var serviceComponent: ComponentName


    var serviceName: String


    var size: Int = runningServicesList!!.size!!





                        for (index in 0 until size)

        {runningServiceInfo= runningServicesList!!.get(index)
serviceComponent= runningServiceInfo!!.service
serviceName= serviceComponent!!.toString()

    
                        if(serviceName!!.indexOf(name) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}

logUtil!!.put(SERVICE_NOT_FOUND_RUNNING +name, this, IS_SERVICE_RUNNING)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

