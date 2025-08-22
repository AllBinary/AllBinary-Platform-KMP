
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
        package org.allbinary.game.layer.hud.basic




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.animation.AnimationInterface
import org.allbinary.game.health.HealthInterface
import org.allbinary.graphics.Anchor
import org.allbinary.image.ImageCacheFactory

open public class ImageHealthGraphic : HealthGraphic {
        

    private var image: Array<Image?>
public constructor        (animationInterface: AnimationInterface, healthInterface: HealthInterface, location: Int, direction: Int)                        

                            : super(animationInterface, healthInterface, location, direction){

                    var animationInterface = animationInterface


                    var healthInterface = healthInterface


                    var location = location


                    var direction = direction


                            //For kotlin this is before the body of the constructor.
                    
image= arrayOfNulls(this.healthInterface!!.getMaxHealth())

    var imageCacheFactory: ImageCacheFactory = ImageCacheFactory.getInstance()!!





                        for (numOfHealth in 0 until max)


        {image[numOfHealth]= imageCacheFactory!!.get(this, numOfHealth +1 *10, 10)
}





                        for (numOfHealth in 0 until max)


        {



                        for (index in 0 until numOfHealth)


        {this.animationInterface!!.paint(image[numOfHealth]!!.getGraphics(), numOfHealth *10, 0)
}

}

}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
graphics.drawImage(this.image[max]!!, x, y, Anchor.TOP_LEFT)
}


}
                
            

