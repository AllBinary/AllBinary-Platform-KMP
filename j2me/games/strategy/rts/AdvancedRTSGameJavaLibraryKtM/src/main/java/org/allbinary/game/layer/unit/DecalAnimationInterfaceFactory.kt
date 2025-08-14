
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer.unit




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.resources.BasicGameResources
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.animation.NullRotationAnimationFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory

open public class DecalAnimationInterfaceFactory
            : Object
         {
        

        companion object {
            
    private val instance: DecalAnimationInterfaceFactory = DecalAnimationInterfaceFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DecalAnimationInterfaceFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getInstance(basicGameResources: BasicGameResources, basicColor: BasicColor)
        //nullable =  from not(true or (false and false)) = 
: AnimationInterfaceFactoryInterface{

                    var basicGameResources = basicGameResources


                    var basicColor = basicColor

    var animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface


    
                        if(basicColor == BasicColorFactory.getInstance()!!.RED)
                        
                                    {
                                    animationInterfaceFactoryInterface= FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.get(basicGameResources!!.RESOURCE)

                                    }
                                
                        else {
                            animationInterfaceFactoryInterface= NullRotationAnimationFactory.getFactoryInstance()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterfaceFactoryInterface
}


}
                
            

