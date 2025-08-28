
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
        
import org.allbinary.animation.resource.BaseResourceAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.resource.ResourceLoadingLevelFactory
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.image.ImageCache
import org.allbinary.image.ImageCacheFactory

open public class TouchButtonResourceAnimationInterfaceFactoryInterfaceFactory : BaseResourceAnimationInterfaceFactoryInterfaceFactory {
        
public constructor        ()                        

                            : super("TouchButton Animations"){


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (name: String)                        

                            : super(name){
var name = name


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            override fun init(level: Int)
        //nullable = true from not(false or (false and false)) = true
{
var level = level
this.init(ImageCacheFactory.getInstance(), level)
}


                @Throws(Exception::class)
            override fun init(imageCache: ImageCache, level: Int)
        //nullable = true from not(false or (false and false)) = true
{
var imageCache = imageCache
var level = level

    
                        if(this.isInitialized())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
super.init(level)
}

override fun isLoadingLevel(level: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var level = level

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
                
            

