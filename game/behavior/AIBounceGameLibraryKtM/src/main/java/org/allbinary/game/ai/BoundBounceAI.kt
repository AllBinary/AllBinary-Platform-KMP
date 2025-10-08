
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
        package org.allbinary.game.ai




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.bounds.BoundsVisitorInterface
import org.allbinary.bounds.LayerBounds
import org.allbinary.game.input.GameInput
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager

open public class BoundBounceAI : BasicAI {
        

    var currentRelativeAngle: Int = 0

    private var layerBounds: LayerBounds

    private var boundsVisitorInterface: BoundsVisitorInterface
public constructor (ownerLayerInterface: AllBinaryLayer, gameInput: GameInput, layerBounds: LayerBounds, boundsVisitorInterface: BoundsVisitorInterface)                        

                            : super(ownerLayerInterface, gameInput){
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput
var layerBounds = layerBounds
var boundsVisitorInterface = boundsVisitorInterface


                            //For kotlin this is before the body of the constructor.
                    
this.layerBounds= layerBounds
this.boundsVisitorInterface= boundsVisitorInterface
}


    open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    var rectange: Rectangle = this.layerBounds!!.getRectangleP()!!

graphics.drawRect(rectange.getPoint()!!.getX(), rectange.getPoint()!!.getY(), rectange.getWidth(), rectange.getHeight())
}


                @Throws(Exception::class)
            
    override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager
this.layerBounds!!.visit(this.boundsVisitorInterface)
}


}
                
            

