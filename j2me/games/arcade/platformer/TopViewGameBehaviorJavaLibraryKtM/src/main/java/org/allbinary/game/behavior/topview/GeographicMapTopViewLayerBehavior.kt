
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.physics.velocity.VelocityProperties
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.topview.BasicTopViewGeographicMapCellTypeFactory
import org.allbinary.util.BasicArrayList

open public class GeographicMapTopViewLayerBehavior : TopViewGameLayerBehavior {
        
public constructor        (maxGravityActionIndex: Int)                        

                            : super(maxGravityActionIndex)

        Updates for KMP build        
        {
    //var maxGravityActionIndex = maxGravityActionIndex


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun getGeographicMapCellPositionIfNotSolidBlockOrOffMap(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, velocityProperties: VelocityProperties, layer: AllBinaryLayer, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition

        Updates for KMP build        
        {
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray
    //var velocityProperties = velocityProperties
    //var layer = layer
    //var x = x
var y = y



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun getGeographicMapCellPositionIfNotSolidBlockOrOffMap(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, geographicMapCellPosition: GeographicMapCellPosition, velocityProperties: VelocityProperties, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition

        Updates for KMP build        
        {
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray
    //var geographicMapCellPosition = geographicMapCellPosition
    //var velocityProperties = velocityProperties
    //var layer = layer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun getGeographicMapCellPositionIfNotSolidBlockOrOffMap(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, geographicMapCellPositionList: BasicArrayList, velocityProperties: VelocityProperties, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition

        Updates for KMP build        
        {
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray
    //var geographicMapCellPositionList = geographicMapCellPositionList
    //var velocityProperties = velocityProperties
    //var layer = layer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun gravity(velocityProperties: VelocityProperties, geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var velocityProperties = velocityProperties
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray
    //var geographicMapCellPosition = geographicMapCellPosition
}


                @Throws(Exception::class)
            
open fun left(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, velocityProperties: VelocityProperties, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray
    //var velocityProperties = velocityProperties
    //var layer = layer
}


                @Throws(Exception::class)
            
open fun move(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, velocityProperties: VelocityProperties, layer: AllBinaryLayer, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray
    //var velocityProperties = velocityProperties
    //var layer = layer
    //var x = x
    //var y = y



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun moveAndLand(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, geographicMapCellPosition: GeographicMapCellPosition, velocityProperties: VelocityProperties, layer: AllBinaryLayer, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray
    //var geographicMapCellPosition = geographicMapCellPosition
    //var velocityProperties = velocityProperties
    //var layer = layer
    //var x = x
    //var y = y
}


                @Throws(Exception::class)
            
open fun right(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, velocityProperties: VelocityProperties, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray
    //var velocityProperties = velocityProperties
    //var layer = layer
}


open fun hasSolidBlock(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray

    var size: Int = geographicMapInterfaceArray!!.size
                


    var basicTopViewGeographicMapCellTypeFactory: BasicTopViewGeographicMapCellTypeFactory





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
basicTopViewGeographicMapCellTypeFactory= geographicMapInterfaceArray[index]!!.getGeographicMapCellTypeFactory() as BasicTopViewGeographicMapCellTypeFactory

    
                        if(basicTopViewGeographicMapCellTypeFactory!!.BLOCK_CELL_TYPE.isType(geographicMapCellTypeArray[index]!!))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun isOffMap(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray

    var size: Int = geographicMapInterfaceArray!!.size
                


    var basicTopViewGeographicMapCellTypeFactory: BasicTopViewGeographicMapCellTypeFactory





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
basicTopViewGeographicMapCellTypeFactory= geographicMapInterfaceArray[index]!!.getGeographicMapCellTypeFactory() as BasicTopViewGeographicMapCellTypeFactory

    
                        if(basicTopViewGeographicMapCellTypeFactory!!.OFF_MAP_CELL_TYPE.isType(geographicMapCellTypeArray[index]!!))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

