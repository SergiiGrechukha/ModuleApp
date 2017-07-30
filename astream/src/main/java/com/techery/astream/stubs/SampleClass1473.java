package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1473 {

    @Ignore    private SampleClass1474 sampleClass;

    public SampleClass1473(){
        sampleClass = new SampleClass1474();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}