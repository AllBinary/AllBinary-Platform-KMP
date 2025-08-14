
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
        package org.allbinary.graphics.canvas.transition.progress




        import java.lang.Object        
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.android.activity.NullProgressActivity
import org.allbinary.android.activity.ProgressActivityInterface
import org.allbinary.android.activity.SimpleProgressActivityInterface
import org.allbinary.graphics.color.BasicColor

open public class AndroidTitleProgressBar : ProgressCanvas {
        

    private var showTitleProgressBarRunnable: ShowTitleProgressBarRunnable = ShowTitleProgressBarRunnable()

    private var dismissTitleProgressBarRunnable: DismissTitleProgressBarRunnable = DismissTitleProgressBarRunnable()

    private var progressDialogPortionSetProgressRunnable: TitleProgressBarPortionSetProgressRunnable = TitleProgressBarPortionSetProgressRunnable()

    private var progressDialogSetProgressRunnable: TitleProgressBarSetProgressRunnable = TitleProgressBarSetProgressRunnable()

    private var progressActivity: ProgressActivityInterface = NullProgressActivity.NULL_PROGRESS_ACTIVITY

    private var portion: Int = 0
protected constructor        (title: String, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, backgroundBasicColor, foregroundBasicColor){

                    var title = title


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
}


open fun init(activity: SimpleProgressActivityInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var activity = activity
}


open fun init(activity: ProgressActivityInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var activity = activity
this.progressActivity= activity
}


open fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.progressActivity != NullProgressActivity.NULL_PROGRESS_ACTIVITY)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun start()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.START_METHOD_NAME)
super.start()
this.progressActivity!!.runOnUiThread(showTitleProgressBarRunnable)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.START_METHOD_NAME, e)
}

}

override fun end()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.END_METHOD_NAME)
this.progressActivity!!.runOnUiThread(dismissTitleProgressBarRunnable)
super.end()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.END_METHOD_NAME, e)
}

}

override fun addPortion(value: Int, text: String, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value


                    var text = text


                    var index = index

        try {
            super.addPortion(value, text, index)
this.portion= value
this.progressActivity!!.runOnUiThread(progressDialogPortionSetProgressRunnable)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, ADD_PORTION, e)
}

}

override fun addPortion(value: Int, text: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value


                    var text = text

        try {
            super.addPortion(value, text)
this.portion= value
this.progressActivity!!.runOnUiThread(progressDialogPortionSetProgressRunnable)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, ADD_PORTION, e)
}

}

override fun setValue(value: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value

        try {
            super.setValue(value)
this.progressActivity!!.runOnUiThread(progressDialogSetProgressRunnable)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "setValue", e)
}

}


open fun waitUntilDisplayed()
        //nullable = true from not(false or (false and true)) = true
{}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


open public inner class TitleProgressBarSetProgressRunnable
            : Object
        
                , Runnable {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var value: Int = this@AndroidTitleProgressBar.getValue().toInt()

this@AndroidTitleProgressBar.progressActivity!!.onTitleProgressBarSetProgress(value)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            
open public inner class TitleProgressBarPortionSetProgressRunnable
            : Object
        
                , Runnable {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var value: Int = (this@AndroidTitleProgressBar.getValue() +this@AndroidTitleProgressBar.getMaxValue() /portion).toInt()

this@AndroidTitleProgressBar.progressActivity!!.onTitleProgressBarSetProgress(value)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            
open public inner class ShowTitleProgressBarRunnable
            : Object
        
                , Runnable {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var maxValue: Int = this@AndroidTitleProgressBar.getMaxValue().toInt()

this@AndroidTitleProgressBar.progressActivity!!.onShowTitleProgressBar(maxValue, false)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            
open public inner class DismissTitleProgressBarRunnable
            : Object
        
                , Runnable {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this@AndroidTitleProgressBar.progressActivity!!.onDismissTitleProgressBar()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            
}
                
            

