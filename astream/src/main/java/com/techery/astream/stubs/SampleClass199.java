package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass199 {

    @Ignore    private SampleClass200 sampleClass;

    public SampleClass199(){
        sampleClass = new SampleClass200();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}