package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1192 {

    @Ignore    private SampleClass1193 sampleClass;

    public SampleClass1192(){
        sampleClass = new SampleClass1193();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}