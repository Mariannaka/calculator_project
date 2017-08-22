package com.marianna.gwt.calculatorProject.client;

import com.marianna.gwt.calculatorProject.shared.FieldVerifier;

import java.util.ArrayList;

//import com.exempel.martin.client.CalcProject;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CalculatorProjekt implements EntryPoint {
	
	private Label helloCalc = new Label("Hello Calc");
  private VerticalPanel mainPanel = new VerticalPanel();
  private HorizontalPanel addPanel = new HorizontalPanel();
  private HorizontalPanel panel123 = new HorizontalPanel();
  private HorizontalPanel panel456 = new HorizontalPanel();
  private HorizontalPanel panel789 = new HorizontalPanel();
  private HorizontalPanel panel0 = new HorizontalPanel();
  private HorizontalPanel clearPanel = new HorizontalPanel();
  private VerticalPanel symbolPanel = new VerticalPanel();
  //private String[] calcSymbols = new String[] { "/", "x", "-", "+", "=" };
  //private Button[] calcSymbolBtns = new Button[calcSymbols.length];
  private FlexTable calcFlexTable = new FlexTable();
  private FlexTable numbersHolder = new FlexTable();
  private TextBox answerOutput = new TextBox();
  private Button one = new Button("1");
  private Button two = new Button("2");
  private Button three = new Button("3");
  private Button four = new Button("4");
  private Button five = new Button("5");
  private Button six = new Button("6");
  private Button seven = new Button("7");
  private Button eight = new Button("8");
  private Button nine = new Button("9");
  private Button zero = new Button("0");
  private Button point = new Button(".");
  private Button plus = new Button("+");
  private Button minus = new Button("-");
  private Button times = new Button("*");
  private Button divide = new Button("/");
  private Button equal = new Button("=");
  private Button modulo = new Button("%");
  private Button clear = new Button("Clear");
  private TextBox firstNumber = new TextBox();
  private TextBox secondNumber = new TextBox();
  private Label symbolLabel = new Label("SYMBOLS");
  private String[] symbolsArray = new String[] { "/", "x", "-", "+", "=" };
  private Button[] numbersBtn = new Button[10];
  private HorizontalPanel numberPanel = new HorizontalPanel();
  private int textBoxFocus = 0;
  double firstIndex, secondIndex, answer;
  private FlexTable answersTable = new FlexTable();
  private ArrayList<String> answers = new ArrayList<String>();
  
	public void onModuleLoad() {
		  //creating the buttons0-9
		 /*for (int i=0;i<numbersBtn.length-1; i++) {
			  Button numberBtn = null;
			  numbersBtn[i] = new Button(String.valueOf(i));
			  numberPanel.add(numberBtn);
		  }*/
		  
		  /*for(int i=0;i<symbolsArray.length; i++) {
			  Button symbolBtn = null;
			  final String symbolsArrayValue = String.valueOf(i);
			  symbolsArray[i] = new Button(symbolsArrayValue);  
		  }*/
		
		
		/*for (int i = 0; i < 15; i++) {
			for (int j = 0; j<i; j++) {
			Button myButtons = null;
			final String btnsValue = String.valueOf(i);
			myButtons= new Button(btnsValue);
			if (j == 3) {
				for(int x = 1; x < symbolsArray.length; x++) {
					String symbolArrayValue = symbolsArray[j];
					Button symbolBtn = new Button(symbolArrayValue);
					}
				}
			numberPanel.add(myButtons);
			
			}
			}*/
			
			
		firstNumber.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				textBoxFocus =1;
			}	
		});
		
		secondNumber.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				textBoxFocus =2;
			}	
		});
		
		
		one.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				if (textBoxFocus == 1) {
				firstNumber.setValue(firstNumber.getValue() + "1");
				} else if (textBoxFocus == 2) {
					secondNumber.setValue(secondNumber.getValue() + "1");
				}
				}
		});

		
		two.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				if (textBoxFocus == 1) {
				firstNumber.setValue(firstNumber.getValue() + "2");
				} else if (textBoxFocus == 2) {
					secondNumber.setValue(secondNumber.getValue() + "2");
				}
				}
		});
		
		three.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				if (textBoxFocus == 1) {
				firstNumber.setValue(firstNumber.getValue() + "3");
				} else if (textBoxFocus == 2) {
					secondNumber.setValue(secondNumber.getValue() + "3");
				}
				}
		});
		
		four.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				if (textBoxFocus == 1) {
				firstNumber.setValue(firstNumber.getValue() + "4");
				} else if (textBoxFocus == 2) {
					secondNumber.setValue(secondNumber.getValue() + "4");
				}
				}
		});
		
		five.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				if (textBoxFocus == 1) {
				firstNumber.setValue(firstNumber.getValue() + "5");
				} else if (textBoxFocus == 2) {
					secondNumber.setValue(secondNumber.getValue() + "5");
				}
				}
		});
		
		six.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				if (textBoxFocus == 1) {
				firstNumber.setValue(firstNumber.getValue() + "6");
				} else if (textBoxFocus == 2) {
					secondNumber.setValue(secondNumber.getValue() + "6");
				}
				}
		});
		
		seven.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				if (textBoxFocus == 1) {
				firstNumber.setValue(firstNumber.getValue() + "7");
				} else if (textBoxFocus == 2) {
					secondNumber.setValue(secondNumber.getValue() + "7");
				}
				}
		});
		
		
		eight.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				if (textBoxFocus == 1) {
				firstNumber.setValue(firstNumber.getValue() + "8");
				} else if (textBoxFocus == 2) {
					secondNumber.setValue(secondNumber.getValue() + "8");
				}
				}
		});
		
		nine.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				if (textBoxFocus == 1) {
				firstNumber.setValue(firstNumber.getValue() + "9");
				} else if (textBoxFocus == 2) {
					secondNumber.setValue(secondNumber.getValue() + "9");
				}
				}
		});
		
		zero.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				if (textBoxFocus == 1) {
				firstNumber.setValue(firstNumber.getValue() + "0");
				} else if (textBoxFocus == 2) {
					secondNumber.setValue(secondNumber.getValue() + "0");
				}
				}
		}); 
	
		
		minus.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				calculateSub();
			}
	    });
		
		times.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				calculateMultiply();
			}
	    });
		
	    plus.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				calculatePlus();
			}
	    }); 
	    
	    divide.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				 calculateDivide();
			}
	    });
	    
	    equal.addClickHandler(new ClickHandler() {
			public void onClick (ClickEvent event) {
				calculateEqual();
			}
	    });
	    
	    
	   
	    
		panel123.add(one);
		  panel123.add(two);
		  panel123.add(three);
		  
		  panel456.add(four);
		  panel456.add(five);
		  panel456.add(six);
		  
		  panel789.add(seven);
		  panel789.add(eight);
		  panel789.add(nine);   
		  
		  panel0.add(zero);
		  panel0.add(point);
		  panel0.add(equal);
		  panel0.add(divide);
		  clearPanel.add(clear);
		  
		  plus.setStyleName("symbol-btns");
		  minus.setStyleName("symbol-btns");
		  divide.setStyleName("symbol-btns");
		  times.setStyleName("symbol-btns");
		  modulo.setStyleName("symbol-btns");
		  clear.setStyleName("clear-panel");
		  one.setStyleName("number-btns");
		  two.setStyleName("number-btns");
		  three.setStyleName("number-btns");
		  four.setStyleName("number-btns");
		  five.setStyleName("number-btns");
		  six.setStyleName("number-btns");
		  seven.setStyleName("number-btns");
		  eight.setStyleName("number-btns");
		  nine.setStyleName("number-btns");
		  zero.setStyleName("number-btns");
		  point.setStyleName("number-btns");
		  equal.setStyleName("equal-btn");
		  answersTable.setStyleName("answers-flex-table");
		  symbolLabel.addStyleName("symbol-label");
		  clearPanel.setStyleName("clear-panel");
		  answersTable.getRowFormatter().addStyleName(0, "answers-header");
		 
		  
		  mainPanel.addStyleName("main-panel");
		  symbolPanel.addStyleName("symbol-panel");
		  firstNumber.setPixelSize(50, 15);
		  secondNumber.setPixelSize(50, 15);
		  answerOutput.setPixelSize(50, 15);
		  addPanel.add(firstNumber);
		  addPanel.add(symbolLabel);
		  addPanel.add(secondNumber);
		  addPanel.add(answerOutput);
		  clearPanel.add(clear);
		  symbolPanel.add(plus);
		  symbolPanel.add(minus);
		  symbolPanel.add(divide);
		  symbolPanel.add(times);
		  symbolPanel.add(modulo);
		  answersTable.setText(0, 0, "Operation");
		  answersTable.setText(0, 1, "answer");
		    
	    // TODO Assemble Main panel.
		  //mainPanel.add(numberPanel);
		  mainPanel.add(addPanel);
		  mainPanel.add(panel123);
		  mainPanel.add(panel456);
		  mainPanel.add(panel789);
		  mainPanel.add(panel0);
		  mainPanel.add(symbolPanel);
		  mainPanel.add(clearPanel);
		  mainPanel.add(answersTable);

		  
		  
		  
		    //mainPanel.add(addPanel);
	    // TODO Associate the Main panel with the HTML host page.
		  RootPanel.get("greatCalculator").add(mainPanel); 
		  RootPanel.get().add(helloCalc);
		    RootPanel.get("calc").add(mainPanel);
		    RootPanel.get("calc").add(new Label("TESSSST"));    

}
	private void calculatePlus() {
		 firstIndex = Double.parseDouble(firstNumber.getText());
		 secondIndex = Double.parseDouble(secondNumber.getText());
		 symbolLabel.setText("+");
		 if (firstIndex == 0 || secondIndex == 0) {
			 Window.alert("You have an empty field");
		 } else {
		 answer = firstIndex + secondIndex;
		 }
		 answerOutput.setValue(Double.toString(answer));
	}
	
	private void calculateDivide() {
   	 firstIndex = Double.parseDouble(firstNumber.getText());
	 secondIndex = Double.parseDouble(secondNumber.getText());
	 symbolLabel.setText("/");
		 if (firstIndex == 0) {
		 Window.alert("You can not divide 0 by another number");
		 firstNumber.setText("");
		 firstNumber.setFocus(true);
		 } else if (firstIndex == 0 || secondIndex == 0) {
				 Window.alert("You have an empty field");
				 } else {
				 answer = firstIndex / secondIndex;
				 }
				 answerOutput.setValue(String.valueOf(answer));
   }
	
	
	private void calculateSub() {
   	 firstIndex = Double.parseDouble(firstNumber.getText());
	 secondIndex = Double.parseDouble(secondNumber.getText());
	 symbolLabel.setText("-");
		  if (firstIndex == 0 || secondIndex == 0) {
				 Window.alert("You have an empty field");
			 } else {
			 answer = firstIndex - secondIndex;
			 }
		 answerOutput.setValue(String.valueOf(answer));
   }
	
	private void calculateMultiply() {
   	 firstIndex = Double.parseDouble(firstNumber.getText());
	 secondIndex = Double.parseDouble(secondNumber.getText());
	 symbolLabel.setText("*");
		  if (firstIndex == 0 || secondIndex == 0) {
				 Window.alert("You have an empty field");
			 } else {
			 answer = firstIndex * secondIndex;
			 }
		 answerOutput.setValue(String.valueOf(answer));
   }
	
	private void calculateEqual() {
    	int row = answersTable.getRowCount();
    	answers.add(Double.toString(answer));
    	answersTable.setText(row,0, (firstNumber.getText()+symbolLabel.getText()+secondNumber.getText()));
    	answersTable.setText(row,1, Double.toString(answer));
}
	
}
