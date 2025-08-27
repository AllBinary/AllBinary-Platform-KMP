
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
        package org.allbinary.layer




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.identification.BasicGroupFactory
import org.allbinary.game.identification.Group
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.RectangleFactory
import org.allbinary.graphics.opengles.OpenGLFeatureUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.math.PositionStrings
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.view.ViewPosition
import org.allbinary.view.event.ViewPositionEvent

open public class AllBinaryLayer : Layer
                , LayerInterface {
        

        companion object {
            
    val NULL_ALLBINARY_LAYER: AllBinaryLayer = AllBinaryLayer(RectangleFactory.SINGLETON, ViewPosition.NULL_VIEW_POSITION)

    private val TYPE: String = "Type: "

        }
            
    val viewPositionEvent: ViewPositionEvent = ViewPositionEvent(this)

    private var halfWidth: Int= 0

    private var halfHeight: Int= 0

    private val name: String

    private var viewPosition: ViewPosition = ViewPosition.NULL_VIEW_POSITION
public constructor        (rectangle: Rectangle, viewPosition: ViewPosition)                        

                            : this(StringUtil.getInstance()!!.EMPTY_STRING, rectangle, viewPosition){

                    var rectangle = rectangle


                    var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (name: String, rectangle: Rectangle, viewPosition: ViewPosition)                        

                            : super(rectangle.getWidth(), rectangle.getHeight()){

                    var name = name


                    var rectangle = rectangle


                    var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    

    var localName: String


    
                        if(name == 
                                    null
                                )
                        
                                    {
                                    localName= this::class.toString()!!

                                    }
                                
                        else {
                            localName= StringMaker().
                            append(name)!!.append(CommonSeps.getInstance()!!.COLON)!!.append(Integer.toHexString(this.hashCode()))!!.toString()

                        }
                            
this.name= localName

    var point: GPoint = rectangle.getPoint()!!

this.setPosition(point.getX(), point.getY(), point.getZ())
this.setHalfWidth((this.getWidth() shr 1))
this.setHalfHeight((this.getHeight() shr 1))
this.viewPosition= viewPosition
this.viewPosition!!.setAllbinaryLayer(this)
}


                @Throws(Exception::class)
            
open fun onChangeEvent(layerManagerEvent: ViewPositionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerManagerEvent = layerManagerEvent
}

override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}

override fun getX2()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getXP() +this.getWidth()
}

override fun getY2()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getYP() +this.getHeight()
}

override fun getZ2()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.getZP() +this.getDepth()).toInt()
}

override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setHalfWidth(halfWidth: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var halfWidth = halfWidth
this.halfWidth= halfWidth
}

override fun getHalfWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return halfWidth
}


open fun setHalfHeight(halfHeight: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var halfHeight = halfHeight
this.halfHeight= halfHeight
}

override fun getHalfHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return halfHeight
}


open fun getHalfDepth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getDepth().toInt() /2
}


open fun getViewPosition()
        //nullable = true from not(false or (false and true)) = true
: ViewPosition{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return viewPosition
}


open fun setViewPosition(viewPosition: ViewPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var viewPosition = viewPosition
this.viewPosition= viewPosition
}

override fun getGroupInterface()
        //nullable = true from not(false or (false and true)) = true
: Array<Group?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicGroupFactory.getInstance()!!.NONE_ARRAY
}

override fun implmentsTickableInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun implmentsGameInputInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun implmentsArtificialIntelligenceCompositeInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun implmentsCollidableInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun implementsThreedInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OpenGLFeatureUtil.getInstance()!!.isAnyThreed()
}

override fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


open fun getMultiPlayerType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}

override fun toString(stringBuffer: StringMaker)
        //nullable = true from not(false or (true and false)) = true
{

                    var stringBuffer = stringBuffer

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var positionStrings: PositionStrings = PositionStrings.getInstance()!!


    var commonLabels: CommonLabels = CommonLabels.getInstance()!!

stringBuffer!!.append(this.getName())
stringBuffer!!.append(commonSeps!!.COLON)
stringBuffer!!.append(TYPE)
stringBuffer!!.append(this.getType())
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.X_LABEL)
stringBuffer!!.append(this.getXP())
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.Y_LABEL)
stringBuffer!!.append(this.getYP())
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.Z_LABEL)
stringBuffer!!.append(this.getZP())
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(commonLabels!!.WIDTH_LABEL)
stringBuffer!!.append(this.getWidth())
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.append(this.getHeight())
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

this.toString(stringBuffer)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

