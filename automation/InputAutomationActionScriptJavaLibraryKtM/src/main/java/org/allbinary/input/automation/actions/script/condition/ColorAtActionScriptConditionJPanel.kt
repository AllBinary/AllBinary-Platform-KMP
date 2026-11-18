
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
        package org.allbinary.input.automation.actions.script.condition




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.media.image.analysis.ColorRangeInterface
import org.allbinary.string.CommonStrings
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JDialog
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.LayoutStyle

open public class ColorAtActionScriptConditionJPanel : JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var colorAtActionScriptConditionInterface: ColorAtActionScriptConditionInterface
public constructor (colorAtActionScriptConditionInterface: ColorAtActionScriptConditionInterface){
var colorAtActionScriptConditionInterface = colorAtActionScriptConditionInterface
this.logUtil!!.putF(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
this.initComponents()
this.colorAtActionScriptConditionInterface= colorAtActionScriptConditionInterface
this.set()
}


    open fun set()
        //nullable = true from not(false or (false and true)) = true
{

    var colorRangeInterface: ColorRangeInterface = this.colorAtActionScriptConditionInterface!!.getColorRangeInterface()!!

this.getMinRedJTextField()!!.setText(colorRangeInterface!!.getMinRed().toString())
this.getMaxRedJTextField()!!.setText(colorRangeInterface!!.getMaxRed().toString())
this.getMinGreenJTextField()!!.setText(colorRangeInterface!!.getMinGreen().toString())
this.getMaxGreenJTextField()!!.setText(colorRangeInterface!!.getMaxGreen().toString())
this.getMinBlueJTextField()!!.setText(colorRangeInterface!!.getMinBlue().toString())
this.getMaxBlueJTextField()!!.setText(colorRangeInterface!!.getMaxBlue().toString())
this.getColorAtXJTextField()!!.setText(this.colorAtActionScriptConditionInterface!!.getPoint()!!.x.toString())
this.getColorAtYJTextField()!!.setText(this.colorAtActionScriptConditionInterface!!.getPoint()!!.y.toString())
this.colorAtActionScriptConditionInterface!!.log()
}


    open fun update()
        //nullable = true from not(false or (false and true)) = true
{

    var colorRangeInterface: ColorRangeInterface = this.colorAtActionScriptConditionInterface!!.getColorRangeInterface()!!

colorRangeInterface!!.setMinRed(Integer.valueOf(this.getMinRedJTextField()!!.getText())!!.toInt())
colorRangeInterface!!.setMaxRed(Integer.valueOf(this.getMaxRedJTextField()!!.getText())!!.toInt())
colorRangeInterface!!.setMinGreen(Integer.valueOf(this.getMinGreenJTextField()!!.getText())!!.toInt())
colorRangeInterface!!.setMaxGreen(Integer.valueOf(this.getMaxGreenJTextField()!!.getText())!!.toInt())
colorRangeInterface!!.setMinBlue(Integer.valueOf(this.getMinBlueJTextField()!!.getText())!!.toInt())
colorRangeInterface!!.setMaxBlue(Integer.valueOf(this.getMaxBlueJTextField()!!.getText())!!.toInt())

    var xString: String = this.getColorAtXJTextField()!!.getText()!!


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(xString) && StringValidationUtil.getInstance()!!.isNumber(xString))
                        
                                    {
                                    this.colorAtActionScriptConditionInterface!!.getPoint()!!.x= xString.toInt()
    

                                    }
                                

    var yString: String = this.getColorAtYJTextField()!!.getText()!!


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(yString) && StringValidationUtil.getInstance()!!.isNumber(yString))
                        
                                    {
                                    this.colorAtActionScriptConditionInterface!!.getPoint()!!.y= xString.toInt()
    

                                    }
                                
