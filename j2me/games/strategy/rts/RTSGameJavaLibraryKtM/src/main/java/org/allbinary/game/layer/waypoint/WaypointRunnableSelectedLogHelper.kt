
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.game.layer.waypoint



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker

open public class WaypointRunnableSelectedLogHelper : WaypointRunnableLogHelper {
        

        companion object {


    private val instance: WaypointRunnableSelectedLogHelper = WaypointRunnableSelectedLogHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: WaypointRunnableSelectedLogHelper{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

open fun start(pathFindingLayerInterface: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(commonStrings!!.START_RUNNABLE)!!.toString(), this, commonStrings!!.RUN)
}


open fun end(pathFindingLayerInterface: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(commonStrings!!.END_RUNNABLE)!!.toString(), this, commonStrings!!.RUN)
}


}
                
            

