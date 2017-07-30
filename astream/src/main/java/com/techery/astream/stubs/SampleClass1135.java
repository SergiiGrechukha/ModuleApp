package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1135 {

    @Ignore    private SampleClass1136 sampleClass;

    public SampleClass1135(){
        sampleClass = new SampleClass1136();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}