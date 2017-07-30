package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass358 {

    @Ignore    private SampleClass359 sampleClass;

    public SampleClass358(){
        sampleClass = new SampleClass359();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}