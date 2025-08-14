
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
        package org.allbinary.game.life




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.health.Health
import org.allbinary.game.health.HealthBarAnimation
import org.allbinary.game.health.HealthBarTwodAnimation
import org.allbinary.game.health.HealthInterface
import org.allbinary.game.health.HealthListenerInterface
import org.allbinary.graphics.paint.Paintable
import org.allbinary.layer.AllBinaryLayer

open public class HealthIncludingLifeBar : Paintable
                , HealthListenerInterface {
        

    private val animationInterface: HealthBarAnimation

    private val life: Life

    private val healthInterface: HealthInterface

    val allbinaryLayer: AllBinaryLayer
public constructor        (layerInterface: AllBinaryLayer, life: Life, healthInterface: Health, animationInterface: HealthBarAnimation, direction: Int){

                    var layerInterface = layerInterface


                    var life = life


                    var healthInterface = healthInterface


                    var animationInterface = animationInterface


                    var direction = direction
this.allbinaryLayer= layerInterface
this.animationInterface= animationInterface
this.life= life
this.healthInterface= healthInterface
this.healthInterface!!.addListener(this)
this.onHealthChange()
}

public constructor        (layerInterface: AllBinaryLayer, life: Life, healthInterface: Health, location: Int, direction: Int)                        

                            : this(layerInterface, life, healthInterface, HealthBarTwodAnimation(layerInterface, location), direction){

                    var layerInterface = layerInterface


                    var life = life


                    var healthInterface = healthInterface


                    var location = location


                    var direction = direction


                            //For kotlin this is before the body of the constructor.
                    
}

override fun onHealthChange()
        //nullable = true from not(false or (false and true)) = true
{this.animationInterface!!.onHealthChange(((this.healthInterface!!.getHealth() +(this.healthInterface!!.getMaxHealth() *this.life.get())) *this.allbinaryLayer!!.getWidth()) /(this.healthInterface!!.getMaxHealth() +(this.healthInterface!!.getMaxHealth() *this.life.getStartLives())))
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.animationInterface!!.paint(graphics, 0, 0)
}

override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.animationInterface!!.paintThreed(graphics, 0, 0, 0)
}


}
                
            

