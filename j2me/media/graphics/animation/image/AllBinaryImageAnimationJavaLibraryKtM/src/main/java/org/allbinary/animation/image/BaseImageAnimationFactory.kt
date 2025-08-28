
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
        package org.allbinary.animation.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.image.AnimationFactoryImageScaleUtil
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.ScaleProperties
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps

open public class BaseImageAnimationFactory
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    val animationFactoryImageScaleUtil: AnimationFactoryImageScaleUtil = AnimationFactoryImageScaleUtil.getInstance()!!

    private val image: Image

    val animationBehaviorFactory: AnimationBehaviorFactory

    private val sequenceArray: IntArray

    val animationFactoryInitializationVisitor: AnimationFactoryInitializationVisitor

    var scaleProperties: ScaleProperties = ScaleProperties.instance
public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, PrimitiveIntUtil.getArrayInstance(), width, height, animationBehaviorFactory){
    //var image = image
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor        (image: Image, sequenceArray: IntArray, width: Int, height: Int, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, sequenceArray, width, height, animationBehaviorFactory){
    //var image = image
    //var sequenceArray = sequenceArray
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor        (image: Image, width: Int, height: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, PrimitiveIntUtil.getArrayInstance(), width, height, animationBehaviorFactory){
    //var image = image
    //var width = width
    //var height = height
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, sequenceArray: IntArray, width: Int, height: Int, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {
    //var image = image
    //var sequenceArray = sequenceArray
    //var width = width
    //var height = height
    //var animationBehaviorFactory = animationBehaviorFactory
this.animationFactoryInitializationVisitor= AnimationFactoryInitializationVisitor()
this.image= image
this.animationFactoryInitializationVisitor!!.width= width
this.animationFactoryInitializationVisitor!!.height= height
this.animationBehaviorFactory= animationBehaviorFactory
this.sequenceArray= sequenceArray
}


                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullAnimationFactory.getFactoryInstance()!!.getInstance(instanceId)
}


open fun getImage()
        //nullable = true from not(false or (false and true)) = true
: Image{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


open fun getSequenceArray()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return sequenceArray
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var commonLabels: CommonLabels = CommonLabels.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(super.toString())
stringBuffer!!.append(commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.append(image.getHeight())
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(this.animationFactoryInitializationVisitor!!.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}

override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{
    //var scaleProperties = scaleProperties
this.scaleProperties= scaleProperties

    
                        if(this.scaleProperties!!.shouldScale)
                        
                                    {
                                    this.scaleProperties!!.scaleWidth= (this.animationFactoryInitializationVisitor!!.width *this.scaleProperties!!.scaleX).toInt()
this.scaleProperties!!.scaleHeight= (this.animationFactoryInitializationVisitor!!.height *this.scaleProperties!!.scaleY).toInt()

                                    }
                                
                        else {
                            
                        }
                            
}


open fun getAnimationFactoryInitializationVisitorP()
        //nullable = true from not(false or (false and true)) = true
: AnimationFactoryInitializationVisitor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationFactoryInitializationVisitor
}


open fun getScalePropertiesP()
        //nullable = true from not(false or (false and true)) = true
: ScaleProperties{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaleProperties
}


}
                
            

