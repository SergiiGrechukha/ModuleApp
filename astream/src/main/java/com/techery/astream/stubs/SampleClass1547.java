package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1547 {

    @Ignore    private SampleClass1548 sampleClass;

    public SampleClass1547(){
        sampleClass = new SampleClass1548();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}