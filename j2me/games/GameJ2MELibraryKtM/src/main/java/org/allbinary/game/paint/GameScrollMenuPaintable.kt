
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
        package org.allbinary.game.paint



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.ColorChangeEventHandler
import org.allbinary.graphics.color.ColorChangeListener
import org.allbinary.graphics.form.FormPaintable
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.graphics.form.item.StringComponent
import org.allbinary.graphics.form.item.TextItem
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class GameScrollMenuPaintable : BasicGameDemoPaintable
                , ColorChangeListener {
        
public constructor        (mainDemoStatePaintable: Paintable, ownershipPaintable: Paintable, helpPaintableInterface: Paintable, basicColor: BasicColor)                        

                            : super(mainDemoStatePaintable, ownershipPaintable, helpPaintableInterface){

                    var mainDemoStatePaintable = mainDemoStatePaintable


                    var ownershipPaintable = ownershipPaintable


                    var helpPaintableInterface = helpPaintableInterface


                    var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
this.setColor(basicColor)
ColorChangeEventHandler.getInstance()!!.addListener(this)
}

override fun setState(state: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var state = state
this.setCurrentStatePaintable(this.getMainDemoStatePaintable())
}

override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
}


open fun setColor(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicColor = basicColor

    var mainGameDemoStatePaintable: MainGameDemoStatePaintable = this.getMainDemoStatePaintable() as MainGameDemoStatePaintable


    var formPaintable: FormPaintable = mainGameDemoStatePaintable!!.getMenuPaintableInterface() as FormPaintable


    var scrollSelectionForm: ScrollSelectionForm = formPaintable!!.getForm() as ScrollSelectionForm

mainGameDemoStatePaintable!!.getOwnershipPaintableInterface()!!.setBasicColorP(basicColor)
scrollSelectionForm!!.setButtonBasicColor(basicColor)




                        for (index in scrollSelectionForm!!.size() -1 downTo 0)


        {
    var item: TextItem = scrollSelectionForm!!.get(index) as TextItem


    var stringComponent: StringComponent = item!!.getLabelStringComponent()!!
            


    
                        if(stringComponent != 
                                    null
                                )
                        
                                    {
                                    stringComponent!!.setForegroundBasicColor(basicColor)

                                    }
                                
}

}


}
                
            

