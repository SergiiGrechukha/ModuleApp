package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1236 {

    @Ignore    private SampleClass1237 sampleClass;

    public SampleClass1236(){
        sampleClass = new SampleClass1237();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}