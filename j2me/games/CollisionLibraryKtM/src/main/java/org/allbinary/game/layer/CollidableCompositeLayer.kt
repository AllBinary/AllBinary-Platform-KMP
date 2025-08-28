
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.ai.ArtificialIntelligence
import org.allbinary.ai.ArtificialIntelligenceInterface
import org.allbinary.game.collision.CollidableBaseBehavior
import org.allbinary.game.collision.CollidableInterfaceCompositeInterface
import org.allbinary.game.collision.CollidableNeverCollideBehaviorFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.RectangleFactory
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.view.ViewPosition

open public class CollidableCompositeLayer : AllBinaryGameLayer
                , CollidableInterfaceCompositeInterface {
        

        companion object {
            
    val NULL_COLLIDABLE_COMPOSITE_LAYER: CollidableCompositeLayer = CollidableCompositeLayer(RectangleFactory.SINGLETON, ViewPosition.NULL_VIEW_POSITION, CollidableNeverCollideBehaviorFactory.getInstance())

        }
            
    private var collidableInferface: CollidableBaseBehavior
public constructor        (layerInfo: Rectangle, viewPosition: ViewPosition, collidableInferface: CollidableBaseBehavior)                        

                            : super(layerInfo, viewPosition){
    //var layerInfo = layerInfo
    //var viewPosition = viewPosition
    //var collidableInferface = collidableInferface


                            //For kotlin this is before the body of the constructor.
                    
this.collidableInferface= CollidableNeverCollideBehaviorFactory.getInstance()
this.setCollidableInferface(collidableInferface)
}

public constructor        (name: String, layerInfo: Rectangle, viewPosition: ViewPosition, collidableInferface: CollidableBaseBehavior)                        

                            : super(name, layerInfo, viewPosition){
    //var name = name
    //var layerInfo = layerInfo
    //var viewPosition = viewPosition
    //var collidableInferface = collidableInferface


                            //For kotlin this is before the body of the constructor.
                    
this.collidableInferface= CollidableNeverCollideBehaviorFactory.getInstance()
this.setCollidableInferface(collidableInferface)
}

public constructor        (layerInfo: Rectangle, viewPosition: ViewPosition)                        

                            : super(layerInfo, viewPosition){
    //var layerInfo = layerInfo
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
collidableInferface= CollidableNeverCollideBehaviorFactory.getInstance()
}

public constructor        (name: String, layerInfo: Rectangle, viewPosition: ViewPosition)                        

                            : super(name, layerInfo, viewPosition){
    //var name = name
    //var layerInfo = layerInfo
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
collidableInferface= CollidableNeverCollideBehaviorFactory.getInstance()
}

public constructor        (layerInfo: Rectangle)                        

                            : super(layerInfo){
    //var layerInfo = layerInfo


                            //For kotlin this is before the body of the constructor.
                    
collidableInferface= CollidableNeverCollideBehaviorFactory.getInstance()
}


open fun getArtificialIntelligenceInterface()
        //nullable = true from not(false or (false and true)) = true
: ArtificialIntelligenceInterface{
ForcedLogUtil.log(commonStrings!!.NOT_IMPLEMENTED, this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ArtificialIntelligence.getInstance()
}

override fun getCollidableInferface()
        //nullable = true from not(false or (false and true)) = true
: CollidableBaseBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return collidableInferface
}


open fun setCollidableInferface(collidableInferface: CollidableBaseBehavior)
        //nullable = true from not(false or (false and false)) = true
{
    //var collidableInferface = collidableInferface
this.collidableInferface= collidableInferface
}

override fun implmentsCollidableInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

override fun toString(stringBuffer: StringMaker)
        //nullable = true from not(false or (true and false)) = true
{
    //var stringBuffer = stringBuffer

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!

super.toString(stringBuffer)
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(this.getCollidableInferface()!!.toString())
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
                
            

