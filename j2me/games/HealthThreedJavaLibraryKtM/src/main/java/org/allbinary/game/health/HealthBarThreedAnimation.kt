
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
        package org.allbinary.game.health




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Graphics
import min3d.core.ColorBufferList
import min3d.core.Number3dBufferList
import min3d.objectPrimitives.Rectangle
import min3d.vos.Number3d
import org.allbinary.device.OpenGLESGraphics
import org.allbinary.graphics.threed.min3d.renderer.Object3dProcessor
import org.allbinary.graphics.threed.min3d.renderer.Object3dProcessorUtil
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.view.ViewPosition

open public class HealthBarThreedAnimation : HealthBarAnimation {
        

    private var rectangle: Rectangle

    private val basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!
public constructor (layerInterface: AllBinaryLayer, location: Int)                        

                            : super(layerInterface, location){
var layerInterface = layerInterface
var location = location


                            //For kotlin this is before the body of the constructor.
                    
this.basicColor= this.basicColorFactory!!.GREEN
this.colorP= this.basicColor!!.toInt()
rectangle= Rectangle(0, 0, 1, 1, this.basicColor)
rectangle.setDoubleSidedEnabled(true)
rectangle.setNormalsEnabled(false)
rectangle.setTexturesEnabled(false)
}


    open fun updateColor()
        //nullable = true from not(false or (false and true)) = true
{

    var colorBufferList: ColorBufferList = rectangle.getVertices()!!.getColor4BufferList()!!


    var size: Int = colorBufferList!!.size()!!





                        for (index in size  - 1  downTo 0)

        {
colorBufferList!!.set(index, this.basicColor)
}

}


    open fun updateSize()
        //nullable = true from not(false or (false and true)) = true
{

    var number3dBufferList: Number3dBufferList = rectangle.getVertices()!!.getPointsOnFacesNumber3dBufferList()!!


    var width: Int = x2


    var height: Int = this.thickness *2


    var segsH: Int = 1


    var segsW: Int = 1


    var row: Int= 0


    var col: Int= 0


    var w: Float = width /segsW


    var h: Float = height /segsH


    var width5: Float = width /2f


    var height5: Float = height /2f


    var index: Int = 0





                        for (row in 0 until segsH)

        {




                        for (col in 0 until segsW)

        {
number3dBufferList!!.set(index++, col.toFloat() *w -width5, row.toFloat() *h -height5, 0f)
}

}

}


    open fun onHealthChange(newX2: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var newX2 = newX2
super.onHealthChange(newX2)
this.updateColor()
this.updateSize()
}


    private val object3dProcessor: Object3dProcessor = Object3dProcessorUtil.getInstance()!!.getInstanceObject3dProcessor()!!

    open fun paintThreed(graphics: Graphics, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var x = x
    //var y = y
    //var z = z

    var openGLESGraphics: OpenGLESGraphics = graphics as OpenGLESGraphics


    var gl: GL10 = openGLESGraphics!!.getGl10()!!


    var viewPosition: ViewPosition = this.allbinaryLayer!!.getViewPosition()!!


    var positionNumber3d: Number3d = this.rectangle.getPosition()!!

positionNumber3d!!.x=  -(viewPosition!!.getX().toFloat())
positionNumber3d!!.z=  -(viewPosition!!.getY().toFloat())
positionNumber3d!!.y= viewPosition!!.getZ() +this.allbinaryLayer!!.getHeight()
object3dProcessor!!.drawObject(gl, this.rectangle)
}


}
                
            

