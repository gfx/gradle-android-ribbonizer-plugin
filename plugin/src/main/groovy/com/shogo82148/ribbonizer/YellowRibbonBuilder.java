package com.shogo82148.ribbonizer;

import com.android.build.gradle.api.ApplicationVariant;
import com.shogo82148.ribbonizer.filter.ColorRibbonFilter;
import com.shogo82148.ribbonizer.resource.Resource;

import java.awt.*;
import java.io.File;
import java.util.function.Consumer;

public class YellowRibbonBuilder implements FilterBuilder {

    private static final Color COLOR = new Color(0xff, 0x76, 0, 0x99);

    @Override
    public Consumer<Resource> apply(ApplicationVariant variant, File iconFile) {
        return new ColorRibbonFilter(variant.getBuildType().getName(), COLOR);
    }
}