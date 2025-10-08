
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
        package org.allbinary.game.layer.hud.basic.life




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.game.graphics.hud.BasicHud
import org.allbinary.game.life.Life
import org.allbinary.graphics.displayable.event.DisplayChangeEvent
import org.allbinary.graphics.paint.PaintableInterface

open public class LivesHudWidget : BasicHud
                , PaintableInterface {
        

    private val lifeInterface: Life

    private var xArray: IntArray

    private val animationInterface: Animation
public constructor (animationInterface: Animation, lifeInterface: Life, location: Int, direction: Int)                        

                            : super(location, direction, 16, lifeInterface!!.getMaxlives() *16, 2){
var animationInterface = animationInterface
var lifeInterface = lifeInterface
var location = location
var direction = direction


                            //For kotlin this is before the body of the constructor.
                    
this.lifeInterface= lifeInterface
this.xArray= IntArray(this.getLifeInterface()!!.getMaxlives().toInt())
this.update()
this.animationInterface= animationInterface
}


    override fun onDisplayChangeEvent(displayChangeEvent: DisplayChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
var displayChangeEvent = displayChangeEvent
super.onDisplayChangeEvent(displayChangeEvent)
this.update()
}


    open fun update()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.xArray != 
                                    null
                                )
                        
                                    {
                                    
    var maxLives: Int = this.getLifeInterface()!!.getMaxlives().toInt()





                        for (index in 0 until maxLives)

        {
this.xArray[index]= this.getX() +(index *16)
}


                                    }
                                
}


    override fun setX(x: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
super.setX(x)
this.update()
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics




                        for (index in this.getLifeInterface()!!.get().toInt()  - 1  downTo 0)

        {
this.animationInterface!!.paint(graphics, xArray[index]!!, this.getY())
}

}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}


    open fun getLifeInterface()
        //nullable = true from not(false or (false and true)) = true
: Life{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return lifeInterface
}


}
                
            

