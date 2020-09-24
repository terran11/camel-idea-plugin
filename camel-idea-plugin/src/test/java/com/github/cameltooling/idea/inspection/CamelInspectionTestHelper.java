package com.github.cameltooling.idea.inspection;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.projectRoots.JavaSdk;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.LanguageLevelModuleExtension;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.pom.java.LanguageLevel;
import com.intellij.testFramework.InspectionTestCase;
import com.intellij.testFramework.LightProjectDescriptor;
import com.intellij.testFramework.fixtures.DefaultLightProjectDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.model.java.JpsJavaSdkType;

/**
 * Test helper for setup test case to test inspection code. The class create a new {@link LightProjectDescriptor} for
 * each test to make sure it start with a clean state and all previous added libraries is removed
 *
 */
public abstract class CamelInspectionTestHelper extends InspectionTestCase {

    private static final String BUILD_MOCK_JDK_DIRECTORY = "build/mockJDK-";

    public static final String CAMEL_CORE_MAVEN_ARTIFACT = "org.apache.camel:camel-core:2.22.0";

    @NotNull
    @Override
    protected LightProjectDescriptor getProjectDescriptor() {
        return JAVA_8;
    }

    @Override
    protected String getTestDataPath() {
        return "src/test/resources/";
    }
}
