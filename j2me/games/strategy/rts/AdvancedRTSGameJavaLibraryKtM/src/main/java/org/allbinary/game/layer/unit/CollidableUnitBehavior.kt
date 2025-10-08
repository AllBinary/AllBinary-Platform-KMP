
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer.unit




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.SteeringVisitor
import javax.microedition.lcdui.Canvas
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.game.layer.CollidableRTSBehavior
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.game.layer.TiledLayerUtil
import org.allbinary.game.layer.geographic.map.LayerPartialCellPositionsUtil
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.math.AngleInfo
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory

open public class CollidableUnitBehavior : CollidableRTSBehavior {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val layerPartialCellPositionsUtil: LayerPartialCellPositionsUtil = LayerPartialCellPositionsUtil.getInstance()!!
public constructor (ownerLayer: CollidableCompositeLayer, collidable: Boolean)                        

                            : super(ownerLayer, collidable){
    //var ownerLayer = ownerLayer
    //var collidable = collidable


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    open fun collideNone(collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface
this.chase(collidableInterfaceCompositeInterface)

    var rtsLayer: AdvancedRTSGameLayer = collidableInterfaceCompositeInterface as AdvancedRTSGameLayer


    
                        if(rtsLayer!!.getType() == UnitLayer.getStaticType())
                        
                                    {
                                    this.collideUnit(rtsLayer as UnitLayer)

                                    }
                                
}


open public inner class SimpleSteeringVisitor : SteeringVisitor {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var anyType = anyType

        try {
            
    
                        if(this.getList()!!.size() > 0)
                        
                                    {
                                    
    var allbinaryLayer: CollidableCompositeLayer = this.getList()!!.get(0) as CollidableCompositeLayer


    var clear: Boolean = this@CollidableUnitBehavior.steer(allbinaryLayer)!!


    
                        if(clear)
                        
                                    {
                                    this.getList()!!.clear()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "visit", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            
    private val simpleSteeringVisitor: SimpleSteeringVisitor = SimpleSteeringVisitor()

                @Throws(Exception::class)
            
    open fun steer(collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var ownerUnitLayer: UnitLayer = this.ownerLayer as UnitLayer


    var unitLayer: UnitLayer = collidableInterfaceCompositeInterface as UnitLayer


    var angleInfo2: AngleInfo = unitLayer!!.getRotationAnimationInterface()!!.getAngleInfoP()!!


    var angleInfo: AngleInfo = ownerUnitLayer!!.getRotationAnimationInterface()!!.getAngleInfoP()!!


    var angle: Int = angleInfo!!.getAngle() -angleInfo2!!.getAngle()


    
                        if(angle < 90 || angle > 270)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                             else 
    
                        if(angle >= 90 || angle <= 270)
                        
                                    {
                                    ownerUnitLayer!!.getGameKeyEventList()!!.add(GameKeyEventFactory.getInstance()!!.getInstance(ownerUnitLayer, Canvas.RIGHT))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                            throw Exception("Error")
}


                @Throws(Exception::class)
            
    open fun chase(collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var rtsLayer: AdvancedRTSGameLayer = collidableInterfaceCompositeInterface as AdvancedRTSGameLayer


    
                        if(rtsLayer!!.getType() == UnitLayer.getStaticType())
                        
                                    {
                                    
    
                        if(!this.simpleSteeringVisitor!!.getList()!!.contains(collidableInterfaceCompositeInterface))
                        
                                    {
                                    this.simpleSteeringVisitor!!.getList()!!.add(collidableInterfaceCompositeInterface)

                                    }
                                

    var ownerUnitLayer: UnitLayer = this.ownerLayer as UnitLayer


    var list: BasicArrayList = ownerUnitLayer!!.getUnitWaypointBehavior()!!.getSteeringVisitorList()!!


    
                        if(!list.contains(this.simpleSteeringVisitor))
                        
                                    {
                                    list.add(this.simpleSteeringVisitor)

                                    }
                                

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun collideUnit(unitLayer: UnitLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var unitLayer = unitLayer

    var ownerUnitLayer: UnitLayer = this.ownerLayer as UnitLayer


    var partialPositionList: BasicArrayList = ownerUnitLayer!!.getPartialpositionlist()!!


    var geographicMapCompositeInterface: GeographicMapCompositeInterface = ownerUnitLayer!!.allBinaryGameLayerManagerP as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var basicGeographicMap: BasicGeographicMap = geographicMapInterface


    var dropCellPositionHistory: DropCellPositionHistory = DropCellPositionHistory.getInstance()!!


    var tiledLayerUtil: TiledLayerUtil = TiledLayerUtil.getInstance()!!


    var tiledLayer: AllBinaryTiledLayer = basicGeographicMap!!.getAllBinaryTiledLayer()!!


    
                        if(this.ownerLayer!!.getXP() < unitLayer!!.getXP() && this.ownerLayer!!.getX2() > unitLayer!!.getXP())
                        
                                    {
                                    
    var diff: Int = this.ownerLayer!!.getWidth() +1

this.layerPartialCellPositionsUtil!!.getAll(basicGeographicMap, this.ownerLayer,  -diff, 0, partialPositionList)

    
                        if(!dropCellPositionHistory!!.anyCellPositionWithDrop(partialPositionList))
                        
                                    {
                                    
    var x: Int = unitLayer!!.getXP() -diff


    var y: Int = this.ownerLayer!!.getYP()!!

x= tiledLayerUtil!!.keepOnMapX(tiledLayer, x, this.ownerLayer!!.getWidth())
y= tiledLayerUtil!!.keepOnMapY(tiledLayer, y, this.ownerLayer!!.getHeight())
this.ownerLayer!!.setPosition(x, y, this.ownerLayer!!.getZP())

                                    }
                                
this.layerPartialCellPositionsUtil!!.getAll(basicGeographicMap, unitLayer, diff, 0, partialPositionList)

    
                        if(!dropCellPositionHistory!!.anyCellPositionWithDrop(partialPositionList))
                        
                                    {
                                    
    var x: Int = unitLayer!!.getXP() +diff


    var y: Int = unitLayer!!.getYP()!!

x= tiledLayerUtil!!.keepOnMapX(tiledLayer, x, unitLayer!!.getWidth())
y= tiledLayerUtil!!.keepOnMapY(tiledLayer, y, unitLayer!!.getHeight())
unitLayer!!.setPosition(x, y, unitLayer!!.getZP())

                                    }
                                

                                    }
                                

    
                        if(this.ownerLayer!!.getYP() < unitLayer!!.getYP() && this.ownerLayer!!.getY2() > unitLayer!!.getYP())
                        
                                    {
                                    
    var diff: Int = this.ownerLayer!!.getHeight() +1

this.layerPartialCellPositionsUtil!!.getAll(basicGeographicMap, this.ownerLayer, 0,  -diff, partialPositionList)

    
                        if(!dropCellPositionHistory!!.anyCellPositionWithDrop(partialPositionList))
                        
                                    {
                                    
    var x: Int = this.ownerLayer!!.getXP()!!


    var y: Int = unitLayer!!.getYP() -diff

x= tiledLayerUtil!!.keepOnMapX(tiledLayer, x, this.ownerLayer!!.getWidth())
y= tiledLayerUtil!!.keepOnMapY(tiledLayer, y, this.ownerLayer!!.getHeight())
this.ownerLayer!!.setPosition(x, y, this.ownerLayer!!.getZP())

                                    }
                                
this.layerPartialCellPositionsUtil!!.getAll(basicGeographicMap, unitLayer, 0, diff, partialPositionList)

    
                        if(!dropCellPositionHistory!!.anyCellPositionWithDrop(partialPositionList))
                        
                                    {
                                    
    var x: Int = unitLayer!!.getXP()!!


    var y: Int = unitLayer!!.getYP() +diff

x= tiledLayerUtil!!.keepOnMapX(tiledLayer, x, unitLayer!!.getWidth())
y= tiledLayerUtil!!.keepOnMapY(tiledLayer, y, unitLayer!!.getHeight())
unitLayer!!.setPosition(x, y, unitLayer!!.getZP())

                                    }
                                

                                    }
                                
}


}
                
            

