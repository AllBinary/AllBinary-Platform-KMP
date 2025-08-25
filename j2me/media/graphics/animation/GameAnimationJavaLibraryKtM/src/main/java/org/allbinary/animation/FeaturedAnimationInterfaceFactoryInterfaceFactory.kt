
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
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.resource.FeatureResourceAnimationInterfaceFactoryInterface
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.game.resource.FeaturedResourceFactory
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.RectangleFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class FeaturedAnimationInterfaceFactoryInterfaceFactory : FeaturedResourceFactory {
        

        companion object {
            
    private var INSTANCE: FeaturedAnimationInterfaceFactoryInterfaceFactory = FeaturedAnimationInterfaceFactoryInterfaceFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FeaturedAnimationInterfaceFactoryInterfaceFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return INSTANCE
}


        }
            private constructor        (){}


                @Throws(Exception::class)
            
open fun getRectangle(resource: String)
        //nullable = true from not(false or (false and false)) = true
: Rectangle{

                    var resource = resource



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getRectangle(resource, 0, 0)
}


                @Throws(Exception::class)
            
open fun getRectangle(resource: String, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Rectangle{

                    var resource = resource


                    var x = x


                    var y = y

    var list: BasicArrayList = this.getList()!!


    var scale: Int = GameConfigurationCentral.getInstance()!!.SCALE.getValue()!!.toInt()!!


    var size: Int = getList()!!.size()!!





                        for (index in 0 until size)


        {
    var featureInterface: FeatureResourceAnimationInterfaceFactoryInterface = list.objectArray[index]!! as FeatureResourceAnimationInterfaceFactoryInterface


    
                        if(featureInterface!!.isFeature())
                        
                                    {
                                    
    var rectangle: Rectangle = featureInterface!!.getRectangle(resource)!!


    
                        if(rectangle != RectangleFactory.SINGLETON)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Rectangle(PointFactory.getInstance()!!.getInstance(x, y), ((rectangle.getWidth() *scale) shr 1), ((rectangle.getHeight() *scale) shr 1))

                                    }
                                

                                    }
                                
}




                            throw Exception(StringMaker().
                            append("No rectangle available for current feature selection or Resource: ")!!.append(resource)!!.toString())
}


                @Throws(Exception::class)
            
open fun getProcedural(resource: String)
        //nullable = true from not(false or (false and false)) = true
: ProceduralAnimationInterfaceFactoryInterface{

                    var resource = resource



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getBasicAnimationInterfaceFactoryInstance(resource) as ProceduralAnimationInterfaceFactoryInterface
}


                @Throws(Exception::class)
            
open fun get(resource: String)
        //nullable = true from not(false or (false and false)) = true
: AnimationInterfaceFactoryInterface{

                    var resource = resource



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getBasicAnimationInterfaceFactoryInstance(resource) as AnimationInterfaceFactoryInterface
}


                @Throws(Exception::class)
            
open fun getBasicAnimationInterfaceFactoryInstance(resource: String)
        //nullable = true from not(false or (false and false)) = true
: BasicAnimationInterfaceFactoryInterface{

                    var resource = resource

    var list: BasicArrayList = this.getList()!!


    var resourceTypeAvailableList: BasicArrayList = BasicArrayList()


    var size: Int = getList()!!.size()!!


    var featureInterface: FeatureResourceAnimationInterfaceFactoryInterface


    var animationInterfaceFactoryInterface: BasicAnimationInterfaceFactoryInterface





                        for (index in 0 until size)


        {featureInterface= list.objectArray[index]!! as FeatureResourceAnimationInterfaceFactoryInterface

    
                        if(featureInterface!!.isFeature())
                        
                                    {
                                    resourceTypeAvailableList!!.add(featureInterface)
animationInterfaceFactoryInterface= featureInterface!!.getBasicAnimationInterfaceFactoryInstance(resource)

    
                        if(animationInterfaceFactoryInterface != NullAnimationFactory.NULL_NOT_FOR_USE_ANIMATION_FACTORY)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterfaceFactoryInterface

                                    }
                                

                                    }
                                
}


    
                        if(resourceTypeAvailableList!!.size() > 0)
                        
                                    {
                                    
    var NO_ANIMATION_AVAILABLE_FROM: String = "No animation available from: "


    var FOR_FACTORIES: String = " factories: "


    var FOR_RESOURCE: String = " for Resource: "


    var HAS_KEY: String = " has: "


    var RESOURCES_LABEL: String = " resources "


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(NO_ANIMATION_AVAILABLE_FROM)
stringBuffer!!.append(resourceTypeAvailableList!!.size())
stringBuffer!!.append(CommonSeps.getInstance()!!.FORWARD_SLASH)
stringBuffer!!.append(size)
stringBuffer!!.append(FOR_FACTORIES)




                        for (index in 0 until resourceTypeAvailableList!!.size()!!)


        {stringBuffer!!.append(resourceTypeAvailableList!!.get(index)!!.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.COMMA_SEP)
}

stringBuffer!!.append(FOR_RESOURCE)
stringBuffer!!.append(resource)




                        for (index in 0 until size)


        {stringBuffer!!.append(CommonSeps.getInstance()!!.NEW_LINE)
featureInterface= list.objectArray[index]!! as FeatureResourceAnimationInterfaceFactoryInterface

    
                        if(featureInterface!!.isFeature())
                        
                                    {
                                    stringBuffer!!.append(StringUtil.getInstance()!!.toString(featureInterface))
stringBuffer!!.append(HAS_KEY)
stringBuffer!!.append(featureInterface!!.getHashtable()!!.size)
stringBuffer!!.append(RESOURCES_LABEL)

                                    }
                                
}




                            throw Exception(stringBuffer!!.toString())

                                    }
                                
                        else {
                            
    var stringBuffer: StringMaker = StringMaker()





                        for (index in 0 until size)


        {featureInterface= list.objectArray[index]!! as FeatureResourceAnimationInterfaceFactoryInterface
stringBuffer!!.append(featureInterface!!.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
}


    var result: String = stringBuffer!!.toString()!!

stringBuffer!!.delete(0, stringBuffer!!.length())



                            throw Exception(stringBuffer!!.append("No feature resource type available for Resource: ")!!.append(resource)!!.append(" Resource Factories Available: ")!!.append(result)!!.toString())

                        }
                            
}


}
                
            

