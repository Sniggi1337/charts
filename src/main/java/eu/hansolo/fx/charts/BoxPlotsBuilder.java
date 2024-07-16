/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2016-2022 Gerrit Grunwald.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.fx.charts;

import eu.hansolo.fx.charts.data.ChartItem;
import eu.hansolo.fx.charts.series.ChartItemSeries;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Dimension2D;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;


public class BoxPlotsBuilder<B extends BoxPlotsBuilder<B>> {
    private HashMap<String, Property> properties = new HashMap<>();


    // ******************** Constructors **************************************
    protected BoxPlotsBuilder() {}


    // ******************** Methods *******************************************
    public static final BoxPlotsBuilder create() {
        return new BoxPlotsBuilder();
    }


    public final B seriesList(final List<ChartItemSeries<? extends ChartItem>> SERIES_LIST) {
        properties.put("seriesList", new SimpleObjectProperty<>(SERIES_LIST));
        return (B)this;
    }

    public final B decimals(final int DECIMALS) {
        properties.put("decimals", new SimpleIntegerProperty(DECIMALS));
        return (B)this;
    }

    public final B locale(final Locale LOCALE) {
        properties.put("locale", new SimpleObjectProperty<>(LOCALE));
        return (B)this;
    }

    public final B backgroundColor(final Color BACKGROUND_COLOR) {
        properties.put("backgroundColor", new SimpleObjectProperty<>(BACKGROUND_COLOR));
        return (B)this;
    }

    public final B whiskerStrokeColor(final Color WHISKER_STROKE_COLOR) {
        properties.put("whiskerStrokeColor", new SimpleObjectProperty<>(WHISKER_STROKE_COLOR));
        return (B)this;
    }

    public final B iqrFillColor(final Color IQR_FILL_COLOR) {
        properties.put("iqrFillColor", new SimpleObjectProperty<>(IQR_FILL_COLOR));
        return (B)this;
    }

    public final B iqrStrokeColor(final Color IQR_STROKE_COLOR) {
        properties.put("iqrStrokeColor", new SimpleObjectProperty<>(IQR_STROKE_COLOR));
        return (B)this;
    }

    public final B medianStrokeColor(final Color MEDIAN_STROKE_COLOR) {
        properties.put("medianStrokeColor", new SimpleObjectProperty<>(MEDIAN_STROKE_COLOR));
        return (B)this;
    }

    public final B outlierFillColor(final Color OUTLIER_FILL_COLOR) {
        properties.put("outlierFillColor", new SimpleObjectProperty<>(OUTLIER_FILL_COLOR));
        return (B)this;
    }

    public final B outlierStrokeColor(final Color OUTLIER_STROKE_COLOR) {
        properties.put("outlierStrokeColor", new SimpleObjectProperty<>(OUTLIER_STROKE_COLOR));
        return (B)this;
    }

    public final B nameVisible(final boolean NAME_VISIBLE) {
        properties.put("nameVisible", new SimpleBooleanProperty(NAME_VISIBLE));
        return (B)this;
    }

    public final B textFillColor(final Color TEXT_FILL_COLOR) {
        properties.put("textFillColor", new SimpleObjectProperty<>(TEXT_FILL_COLOR));
        return (B)this;
    }

    public final B popupTimeout(final long POPUP_TIMEOUT) {
        properties.put("popupTimeout", new SimpleLongProperty(POPUP_TIMEOUT));
        return (B)this;
    }

    public final B yAxis(final Axis Y_AXIS) {
        properties.put("yAxis", new SimpleObjectProperty<>(Y_AXIS));
        return (B)this;
    }


    public final B prefSize(final double WIDTH, final double HEIGHT) {
        properties.put("prefSize", new SimpleObjectProperty<>(new Dimension2D(WIDTH, HEIGHT)));
        return (B)this;
    }
    public final B minSize(final double WIDTH, final double HEIGHT) {
        properties.put("minSize", new SimpleObjectProperty<>(new Dimension2D(WIDTH, HEIGHT)));
        return (B)this;
    }
    public final B maxSize(final double WIDTH, final double HEIGHT) {
        properties.put("maxSize", new SimpleObjectProperty<>(new Dimension2D(WIDTH, HEIGHT)));
        return (B)this;
    }

    public final B prefWidth(final double PREF_WIDTH) {
        properties.put("prefWidth", new SimpleDoubleProperty(PREF_WIDTH));
        return (B)this;
    }
    public final B prefHeight(final double PREF_HEIGHT) {
        properties.put("prefHeight", new SimpleDoubleProperty(PREF_HEIGHT));
        return (B)this;
    }

    public final B minWidth(final double MIN_WIDTH) {
        properties.put("minWidth", new SimpleDoubleProperty(MIN_WIDTH));
        return (B)this;
    }
    public final B minHeight(final double MIN_HEIGHT) {
        properties.put("minHeight", new SimpleDoubleProperty(MIN_HEIGHT));
        return (B)this;
    }

