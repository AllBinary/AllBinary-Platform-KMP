
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
        package org.allbinary.input.automation.actions.script.condition.processors.input




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing
import org.allbinary.input.KeySingletonFactory
import org.allbinary.input.automation.robot.InputRobot
import org.allbinary.input.automation.robot.InputRobotFactory
import org.allbinary.input.automation.robot.TempInputRobotNames
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonStrings

open public class KeyboardActionScriptInputJPanel : javax.swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var keyActionScriptInputInterface: KeyboardActionScriptInputInterface
public constructor        (keyActionScriptInputInterface: KeyboardActionScriptInputInterface){

                    var keyActionScriptInputInterface = keyActionScriptInputInterface
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
initComponents()
this.keyActionScriptInputInterface= keyActionScriptInputInterface

    var defaultComboBoxModel: DefaultComboBoxModel = DefaultComboBoxModel()

defaultComboBoxModel!!.addElement(TempInputRobotNames.DX_NAME)
defaultComboBoxModel!!.addElement(InputRobot.NAME)
this.inputAutomationTypeJComboBox!!.setModel(defaultComboBoxModel)
this.keyNameJComboBox!!.setModel(KeyNameDefaultComboBoxModelFactory.getInstance())
this.keyIntegerJComboBox!!.setModel(KeyCharDefaultComboBoxModelFactory.getInstance())

    
                        if(this.keyActionScriptInputInterface!!.isNormal())
                        
                                    {
                                    this.normalJRadioButton!!.setSelected(true)
this.pressJRadioButton!!.setSelected(false)
this.releaseJRadioButton!!.setSelected(false)

                                    }
                                
                             else 
    
                        if(this.keyActionScriptInputInterface!!.isPress())
                        
                                    {
                                    this.normalJRadioButton!!.setSelected(false)
this.pressJRadioButton!!.setSelected(true)
this.releaseJRadioButton!!.setSelected(false)

                                    }
                                
                             else 
    
                        if(this.keyActionScriptInputInterface!!.isRelease())
                        
                                    {
                                    this.normalJRadioButton!!.setSelected(false)
this.pressJRadioButton!!.setSelected(false)
this.releaseJRadioButton!!.setSelected(true)

                                    }
                                
this.set()
}


open fun set()
        //nullable = true from not(false or (false and true)) = true
{
    var inputTypeComboBoxModel: ComboBoxModel = this.inputAutomationTypeJComboBox!!.getModel()!!
            

inputTypeComboBoxModel!!.setSelectedItem(this.keyActionScriptInputInterface!!.getInputRobotInterface()!!.getName())
this.textJTextField!!.setText(this.keyActionScriptInputInterface!!.getText())
this.delayJTextField!!.setText(this.keyActionScriptInputInterface!!.getDelayBetweenKeys().toString())
this.timeJTextField!!.setText(this.keyActionScriptInputInterface!!.getTime().toString())
this.keyActionScriptInputInterface!!.log()
}


                @Throws(Exception::class)
            
open fun updateInputType()
        //nullable = true from not(false or (false and true)) = true
{
    var comboBoxModel: ComboBoxModel = this.inputAutomationTypeJComboBox!!.getModel()!!
            


    var selectedItem: String = comboBoxModel!!.getSelectedItem() as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(selectedItem))
                        
                                    {
                                    this.keyActionScriptInputInterface!!.setInputRobotInterface(InputRobotFactory.getInstance()!!.get(selectedItem))

                                    }
                                
}


open fun getSelectedKey()
        //nullable = true from not(false or (false and true)) = true
: Integer{
    var comboBoxModel: ComboBoxModel = this.keyNameJComboBox!!.getModel()!!
            


    var selectedItem: String = comboBoxModel!!.getSelectedItem() as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(selectedItem))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return KeySingletonFactory.getHashtable()!!.get(selectedItem as Object?) as Integer

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun updateKeys()
        //nullable = true from not(false or (false and true)) = true
{
    var text: String = this.textJTextField!!.getText()!!
            

this.keyActionScriptInputInterface!!.setText(text)
}


                @Throws(Exception::class)
            
open fun update()
        //nullable = true from not(false or (false and true)) = true
{this.updateInputType()
this.updateKeys()
this.keyActionScriptInputInterface!!.setTime(Integer.valueOf(this.timeJTextField!!.getText())!!.toInt())
this.keyActionScriptInputInterface!!.log()
}


open fun getKeyActionJDialog()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JDialog{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyActionJDialog
}


