package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1130 {

    @Ignore    private SampleClass1131 sampleClass;

    public SampleClass1130(){
        sampleClass = new SampleClass1131();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}