    public final B maxWidth(final double MAX_WIDTH) {
        properties.put("maxWidth", new SimpleDoubleProperty(MAX_WIDTH));
        return (B)this;
    }
    public final B maxHeight(final double MAX_HEIGHT) {
        properties.put("maxHeight", new SimpleDoubleProperty(MAX_HEIGHT));
        return (B)this;
    }

    public final B scaleX(final double SCALE_X) {
        properties.put("scaleX", new SimpleDoubleProperty(SCALE_X));
        return (B)this;
    }
    public final B scaleY(final double SCALE_Y) {
        properties.put("scaleY", new SimpleDoubleProperty(SCALE_Y));
        return (B)this;
    }

    public final B layoutX(final double LAYOUT_X) {
        properties.put("layoutX", new SimpleDoubleProperty(LAYOUT_X));
        return (B)this;
    }
    public final B layoutY(final double LAYOUT_Y) {
        properties.put("layoutY", new SimpleDoubleProperty(LAYOUT_Y));
        return (B)this;
    }

    public final B translateX(final double TRANSLATE_X) {
        properties.put("translateX", new SimpleDoubleProperty(TRANSLATE_X));
        return (B)this;
    }
    public final B translateY(final double TRANSLATE_Y) {
        properties.put("translateY", new SimpleDoubleProperty(TRANSLATE_Y));
        return (B)this;
    }

    public final B padding(final Insets INSETS) {
        properties.put("padding", new SimpleObjectProperty<>(INSETS));
        return (B)this;
    }


    public final BoxPlots build() {
        final BoxPlots control = new BoxPlots();

        if (properties.keySet().contains("seriesList")) {
            List<ChartItemSeries<? extends ChartItem>> seriesList = ((ObjectProperty<List<ChartItemSeries<? extends ChartItem>>>) properties.get("seriesList")).get();
            control.setSeriesList(seriesList);
        }

        properties.forEach((key, property) -> {
            switch (key) {
                case "prefSize"           -> {
                    Dimension2D dim = ((ObjectProperty<Dimension2D>) property).get();
                    control.setPrefSize(dim.getWidth(), dim.getHeight());
                }
                case "minSize"            -> {
                    Dimension2D dim = ((ObjectProperty<Dimension2D>) property).get();
                    control.setMinSize(dim.getWidth(), dim.getHeight());
                }
                case "maxSize"            -> {
                    Dimension2D dim = ((ObjectProperty<Dimension2D>) property).get();
                    control.setMaxSize(dim.getWidth(), dim.getHeight());
                }
                case "prefWidth"          -> control.setPrefWidth(((DoubleProperty) property).get());
                case "prefHeight"         -> control.setPrefHeight(((DoubleProperty) property).get());
                case "minWidth"           -> control.setMinWidth(((DoubleProperty) property).get());
                case "minHeight"          -> control.setMinHeight(((DoubleProperty) property).get());
                case "maxWidth"           -> control.setMaxWidth(((DoubleProperty) property).get());
                case "maxHeight"          -> control.setMaxHeight(((DoubleProperty) property).get());
                case "scaleX"             -> control.setScaleX(((DoubleProperty) property).get());
                case "scaleY"             -> control.setScaleY(((DoubleProperty) property).get());
                case "layoutX"            -> control.setLayoutX(((DoubleProperty) property).get());
                case "layoutY"            -> control.setLayoutY(((DoubleProperty) property).get());
                case "translateX"         -> control.setTranslateX(((DoubleProperty) property).get());
                case "translateY"         -> control.setTranslateY(((DoubleProperty) property).get());
                case "padding"            -> control.setPadding(((ObjectProperty<Insets>) property).get());
                case "decimals"           -> control.setDecimals(((IntegerProperty) property).get());
                case "locale"             -> control.setLocale(((ObjectProperty<Locale>) property).get());
                case "name"               -> control.setName(((StringProperty) property).get());
                case "backgroundColor"    -> control.setBackgroundColor(((ObjectProperty<Color>) property).get());
                case "whiskerStrokeColor" -> control.setWhiskerStrokeColor(((ObjectProperty<Color>) property).get());
                case "iqrFillColor"       -> control.setIqrFillColor(((ObjectProperty<Color>) property).get());
                case "iqrStrokeColor"     -> control.setIqrStrokeColor(((ObjectProperty<Color>) property).get());
                case "medianStrokeColor"  -> control.setMedianStrokeColor(((ObjectProperty<Color>) property).get());
                case "outlierFillColor"   -> control.setOutlierFillColor(((ObjectProperty<Color>) property).get());
                case "outlierStrokeColor" -> control.setOutlierStrokeColor(((ObjectProperty<Color>) property).get());
                case "nameVisible"        -> control.setNameVisible(((BooleanProperty) property).get());
                case "textFillColor"      -> control.setTextFillColor(((ObjectProperty<Color>) property).get());
                case "popupTimeout"       -> control.setPopupTimeout(((LongProperty) property).get());
            }
        });
        if (properties.containsKey("yAxis")) { control.setYAxis(((ObjectProperty<Axis>) properties.get("yAxis")).get()); }
        return control;
    }
}