open fun setKeyActionJDialog(keyActionJDialog: javax.swing.JDialog)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyActionJDialog = keyActionJDialog
this.keyActionJDialog= keyActionJDialog
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{keyActionJDialog= javax.swing.JDialog()
titleJLabel= javax.swing.JLabel()
addKeyJLabel= javax.swing.JLabel()
keyNameJComboBox= javax.swing.JComboBox()
timeJTextField= javax.swing.JTextField()
holdTimeJLabel= javax.swing.JLabel()
inputAutomationTypeJComboBox= javax.swing.JComboBox()
inputTypeJLabel= javax.swing.JLabel()
delayJTextField= javax.swing.JTextField()
delayBetweenJLabel= javax.swing.JLabel()
testJLabel= javax.swing.JLabel()
textJTextField= javax.swing.JTextField()
pressJRadioButton= javax.swing.JRadioButton()
releaseJRadioButton= javax.swing.JRadioButton()
normalJRadioButton= javax.swing.JRadioButton()
simultaneousJRadioButton= javax.swing.JRadioButton()
sequenceJRadioButton= javax.swing.JRadioButton()
jPanel1= javax.swing.JPanel()
okJButton= javax.swing.JButton()
keyIntegerJComboBox= javax.swing.JComboBox()
keyActionJButton= javax.swing.JButton()
jLabel1= javax.swing.JLabel()
keyActionJDialog!!.setMinimumSize(java.awt.Dimension(255, 280))
titleJLabel!!.setHorizontalAlignment(javax.swing.SwingConstants.CENTER)
titleJLabel!!.setText("Keyboard Input Options")
addKeyJLabel!!.setText("Add Key:")
keyNameJComboBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
keyNameJComboBoxActionPerformed(evt)
}

                                }
                            )
timeJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
holdTimeJLabel!!.setText("Hold Time (ms):")
inputTypeJLabel!!.setText("Input Type:")
delayJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
delayBetweenJLabel!!.setText("Delay Between Keys (ms):")
testJLabel!!.setText("Text:")
textJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
pressJRadioButton!!.setText("Press")
pressJRadioButton!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
pressJRadioButton!!.setMargin(java.awt.Insets(0, 0, 0, 0))
pressJRadioButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
pressJRadioButtonActionPerformed(evt)
}

                                }
                            )
releaseJRadioButton!!.setText("Release")
releaseJRadioButton!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
releaseJRadioButton!!.setMargin(java.awt.Insets(0, 0, 0, 0))
releaseJRadioButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
releaseJRadioButtonActionPerformed(evt)
}

                                }
                            )
normalJRadioButton!!.setSelected(true)
normalJRadioButton!!.setText("Normal")
normalJRadioButton!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
normalJRadioButton!!.setMargin(java.awt.Insets(0, 0, 0, 0))
normalJRadioButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
normalJRadioButtonActionPerformed(evt)
}

                                }
                            )
simultaneousJRadioButton!!.setSelected(true)
simultaneousJRadioButton!!.setText("Simultaneous")
simultaneousJRadioButton!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
simultaneousJRadioButton!!.setMargin(java.awt.Insets(0, 0, 0, 0))
simultaneousJRadioButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
simultaneousJRadioButtonActionPerformed(evt)
}

                                }
                            )
sequenceJRadioButton!!.setText("Sequence")
sequenceJRadioButton!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
sequenceJRadioButton!!.setMargin(java.awt.Insets(0, 0, 0, 0))
sequenceJRadioButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
sequenceJRadioButtonActionPerformed(evt)
}

                                }
                            )
okJButton!!.setText("OK")
okJButton!!.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER)
okJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )
jPanel1!!.add(okJButton)
keyIntegerJComboBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
keyIntegerJComboBoxActionPerformed(evt)
}

                                }
                            )

    var keyActionJDialogLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(keyActionJDialog!!.getContentPane())

keyActionJDialog!!.getContentPane()!!.setLayout(keyActionJDialogLayout)
keyActionJDialogLayout!!.setHorizontalGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)!!.addComponent(addKeyJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(inputTypeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)!!.addComponent(inputAutomationTypeJComboBox, 0, 148, Short.MAX_VALUE)!!.addComponent(textJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(keyNameJComboBox, 0, 101, Short.MAX_VALUE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(keyIntegerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))!!.addComponent(testJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(normalJRadioButton)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(pressJRadioButton)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(releaseJRadioButton)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(holdTimeJLabel)!!.addGap(22, 22, 22)!!.addComponent(timeJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(delayBetweenJLabel)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)!!.addComponent(delayJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(simultaneousJRadioButton)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(sequenceJRadioButton)))!!.addContainerGap())!!.addComponent(titleJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)!!.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
keyActionJDialogLayout!!.setVerticalGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(titleJLabel)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(inputTypeJLabel)!!.addComponent(inputAutomationTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(addKeyJLabel)!!.addComponent(keyIntegerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(keyNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(testJLabel)!!.addComponent(textJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(pressJRadioButton)!!.addComponent(normalJRadioButton)!!.addComponent(releaseJRadioButton))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(holdTimeJLabel)!!.addComponent(timeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(delayBetweenJLabel)!!.addComponent(delayJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(simultaneousJRadioButton)!!.addComponent(sequenceJRadioButton))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addContainerGap()))
setMinimumSize(java.awt.Dimension(100, 0))
keyActionJButton!!.setText("Edit")
keyActionJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
keyActionJButtonActionPerformed(evt)
}

                                }
                            )
