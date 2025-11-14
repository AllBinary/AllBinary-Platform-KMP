
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
        package org.allbinary.graphics.j2me.dialog




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing
import org.allbinary.graphics.j2me.GraphicsException
import org.allbinary.graphics.j2me.MyFrame
import org.allbinary.graphics.j2me.workarea.WorkAreaJPanel
import org.allbinary.graphics.j2me.workarea.WorkAreaJPanelInterface

open public class NewWorkAreaJDialog : javax.swing.JDialog {
        
companion object {
            
    open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
var args = args

        try {
            NewWorkAreaJDialog(MyFrame(), true, Dimension(100, 100), "testing").
                            show()
} catch(e: Exception)
            {
}

}


        }
            
    private var parent: MyFrame

    private var dimension: Dimension

    private var xSizeJTextField: JTextField

    private var ySizeJTextField: JTextField

    private var nameJTextField: JTextField
public constructor (parent: MyFrame, modal: Boolean, dimension: Dimension, newName: String)                        

                            : super(parent as java.awt.Frame, modal){
var parent = parent
var modal = modal
var dimension = dimension
var newName = newName


                            //For kotlin this is before the body of the constructor.
                    

        try {
            initComponents()
this.parent= parent
this.xSizeJTextField= JTextField("12")
this.ySizeJTextField= JTextField("12")
this.nameJTextField= JTextField(newName)
this.dimension= dimension

    var submitButton: JButton = JButton("Ok")

submitButton!!.addActionListener(object: ActionListener()
                                {
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            disposeNewDialog()
} catch(e: Exception)
            {
}

}

                                }
                            )
this.setSize(150, 100)
this.getContentPane()!!.setLayout(GridLayout(5, 2))
this.getContentPane()!!.add(JLabel("Please enter"))
this.getContentPane()!!.add(JLabel(" the size."))
this.getContentPane()!!.add(JLabel("Name:"))
this.getContentPane()!!.add(nameJTextField)
this.getContentPane()!!.add(JLabel("X: "))
this.getContentPane()!!.add(xSizeJTextField)
this.getContentPane()!!.add(JLabel("Y: "))
this.getContentPane()!!.add(ySizeJTextField)
this.getContentPane()!!.add(submitButton)
this.show()
} catch(e: Exception)
            {



                            throw e
}

}


                @Throws(Exception::class)
            
    open fun disposeNewDialog()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var canvasWidth: Integer = Integer(xSizeJTextField!!.getText())


    var canvasHeight: Integer = Integer(ySizeJTextField!!.getText())


    var newName: String = this.nameJTextField!!.getText()!!


    
                        if(newName == 
                                    null
                                )
                        
                                    throw GraphicsException("No Name", this, "disposeNewDialog")

    var workAreaJPanel: WorkAreaJPanel = WorkAreaJPanel(newName, this.dimension, canvasWidth!!.toInt(), canvasHeight!!.toInt())

workAreaJPanel!!.setLayout(GridLayout(1, 1))
parent.add(workAreaJPanel as WorkAreaJPanelInterface)
this.dispose()
} catch(e: Exception)
            {



                            throw e
}

}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
addWindowListener(object: java.awt.event.WindowAdapter()
                                {
                                
    open override fun windowClosing(evt: java.awt.event.WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
closeDialog(evt)
}

                                }
                            )
pack()
}


    open fun closeDialog(evt: java.awt.event.WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
setVisible(false)
dispose()
}


}
                
            

