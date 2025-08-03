
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
        package org.allbinary.animation.resource



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.animation.BasicAnimationInterfaceFactoryInterface
import org.allbinary.game.resource.ResourceLoadingLevelFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.image.ImageCache
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class BaseResourceAnimationInterfaceFactoryInterfaceFactory
            : Object
        
                , FeatureResourceAnimationInterfaceFactoryInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val hashtable: Hashtable<Any, Any>

    private val rectangleHashtable: Hashtable<Any, Any>

    private val rectangleArrayOfArraysHashtable: Hashtable<Any, Any>

    private val name: String

    private var initialized: Boolean= false
public constructor        (name: String)
            : super()
        {

                    var name = name
this.hashtable= Hashtable<Any, Any>()
this.rectangleHashtable= Hashtable<Any, Any>()
this.rectangleArrayOfArraysHashtable= Hashtable<Any, Any>()
this.name= name
}

public constructor        (name: String, hashtable: Hashtable<Any, Any>, rectangleHashtable: Hashtable<Any, Any>, rectangleArrayHashtable: Hashtable<Any, Any>)
            : super()
        {

                    var name = name


                    var hashtable = hashtable


                    var rectangleHashtable = rectangleHashtable


                    var rectangleArrayHashtable = rectangleArrayHashtable
this.hashtable= hashtable
this.rectangleHashtable= rectangleHashtable
this.rectangleArrayOfArraysHashtable= rectangleArrayHashtable
this.name= name
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


                @Throws(Exception::class)
            override fun init(level: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var level = level

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(StringMaker().
                            append(
                            "Available List of Animations: ")!!.append(hashtable!!.toString())!!.toString(), this, commonStrings!!.INIT)
this.setInitialized(true)
}


                @Throws(Exception::class)
            
open fun init(imageCache: ImageCache, level: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageCache = imageCache


                    var level = level
}


                @Throws(Exception::class)
            
open fun add(resource: String, animationInterfaceFactoryInterface: BasicAnimationInterfaceFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var resource = resource


                    var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface

    
                        if(hashtable!!.containsKey(resource as Object))
                        
                                    {
                                    


                            throw Exception(StringMaker().
                            append(
                            "Resource Already Created: ")!!.append(resource)!!.toString())

                                    }
                                
hashtable!!.put(resource, animationInterfaceFactoryInterface)
}


                @Throws(Exception::class)
            override fun getBasicAnimationInterfaceFactoryInstance(resource: String)
        //nullable = true from not(false or (false and false)) = true
: BasicAnimationInterfaceFactoryInterface{

                    var resource = resource



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable!!.get(resource as Object?) as BasicAnimationInterfaceFactoryInterface
}


                @Throws(Exception::class)
            override fun getRectangle(resource: String)
        //nullable = true from not(false or (false and false)) = true
: Rectangle{

                    var resource = resource



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangleHashtable!!.get(resource as Object?) as Rectangle
}


                @Throws(Exception::class)
            
open fun addRectangle(resource: String, rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
{

                    var resource = resource


                    var rectangle = rectangle
rectangleHashtable!!.put(resource, rectangle)
}


                @Throws(Exception::class)
            override fun getRectangleArrayOfArrays(resource: String)
        //nullable = true from not(false or (false and false)) = true
: Array<Array<Rectangle?>?>{

                    var resource = resource



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangleArrayOfArraysHashtable!!.get(resource as Object?)as Array<Array<Rectangle?>?>
}


                @Throws(Exception::class)
            
open fun addRectangleArrayOfArrays(resource: String, rectangleArrayOfArrays: Array<Array<Rectangle?>?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var resource = resource


                    var rectangleArrayOfArrays = rectangleArrayOfArrays
rectangleArrayOfArraysHashtable!!.put(resource, rectangleArrayOfArrays)
}

override fun isFeature()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun isLoadingLevel(level: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var level = level

    var resourceLoadingLevelFactory: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory.getInstance()!!
            


    
                        if(level == resourceLoadingLevelFactory!!.LOAD_ALL.getLevel())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(this::class.qualifiedName!!)!!.append(CommonSeps.getInstance()!!.SEMICOLON)!!.append(CommonSeps.getInstance()!!.SPACE)!!.append(this.name)!!.toString()
}

override fun getHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


open fun getRectangleHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangleHashtable
}


open fun getRectangleArrayOfArraysHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rectangleArrayOfArraysHashtable
}


open fun setInitialized(initialized: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var initialized = initialized
this.initialized= initialized
}


open fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initialized
}


}
                
            

