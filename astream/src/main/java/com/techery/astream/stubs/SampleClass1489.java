package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1489 {

    @Ignore    private SampleClass1490 sampleClass;

    public SampleClass1489(){
        sampleClass = new SampleClass1490();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}