
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.RotationAnimation
import org.allbinary.game.identification.Group
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionTracking
import org.allbinary.util.BasicArrayList

open public class NullVehicleLayer
            : Object
        
                , VehicleLayerInterface {
        
companion object {
            
    val NULL_VEHICLE_LAYER: NullVehicleLayer = NullVehicleLayer()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                            throw RuntimeException()
}


    override fun getGroupInterface()
        //nullable = true from not(false or (false and true)) = true
: Array<Group?>{



                            throw RuntimeException()
}


    override fun setPosition(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var z = z



                            throw RuntimeException()
}


    override fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getHalfHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getHalfWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getXP()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getYP()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getZP()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getX2()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getY2()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getZ2()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun isVisible()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun move(dx: Int, dy: Int, dz: Int)
        //nullable = true from not(false or (false and false)) = true
{
var dx = dx
var dy = dy
var dz = dz



                            throw RuntimeException()
}


    override fun setVisible(visible: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var visible = visible



                            throw RuntimeException()
}


    override fun implmentsTickableInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun implmentsCollidableInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun implmentsGameInputInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun implmentsArtificialIntelligenceCompositeInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getVehicleProperties()
        //nullable = true from not(false or (false and true)) = true
: VehicleProperties{



                            throw RuntimeException()
}


    override fun getGameKeyEventList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                            throw RuntimeException()
}


    override fun getSpeedBasicDecimal()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal{



                            throw RuntimeException()
}


    override fun isReadyForExplosion()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun getRotationAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: RotationAnimation{



                            throw RuntimeException()
}


    override fun setRotationAnimationInterface(animationInterface: RotationAnimation)
        //nullable = true from not(false or (false and false)) = true
{
var animationInterface = animationInterface



                            throw RuntimeException()
}


    override fun isDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun isFinish()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun getFinalPosition()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun handleFinish()
        //nullable = true from not(false or (false and true)) = true
{



                            throw RuntimeException()
}


    override fun getGeographicMapCellPositionTracking()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPositionTracking{



                            throw RuntimeException()
}


    override fun getGeographicMapCellHistoryArray()
        //nullable = true from not(false or (false and true)) = true
: Array<GeographicMapCellHistory?>{



                            throw RuntimeException()
}


    override fun setGeographicMapCellHistoryArray(geographicMapCellHistory: Array<GeographicMapCellHistory?>)
        //nullable = true from not(false or (false and false)) = true
{
var geographicMapCellHistory = geographicMapCellHistory



                            throw RuntimeException()
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}


}
                
            

