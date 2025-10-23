
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

    var pathFindingLayer: PathFindingLayerInterface = NullPathFindingLayer.NULL_PATH_FINDING_LAYER

    var targetPathFindingLayer: PathFindingLayerInterface = NullPathFindingLayer.NULL_PATH_FINDING_LAYER

    var priorityP: Int = Integer.MAX_VALUE

    var runningP: Boolean= false

    override fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.runningP
}


    override fun setRunning(isRunning: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var isRunning = isRunning
this.runningP= isRunning
}


                @Throws(Exception::class)
            
    override fun setThread(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
{
    //var thread = thread
}


    open fun setTargetLayer(waypointLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var waypointLayer = waypointLayer
this.targetPathFindingLayer= waypointLayer
this.setPriority()
}


    open fun setPriority()
        //nullable = true from not(false or (false and true)) = true
{

    var pathFindingLayer: AllBinaryLayer = this.pathFindingLayer as AllBinaryLayer


    var targetLayer: AllBinaryLayer = this.targetPathFindingLayer as AllBinaryLayer


    
                        if(targetLayer != 
                                    null
                                )
                        
                                    {
                                    
    var distance: Int = layerDistanceUtil!!.getDistance(targetLayer, pathFindingLayer)!!


    var distanceCategory: Int = distance /70

this.priorityP= distanceCategory

                                    }
                                
}


    open fun getTargetLayer()
        //nullable = true from not(false or (false and true)) = true
: PathFindingLayerInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return targetPathFindingLayer
}


    open fun setUnitLayer(unitLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var unitLayer = unitLayer
this.pathFindingLayer= unitLayer
}


    override fun getPriority()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.priorityP
}


    override fun isDone()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    override fun run()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun reset()
        //nullable = true from not(false or (false and true)) = true
{
}


}
                
            

