
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
        package org.allbinary.graphics.j2me.workarea.tools




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ToolJPanel : javax.swing.JPanel {
        
public constructor (){
initComponents()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
lineJButton= javax.swing.JButton()
this.rectJButton= javax.swing.JButton()
this.arcJButton= javax.swing.JButton()
this.stringJButton= javax.swing.JButton()
this.charJButton= javax.swing.JButton()
this.roundRectJButton= javax.swing.JButton()
this.imageJButton= javax.swing.JButton()
this.fillArcJButton= javax.swing.JButton()
this.fillRectJButton= javax.swing.JButton()
this.fillRoundRectJButton= javax.swing.JButton()
this.dottedLineJButton= javax.swing.JButton()
this.dottedRectButton= javax.swing.JButton()
this.dottedArcJButton= javax.swing.JButton()
this.dottedFillRectJButton= javax.swing.JButton()
this.dottedFillArcJButton= javax.swing.JButton()
this.dottedFillRountRectJButton= javax.swing.JButton()
this.colorJPanel= javax.swing.JPanel()
this.colorJList= javax.swing.JList()
setLayout(java.awt.GridLayout(17, 1))
lineJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
lineJButton!!.setText(LinesGraphicItem.getStaticName())
lineJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mouseClicked(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
lineJButtonMouseClicked(evt)
}

                                }
                            )
add(this.lineJButton)
this.rectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.rectJButton!!.setText("Rect")
rectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mouseClicked(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
rectJButtonMouseClicked(evt)
}

                                }
                            )
add(this.rectJButton)
this.arcJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.arcJButton!!.setText("Arc")
arcJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
arcJButtonMousePressed(evt)
}

                                }
                            )
add(this.arcJButton)
this.stringJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.stringJButton!!.setText("String")
stringJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
stringJButtonMousePressed(evt)
}

                                }
                            )
add(this.stringJButton)
this.charJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.charJButton!!.setText("Char")
charJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
charJButtonMousePressed(evt)
}

                                }
                            )
add(this.charJButton)
this.roundRectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.roundRectJButton!!.setText("Round Rect")
roundRectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
roundRectJButtonMousePressed(evt)
}

                                }
                            )
add(this.roundRectJButton)
this.imageJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.imageJButton!!.setText("Image")
imageJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
imageJButtonMousePressed(evt)
}

                                }
                            )
add(this.imageJButton)
this.fillArcJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.fillArcJButton!!.setText("Fill Arc")
fillArcJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fillArcJButtonMousePressed(evt)
}

                                }
                            )
add(this.fillArcJButton)
this.fillRectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.fillRectJButton!!.setText("Fill Rect")
fillRectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fillRectJButtonMousePressed(evt)
}

                                }
                            )
add(this.fillRectJButton)
this.fillRoundRectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.fillRoundRectJButton!!.setText("Fill Rnd Rect")
fillRoundRectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fillRoundRectJButtonMousePressed(evt)
}

                                }
                            )
add(this.fillRoundRectJButton)
this.dottedLineJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.dottedLineJButton!!.setText("Dot Line")
dottedLineJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedLineJButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedLineJButton)
this.dottedRectButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.dottedRectButton!!.setText("Dot Rect")
dottedRectButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedRectButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedRectButton)
this.dottedArcJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.dottedArcJButton!!.setText("Dot Arc")
dottedArcJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedArcJButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedArcJButton)
this.dottedFillRectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.dottedFillRectJButton!!.setText("Dot Fill Rect")
dottedFillRectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedFillRectJButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedFillRectJButton)
this.dottedFillArcJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.dottedFillArcJButton!!.setText("Dot Fill Arc")
dottedFillArcJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedFillArcJButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedFillArcJButton)
this.dottedFillRountRectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.dottedFillRountRectJButton!!.setText("Dot Fill Rnd Rect")
dottedFillRountRectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedFillRountRectJButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedFillRountRectJButton)
this.colorJPanel!!.setLayout(java.awt.GridLayout(1, 1))
this.colorJPanel!!.add(this.colorJList)
add(this.colorJPanel)
}


    open fun dottedFillRountRectJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedFillRountRectJButton!!.getText())
}


    open fun dottedFillArcJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedFillArcJButton!!.getText())
}


    open fun dottedFillRectJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedFillRectJButton!!.getText())
}


    open fun dottedArcJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedArcJButton!!.getText())
}


    open fun dottedRectButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedRectButton!!.getText())
}


    open fun dottedLineJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedLineJButton!!.getText())
}


    open fun fillRoundRectJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.fillRoundRectJButton!!.getText())
}


    open fun fillRectJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.fillRectJButton!!.getText())
}


    open fun fillArcJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.fillArcJButton!!.getText())
}


    open fun imageJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.imageJButton!!.getText())
}


    open fun roundRectJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.roundRectJButton!!.getText())
}


    open fun charJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.charJButton!!.getText())
}


    open fun stringJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.stringJButton!!.getText())
}


    open fun arcJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.arcJButton!!.getText())
}


    open fun rectJButtonMouseClicked(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.rectJButton!!.getText())
}


    open fun lineJButtonMouseClicked(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.lineJButton!!.getText())
}


    private var arcJButton: javax.swing.JButton

    private var charJButton: javax.swing.JButton

    private var colorJList: javax.swing.JList

    private var colorJPanel: javax.swing.JPanel

    private var dottedArcJButton: javax.swing.JButton

    private var dottedFillArcJButton: javax.swing.JButton

    private var dottedFillRectJButton: javax.swing.JButton

    private var dottedFillRountRectJButton: javax.swing.JButton

    private var dottedLineJButton: javax.swing.JButton

    private var dottedRectButton: javax.swing.JButton

    private var fillArcJButton: javax.swing.JButton

    private var fillRectJButton: javax.swing.JButton

    private var fillRoundRectJButton: javax.swing.JButton

    private var imageJButton: javax.swing.JButton

    private var lineJButton: javax.swing.JButton

    private var rectJButton: javax.swing.JButton

    private var roundRectJButton: javax.swing.JButton

    private var stringJButton: javax.swing.JButton

}
                
            

