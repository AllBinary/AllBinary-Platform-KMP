
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
        package org.allbinary.animation.image.sprite




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.game.Sprite
import org.allbinary.animation.AnimationBehavior
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorUtil

open public class AdjustedSpriteIndexedAnimation : SpriteIndexedAnimation {
        

    private var dx: Int

    private var dy: Int
public constructor        (sprite: Sprite, image: Image, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : this(sprite, image, BasicColorUtil.getInstance()!!.ZERO_ARRAY, dx, dy, animationBehavior)

        Updates for KMP build        
        {
    //var sprite = sprite
    //var image = image
    //var dx = dx
    //var dy = dy
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (sprite: Sprite, image: Image, basicColorArray: Array<BasicColor?>, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : super(sprite, image, basicColorArray, animationBehavior)

        Updates for KMP build        
        {
    //var sprite = sprite
    //var image = image
    //var basicColorArray = basicColorArray
    //var dx = dx
    //var dy = dy
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.dx= dx
this.dy= dy
}

override fun paint(graphics: Graphics, frame: Int, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics
    //var frame = frame
    //var x = x
    //var y = y
this.setFrame(frame)
this.sprite.setPosition(x +this.dx, y +this.dy)
super.paint(graphics)
}

override fun paint(g: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var g = g
    //var x = x
    //var y = y
this.sprite.setPosition(x +this.dx, y +this.dy)
super.paint(g)
}

override fun paint(g: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var g = g
this.sprite.setPosition(this.dx, this.dy)
super.paint(g)
}


}
                
            

