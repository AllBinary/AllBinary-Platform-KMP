
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
        package org.allbinary.game.behavior.topview



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.MultiGeographicMapBehavior
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.game.physics.acceleration.GravityUtil
import org.allbinary.game.physics.velocity.VelocityProperties
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.topview.BasicTopViewGeographicMapCellTypeFactory

open public class GeographicMapTopViewGameLayerBehavior1 : GeographicMapTopViewLayerBehavior {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val gravityUtil: GravityUtil = GravityUtil.getInstance()!!
            

    private val geographicMapBehavior: MultiGeographicMapBehavior = MultiGeographicMapBehavior()

    private val autoStepBlocks: Boolean

    private val offsetY: Int

    private var previousGeographicMapCellPosition: GeographicMapCellPosition
public constructor        ()                        

                            : super(16){

                            //For kotlin this is before the body of the constructor.
                    
this.autoStepBlocks= true
this.offsetY= 0
}

public constructor        (maxGravityActionIndex: Int, autoStepBlocks: Boolean, offsetY: Int)                        

                            : super(maxGravityActionIndex){

                    var maxGravityActionIndex = maxGravityActionIndex


                    var autoStepBlocks = autoStepBlocks


                    var offsetY = offsetY


                            //For kotlin this is before the body of the constructor.
                    
this.autoStepBlocks= autoStepBlocks
this.offsetY= offsetY
}


