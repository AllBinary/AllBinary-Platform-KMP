
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Image
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.animation.image.sprite.OneRowSpriteIndexedAnimationFactory
import org.allbinary.animation.resource.BaseResourceAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.resource.ResourceLoadingLevelFactory
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.image.ImageCache
import org.allbinary.image.ImageCacheFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.os.OperatingSystemFactory
import org.allbinary.media.image.ImageCompleteUtil

open public class TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory : BaseResourceAnimationInterfaceFactoryInterfaceFactory {
        
companion object {
            
    open fun createFactory()
        //nullable = true from not(false or (false and true)) = true
: TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory("TouchButton Animations")
}


        }
            public constructor (name: String)                        

                            : super(name, Hashtable<Any, Any>(), Hashtable<Any, Any>(), Hashtable<Any, Any>()){
    //var name = name


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun init(level: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var level = level
this.initImageCache(ImageCacheFactory.getInstance(), level)
}


                @Throws(Exception::class)
            
    override fun initImageCache(imageCache: ImageCache, level: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageCache = imageCache
    //var level = level

    
                        if(this.isInitialized())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var portion: Int = 140


    var loadingString: String = StringMaker().
                            append(this.toString())!!.append(" Loading: ")!!.toString()!!


    var index: Int = 0


    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.addPortion(portion, loadingString, index++)

    var touchButtonBlankResource: TouchButtonResource = TouchButtonBlankResource.getInstance()!!


    var touchButtonGenericActionResource: TouchButtonResource = TouchButtonGenericActionResource.getInstance()!!


    var touchButtonStartResource: TouchButtonResource = TouchButtonStartResource.getInstance()!!


    var touchButtonUpResource: TouchButtonResource = TouchButtonUpResource.getInstance()!!


    var touchButtonDownResource: TouchButtonResource = TouchButtonDownResource.getInstance()!!


    var touchButtonTurnLeftResource: TouchButtonResource = TouchButtonTurnLeftResource.getInstance()!!


    var touchButtonTurnRightResource: TouchButtonResource = TouchButtonTurnRightResource.getInstance()!!


    var touchButtonStrafeLeftResource: TouchButtonResource = TouchButtonStrafeLeftResource.getInstance()!!


    var touchButtonStrafeRightResource: TouchButtonResource = TouchButtonStrafeRightResource.getInstance()!!


    var touchButtonBlankResourceImage: Image = imageCache!!.getWithKey(touchButtonBlankResource!!.RESOURCE)!!


    var touchButtonGenericActionResourceImage: Image = imageCache!!.getWithKey(touchButtonGenericActionResource!!.RESOURCE)!!


    var touchButtonStartResourceImage: Image = imageCache!!.getWithKey(touchButtonStartResource!!.RESOURCE)!!


    var touchButtonUpResourceImage: Image = imageCache!!.getWithKey(touchButtonUpResource!!.RESOURCE)!!


    var touchButtonDownResourceImage: Image = imageCache!!.getWithKey(touchButtonDownResource!!.RESOURCE)!!


    var touchButtonTurnLeftResourceImage: Image = imageCache!!.getWithKey(touchButtonTurnLeftResource!!.RESOURCE)!!


    var touchButtonTurnRightResourceImage: Image = imageCache!!.getWithKey(touchButtonTurnRightResource!!.RESOURCE)!!


    var touchButtonStrafeLeftResourceImage: Image = imageCache!!.getWithKey(touchButtonStrafeLeftResource!!.RESOURCE)!!


    var touchButtonStrafeRightResourceImage: Image = imageCache!!.getWithKey(touchButtonStrafeRightResource!!.RESOURCE)!!


    var nullAnimationFactory: NullAnimationFactory = NullAnimationFactory.getFactoryInstance()!!


    
                        if(OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!.isOverScan())
                        
                                    {
                                    imageCache!!.getWithKey(TouchButtonStartResource.getInstance()!!.HINT)

                                    }
                                
progressCanvas!!.addPortion(portion, loadingString, index++)

    var imageCompleteUtil: ImageCompleteUtil = ImageCompleteUtil.getInstance()!!

progressCanvas!!.addPortion(portion, loadingString, index++)
imageCompleteUtil!!.waitFor(touchButtonBlankResourceImage, touchButtonBlankResource!!.RESOURCE)
this.add(touchButtonBlankResource!!.RESOURCE, OneRowSpriteIndexedAnimationFactory.createFactory(touchButtonBlankResourceImage, AnimationBehaviorFactory.getInstance()))
this.add(touchButtonBlankResource!!.HINT, nullAnimationFactory)
progressCanvas!!.addPortion(portion, loadingString, index++)
imageCompleteUtil!!.waitFor(touchButtonGenericActionResourceImage, touchButtonGenericActionResource!!.RESOURCE)
this.add(touchButtonGenericActionResource!!.RESOURCE, OneRowSpriteIndexedAnimationFactory.createFactory(touchButtonGenericActionResourceImage, AnimationBehaviorFactory.getInstance()))
this.add(touchButtonGenericActionResource!!.HINT, nullAnimationFactory)
progressCanvas!!.addPortion(portion, loadingString, index++)
imageCompleteUtil!!.waitFor(touchButtonStartResourceImage, touchButtonStartResource!!.RESOURCE)
this.add(touchButtonStartResource!!.RESOURCE, OneRowSpriteIndexedAnimationFactory.createFactory(touchButtonStartResourceImage, AnimationBehaviorFactory.getInstance()))
progressCanvas!!.addPortion(portion, loadingString, index++)
imageCompleteUtil!!.waitFor(touchButtonUpResourceImage, touchButtonUpResource!!.RESOURCE)
this.add(touchButtonUpResource!!.RESOURCE, OneRowSpriteIndexedAnimationFactory.createFactory(touchButtonUpResourceImage, AnimationBehaviorFactory.getInstance()))
this.add(touchButtonUpResource!!.HINT, nullAnimationFactory)
progressCanvas!!.addPortion(portion, loadingString, index++)
imageCompleteUtil!!.waitFor(touchButtonDownResourceImage, touchButtonDownResource!!.RESOURCE)
this.add(touchButtonDownResource!!.RESOURCE, OneRowSpriteIndexedAnimationFactory.createFactory(touchButtonDownResourceImage, AnimationBehaviorFactory.getInstance()))
this.add(touchButtonDownResource!!.HINT, nullAnimationFactory)
progressCanvas!!.addPortion(portion, loadingString, index++)
imageCompleteUtil!!.waitFor(touchButtonTurnLeftResourceImage, touchButtonTurnLeftResource!!.RESOURCE)
this.add(touchButtonTurnLeftResource!!.RESOURCE, OneRowSpriteIndexedAnimationFactory.createFactory(touchButtonTurnLeftResourceImage, AnimationBehaviorFactory.getInstance()))
this.add(touchButtonTurnLeftResource!!.HINT, nullAnimationFactory)
progressCanvas!!.addPortion(portion, loadingString, index++)
imageCompleteUtil!!.waitFor(touchButtonTurnRightResourceImage, touchButtonTurnRightResource!!.RESOURCE)
this.add(touchButtonTurnRightResource!!.RESOURCE, OneRowSpriteIndexedAnimationFactory.createFactory(touchButtonTurnRightResourceImage, AnimationBehaviorFactory.getInstance()))
this.add(touchButtonTurnRightResource!!.HINT, nullAnimationFactory)
progressCanvas!!.addPortion(portion, loadingString, index++)
imageCompleteUtil!!.waitFor(touchButtonStrafeLeftResourceImage, touchButtonStrafeLeftResource!!.RESOURCE)
this.add(touchButtonStrafeLeftResource!!.RESOURCE, OneRowSpriteIndexedAnimationFactory.createFactory(touchButtonStrafeLeftResourceImage, AnimationBehaviorFactory.getInstance()))
this.add(touchButtonStrafeLeftResource!!.HINT, nullAnimationFactory)
progressCanvas!!.addPortion(portion, loadingString, index++)
imageCompleteUtil!!.waitFor(touchButtonStrafeRightResourceImage, touchButtonStrafeRightResource!!.RESOURCE)
this.add(touchButtonStrafeRightResource!!.RESOURCE, OneRowSpriteIndexedAnimationFactory.createFactory(touchButtonStrafeRightResourceImage, AnimationBehaviorFactory.getInstance()))
this.add(touchButtonStrafeRightResource!!.HINT, nullAnimationFactory)

    
                        if(OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!.isOverScan())
                        
                                    {
                                    
    var touchButtonStartHintResource: Image = imageCache!!.getWithKey(TouchButtonStartResource.getInstance()!!.HINT)!!

this.add(touchButtonStartResource!!.HINT, OneRowSpriteIndexedAnimationFactory.createFactory(touchButtonStartHintResource, AnimationBehaviorFactory.getInstance()))

                                    }
                                
                        else {
                            this.add(touchButtonStartResource!!.HINT, nullAnimationFactory)

                        }
                            
super.init(level)
}


    override fun isLoadingLevel(level: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var level = level

    var resourceLoadingLevelFactory: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory.getInstance()!!


    
                        if(level == resourceLoadingLevelFactory!!.LOAD_TOUCH.getLevel())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.isLoadingLevel(level)

                        }
                            
}


    override fun isFeature()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(!Features.getInstance()!!.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


}
                
            

