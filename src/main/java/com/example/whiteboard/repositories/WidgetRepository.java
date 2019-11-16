package com.example.whiteboard.repositories;

    import com.example.whiteboard.model.Widget;
    import java.util.List;
    import org.springframework.data.jpa.repository.Query;
    import org.springframework.data.repository.CrudRepository;
    import org.springframework.data.repository.query.Param;

public interface WidgetRepository
    extends CrudRepository<Widget, Integer> {

    @Query("select widget from Widget widget where widget.id=widgetId")
    public Widget findWidgetById(@Param("widgetId") Integer id);

    @Query("select widget from Widget widget")
    public List<Widget> findAllWidgets();
}
