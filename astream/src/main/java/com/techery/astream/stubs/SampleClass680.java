package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass680 {

    @Ignore    private SampleClass681 sampleClass;

    public SampleClass680(){
        sampleClass = new SampleClass681();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}