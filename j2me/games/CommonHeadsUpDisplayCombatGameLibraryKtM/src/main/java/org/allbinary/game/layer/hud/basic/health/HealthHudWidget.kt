
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
        package org.allbinary.game.layer.hud.basic.health




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.game.graphics.hud.BasicHud
import org.allbinary.game.health.Health
import org.allbinary.game.health.HealthListenerInterface
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.NoTimeDelayHelper
import org.allbinary.time.TimeDelayHelper

open public class HealthHudWidget : BasicHud
                , PaintableInterface
                , HealthListenerInterface {
        

    private var healthScale: Int

    var animationInterface: Animation

    var healthInterface: Health

    var max: Int= 0

    private var xArray: IntArray

    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!
public constructor (animationInterface: Animation, healthInterface: Health, location: Int, direction: Int)                        

                            : super(location, direction, 16, healthInterface!!.getMaxHealth() *16, 2){
var animationInterface = animationInterface
var healthInterface = healthInterface
var location = location
var direction = direction


                            //For kotlin this is before the body of the constructor.
                    
this.animationInterface= animationInterface
this.healthInterface= healthInterface
this.healthInterface!!.addListener(this)
this.healthScale= (this.healthInterface!!.getMaxHealth() /6) +1
this.onHealthChange()
this.xArray= IntArray(30)
this.update()
}


    open fun update()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.xArray != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until this.xArray!!.size)

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


    private var timeDelayHelper: TimeDelayHelper = NoTimeDelayHelper.SINGLETON

    private val slowBeatTimeDelayHelper: TimeDelayHelper = TimeDelayHelper(1280)

    private val mediumBeatTimeDelayHelper: TimeDelayHelper = TimeDelayHelper(640)

    private val fastBeatTimeDelayHelper: TimeDelayHelper = TimeDelayHelper(320)

    override fun onHealthChange()
        //nullable = true from not(false or (false and true)) = true
{
max= (this.healthInterface!!.getHealth() /this.healthScale)
timeDelayHelper= NoTimeDelayHelper.SINGLETON

    
                        if(max <= 1 && this.healthInterface!!.isAlive())
                        
                                    {
                                    max= 1

    
                        if(this.healthScale -this.healthInterface!!.getHealth() > (this.healthScale *2) /3)
                        
                                    {
                                    timeDelayHelper= this.slowBeatTimeDelayHelper

                                    }
                                
                             else 
    
                        if(this.healthScale -this.healthInterface!!.getHealth() > this.healthScale /3)
                        
                                    {
                                    timeDelayHelper= this.mediumBeatTimeDelayHelper

                                    }
                                
                        else {
                            timeDelayHelper= this.fastBeatTimeDelayHelper

                        }
                            

                                    }
                                
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics




                        for (index in 0 until max)

        {

    
                        if(this.timeDelayHelper!!.isTime(this.gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    this.animationInterface!!.paint(graphics, xArray[index]!!, this.getY())

                                    }
                                
}

}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}


}
                
            

