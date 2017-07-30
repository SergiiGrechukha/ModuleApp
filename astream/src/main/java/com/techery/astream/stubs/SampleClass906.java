package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass906 {

    @Ignore    private SampleClass907 sampleClass;

    public SampleClass906(){
        sampleClass = new SampleClass907();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}