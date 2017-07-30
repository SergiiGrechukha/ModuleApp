package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1123 {

    @Ignore    private SampleClass1124 sampleClass;

    public SampleClass1123(){
        sampleClass = new SampleClass1124();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}