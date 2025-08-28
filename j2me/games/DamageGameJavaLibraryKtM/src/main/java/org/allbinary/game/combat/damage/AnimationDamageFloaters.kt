
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
        package org.allbinary.game.combat.damage




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.IndexedAnimation
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.CircularIndexUtil
import org.allbinary.view.ViewPosition

open public class AnimationDamageFloaters : DamageFloaters {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var layerInterface: AllBinaryLayer

    private var animationInterfaceArray: Array<IndexedAnimation?>

    private val circularIndexUtil: CircularIndexUtil

    private var dx: Int

    private var dy: Int
public constructor        (layerInterface: AllBinaryLayer, animationInterfaceArray: Array<IndexedAnimation?>, dx: Int, dy: Int)

        Updates for KMP build        
        {
var layerInterface = layerInterface
var animationInterfaceArray = animationInterfaceArray
var dx = dx
var dy = dy
this.animationInterfaceArray= animationInterfaceArray




                        for (index in this.animationInterfaceArray!!.size -1 downTo 0)

        

        Updates for KMP build        
        {
this.animationInterfaceArray[index]!!.setFrame(this.animationInterfaceArray[index]!!.getSize() -1)
}

this.layerInterface= layerInterface
this.circularIndexUtil= CircularIndexUtil.getInstance(this.animationInterfaceArray!!.size)
this.dx= dx
this.dy= dy
}

override fun add(damage: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var damage = damage

    var i: Int = this.circularIndexUtil!!.getIndex()!!

animationInterfaceArray[i]!!.setFrame(0)
this.circularIndexUtil!!.next()
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics

        try {
            
    var viewPosition: ViewPosition = this.layerInterface!!.getViewPosition()!!


    var x: Int = viewPosition!!.getX()!!


    var y: Int = viewPosition!!.getY()!!





                        for (index in 0 until this.animationInterfaceArray!!.size)

        

        Updates for KMP build        
        {

    var animationInterface: IndexedAnimation = animationInterfaceArray[index]!!


    
                        if(animationInterface!!.getFrame() < animationInterface!!.getAnimationSize() -1)
                        
                                    {
                                    
    var delta: Int = animationInterface!!.getFrame() *20

animationInterface!!.paint(graphics, x +dx, y -delta +dy)
animationInterface!!.nextFrame()

                                    }
                                
}

} catch(e: Exception)
            

        Updates for KMP build        
        {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var canvasStrings: CanvasStrings = CanvasStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, canvasStrings!!.PAINT, e)
}

}


}
                
            

