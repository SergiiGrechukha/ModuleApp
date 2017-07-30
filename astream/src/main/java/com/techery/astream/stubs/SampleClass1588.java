package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1588 {

    @Ignore    private SampleClass1589 sampleClass;

    public SampleClass1588(){
        sampleClass = new SampleClass1589();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}