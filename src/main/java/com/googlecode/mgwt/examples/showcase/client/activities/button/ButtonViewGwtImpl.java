/*
 * Copyright 2010 Daniel Kurka
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.examples.showcase.client.activities.button;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

import com.googlecode.mgwt.examples.showcase.client.DetailViewGwtImpl;
import com.googlecode.mgwt.ui.client.widget.button.Button;
import com.googlecode.mgwt.ui.client.widget.button.ImageButton;
import com.googlecode.mgwt.ui.client.widget.image.ImageHolder;

/**
 * @author Daniel Kurka
 *
 */
public class ButtonViewGwtImpl extends DetailViewGwtImpl implements ButtonView {

  public ButtonViewGwtImpl() {

    FlowPanel content = new FlowPanel();

    content.getElement().getStyle().setMargin(20, Unit.PX);

    scrollPanel.setScrollingEnabledX(false);

    Button normalButton = new Button("Normal");
    content.add(normalButton);

    Button roundButton = new Button("Round");
    roundButton.setRound(true);
    content.add(roundButton);

    Button smallButton = new Button("Small");
    smallButton.setSmall(true);
    content.add(smallButton);

    Button disabledButton = new Button("Disabled");
    disabledButton.setDisabled(true);
    content.add(disabledButton);

    HTML spacer = new HTML();
    spacer.setHeight("100px");
    content.add(spacer);

    Button importantButton = new Button("Important");
    importantButton.setImportant(true);
    content.add(importantButton);

    Button importantRoundButton = new Button("Round");
    importantRoundButton.setImportant(true);
    importantRoundButton.setRound(true);
    content.add(importantRoundButton);

    Button importantSmallButton = new Button("Small");
    importantSmallButton.setImportant(true);
    importantSmallButton.setSmall(true);
    content.add(importantSmallButton);

    Button importantDisabledButton = new Button("Disabled");
    importantDisabledButton.setDisabled(true);
    importantDisabledButton.setImportant(true);
    content.add(importantDisabledButton);

    spacer = new HTML();
    spacer.setHeight("100px");
    content.add(spacer);

    Button conmfirmButton = new Button("Confirm");
    conmfirmButton.setConfirm(true);
    content.add(conmfirmButton);

    Button confirmRoundButton = new Button("Round");
    confirmRoundButton.setConfirm(true);
    confirmRoundButton.setRound(true);
    content.add(confirmRoundButton);

    Button confirmSmallButton = new Button("Small");
    confirmSmallButton.setConfirm(true);
    confirmSmallButton.setSmall(true);
    content.add(confirmSmallButton);

    Button confirmImportantButton = new Button("Disabled");
    confirmImportantButton.setConfirm(true);
    confirmImportantButton.setDisabled(true);
    content.add(confirmImportantButton);


    spacer = new HTML();
    spacer.setHeight("100px");
    content.add(spacer);

    ImageButton imageButton = new ImageButton(ImageHolder.get().about());
    content.add(imageButton);
    imageButton.setText("ImageButton");

    scrollPanel.setWidget(content);
  }

}
