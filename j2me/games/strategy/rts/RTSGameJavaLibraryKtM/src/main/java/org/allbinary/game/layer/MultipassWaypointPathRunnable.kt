
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil
import org.allbinary.thread.ARunnable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.pathfinding.MultipassState
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class MultipassWaypointPathRunnable : WaypointPathRunnableBase {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val basicArrayListUtil: BasicArrayListUtil = BasicArrayListUtil.getInstance()!!

    private val multipassState: MultipassState = MultipassState()

    private var done: Boolean = false

    private var list: BasicArrayList = basicArrayListUtil!!.getImmutableInstance()!!

    private var pathFindingInfo: Any = NullUtil.getInstance()!!.NULL_OBJECT

    private val FIRST_RUNNABLE: Runnable = object: ARunnable()
                                {
                                
    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            pathFindingLayer!!.getWaypointRunnableLogHelper()!!.start(pathFindingLayer)
reset2()

    var geographicMapCellPosition: GeographicMapCellPosition = pathFindingLayer!!.getCurrentGeographicMapCellPosition()!!


    
                        if(geographicMapCellPosition == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Should never be running here")

                                    }
                                
pathFindingInfo= targetPathFindingLayer!!.getWaypointBehavior()!!.getWaypoint()!!.getPathFindingInfo(geographicMapCellPosition)

    var localPathFindingInfo: PathFindingInfo = pathFindingInfo as PathFindingInfo

list= targetPathFindingLayer!!.getWaypointBehavior()!!.getWaypoint()!!.getPathsList(geographicMapCellPosition, localPathFindingInfo, multipassState)

    
                        if(list != basicArrayListUtil!!.getImmutableInstance())
                        
                                    {
                                    END_RUNNABLE.run()

                                    }
                                
                        else {
                            currentPassRunnable= SECOND_RUNNABLE

                        }
                            
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
setRunning(false)
finish()
}

}

                                }
                            

    private val SECOND_RUNNABLE: Runnable = object: ARunnable()
                                {
                                
    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var geographicMapCellPosition: GeographicMapCellPosition = pathFindingLayer!!.getCurrentGeographicMapCellPosition()!!


    var localPathFindingInfo: PathFindingInfo = pathFindingInfo as PathFindingInfo

list= targetPathFindingLayer!!.getWaypointBehavior()!!.getWaypoint()!!.getPathsList(geographicMapCellPosition, localPathFindingInfo, multipassState)

    
                        if(list != basicArrayListUtil!!.getImmutableInstance())
                        
                                    {
                                    END_RUNNABLE.run()

                                    }
                                
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
setRunning(false)
finish()
}

}

                                }
                            

    private val END_RUNNABLE: Runnable = object: ARunnable()
                                {
                                
    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var waypointBehavior: WaypointBehaviorBase = pathFindingLayer!!.getWaypointBehavior()!!

waypointBehavior!!.setWaypointPathsList(list)
pathFindingLayer!!.getWaypointRunnableLogHelper()!!.end(pathFindingLayer)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
setRunning(false)
}

finish()
}

                                }
                            

    private val ALREADY_ENDED_RUNNABLE: Runnable = object: ARunnable()
                                {
                                
    override fun run()
        //nullable = true from not(false or (false and true)) = true
{



                            throw RuntimeException()
}

                                }
                            

    private var currentPassRunnable: Runnable = FIRST_RUNNABLE
public constructor (){
}


    override fun setRunning(isRunning: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var isRunning = isRunning
this.runningP= isRunning

    
                        if(this.runningP)
                        
                                    {
                                    this.reset()
this.done= false

                                    }
                                
}


    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            this.currentPassRunnable!!.run()
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
this.setRunning(false)
}

}


    open fun reset2()
        //nullable = true from not(false or (false and true)) = true
{
multipassState!!.step= 0
multipassState!!.iteration= 0
multipassState!!.iteration2= 0
pathFindingInfo= NullUtil.getInstance()!!.NULL_OBJECT
}


    open fun finish()
        //nullable = true from not(false or (false and true)) = true
{
this.reset2()
currentPassRunnable= ALREADY_ENDED_RUNNABLE
done= true
}


    override fun isDone()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return done
}


    override fun reset()
        //nullable = true from not(false or (false and true)) = true
{
this.reset2()
this.currentPassRunnable= FIRST_RUNNABLE
this.done= false
}


}
                
            