                @Throws(Exception::class)
            override fun gravity(velocityProperties: VelocityProperties, geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var velocityProperties = velocityProperties


                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var geographicMapCellTypeArray = geographicMapCellTypeArray


                    var geographicMapCellPosition = geographicMapCellPosition

    
                        if(geographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    geographicMapBehavior!!.getCellTypeAt(geographicMapInterfaceArray, geographicMapCellTypeArray, geographicMapCellPosition)

    var hasSolidBlock: Boolean = this.hasSolidBlock(geographicMapInterfaceArray, geographicMapCellTypeArray)!!
            


    
                        if(!hasSolidBlock)
                        
                                    {
                                    gravityUtil!!.process(velocityProperties)
velocityProperties!!.limitXYToForwardAndReverseMaxVelocity()
this.gravity()

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                
}


                @Throws(Exception::class)
            
open fun getPosition(geographicMapInterfaceArray: Array<BasicGeographicMap?>, layer: AllBinaryLayer, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var layer = layer


                    var x = x


                    var y = y

    var xCellPosition: Int = layer!!.getXP() + -x +layer!!.getWidth()


    var yCellPosition: Int = layer!!.getYP() + -y +layer!!.getHeight()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapInterfaceArray[0]!!.getCellPositionAtNoThrow(xCellPosition, yCellPosition)
}


                @Throws(Exception::class)
            
open fun getLeftPosition(geographicMapInterfaceArray: Array<BasicGeographicMap?>, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var layer = layer

    var xCellPosition: Int = layer!!.getXP()!!
            


    var yCellPosition: Int = layer!!.getYP() +layer!!.getHeight()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapInterfaceArray[0]!!.getCellPositionAtNoThrow(xCellPosition, yCellPosition)
}


                @Throws(Exception::class)
            
open fun getRightPosition(geographicMapInterfaceArray: Array<BasicGeographicMap?>, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var layer = layer

    var xCellPosition: Int = layer!!.getXP() +layer!!.getWidth()


    var yCellPosition: Int = layer!!.getYP() +layer!!.getHeight()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapInterfaceArray[0]!!.getCellPositionAtNoThrow(xCellPosition, yCellPosition)
}


                @Throws(Exception::class)
            override fun getGeographicMapCellPositionIfNotSolidBlockOrOffMap(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, velocityProperties: VelocityProperties, layer: AllBinaryLayer, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var geographicMapCellTypeArray = geographicMapCellTypeArray


                    var velocityProperties = velocityProperties


                    var layer = layer


                    var x = x


                    var y = y

    var geographicMapCellPosition: GeographicMapCellPosition = this.getPosition(geographicMapInterfaceArray, layer, x, y)!!
            


    
                        if(this.previousGeographicMapCellPosition != geographicMapCellPosition && geographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    
    var possibleStepGeographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPosition


    var tiledLayer: AllBinaryTiledLayer = geographicMapInterfaceArray[0]!!.getAllBinaryTiledLayer()!!
            


    
                        if(possibleStepGeographicMapCellPosition!!.getColumn() > 0 && possibleStepGeographicMapCellPosition!!.getRow() > 0 && possibleStepGeographicMapCellPosition!!.getColumn() < tiledLayer!!.getColumns() && possibleStepGeographicMapCellPosition!!.getRow() < tiledLayer!!.getRows())
                        
                                    {
                                    geographicMapBehavior!!.getCellTypeAt(geographicMapInterfaceArray, geographicMapCellTypeArray, possibleStepGeographicMapCellPosition)

    var hasSolidBlock: Boolean = this.hasSolidBlock(geographicMapInterfaceArray, geographicMapCellTypeArray)!!
            


    
                        if(hasSolidBlock)
                        
                                    {
                                    velocityProperties!!.getVelocityXBasicDecimalP()!!.set(0)
this.previousGeographicMapCellPosition= 
                                        null
                                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                                    }
                                
                        else {
                            this.previousGeographicMapCellPosition= possibleStepGeographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return possibleStepGeographicMapCellPosition

                        }
                            

                                    }
                                

                                    }
                                
this.previousGeographicMapCellPosition= 
                                        null
                                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            override fun moveAndLand(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, geographicMapCellPosition: GeographicMapCellPosition, velocityProperties: VelocityProperties, layer: AllBinaryLayer, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var geographicMapCellTypeArray = geographicMapCellTypeArray


                    var geographicMapCellPosition = geographicMapCellPosition


                    var velocityProperties = velocityProperties


                    var layer = layer


                    var x = x


                    var y = y

    
                        if(geographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    layer = layerlayer as TopViewCharacterInterface
layer.
                                terrainMove(geographicMapInterfaceArray, geographicMapCellTypeArray, x, y)

                                    }
                                
                        else {
                            
                        }
                            
}


                @Throws(Exception::class)
            override fun move(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, velocityProperties: VelocityProperties, layer: AllBinaryLayer, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var geographicMapCellTypeArray = geographicMapCellTypeArray


                    var velocityProperties = velocityProperties


                    var layer = layer


                    var x = x


                    var y = y

    var geographicMapCellPosition: GeographicMapCellPosition = this.getGeographicMapCellPositionIfNotSolidBlockOrOffMap(geographicMapInterfaceArray, geographicMapCellTypeArray, velocityProperties, layer, x, y)!!
            

this.moveAndLand(geographicMapInterfaceArray, geographicMapCellTypeArray, geographicMapCellPosition, velocityProperties, layer, x, y)

    
                        if(geographicMapCellPosition == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


                @Throws(Exception::class)
            override fun left(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, velocityProperties: VelocityProperties, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var geographicMapCellTypeArray = geographicMapCellTypeArray


                    var velocityProperties = velocityProperties


                    var layer = layer

    var geographicMapCellPosition: GeographicMapCellPosition = this.getLeftPosition(geographicMapInterfaceArray, layer)!!
            


    
                        if(geographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    
    var possibleStepGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterfaceArray[0]!!.getGeographicMapCellPositionFactory()!!.getInstance(geographicMapCellPosition!!.getColumn(), geographicMapCellPosition!!.getRow() -1)!!
            

geographicMapBehavior!!.getCellTypeAt(geographicMapInterfaceArray, geographicMapCellTypeArray, possibleStepGeographicMapCellPosition)

    var hasSolidBlock: Boolean = this.hasSolidBlock(geographicMapInterfaceArray, geographicMapCellTypeArray)!!
            


    
                        if(hasSolidBlock)
                        
                                    {
                                    
    
                        if(this.autoStepBlocks)
                        
                                    {
                                    layer = layerlayer as TopViewCharacterInterface
layer.
                                leftp()

                                    }
                                
                        else {
                            velocityProperties!!.getVelocityXBasicDecimalP()!!.set(0)

                        }
                            

                                    }
                                
                        else {
                            layer = layerlayer as TopViewCharacterInterface
layer.
                                leftp()

                        }
                            

                                    }
                                
}


                @Throws(Exception::class)
            override fun right(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, velocityProperties: VelocityProperties, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var geographicMapCellTypeArray = geographicMapCellTypeArray


                    var velocityProperties = velocityProperties


                    var layer = layer

    var geographicMapCellPosition: GeographicMapCellPosition = this.getRightPosition(geographicMapInterfaceArray, layer)!!
            


    
                        if(geographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    
    var possibleStepGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterfaceArray[0]!!.getGeographicMapCellPositionFactory()!!.getInstance(geographicMapCellPosition!!.getColumn(), geographicMapCellPosition!!.getRow() -1)!!
            

geographicMapBehavior!!.getCellTypeAt(geographicMapInterfaceArray, geographicMapCellTypeArray, possibleStepGeographicMapCellPosition)

    var hasSolidBlock: Boolean = this.hasSolidBlock(geographicMapInterfaceArray, geographicMapCellTypeArray)!!
            


    
                        if(hasSolidBlock)
                        
                                    {
                                    
    
                        if(this.autoStepBlocks)
                        
                                    {
                                    layer = layerlayer as TopViewCharacterInterface
layer.
                                rightp()

                                    }
                                
                        else {
                            velocityProperties!!.getVelocityXBasicDecimalP()!!.set(0)

                        }
                            

                                    }
                                
                        else {
                            layer = layerlayer as TopViewCharacterInterface
layer.
                                rightp()

                        }
                            

                                    }
                                
}


}
                
            

