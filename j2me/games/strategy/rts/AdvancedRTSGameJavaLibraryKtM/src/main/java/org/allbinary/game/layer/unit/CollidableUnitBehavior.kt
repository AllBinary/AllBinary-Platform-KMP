
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
        
import javax.microedition.lcdui.Canvas
import org.allbinary.game.layer.SteeringVisitor
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.game.layer.CollidableRTSBehavior
import org.allbinary.util.BasicArrayList
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.game.layer.TiledLayerUtil
import org.allbinary.game.layer.geographic.map.LayerPartialCellPositionsUtil
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.math.AngleInfo
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory

open public class CollidableUnitBehavior : CollidableRTSBehavior {
        

    private val layerPartialCellPositionsUtil: LayerPartialCellPositionsUtil = LayerPartialCellPositionsUtil.getInstance()!!
public constructor (collidable: Boolean)                        

                            : super(collidable){
    //var collidable = collidable


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun collideNone(ownerLayer: CollidableCompositeLayer, collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayer = ownerLayer
    //var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface
this.chase(ownerLayer, collidableInterfaceCompositeInterface)

    var rtsLayer: AdvancedRTSGameLayer = collidableInterfaceCompositeInterface as AdvancedRTSGameLayer


    
                        if(rtsLayer!!.getType() == UnitLayer.getStaticType())
                        
                                    {
                                    this.collideUnit(ownerLayer, rtsLayer as UnitLayer)

                                    }
                                
}


open public inner class SimpleSteeringVisitor : SteeringVisitor {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var anyType = anyType

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var ownerLayer: CollidableCompositeLayer = anyType as CollidableCompositeLayer


    
                        if(this.getList()!!.size() > 0)
                        
                                    {
                                    
    var allbinaryLayer: CollidableCompositeLayer = this.getList()!!.get(0) as CollidableCompositeLayer


    var clear: Boolean = this@CollidableUnitBehavior.steer(ownerLayer, allbinaryLayer)!!


    
                        if(clear)
                        
                                    {
                                    this.getList()!!.clear()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanFactory.getInstance()!!.TRUE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "visit", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT
}

}


}
                
            
    private val simpleSteeringVisitor: SimpleSteeringVisitor = SimpleSteeringVisitor()

                @Throws(Exception::class)
            
    open fun steer(ownerLayer: CollidableCompositeLayer, collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var ownerLayer = ownerLayer
    //var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var ownerUnitLayer: UnitLayer = ownerLayer as UnitLayer


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
                                    ownerUnitLayer!!.getGameKeyEventList()!!.add(GameKeyEventFactory.getInstance()!!.getInstanceForKey(ownerUnitLayer, Canvas.RIGHT))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                            throw Exception("Error")
}


                @Throws(Exception::class)
            
    open fun chase(ownerLayer: CollidableCompositeLayer, collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayer = ownerLayer
    //var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var rtsLayer: AdvancedRTSGameLayer = collidableInterfaceCompositeInterface as AdvancedRTSGameLayer


    
                        if(rtsLayer!!.getType() == UnitLayer.getStaticType())
                        
                                    {
                                    
    
                        if(!this.simpleSteeringVisitor!!.getList()!!.contains(collidableInterfaceCompositeInterface))
                        
                                    {
                                    this.simpleSteeringVisitor!!.getList()!!.add(collidableInterfaceCompositeInterface)

                                    }
                                

    var ownerUnitLayer: UnitLayer = ownerLayer as UnitLayer


    var list: BasicArrayList = ownerUnitLayer!!.getUnitWaypointBehavior()!!.getSteeringVisitorList()!!


    
                        if(!list.contains(this.simpleSteeringVisitor))
                        
                                    {
                                    list.add(this.simpleSteeringVisitor)

                                    }
                                

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun collideUnit(ownerLayer: CollidableCompositeLayer, unitLayer: UnitLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayer = ownerLayer
    //var unitLayer = unitLayer

    var ownerUnitLayer: UnitLayer = ownerLayer as UnitLayer


    var partialPositionList: BasicArrayList = UnitLayer.getPartialpositionlist()!!


    var geographicMapCompositeInterface: GeographicMapCompositeInterface = ownerUnitLayer!!.allBinaryGameLayerManagerP as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var basicGeographicMap: BasicGeographicMap = geographicMapInterface


    var dropCellPositionHistory: DropCellPositionHistory = DropCellPositionHistory.getInstance()!!


    var tiledLayerUtil: TiledLayerUtil = TiledLayerUtil.getInstance()!!


    var tiledLayer: AllBinaryTiledLayer = basicGeographicMap!!.getAllBinaryTiledLayer()!!


    
                        if(ownerLayer!!.getXP() < unitLayer!!.getXP() && ownerLayer!!.getX2() > unitLayer!!.getXP())
                        
                                    {
                                    
    var diff: Int = ownerLayer!!.getWidth() +1

this.layerPartialCellPositionsUtil!!.getAllDXY(basicGeographicMap, ownerLayer,  -diff, 0, partialPositionList)

    
                        if(!dropCellPositionHistory!!.anyCellPositionWithDrop(partialPositionList))
                        
                                    {
                                    
    var x: Int = unitLayer!!.getXP() -diff


    var y: Int = ownerLayer!!.getYP()!!

x= tiledLayerUtil!!.keepOnMapX(tiledLayer, x, ownerLayer!!.getWidth())
y= tiledLayerUtil!!.keepOnMapY(tiledLayer, y, ownerLayer!!.getHeight())
ownerLayer!!.setPosition(x, y, ownerLayer!!.getZP())

                                    }
                                
this.layerPartialCellPositionsUtil!!.getAllDXY(basicGeographicMap, unitLayer, diff, 0, partialPositionList)

    
                        if(!dropCellPositionHistory!!.anyCellPositionWithDrop(partialPositionList))
                        
                                    {
                                    
    var x: Int = unitLayer!!.getXP() +diff


    var y: Int = unitLayer!!.getYP()!!

x= tiledLayerUtil!!.keepOnMapX(tiledLayer, x, unitLayer!!.getWidth())
y= tiledLayerUtil!!.keepOnMapY(tiledLayer, y, unitLayer!!.getHeight())
unitLayer!!.setPosition(x, y, unitLayer!!.getZP())

                                    }
                                

                                    }
                                

    
                        if(ownerLayer!!.getYP() < unitLayer!!.getYP() && ownerLayer!!.getY2() > unitLayer!!.getYP())
                        
                                    {
                                    
    var diff: Int = ownerLayer!!.getHeight() +1

this.layerPartialCellPositionsUtil!!.getAllDXY(basicGeographicMap, ownerLayer, 0,  -diff, partialPositionList)

    
                        if(!dropCellPositionHistory!!.anyCellPositionWithDrop(partialPositionList))
                        
                                    {
                                    
    var x: Int = ownerLayer!!.getXP()!!


    var y: Int = unitLayer!!.getYP() -diff

x= tiledLayerUtil!!.keepOnMapX(tiledLayer, x, ownerLayer!!.getWidth())
y= tiledLayerUtil!!.keepOnMapY(tiledLayer, y, ownerLayer!!.getHeight())
ownerLayer!!.setPosition(x, y, ownerLayer!!.getZP())

                                    }
                                
this.layerPartialCellPositionsUtil!!.getAllDXY(basicGeographicMap, unitLayer, 0, diff, partialPositionList)

    
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
                
            

