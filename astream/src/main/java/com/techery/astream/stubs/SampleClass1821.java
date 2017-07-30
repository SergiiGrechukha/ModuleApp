package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1821 {

    @Ignore    private SampleClass1822 sampleClass;

    public SampleClass1821(){
        sampleClass = new SampleClass1822();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}