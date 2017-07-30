package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1736 {

    @Ignore    private SampleClass1737 sampleClass;

    public SampleClass1736(){
        sampleClass = new SampleClass1737();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}