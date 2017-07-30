package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass836 {

    @Ignore    private SampleClass837 sampleClass;

    public SampleClass836(){
        sampleClass = new SampleClass837();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}