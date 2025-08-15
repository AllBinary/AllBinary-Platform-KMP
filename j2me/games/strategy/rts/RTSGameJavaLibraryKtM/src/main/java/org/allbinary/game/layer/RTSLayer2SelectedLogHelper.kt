
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker

open public class RTSLayer2SelectedLogHelper : RTSLayer2LogHelper {
        

        companion object {
            
    private val instance: RTSLayer2SelectedLogHelper = RTSLayer2SelectedLogHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RTSLayer2SelectedLogHelper{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val TRACK_TO_FIRE_OR_MOVE: String = "trackTo:fireOrMove"

    private val BUILDING_CHASE: String = "buildingChase"

open fun steeringUp(pathFindingLayerInterface: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(" steering - Up")!!.toString(), this, TRACK_TO_FIRE_OR_MOVE)
}


open fun steeringFireOrStop(pathFindingLayerInterface: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(" steering - Fire/All Stop")!!.toString(), this, TRACK_TO_FIRE_OR_MOVE)
}


open fun buildingAbove(pathFindingLayerInterface: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(" Building Above")!!.toString(), this, BUILDING_CHASE)
}


open fun buildingChaseLeft(pathFindingLayerInterface: PathFindingLayerInterface, angle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface


                    var angle = angle
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(" steering - Going Left: ")!!.append(angle)!!.toString(), this, BUILDING_CHASE)
}


open fun buildingChaseRight(pathFindingLayerInterface: PathFindingLayerInterface, angle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface


                    var angle = angle
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(" steering - Going Right: ")!!.append(angle)!!.toString(), this, BUILDING_CHASE)
}


open fun buildingDown(pathFindingLayerInterface: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(" Building Below")!!.toString(), this, BUILDING_CHASE)
}


open fun buildingChaseDown(pathFindingLayerInterface: PathFindingLayerInterface, angle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface


                    var angle = angle
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(" steering - Going Down: ")!!.append(angle)!!.toString(), this, BUILDING_CHASE)
}


open fun buildingChaseUp(pathFindingLayerInterface: PathFindingLayerInterface, angle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface


                    var angle = angle
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(" steering - Going Up: ")!!.append(angle)!!.toString(), this, BUILDING_CHASE)
}


open fun buildingLeft(pathFindingLayerInterface: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(" Building Left")!!.toString(), this, BUILDING_CHASE)
}


open fun buildingRight(pathFindingLayerInterface: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingLayerInterface = pathFindingLayerInterface
logUtil!!.put(StringMaker().
                            append(pathFindingLayerInterface!!.getName())!!.append(" Building Right")!!.toString(), this, BUILDING_CHASE)
}


}
                
            

