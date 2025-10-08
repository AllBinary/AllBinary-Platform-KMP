
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
        package org.allbinary.game.ai.scroller




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.game.input.GameInput
import org.allbinary.game.terrain.BasicTerrainInfo
import org.allbinary.game.terrain.TerrainEvent
import org.allbinary.game.terrain.TerrainEventCircularStaticPool
import org.allbinary.game.terrain.TerrainEventHandler
import org.allbinary.game.terrain.TerrainEventListener
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.math.Angle
import org.allbinary.math.AngleFactory
import org.allbinary.util.BasicArrayList

open public class TerrainPatrolAI : PacePatrolAI {
        

    private val terrainEventListener: TerrainEventListener = TerrainEventListener()

    private val DOWN: Angle = AngleFactory.getInstance()!!.DOWN

    private val CLIFF: BasicTerrainInfo = BasicTerrainInfo(DOWN)
public constructor (hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(hashtable, ownerLayerInterface, gameInput){
    //var hashtable = hashtable
    //var ownerLayerInterface = ownerLayerInterface
    //var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
TerrainEventHandler.getInstance(ownerLayerInterface)!!.addListener(this.terrainEventListener)
this.terrainEventListener!!.onTerrainEvent(TerrainEventCircularStaticPool.getInstance()!!.getInstance(this.CLIFF))
}


    override fun update()
        //nullable = true from not(false or (false and true)) = true
{
super.update()
this.changeDirectionIfCliffReached()
}


    open fun changeDirectionIfCliffReached()
        //nullable = true from not(false or (false and true)) = true
{

    var list: BasicArrayList = this.terrainEventListener!!.getList()!!


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {

    var terrainEvent: TerrainEvent = list.remove(index) as TerrainEvent


    var basicTerrainInfo: BasicTerrainInfo = terrainEvent!!.getBasicTerrainInfo()!!


    var angle: Angle = basicTerrainInfo!!.getAngle()!!


    
                        if(angle == DOWN)
                        
                                    {
                                    this.nextDirection()

    
                        if(!this.isFollowLimitedByTerrain)
                        
                                    {
                                    logUtil!!.put("Following Limited", this, "onTerrainEvent")
this.isFollowLimitedByTerrain= true

                                    }
                                

                                    }
                                
}

}


}
                
            

