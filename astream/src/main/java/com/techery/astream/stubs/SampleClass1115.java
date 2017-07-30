package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1115 {

    @Ignore    private SampleClass1116 sampleClass;

    public SampleClass1115(){
        sampleClass = new SampleClass1116();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}