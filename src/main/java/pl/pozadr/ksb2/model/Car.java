package pl.pozadr.ksb2.model;

import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.*;

public class Car extends RepresentationModel<Car> {
    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @NotBlank
    private String mark;

    @NotNull
    @NotBlank
    private String model;

    @NotNull
    @NotBlank
    private Color color;

    public Car(long id, String mark, String model, Color color) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}