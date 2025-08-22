
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
        
        import java.lang.Integer
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.math.LayerDistanceUtil
import org.allbinary.thread.PriorityRunnable
import org.allbinary.thread.RunnableInterface

open public class WaypointPathRunnableBase
            : Object
        
                , RunnableInterface
                , PriorityRunnable {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val layerDistanceUtil: LayerDistanceUtil = LayerDistanceUtil.getInstance()!!

    var pathFindingLayer: PathFindingLayerInterface

    var targetLayer: PathFindingLayerInterface

    var priority: Int = Integer.MAX_VALUE

    var running: Boolean= false

open fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.running
}


open fun setRunning(isRunning: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var isRunning = isRunning
this.running= isRunning
}


                @Throws(Exception::class)
            
open fun setThread(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
{

                    var thread = thread
}


open fun setTargetLayer(waypointLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var waypointLayer = waypointLayer
this.targetLayer= waypointLayer
this.setPriority()
}


open fun setPriority()
        //nullable = true from not(false or (false and true)) = true
{
    var pathFindingLayer: AllBinaryLayer = this.pathFindingLayer as AllBinaryLayer


    var targetLayer: AllBinaryLayer = this.targetLayer as AllBinaryLayer


    
                        if(targetLayer != 
                                    null
                                )
                        
                                    {
                                    
    var distance: Int = layerDistanceUtil!!.getDistance(targetLayer, pathFindingLayer)!!


    var distanceCategory: Int = distance /70

this.priority= distanceCategory

                                    }
                                
}


open fun getTargetLayer()
        //nullable = true from not(false or (false and true)) = true
: PathFindingLayerInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return targetLayer
}


open fun setUnitLayer(unitLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var unitLayer = unitLayer
this.pathFindingLayer= unitLayer
}


open fun getPriority()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.priority
}


open fun isDone()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun run()
        //nullable = true from not(false or (false and true)) = true
{}


open fun reset()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

