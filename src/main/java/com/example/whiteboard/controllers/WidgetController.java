package com.example.whiteboard.controllers;

import com.example.whiteboard.model.Widget;
//import com.example.whiteboard.model.Widget.type;
import com.example.whiteboard.model.Widget.type;
import com.example.whiteboard.repositories.WidgetRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {

  @Autowired
  WidgetRepository repository;

//  Widget Widget1 = new Widget("W1",1,3, type.HEADING);
//  Widget Widget2 = new Widget("W2",2,2,type.PARAGRAPH);

//  Widget headingWidget = new Widget("heading1", 1, true, "hello", null, 1, type.HEADING);
//  Widget listWidget = new Widget("list1", 2, true, "a,b,c", null, 1, type.LIST);
//  Widget paragraphWidget = new Widget("paragraph1", 3, true, "hello how are you", null, 1,
//      type.PARAGRAPH);
//  Widget imageWidget = new Widget("image1", 4, true, null, "https://unsplash.com/photos/JZRlnfsdcj0",
//      1, type.IMAGE);
//  Widget linkWidget = new Widget("link1", 5, true, null, "https://unsplash.com", 1, type.LINK);

//  List<Widget> Widgets = new ArrayList<Widget>();
//
//  {
//    Widgets.add(Widget1);
//    Widgets.add(Widget2);
//    Widgets.add(headingWidget);
//    Widgets.add(listWidget);
//    Widgets.add(paragraphWidget);
//    Widgets.add(imageWidget);
//    Widgets.add(linkWidget);
//  }

  @GetMapping("/api/widgets")
  public List<Widget> findAllWidget() {
    return repository.findAllWidgets();
//    return (List<Widget>)repository.findAll();
//    return Widgets;
  }

  @GetMapping("/api/widgets/{InputId}")
  public Widget findWidgetById(
      @PathVariable("InputId") Integer id) {
    return repository.findWidgetById(id);
//    Optional<Widget> w = repository.findById(id);
//    if(w.isPresent()){
//      return w.get();
//    }
//    return null;
//    for (Widget widget : Widgets) {
//      if (widget.getId().equals(id)) {
//        return widget;
//      }
//    }
//    return null;
  }

  @PostMapping("/api/widgets")
  public List<Widget> createWidget(
      @RequestBody Widget widget) {
    repository.save(widget);
    return findAllWidget();
    // Widgets.add(widget);
    // return widget;
  }

  @DeleteMapping("/api/widgets/{InputId}")
  public void deleteWidget(
      @PathVariable("InputId") Integer id){
    repository.deleteById(id);
//    for(Widget widget:Widgets){
//      if(widget.getId().equals(id)){
//        Widgets.remove(widget);
//      }
//    }
  }

  @PutMapping("/api/widgets/{InputId}")
  public List<Widget> updateWidget(
      @PathVariable("InputId") Integer id,
      @RequestBody Widget newWidget){
    repository.save(newWidget);
    return repository.findAllWidgets();

//    for (Widget widget: Widgets){
//      if (widget.getId().equals(id)){
//        widget.setId(newWidget.getId());
//        widget.setText(newWidget.getText());
//        widget.setSize(newWidget.getSize());
//        widget.setWidgetType(newWidget.getWidgetType());
//        widget.setName(newWidget.getName());
//        widget.setId(newWidget.getId());
//        widget.setWidgetType(newWidget.getWidgetType());
//        widget.setOrder(newWidget.getOrder());
//        widget.setText(newWidget.getText());
//        widget.setSrc(newWidget.getSrc());
//        widget.setSize(newWidget.getSize());
//      }
//    }
//    return null;
  }
}
