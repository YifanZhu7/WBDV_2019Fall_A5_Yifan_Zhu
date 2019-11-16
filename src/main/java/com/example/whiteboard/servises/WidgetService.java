package com.example.whiteboard.servises;

import com.example.whiteboard.model.Widget;
//import com.example.whiteboard.model.Widget.type;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class WidgetService {
//
//  Widget headingWidget = new Widget("heading1", 1, true, "hello", null, 1, type.HEADING);
//  Widget listWidget = new Widget("list1", 2, true, "a,b,c", null, 1, type.LIST);
//  Widget paragraphWidget = new Widget("paragraph1", 3, true, "hello how are you", null, 1,
//      type.PARAGRAPH);
//  Widget imageWidget = new Widget("image1", 4, true, null, "https://unsplash.com/photos/JZRlnfsdcj0",
//      1, type.IMAGE);
//  Widget linkWidget = new Widget("link1", 5, true, null, "https://unsplash.com", 1, type.LINK);
//
//  List<Widget> Widgets = new ArrayList<Widget>();
//
//  {
//    Widgets.add(headingWidget);
//    Widgets.add(listWidget);
//    Widgets.add(paragraphWidget);
//    Widgets.add(imageWidget);
//    Widgets.add(linkWidget);
//  }
//
//  @GetMapping("/api/widgets")
//  public List<Widget> findAllWidget() {
//    return Widgets;
//  }
//
//  @GetMapping("/api/widgets/{InputId}")
//  public Widget findWidgetById(
//      @PathVariable("InputId") Integer id) {
//    for (Widget widget : Widgets) {
//      if (widget.getId().equals(id)) {
//        return widget;
//      }
//    }
//    return null;
//  }
//
//  @PostMapping("/api/widgets")
//  public Widget createWidget(
//      @RequestBody Widget widget) {
//    Widgets.add(widget);
//    return widget;
//  }
//
//  @DeleteMapping("/api/widgets/{InputId}")
//  public void deleteWidget(
//      @PathVariable("InputId") Integer id){
//    for(Widget widget:Widgets){
//      if(widget.getId().equals(id)){
//        Widgets.remove(widget);
//      }
//    }
//  }
//
//  @PutMapping("/api/widgets/{InputId}")
//  public Widget updateWidget(
//      @PathVariable("InputId") Integer id,
//      @RequestBody Widget newWidget){
//    for (Widget widget: Widgets){
//      if (widget.getId().equals(id)){
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
//  }
//}
