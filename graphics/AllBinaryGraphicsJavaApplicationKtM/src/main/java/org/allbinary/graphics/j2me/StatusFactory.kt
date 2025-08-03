
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
        package org.allbinary.graphics.j2me



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil

open public class StatusFactory
            : Object
         {
        

        companion object {


    private val instance: StatusFactory = StatusFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StatusFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val SETSTATUS: String = "setStatus"

    private val STATUS_LABEL: String = "Status: "

open fun setStatusNoLog(status: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var status = status
MyFrame.statusJLabel!!.setText(status)
}


open fun setStatus(status: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var status = status
setStatusNoLog(status)
logUtil!!.put(STATUS_LABEL +status, this, SETSTATUS)
}


}
                
            

