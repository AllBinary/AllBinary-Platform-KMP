
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
        package org.allbinary.game.resource



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.RelativeRelationship
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.relationship.RelativeLayerRelationship
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class FeaturedResourceRelativeRelationshipFactory : FeaturedResourceFactory {
        

        companion object {
            
    private var INSTANCE: FeaturedResourceRelativeRelationshipFactory = FeaturedResourceRelativeRelationshipFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FeaturedResourceRelativeRelationshipFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return INSTANCE
}


        }
            private constructor        (){}


                @Throws(Exception::class)
            
open fun getRelativeRelationshipList(resource: String, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var resource = resource


                    var layer = layer

    var featureReleaseList: BasicArrayList = this.getList()!!
            


    var size: Int = getList()!!.size()!!
            





                        for (index in 0 until size)


        {
    var featureInterface: ResourceRelativeRelationshipFactoryInterface = featureReleaseList!!.objectArray[index]!! as ResourceRelativeRelationshipFactoryInterface


    
                        if(featureInterface!!.isFeature())
                        
                                    {
                                    
    var list: BasicArrayList = featureInterface!!.getResourceRelativeRelationshipList(resource)!!
            


    
                        if(list != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.duplicate(list, layer)

                                    }
                                

                                    }
                                
}




                            throw Exception(StringMaker().
                            append(
                            "Not available for current feature selection or Resource: ")!!.append(resource)!!.toString())
}


                @Throws(Exception::class)
            
open fun duplicate(list: BasicArrayList, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var list = list


                    var layer = layer

    var newList: BasicArrayList = BasicArrayList()





                        for (index in 0 until list.size()!!)


        {
    var relativeRelationship: RelativeRelationship = list.objectArray[index]!! as RelativeRelationship

newList!!.add(RelativeLayerRelationship(layer, PointFactory.getInstance()!!.getInstance(relativeRelationship!!.getX(), relativeRelationship!!.getY()), BasicArrayListUtil.getInstance()!!.getImmutableInstance()))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newList
}


}
                
            

