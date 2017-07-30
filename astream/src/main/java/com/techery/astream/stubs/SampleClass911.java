package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass911 {

    @Ignore    private SampleClass912 sampleClass;

    public SampleClass911(){
        sampleClass = new SampleClass912();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}