jLabel1!!.setText("Key:")

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)!!.addComponent(keyActionJButton)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(keyActionJButton)))
}


open fun prependText(integer: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var integer = integer

    
                        if(integer != 
                                    null
                                )
                        
                                    {
                                    
    var newKey: String = "&#" +integer.toString() +";"

this.textJTextField!!.setText(newKey +this.textJTextField!!.getText())

                                    }
                                
}


open fun keyIntegerJComboBoxActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.keyIntegerJComboBox!!.getSelectedIndex()
this.keyNameJComboBox!!.setSelectedIndex(this.keyIntegerJComboBox!!.getSelectedIndex())
}


open fun sequenceJRadioButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    
                        if(this.sequenceJRadioButton!!.isSelected())
                        
                                    {
                                    this.delayJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ONE)
this.simultaneousJRadioButton!!.setSelected(false)

                                    }
                                
}


open fun simultaneousJRadioButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    
                        if(this.simultaneousJRadioButton!!.isSelected())
                        
                                    {
                                    this.delayJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.sequenceJRadioButton!!.setSelected(false)

                                    }
                                
}


open fun keyNameJComboBoxActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    var integer: Integer = getSelectedKey()!!
            

this.prependText(integer)
this.keyIntegerJComboBox!!.setSelectedIndex(this.keyNameJComboBox!!.getSelectedIndex())
}


open fun okJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            this.update()
this.getKeyActionJDialog()!!.setVisible(false)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "okButtonActionPerformed", e)
}

}


open fun keyActionJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.getKeyActionJDialog()!!.setVisible(true)
}


open fun normalJRadioButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    
                        if(this.normalJRadioButton!!.isSelected())
                        
                                    {
                                    this.keyActionScriptInputInterface!!.setNormal()
this.pressJRadioButton!!.setSelected(false)
this.releaseJRadioButton!!.setSelected(false)

                                    }
                                
}


open fun releaseJRadioButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    
                        if(this.releaseJRadioButton!!.isSelected())
                        
                                    {
                                    this.keyActionScriptInputInterface!!.setRelease(true)
this.keyActionScriptInputInterface!!.setPress(false)
this.pressJRadioButton!!.setSelected(false)
this.normalJRadioButton!!.setSelected(false)

                                    }
                                
}


open fun pressJRadioButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    
                        if(this.pressJRadioButton!!.isSelected())
                        
                                    {
                                    this.keyActionScriptInputInterface!!.setPress(true)
this.keyActionScriptInputInterface!!.setRelease(false)
this.releaseJRadioButton!!.setSelected(false)
this.normalJRadioButton!!.setSelected(false)

                                    }
                                
}


    private var addKeyJLabel: javax.swing.JLabel

    private var delayBetweenJLabel: javax.swing.JLabel

    private var delayJTextField: javax.swing.JTextField

    private var holdTimeJLabel: javax.swing.JLabel

    private var inputAutomationTypeJComboBox: javax.swing.JComboBox

    private var inputTypeJLabel: javax.swing.JLabel

    private var jLabel1: javax.swing.JLabel

    private var jPanel1: javax.swing.JPanel

    private var keyActionJButton: javax.swing.JButton

    private var keyActionJDialog: javax.swing.JDialog

    private var keyIntegerJComboBox: javax.swing.JComboBox

    private var keyNameJComboBox: javax.swing.JComboBox

    private var normalJRadioButton: javax.swing.JRadioButton

    private var okJButton: javax.swing.JButton

    private var pressJRadioButton: javax.swing.JRadioButton

    private var releaseJRadioButton: javax.swing.JRadioButton

    private var sequenceJRadioButton: javax.swing.JRadioButton

    private var simultaneousJRadioButton: javax.swing.JRadioButton

    private var testJLabel: javax.swing.JLabel

    private var textJTextField: javax.swing.JTextField

    private var timeJTextField: javax.swing.JTextField

    private var titleJLabel: javax.swing.JLabel

}
                
            