this.colorAtActionScriptConditionInterface!!.log()
}


    open fun getColorAtXJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.colorAtXJTextField
}


    open fun setColorAtXJTextField(colorAtXJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var colorAtXJTextField = colorAtXJTextField
this.colorAtXJTextField= colorAtXJTextField
}


    open fun getColorAtYJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.colorAtYJTextField
}


    open fun setColorAtYJTextField(colorAtYJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var colorAtYJTextField = colorAtYJTextField
this.colorAtYJTextField= colorAtYJTextField
}


    open fun getMaxBlueJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.maxBlueJTextField
}


    open fun setMaxBlueJTextField(maxBlueJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var maxBlueJTextField = maxBlueJTextField
this.maxBlueJTextField= maxBlueJTextField
}


    open fun getMaxGreenJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.maxGreenJTextField
}


    open fun setMaxGreenJTextField(maxGreenJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var maxGreenJTextField = maxGreenJTextField
this.maxGreenJTextField= maxGreenJTextField
}


    open fun getMaxRedJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.maxRedJTextField
}


    open fun setMaxRedJTextField(maxRedJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var maxRedJTextField = maxRedJTextField
this.maxRedJTextField= maxRedJTextField
}


    open fun getMinBlueJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.minBlueJTextField
}


    open fun setMinBlueJTextField(minBlueJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var minBlueJTextField = minBlueJTextField
this.minBlueJTextField= minBlueJTextField
}


    open fun getMinGreenJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.minGreenJTextField
}


    open fun setMinGreenJTextField(minGreenJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var minGreenJTextField = minGreenJTextField
this.minGreenJTextField= minGreenJTextField
}


    open fun getMinRedJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.minRedJTextField
}


    open fun setMinRedJTextField(minRedJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{
var minRedJTextField = minRedJTextField
this.minRedJTextField= minRedJTextField
}


    open fun getYJLabel()
        //nullable = true from not(false or (false and true)) = true
: JLabel{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.yJLabel
}


    open fun setYJLabel(yJLabel: JLabel)
        //nullable = true from not(false or (false and false)) = true
{
var yJLabel = yJLabel
this.yJLabel= yJLabel
}


    open fun getColorAtActionJDialog()
        //nullable = true from not(false or (false and true)) = true
: JDialog{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.colorAtActionJDialog
}


    open fun setColorAtActionJDialog(colorAtActionJDialog: JDialog)
        //nullable = true from not(false or (false and false)) = true
{
var colorAtActionJDialog = colorAtActionJDialog
this.colorAtActionJDialog= colorAtActionJDialog
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.colorAtActionJDialog= JDialog()
this.titleJLabel= JLabel()
this.locationJLabel= JLabel()
this.colorAtXJTextField= JTextField()
this.xJLabel= JLabel()
this.yJLabel= JLabel()
this.colorAtYJTextField= JTextField()
this.colorRangeJLabel= JLabel()
this.redJLabel= JLabel()
this.minJLabel= JLabel()
this.maxJLabel= JLabel()
this.greenJLabel= JLabel()
this.blueJLabel= JLabel()
this.minRedJTextField= JTextField()
this.maxRedJTextField= JTextField()
this.maxGreenJTextField= JTextField()
this.minBlueJTextField= JTextField()
this.maxBlueJTextField= JTextField()
this.okJButton= JButton()
this.minGreenJTextField= JTextField()
this.colorAtActionJButton= JButton()
this.jLabel1= JLabel()
this.colorAtActionJDialog!!.setMinimumSize(Dimension(350, 250))
this.titleJLabel!!.setText("              Color At Action Options            ")
this.locationJLabel!!.setText("Location:")
this.xJLabel!!.setText("X:")
this.yJLabel!!.setText("Y:")
this.colorRangeJLabel!!.setText("Color Range")
this.redJLabel!!.setText("Red:")
this.minJLabel!!.setText("Minimum")
this.maxJLabel!!.setText("Maximum")
this.greenJLabel!!.setText("Green:")
this.blueJLabel!!.setText("Blue:")
this.okJButton!!.setText("OK")
this.okJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )

    var colorAtActionJDialogLayout: GroupLayout = GroupLayout(this.colorAtActionJDialog!!.getContentPane())

this.colorAtActionJDialog!!.getContentPane()!!.setLayout(colorAtActionJDialogLayout)
colorAtActionJDialogLayout!!.setHorizontalGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.TRAILING)!!.addComponent(okJButton)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING, false)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(blueJLabel)!!.addComponent(greenJLabel)!!.addComponent(redJLabel)!!.addComponent(colorRangeJLabel))!!.addGap(29, 29, 29))!!.addGroup(GroupLayout.Alignment.TRAILING, colorAtActionJDialogLayout!!.createSequentialGroup()!!.addComponent(locationJLabel)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(xJLabel)!!.addGap(18, 18, 18)))!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(minBlueJTextField, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)!!.addComponent(minGreenJTextField, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)!!.addComponent(minJLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(minRedJTextField, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)!!.addComponent(colorAtXJTextField, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))!!.addGap(16, 16, 16)))!!.addGap(6, 6, 6)!!.addComponent(yJLabel)!!.addGap(24, 24, 24)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.TRAILING)!!.addComponent(maxJLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addGroup(GroupLayout.Alignment.LEADING, colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGap(1, 1, 1)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING, false)!!.addComponent(maxBlueJTextField, GroupLayout.Alignment.TRAILING)!!.addComponent(maxRedJTextField, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)!!.addComponent(maxGreenJTextField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))!!.addComponent(colorAtYJTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))!!.addGap(22, 22, 22))!!.addGroup(GroupLayout.Alignment.TRAILING, colorAtActionJDialogLayout!!.createSequentialGroup()!!.addComponent(titleJLabel)!!.addGap(33, 33, 33)))))
colorAtActionJDialogLayout!!.setVerticalGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(titleJLabel)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGap(15, 15, 15)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(xJLabel)!!.addComponent(locationJLabel)!!.addComponent(colorAtXJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(yJLabel))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(minJLabel)!!.addComponent(colorRangeJLabel))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(minRedJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(redJLabel))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(greenJLabel)!!.addComponent(minGreenJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(blueJLabel)!!.addComponent(minBlueJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)!!.addComponent(okJButton))!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGap(14, 14, 14)!!.addComponent(colorAtYJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(maxJLabel)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(maxRedJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(maxGreenJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(maxBlueJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))!!.addContainerGap()))
setPreferredSize(Dimension(100, 0))
this.colorAtActionJButton!!.setText("Edit")
this.colorAtActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
colorAtActionJButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel1!!.setText("Color At:")

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)!!.addComponent(colorAtActionJButton)))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(colorAtActionJButton)))
}


    open fun okJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.update()
this.getColorAtActionJDialog()!!.setVisible(false)
}


    open fun colorAtActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.getColorAtActionJDialog()!!.setVisible(true)
}


    private var blueJLabel: JLabel

    private var colorAtActionJButton: JButton

    private var colorAtActionJDialog: JDialog

    private var colorAtXJTextField: JTextField

    private var colorAtYJTextField: JTextField

    private var colorRangeJLabel: JLabel

    private var greenJLabel: JLabel

    private var jLabel1: JLabel

    private var locationJLabel: JLabel

    private var maxBlueJTextField: JTextField

    private var maxGreenJTextField: JTextField

    private var maxJLabel: JLabel

    private var maxRedJTextField: JTextField

    private var minBlueJTextField: JTextField

    private var minGreenJTextField: JTextField

    private var minJLabel: JLabel

    private var minRedJTextField: JTextField

    private var okJButton: JButton

    private var redJLabel: JLabel

    private var titleJLabel: JLabel

    private var xJLabel: JLabel

    private var yJLabel: JLabel

}
                
            

