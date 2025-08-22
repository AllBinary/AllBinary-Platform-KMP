
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
        
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.game.Sprite
import javax.microedition.media.Player
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.IndexedAnimation
import org.allbinary.animation.caption.CaptionIndexedAnimation
import org.allbinary.animation.image.ImageAnimation
import org.allbinary.image.AnimationFactoryImageScaleUtil
import org.allbinary.image.sprite.AnimationFactorySpriteScaleUtil
import org.allbinary.media.ScaleProperties
import org.allbinary.media.audio.Sound

open public class ImageCaptionIndexedAnimationFactory
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    val animationFactoryImageScaleUtil: AnimationFactoryImageScaleUtil = AnimationFactoryImageScaleUtil.getInstance()!!

    private val animationFactorySpriteScaleUtil: AnimationFactorySpriteScaleUtil = AnimationFactorySpriteScaleUtil.getInstance()!!

    private var captionImage: Image

    private var spriteMovieImage: Image

    private var frameWidth: Int

    private var frameHeight: Int

    private var captionDx: Int

    private var captionDy: Int

    private var dx: Int

    private var dy: Int

    private var time: Int

    private var soundInterface: Sound

    var scaleProperties: ScaleProperties = ScaleProperties.instance

    private val animationBehaviorFactory: AnimationBehaviorFactory
public constructor        (captionImage: Image, spriteMovieImage: Image, soundInterface: Sound, frameWidth: Int, frameHeight: Int, captionDx: Int, captionDy: Int, dx: Int, dy: Int, time: Int)                        

                            : this(captionImage, spriteMovieImage, soundInterface, frameWidth, frameHeight, captionDx, captionDy, dx, dy, time, AnimationBehaviorFactory.getInstance()){

                    var captionImage = captionImage


                    var spriteMovieImage = spriteMovieImage


                    var soundInterface = soundInterface


                    var frameWidth = frameWidth


                    var frameHeight = frameHeight


                    var captionDx = captionDx


                    var captionDy = captionDy


                    var dx = dx


                    var dy = dy


                    var time = time


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (captionImage: Image, spriteMovieImage: Image, soundInterface: Sound, frameWidth: Int, frameHeight: Int, captionDx: Int, captionDy: Int, dx: Int, dy: Int, time: Int, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {

                    var captionImage = captionImage


                    var spriteMovieImage = spriteMovieImage


                    var soundInterface = soundInterface


                    var frameWidth = frameWidth


                    var frameHeight = frameHeight


                    var captionDx = captionDx


                    var captionDy = captionDy


                    var dx = dx


                    var dy = dy


                    var time = time


                    var animationBehaviorFactory = animationBehaviorFactory
this.captionImage= captionImage
this.spriteMovieImage= spriteMovieImage
this.frameWidth= frameWidth
this.frameHeight= frameHeight
this.captionDx= captionDx
this.captionDy= captionDy
this.dx= dx
this.dy= dy
this.time= time
this.soundInterface= soundInterface
this.animationBehaviorFactory= animationBehaviorFactory
}


                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var instanceId = instanceId

    var scaledImage: Image = animationFactoryImageScaleUtil!!.createImage(this.captionImage, this.captionImage!!.getWidth(), this.captionImage!!.getHeight(), this.scaleProperties!!.scaleWidth, this.scaleProperties!!.scaleHeight)!!


    var animationInterface: Animation = ImageAnimation(scaledImage, this.animationBehaviorFactory!!.getOrCreateInstance())


    var sprite: Sprite = animationFactorySpriteScaleUtil!!.createImage(this.spriteMovieImage, this.frameWidth, this.frameHeight, this.scaleProperties!!.scaleWidth, this.scaleProperties!!.scaleHeight)!!


    var movieIndexedAnimationInterface: IndexedAnimation = SpriteIndexedAnimation(sprite, this.spriteMovieImage, this.animationBehaviorFactory!!.getOrCreateInstance())


    var player: Player = this.soundInterface!!.getPlayerP()!!


    
                        if(player == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Sound Was not Initialized")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CaptionIndexedAnimation(animationInterface, movieIndexedAnimationInterface, player, this.captionDx, this.captionDy, dx, dy, time, this.animationBehaviorFactory!!.getOrCreateInstance())
}

override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var scaleProperties = scaleProperties
this.scaleProperties= scaleProperties
}


}
                
            

